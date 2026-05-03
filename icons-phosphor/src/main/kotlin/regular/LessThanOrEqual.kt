package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorRegularIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 40.000 104.000 C 40.002 100.652 42.089 97.659 45.230 96.500 L 197.230 40.500 C 201.314 39.179 205.713 41.317 207.197 45.345 C 208.682 49.372 206.724 53.854 202.760 55.500 L 71.140 104.000 L 202.760 152.490 C 206.401 153.827 208.559 157.583 207.879 161.402 C 207.200 165.220 203.879 168.002 200.000 168.000 C 199.055 167.999 198.118 167.833 197.230 167.510 L 45.230 111.510 C 42.086 110.349 39.998 107.352 40.000 104.000 ZM 200.000 192.000 L 48.000 192.000 C 43.582 192.000 40.000 195.582 40.000 200.000 C 40.000 204.418 43.582 208.000 48.000 208.000 L 200.000 208.000 C 204.418 208.000 208.000 204.418 208.000 200.000 C 208.000 195.582 204.418 192.000 200.000 192.000 Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
