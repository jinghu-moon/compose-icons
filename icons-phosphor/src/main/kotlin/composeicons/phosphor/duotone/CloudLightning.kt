package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorDuotoneIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 92c0 37.555-30.445 68-68 68h-80C58.556 159.983 42.769 149.663 35.755 133.69 28.742 117.718 31.826 99.111 43.618 86.256 55.411 73.401 73.683 68.727 90.2 74.34v.11C99.038 41.473 130.94 20.146 164.791 24.587 198.642 29.027 223.966 57.859 224 92Z"),
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
                pathData = parseSvgPathData("M156 16C124.507 16.003 96.261 35.38 84.92 64.76 81.973 64.257 78.989 64.003 76 64 47.281 64 24 87.281 24 116c0 28.719 23.281 52 52 52h37.87L97.14 195.88c-1.485 2.472-1.525 5.551-.105 8.061 1.42 2.509 4.081 4.06 6.965 4.059h25.87l-16.73 27.88c-2.275 3.789-1.049 8.705 2.74 10.98 3.789 2.275 8.705 1.049 10.98-2.74l24-40c1.485-2.472 1.525-5.551 .105-8.061C149.544 193.55 146.883 191.999 144 192h-25.87l14.4-24h23.47c41.974 0 76-34.026 76-76C232 50.026 197.974 16 156 16ZM156 152h-80C56.118 152 40 135.882 40 116 40 96.118 56.118 80 76 80c1.598 .003 3.195 .107 4.78 .31q-.56 3.57-.77 7.23c-.254 4.418 3.122 8.206 7.54 8.46 4.418 .254 8.206-3.122 8.46-7.54C97.906 55.801 125.59 30.666 158.28 31.924c32.69 1.258 58.36 28.448 57.739 61.156C215.397 125.788 188.714 151.983 156 152Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
