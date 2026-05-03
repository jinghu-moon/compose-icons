package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorLightIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 160.000 C 222.000 163.314 219.314 166.000 216.000 166.000 L 101.560 166.000 L 52.440 220.000 C 51.076 221.817 48.803 222.707 46.568 222.301 C 44.333 221.894 42.519 220.260 41.882 218.079 C 41.246 215.899 41.895 213.545 43.560 212.000 L 85.350 166.000 L 40.000 166.000 C 36.686 166.000 34.000 163.314 34.000 160.000 C 34.000 156.686 36.686 154.000 40.000 154.000 L 96.250 154.000 L 143.530 102.000 L 40.000 102.000 C 36.686 102.000 34.000 99.314 34.000 96.000 C 34.000 92.686 36.686 90.000 40.000 90.000 L 154.440 90.000 L 203.560 36.000 C 204.924 34.183 207.197 33.293 209.432 33.699 C 211.667 34.106 213.481 35.740 214.118 37.921 C 214.754 40.101 214.105 42.455 212.440 44.000 L 170.650 90.000 L 216.000 90.000 C 219.314 90.000 222.000 92.686 222.000 96.000 C 222.000 99.314 219.314 102.000 216.000 102.000 L 159.750 102.000 L 112.470 154.000 L 216.000 154.000 C 219.314 154.000 222.000 156.686 222.000 160.000 Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
