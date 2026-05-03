package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorThinIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 112.000 C 108.000 109.791 109.791 108.000 112.000 108.000 L 144.000 108.000 C 146.209 108.000 148.000 109.791 148.000 112.000 C 148.000 114.209 146.209 116.000 144.000 116.000 L 112.000 116.000 C 109.791 116.000 108.000 114.209 108.000 112.000 ZM 228.000 72.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 72.000 C 28.000 65.373 33.373 60.000 40.000 60.000 L 84.000 60.000 L 84.000 48.000 C 84.000 36.954 92.954 28.000 104.000 28.000 L 152.000 28.000 C 163.046 28.000 172.000 36.954 172.000 48.000 L 172.000 60.000 L 216.000 60.000 C 222.627 60.000 228.000 65.373 228.000 72.000 ZM 92.000 60.000 L 164.000 60.000 L 164.000 48.000 C 164.000 41.373 158.627 36.000 152.000 36.000 L 104.000 36.000 C 97.373 36.000 92.000 41.373 92.000 48.000 ZM 36.000 72.000 L 36.000 116.000 C 64.104 131.751 95.784 140.015 128.000 140.000 C 160.216 140.015 191.896 131.751 220.000 116.000 L 220.000 72.000 C 220.000 69.791 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 69.791 36.000 72.000 ZM 220.000 200.000 L 220.000 125.100 C 191.669 140.145 160.078 148.008 128.000 148.000 C 95.921 148.010 64.331 140.147 36.000 125.100 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
