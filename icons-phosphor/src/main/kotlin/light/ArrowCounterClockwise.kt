package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorLightIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 128.000 C 222.005 179.427 180.682 221.311 129.260 222.000 L 128.000 222.000 C 104.004 222.050 80.908 212.866 63.500 196.350 C 61.889 194.891 61.193 192.674 61.681 190.556 C 62.169 188.438 63.765 186.749 65.852 186.142 C 67.939 185.535 70.192 186.104 71.740 187.630 C 104.463 218.486 155.934 217.224 187.106 184.802 C 218.279 152.380 217.517 100.900 185.399 69.414 C 153.282 37.928 101.796 38.190 70.000 70.000 L 69.810 70.190 L 39.440 98.000 L 72.000 98.000 C 75.314 98.000 78.000 100.686 78.000 104.000 C 78.000 107.314 75.314 110.000 72.000 110.000 L 24.000 110.000 C 20.686 110.000 18.000 107.314 18.000 104.000 L 18.000 56.000 C 18.000 52.686 20.686 50.000 24.000 50.000 C 27.314 50.000 30.000 52.686 30.000 56.000 L 30.000 90.340 L 61.630 61.400 C 88.540 34.569 128.958 26.580 164.052 41.154 C 199.146 55.729 222.014 90.000 222.000 128.000 Z"),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
