package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorThinIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 92.000 L 164.000 92.000 L 164.000 40.000 C 164.000 33.373 158.627 28.000 152.000 28.000 L 104.000 28.000 C 97.373 28.000 92.000 33.373 92.000 40.000 L 92.000 92.000 L 40.000 92.000 C 33.373 92.000 28.000 97.373 28.000 104.000 L 28.000 152.000 C 28.000 158.627 33.373 164.000 40.000 164.000 L 92.000 164.000 L 92.000 216.000 C 92.000 222.627 97.373 228.000 104.000 228.000 L 152.000 228.000 C 158.627 228.000 164.000 222.627 164.000 216.000 L 164.000 164.000 L 216.000 164.000 C 222.627 164.000 228.000 158.627 228.000 152.000 L 228.000 104.000 C 228.000 97.373 222.627 92.000 216.000 92.000 ZM 220.000 152.000 C 220.000 154.209 218.209 156.000 216.000 156.000 L 160.000 156.000 C 157.791 156.000 156.000 157.791 156.000 160.000 L 156.000 216.000 C 156.000 218.209 154.209 220.000 152.000 220.000 L 104.000 220.000 C 101.791 220.000 100.000 218.209 100.000 216.000 L 100.000 160.000 C 100.000 157.791 98.209 156.000 96.000 156.000 L 40.000 156.000 C 37.791 156.000 36.000 154.209 36.000 152.000 L 36.000 104.000 C 36.000 101.791 37.791 100.000 40.000 100.000 L 96.000 100.000 C 98.209 100.000 100.000 98.209 100.000 96.000 L 100.000 40.000 C 100.000 37.791 101.791 36.000 104.000 36.000 L 152.000 36.000 C 154.209 36.000 156.000 37.791 156.000 40.000 L 156.000 96.000 C 156.000 98.209 157.791 100.000 160.000 100.000 L 216.000 100.000 C 218.209 100.000 220.000 101.791 220.000 104.000 Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
