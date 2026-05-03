package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorThinIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 66.000 204.000 C 76.986 179.611 101.251 163.928 128.000 163.928 C 154.749 163.928 179.014 179.611 190.000 204.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 198.670 204.000 C 189.911 181.987 171.409 165.303 148.610 158.860 C 166.466 149.393 175.577 128.980 170.699 109.367 C 165.822 89.754 148.210 75.985 128.000 75.985 C 107.790 75.985 90.178 89.754 85.301 109.367 C 80.423 128.980 89.534 149.393 107.390 158.860 C 84.591 165.303 66.089 181.987 57.330 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 128.000 156.000 C 108.118 156.000 92.000 139.882 92.000 120.000 C 92.000 100.118 108.118 84.000 128.000 84.000 C 147.882 84.000 164.000 100.118 164.000 120.000 C 164.000 139.882 147.882 156.000 128.000 156.000 Z"),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
