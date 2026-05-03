package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorThinIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 100.400 L 204.000 96.000 C 204.000 54.026 169.974 20.000 128.000 20.000 C 86.026 20.000 52.000 54.026 52.000 96.000 L 52.000 100.400 C 41.930 102.445 35.049 111.787 36.081 122.010 C 37.114 132.233 45.725 140.010 56.000 140.000 L 61.610 140.000 L 117.610 237.950 C 119.746 241.690 123.723 243.998 128.030 243.998 C 132.337 243.998 136.314 241.690 138.450 237.950 L 194.450 140.000 L 200.000 140.000 C 210.275 140.010 218.886 132.233 219.919 122.010 C 220.951 111.787 214.070 102.445 204.000 100.400 ZM 131.470 234.000 C 130.757 235.243 129.433 236.010 128.000 236.010 C 126.567 236.010 125.243 235.243 124.530 234.000 L 70.820 140.000 L 99.390 140.000 L 142.290 215.060 ZM 137.110 140.000 L 161.110 182.060 L 146.890 207.000 L 108.610 140.000 ZM 165.750 174.000 L 146.320 140.000 L 185.180 140.000 ZM 200.000 132.000 L 56.000 132.000 C 49.373 132.000 44.000 126.627 44.000 120.000 C 44.000 113.373 49.373 108.000 56.000 108.000 C 58.209 108.000 60.000 106.209 60.000 104.000 L 60.000 96.000 C 60.000 58.445 90.445 28.000 128.000 28.000 C 165.555 28.000 196.000 58.445 196.000 96.000 L 196.000 104.000 C 196.000 106.209 197.791 108.000 200.000 108.000 C 206.627 108.000 212.000 113.373 212.000 120.000 C 212.000 126.627 206.627 132.000 200.000 132.000 Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
