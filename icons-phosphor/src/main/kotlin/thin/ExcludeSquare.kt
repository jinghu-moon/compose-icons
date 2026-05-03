package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ExcludeSquare: ImageVector
    get() {
        if (_excludeSquare != null) return _excludeSquare!!
        _excludeSquare = phosphorThinIcon(
            name = "ExcludeSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 92.000 L 164.000 92.000 L 164.000 40.000 C 164.000 37.791 162.209 36.000 160.000 36.000 L 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 L 36.000 160.000 C 36.000 162.209 37.791 164.000 40.000 164.000 L 92.000 164.000 L 92.000 216.000 C 92.000 218.209 93.791 220.000 96.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 96.000 C 220.000 93.791 218.209 92.000 216.000 92.000 ZM 161.660 212.000 L 113.660 164.000 L 158.340 164.000 L 206.340 212.000 ZM 44.000 49.660 L 92.000 97.660 L 92.000 142.340 L 44.000 94.340 ZM 94.340 44.000 L 142.340 92.000 L 97.660 92.000 L 49.660 44.000 ZM 100.000 156.000 L 100.000 100.000 L 156.000 100.000 L 156.000 156.000 ZM 164.000 158.340 L 164.000 113.660 L 212.000 161.660 L 212.000 206.340 ZM 212.000 100.000 L 212.000 150.340 L 164.000 102.340 L 164.000 100.000 ZM 156.000 92.000 L 153.660 92.000 L 105.660 44.000 L 156.000 44.000 ZM 44.000 156.000 L 44.000 105.660 L 92.000 153.660 L 92.000 156.000 ZM 100.000 164.000 L 102.340 164.000 L 150.340 212.000 L 100.000 212.000 Z"),
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
        return _excludeSquare!!
    }

private var _excludeSquare: ImageVector? = null
