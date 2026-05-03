package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorRegularIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 40.000 C 195.582 40.000 192.000 43.582 192.000 48.000 C 192.000 52.418 195.582 56.000 200.000 56.000 C 208.837 56.000 216.000 63.163 216.000 72.000 L 216.000 128.000 L 40.000 128.000 L 40.000 72.000 C 40.000 63.163 47.163 56.000 56.000 56.000 C 60.418 56.000 64.000 52.418 64.000 48.000 C 64.000 43.582 60.418 40.000 56.000 40.000 C 38.327 40.000 24.000 54.327 24.000 72.000 L 24.000 164.000 C 24.000 188.301 43.699 208.000 68.000 208.000 C 92.301 208.000 112.000 188.301 112.000 164.000 L 112.000 144.000 L 144.000 144.000 L 144.000 164.000 C 144.000 188.301 163.699 208.000 188.000 208.000 C 212.301 208.000 232.000 188.301 232.000 164.000 L 232.000 72.000 C 232.000 54.327 217.673 40.000 200.000 40.000 ZM 212.630 177.310 L 179.310 144.000 L 216.000 144.000 L 216.000 164.000 C 216.007 168.649 214.848 173.225 212.630 177.310 ZM 40.000 164.000 L 40.000 147.310 L 81.310 188.630 C 72.634 193.318 62.131 193.096 53.661 188.046 C 45.191 182.995 40.001 173.862 40.000 164.000 ZM 96.000 164.000 C 96.007 168.649 94.848 173.225 92.630 177.310 L 59.310 144.000 L 96.000 144.000 ZM 160.000 164.000 L 160.000 147.310 L 201.310 188.630 C 192.634 193.318 182.131 193.096 173.661 188.046 C 165.191 182.995 160.001 173.862 160.000 164.000 Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
