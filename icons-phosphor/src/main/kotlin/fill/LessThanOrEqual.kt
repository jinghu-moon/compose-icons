package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorFillIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 176.000 184.000 L 72.000 184.000 C 67.582 184.000 64.000 180.418 64.000 176.000 C 64.000 171.582 67.582 168.000 72.000 168.000 L 176.000 168.000 C 180.418 168.000 184.000 171.582 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 ZM 178.350 128.350 C 182.575 129.648 184.948 134.125 183.650 138.350 C 182.352 142.575 177.875 144.948 173.650 143.650 L 69.650 111.650 C 66.287 110.621 63.990 107.517 63.990 104.000 C 63.990 100.483 66.287 97.379 69.650 96.350 L 173.650 64.350 C 177.875 63.052 182.352 65.425 183.650 69.650 C 184.948 73.875 182.575 78.352 178.350 79.650 L 99.200 104.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
