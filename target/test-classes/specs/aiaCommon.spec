
@objects
    header                   css   .cta-header
    aia-logo                 css   .logo-icon
    image-container          css   .hero
    phone-number             id    phoneDesktop
    menu                     css   #menu ul
    menu-item-*              css   #menu li a
    plan-button-container    css   .plan-button-container

    footer                   css   .page__footer


= Header =
    @on *
        header:
            inside screen 0px top
            height ~ 40px

        aia-logo:
            inside image-container
            below header 14px

        phone-number:
            inside header ~ 50px right
            above image-container

        plan-button-container:
            width 930px



    @on mobile, tablet
        header-text:
            text is "Sample Website"

= Footer =
        footer:
            height ~ 306px


