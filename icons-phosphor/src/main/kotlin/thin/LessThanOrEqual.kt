package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorThinIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 44.000 104.000 C 44.002 102.325 45.048 100.828 46.620 100.250 L 198.620 44.250 C 199.977 43.679 201.539 43.900 202.684 44.825 C 203.830 45.751 204.374 47.230 204.102 48.677 C 203.829 50.125 202.784 51.305 201.380 51.750 L 59.570 104.000 L 201.380 156.250 C 203.193 156.923 204.265 158.797 203.926 160.701 C 203.587 162.605 201.934 163.994 200.000 164.000 C 199.529 164.001 199.061 163.916 198.620 163.750 L 46.620 107.750 C 45.048 107.172 44.002 105.675 44.000 104.000 ZM 200.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 197.791 44.000 200.000 C 44.000 202.209 45.791 204.000 48.000 204.000 L 200.000 204.000 C 202.209 204.000 204.000 202.209 204.000 200.000 C 204.000 197.791 202.209 196.000 200.000 196.000 Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
