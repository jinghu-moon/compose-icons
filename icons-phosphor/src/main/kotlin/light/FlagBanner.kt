package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorLightIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.070 52.800 C 235.972 51.059 234.058 50.002 232.000 50.000 L 40.000 50.000 C 37.575 50.002 35.389 51.464 34.462 53.705 C 33.534 55.945 34.046 58.524 35.760 60.240 L 79.510 104.000 L 35.760 147.760 C 34.046 149.476 33.534 152.055 34.462 154.295 C 35.389 156.536 37.575 157.998 40.000 158.000 L 176.780 158.000 L 146.580 221.420 C 145.155 224.413 146.427 227.995 149.420 229.420 C 152.413 230.845 155.995 229.573 157.420 226.580 L 237.420 58.580 C 238.302 56.721 238.170 54.539 237.070 52.800 ZM 182.500 146.000 L 54.500 146.000 L 92.250 108.240 C 94.590 105.897 94.590 102.103 92.250 99.760 L 54.490 62.000 L 222.490 62.000 Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
