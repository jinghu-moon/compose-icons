package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorThinIcon(
            name = "SkipBackCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 161.940 84.500 C 160.667 83.796 159.113 83.838 157.880 84.610 L 100.000 120.780 L 100.000 88.000 C 100.000 85.791 98.209 84.000 96.000 84.000 C 93.791 84.000 92.000 85.791 92.000 88.000 L 92.000 168.000 C 92.000 170.209 93.791 172.000 96.000 172.000 C 98.209 172.000 100.000 170.209 100.000 168.000 L 100.000 135.220 L 157.880 171.390 C 158.516 171.788 159.250 171.999 160.000 172.000 C 160.678 171.998 161.345 171.826 161.940 171.500 C 163.212 170.795 164.001 169.454 164.000 168.000 L 164.000 88.000 C 164.001 86.546 163.212 85.205 161.940 84.500 ZM 156.000 160.780 L 103.550 128.000 L 156.000 95.220 Z"),
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
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
