package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorThinIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 63.000 212.000 C 71.772 183.456 98.139 163.975 128.000 163.975 C 157.861 163.975 184.228 183.456 193.000 212.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 201.340 212.000 C 194.304 186.257 174.282 166.090 148.590 158.870 C 166.455 149.410 175.576 128.995 170.702 109.377 C 165.829 89.759 148.215 75.985 128.000 75.985 C 107.785 75.985 90.171 89.759 85.298 109.377 C 80.424 128.995 89.545 149.410 107.410 158.870 C 81.718 166.090 61.696 186.257 54.660 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 128.000 156.000 C 108.118 156.000 92.000 139.882 92.000 120.000 C 92.000 100.118 108.118 84.000 128.000 84.000 C 147.882 84.000 164.000 100.118 164.000 120.000 C 164.000 139.882 147.882 156.000 128.000 156.000 Z"),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
