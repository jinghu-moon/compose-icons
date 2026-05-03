package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorBoldIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 52.000 L 204.000 196.240 C 195.888 178.941 182.096 164.941 164.920 156.570 C 185.105 136.219 185.015 103.372 164.719 83.132 C 144.424 62.891 111.576 62.891 91.281 83.132 C 70.985 103.372 70.895 136.219 91.080 156.570 C 73.904 164.941 60.112 178.941 52.000 196.240 L 52.000 52.000 ZM 100.000 120.000 C 100.000 104.536 112.536 92.000 128.000 92.000 C 143.464 92.000 156.000 104.536 156.000 120.000 C 156.000 135.464 143.464 148.000 128.000 148.000 C 112.536 148.000 100.000 135.464 100.000 120.000 ZM 128.000 172.000 C 141.725 171.945 155.044 176.648 165.690 185.310 C 172.021 190.440 177.249 196.798 181.060 204.000 L 74.940 204.000 C 78.751 196.798 83.979 190.440 90.310 185.310 C 100.956 176.648 114.275 171.945 128.000 172.000 Z"),
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
