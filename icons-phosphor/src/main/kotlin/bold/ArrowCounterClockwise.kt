package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorBoldIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.005 182.709 184.044 227.267 129.340 228.000 L 128.000 228.000 C 102.471 228.054 77.900 218.282 59.380 200.710 C 54.561 196.159 54.344 188.564 58.895 183.745 C 63.446 178.926 71.041 178.709 75.860 183.260 C 106.175 211.880 153.886 210.736 182.794 180.696 C 211.703 150.657 211.015 102.937 181.254 73.743 C 151.492 44.548 103.768 44.779 74.290 74.260 C 74.160 74.390 74.040 74.510 73.900 74.630 L 54.890 92.000 L 72.000 92.000 C 78.627 92.000 84.000 97.373 84.000 104.000 C 84.000 110.627 78.627 116.000 72.000 116.000 L 24.000 116.000 C 17.373 116.000 12.000 110.627 12.000 104.000 L 12.000 56.000 C 12.000 49.373 17.373 44.000 24.000 44.000 C 30.627 44.000 36.000 49.373 36.000 56.000 L 36.000 76.720 L 57.480 57.060 C 86.127 28.567 129.106 20.112 166.411 35.632 C 203.716 51.152 228.016 87.596 228.000 128.000 Z"),
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
