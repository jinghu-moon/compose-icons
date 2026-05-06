package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorRegularIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM164 128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM238.45 192.9l-67 29.71c-4.072 1.81-8.71 1.86-12.82 .137-4.11-1.723-7.326-5.065-8.89-9.237l-8.11-22q-6.72 .45-13.63 .46-6.91 .01-13.63-.46l-8.11 22c-1.566 4.171-4.783 7.511-8.892 9.233-4.109 1.722-8.746 1.674-12.818-.133L17.55 192.9C10.408 189.777 6.575 181.946 8.49 174.39L38 58C39.591 51.815 44.695 47.159 51 46.14L87.06 40.21c8.236-1.325 16.134 3.814 18.26 11.88l3.26 12.84Q118.11 64 128 64q9.89 0 19.4 .93l3.26-12.84c2.122-8.069 10.023-13.21 18.26-11.88L205 46.14c6.305 1.019 11.409 5.675 13 11.86l29.53 116.38c1.918 7.564-1.926 15.404-9.08 18.52ZM232 178.28 202.47 62c0 0 0 0-.08 0L166.33 56c-.053-.03-.117-.03-.17 0l-2.83 11.14c5 .94 10 2.06 14.83 3.42 3.942 1.005 6.503 4.808 5.95 8.839-.553 4.031-4.043 7.004-8.11 6.911-.73-.002-1.457-.103-2.16-.3C158.899 81.956 143.481 79.934 128 80c-15.48-.069-30.899 1.949-45.84 6-2.779 .859-5.805 .142-7.903-1.872C72.159 82.114 71.319 79.12 72.064 76.309c.745-2.811 2.956-4.997 5.776-5.709 4.82-1.36 9.78-2.48 14.82-3.42L89.83 56c0 0 0 0-.12 0h0L53.61 61.93c-.029-.008-.061-.008-.09 0L24 178.33 91 208c.069 .037 .151 .037 .22 0L98 189.72c-6.793-1.039-13.518-2.482-20.14-4.32-4.099-1.31-6.428-5.627-5.27-9.772 1.157-4.145 5.386-6.631 9.57-5.628 14.94 4.056 30.359 6.074 45.84 6 15.48 .074 30.9-1.944 45.84-6 4.255-1.193 8.672 1.29 9.865 5.545 1.193 4.255-1.29 8.672-5.545 9.865-6.628 1.836-13.36 3.275-20.16 4.31L164.75 208c.065 .036 .145 .036 .21 0Z"),
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
