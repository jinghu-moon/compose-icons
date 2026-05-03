package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorLightIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 82.000 L 182.000 82.000 L 182.000 48.000 C 182.000 40.268 175.732 34.000 168.000 34.000 L 40.000 34.000 C 32.268 34.000 26.000 40.268 26.000 48.000 L 26.000 176.000 C 26.003 178.312 27.333 180.416 29.420 181.410 C 30.224 181.801 31.106 182.003 32.000 182.000 C 33.372 182.001 34.702 181.531 35.770 180.670 L 73.710 150.000 L 74.000 150.000 L 74.000 184.000 C 74.000 191.732 80.268 198.000 88.000 198.000 L 182.290 198.000 L 220.230 228.670 C 221.298 229.531 222.628 230.001 224.000 230.000 C 224.894 230.003 225.776 229.801 226.580 229.410 C 228.667 228.416 229.997 226.312 230.000 224.000 L 230.000 96.000 C 230.000 88.268 223.732 82.000 216.000 82.000 ZM 71.580 138.000 C 70.208 137.999 68.878 138.469 67.810 139.330 L 38.000 163.430 L 38.000 48.000 C 38.000 46.895 38.895 46.000 40.000 46.000 L 168.000 46.000 C 169.105 46.000 170.000 46.895 170.000 48.000 L 170.000 136.000 C 170.000 137.105 169.105 138.000 168.000 138.000 ZM 218.000 211.430 L 188.190 187.330 C 187.122 186.469 185.792 185.999 184.420 186.000 L 88.000 186.000 C 86.895 186.000 86.000 185.105 86.000 184.000 L 86.000 150.000 L 168.000 150.000 C 175.732 150.000 182.000 143.732 182.000 136.000 L 182.000 94.000 L 216.000 94.000 C 217.105 94.000 218.000 94.895 218.000 96.000 Z"),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
