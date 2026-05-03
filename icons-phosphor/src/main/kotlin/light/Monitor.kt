package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorLightIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 42.000 L 48.000 42.000 C 35.850 42.000 26.000 51.850 26.000 64.000 L 26.000 176.000 C 26.000 188.150 35.850 198.000 48.000 198.000 L 208.000 198.000 C 220.150 198.000 230.000 188.150 230.000 176.000 L 230.000 64.000 C 230.000 51.850 220.150 42.000 208.000 42.000 ZM 218.000 176.000 C 218.000 181.523 213.523 186.000 208.000 186.000 L 48.000 186.000 C 42.477 186.000 38.000 181.523 38.000 176.000 L 38.000 64.000 C 38.000 58.477 42.477 54.000 48.000 54.000 L 208.000 54.000 C 213.523 54.000 218.000 58.477 218.000 64.000 ZM 166.000 224.000 C 166.000 227.314 163.314 230.000 160.000 230.000 L 96.000 230.000 C 92.686 230.000 90.000 227.314 90.000 224.000 C 90.000 220.686 92.686 218.000 96.000 218.000 L 160.000 218.000 C 163.314 218.000 166.000 220.686 166.000 224.000 Z"),
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
        return _monitor!!
    }

private var _monitor: ImageVector? = null
