package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatText: ImageVector
    get() {
        if (_chatText != null) return _chatText!!
        _chatText = phosphorLightIcon(
            name = "ChatText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 50.000 L 40.000 50.000 C 32.268 50.000 26.000 56.268 26.000 64.000 L 26.000 224.000 C 25.970 229.452 29.135 234.416 34.090 236.690 C 35.942 237.549 37.958 237.996 40.000 238.000 C 43.298 238.002 46.489 236.828 49.000 234.690 L 49.060 234.640 L 82.230 206.000 L 216.000 206.000 C 223.732 206.000 230.000 199.732 230.000 192.000 L 230.000 64.000 C 230.000 56.268 223.732 50.000 216.000 50.000 ZM 218.000 192.000 C 218.000 193.105 217.105 194.000 216.000 194.000 L 80.000 194.000 C 78.561 194.001 77.169 194.519 76.080 195.460 L 41.260 225.530 C 40.664 226.013 39.845 226.113 39.150 225.787 C 38.456 225.462 38.009 224.767 38.000 224.000 L 38.000 64.000 C 38.000 62.895 38.895 62.000 40.000 62.000 L 216.000 62.000 C 217.105 62.000 218.000 62.895 218.000 64.000 ZM 166.000 112.000 C 166.000 115.314 163.314 118.000 160.000 118.000 L 96.000 118.000 C 92.686 118.000 90.000 115.314 90.000 112.000 C 90.000 108.686 92.686 106.000 96.000 106.000 L 160.000 106.000 C 163.314 106.000 166.000 108.686 166.000 112.000 ZM 166.000 144.000 C 166.000 147.314 163.314 150.000 160.000 150.000 L 96.000 150.000 C 92.686 150.000 90.000 147.314 90.000 144.000 C 90.000 140.686 92.686 138.000 96.000 138.000 L 160.000 138.000 C 163.314 138.000 166.000 140.686 166.000 144.000 Z"),
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
        return _chatText!!
    }

private var _chatText: ImageVector? = null
