package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorLightIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 94.000 120.000 C 94.000 101.222 109.222 86.000 128.000 86.000 C 146.778 86.000 162.000 101.222 162.000 120.000 C 162.000 138.778 146.778 154.000 128.000 154.000 C 109.222 154.000 94.000 138.778 94.000 120.000 ZM 69.210 202.000 C 80.484 179.904 103.194 165.996 128.000 165.996 C 152.806 165.996 175.516 179.904 186.790 202.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 200.000 202.000 C 191.412 181.469 174.481 165.570 153.450 158.290 C 170.348 147.067 177.899 126.100 172.038 106.680 C 166.176 87.260 148.285 73.972 128.000 73.972 C 107.715 73.972 89.824 87.260 83.962 106.680 C 78.101 126.100 85.652 147.067 102.550 158.290 C 81.519 165.570 64.588 181.469 56.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 Z"),
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
