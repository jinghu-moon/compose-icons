package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorThinIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 92.000 L 148.000 92.000 L 148.000 40.000 C 148.000 33.373 142.627 28.000 136.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 88.000 C 60.000 94.627 65.373 100.000 72.000 100.000 L 140.000 100.000 L 140.000 156.000 L 72.000 156.000 C 65.373 156.000 60.000 161.373 60.000 168.000 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 L 136.000 228.000 C 142.627 228.000 148.000 222.627 148.000 216.000 L 148.000 164.000 L 216.000 164.000 C 222.627 164.000 228.000 158.627 228.000 152.000 L 228.000 104.000 C 228.000 97.373 222.627 92.000 216.000 92.000 ZM 140.000 216.000 C 140.000 218.209 138.209 220.000 136.000 220.000 L 72.000 220.000 C 69.791 220.000 68.000 218.209 68.000 216.000 L 68.000 168.000 C 68.000 165.791 69.791 164.000 72.000 164.000 L 140.000 164.000 ZM 140.000 92.000 L 72.000 92.000 C 69.791 92.000 68.000 90.209 68.000 88.000 L 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 136.000 36.000 C 138.209 36.000 140.000 37.791 140.000 40.000 ZM 220.000 152.000 C 220.000 154.209 218.209 156.000 216.000 156.000 L 148.000 156.000 L 148.000 100.000 L 216.000 100.000 C 218.209 100.000 220.000 101.791 220.000 104.000 Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
