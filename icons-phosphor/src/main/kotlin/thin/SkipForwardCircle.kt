package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorThinIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 160.000 84.000 C 157.791 84.000 156.000 85.791 156.000 88.000 L 156.000 120.780 L 98.120 84.610 C 96.887 83.840 95.333 83.799 94.062 84.503 C 92.790 85.207 92.001 86.546 92.000 88.000 L 92.000 168.000 C 91.999 169.454 92.788 170.795 94.060 171.500 C 94.655 171.826 95.322 171.998 96.000 172.000 C 96.750 171.999 97.484 171.788 98.120 171.390 L 156.000 135.220 L 156.000 168.000 C 156.000 170.209 157.791 172.000 160.000 172.000 C 162.209 172.000 164.000 170.209 164.000 168.000 L 164.000 88.000 C 164.000 85.791 162.209 84.000 160.000 84.000 ZM 100.000 160.780 L 100.000 95.220 L 152.450 128.000 Z"),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
