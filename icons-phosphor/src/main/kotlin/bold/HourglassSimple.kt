package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorBoldIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 193.680 L 145.350 128.000 L 214.000 62.320 L 214.180 62.140 C 219.903 56.415 221.611 47.804 218.506 40.328 C 215.401 32.852 208.095 27.986 200.000 28.000 L 56.000 28.000 C 47.914 28.006 40.627 32.880 37.535 40.352 C 34.442 47.823 36.153 56.421 41.870 62.140 L 42.050 62.320 L 110.650 128.000 L 42.050 193.680 L 41.870 193.860 C 36.153 199.579 34.442 208.177 37.535 215.648 C 40.627 223.120 47.914 227.994 56.000 228.000 L 200.000 228.000 C 208.088 227.998 215.379 223.125 218.474 215.653 C 221.568 208.181 219.858 199.580 214.140 193.860 ZM 190.000 52.000 L 128.000 111.390 L 66.000 52.000 ZM 66.000 204.000 L 128.000 144.610 L 190.000 204.000 Z"),
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
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
