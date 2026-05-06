package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorDuotoneIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.21 185.59l-67 29.7c-2.055 .933-4.405 .972-6.49 .108-2.085-.864-3.718-2.554-4.51-4.668L147 183.06c-6.314 .63-12.655 .943-19 .94-6.345 .003-12.686-.31-19-.94L98.75 210.73c-.792 2.113-2.425 3.803-4.51 4.668-2.085 .864-4.435 .825-6.49-.108l-67-29.7c-3.561-1.564-5.481-5.463-4.55-9.24L45.77 60c.788-3.125 3.358-5.483 6.54-6L88.37 48.08c4.165-.708 8.174 1.904 9.21 6l5 19.63c16.885-2.253 33.995-2.253 50.88 0l5-19.63c1.036-4.096 5.045-6.708 9.21-6L203.69 54c3.182 .517 5.752 2.875 6.54 6l29.53 116.37c.92 3.77-.998 7.657-4.55 9.22Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M104 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM164 128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM238.45 192.9l-67 29.71c-4.072 1.81-8.71 1.86-12.82 .137-4.11-1.723-7.326-5.065-8.89-9.237l-8.11-22q-6.72 .45-13.63 .46-6.91 .01-13.63-.46l-8.11 22c-1.566 4.171-4.783 7.511-8.892 9.233-4.109 1.722-8.746 1.674-12.818-.133L17.55 192.9C10.411 189.774 6.579 181.945 8.49 174.39L38 58C39.59 51.812 44.693 47.153 51 46.13L87.06 40.21c8.237-1.33 16.138 3.811 18.26 11.88l3.26 12.83Q118.11 64 128 64q9.89 0 19.4 .92l3.26-12.83c2.126-8.066 10.024-13.205 18.26-11.88L205 46.13c6.307 1.023 11.41 5.682 13 11.87l29.53 116.38c1.914 7.564-1.929 15.401-9.08 18.52ZM232 178.28 202.47 62c0 0 0 0-.08 0L166.33 56c-.053-.03-.117-.03-.17 0l-2.83 11.14c5 .94 10 2.06 14.83 3.42 3.942 1.005 6.503 4.808 5.95 8.839-.553 4.031-4.043 7.004-8.11 6.911-.73-.002-1.457-.103-2.16-.3C158.899 81.956 143.481 79.934 128 80c-15.48-.069-30.899 1.949-45.84 6-2.779 .859-5.805 .142-7.903-1.872C72.159 82.114 71.319 79.12 72.064 76.309c.745-2.811 2.956-4.997 5.776-5.709 4.82-1.36 9.78-2.48 14.82-3.42L89.83 56c-.039-.012-.081-.012-.12 0h0L53.61 61.92c-.03-.006-.06-.006-.09 0L24 178.33 91 208c.067 .041 .153 .041 .22 0L98 189.72c-6.793-1.039-13.518-2.482-20.14-4.32-4.099-1.31-6.428-5.627-5.27-9.772 1.157-4.145 5.386-6.631 9.57-5.628 14.94 4.056 30.359 6.074 45.84 6 15.48 .074 30.9-1.944 45.84-6 4.255-1.193 8.672 1.29 9.865 5.545 1.193 4.255-1.29 8.672-5.545 9.865-6.628 1.836-13.36 3.275-20.16 4.31L164.75 208c.065 .036 .145 .036 .21 0Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
