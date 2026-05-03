package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorThinIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 88.000 156.000 C 94.627 156.000 100.000 161.373 100.000 168.000 C 100.000 174.627 94.627 180.000 88.000 180.000 C 81.373 180.000 76.000 174.627 76.000 168.000 C 76.000 161.373 81.373 156.000 88.000 156.000 ZM 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 84.000 44.000 L 84.000 148.400 C 73.940 150.453 67.069 159.791 68.101 170.006 C 69.133 180.221 77.733 187.996 88.000 187.996 C 98.267 187.996 106.867 180.221 107.899 170.006 C 108.931 159.791 102.060 150.453 92.000 148.400 L 92.000 105.660 L 148.000 161.660 L 148.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 156.000 212.000 L 156.000 160.000 C 156.001 158.939 155.580 157.921 154.830 157.170 L 92.000 94.340 L 92.000 44.000 L 132.000 44.000 L 132.000 72.000 C 131.999 73.061 132.420 74.079 133.170 74.830 L 151.330 93.000 C 145.674 101.567 147.421 113.024 155.375 119.515 C 163.328 126.006 174.903 125.421 182.162 118.162 C 189.421 110.903 190.006 99.328 183.515 91.375 C 177.024 83.421 165.567 81.674 157.000 87.330 L 140.000 70.330 L 140.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 168.000 92.000 C 174.627 92.000 180.000 97.373 180.000 104.000 C 180.000 110.627 174.627 116.000 168.000 116.000 C 161.373 116.000 156.000 110.627 156.000 104.000 C 156.000 97.373 161.373 92.000 168.000 92.000 Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
