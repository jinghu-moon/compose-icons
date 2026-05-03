package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorLightIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 194.000 L 230.000 194.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 194.000 L 16.000 194.000 C 12.686 194.000 10.000 196.686 10.000 200.000 C 10.000 203.314 12.686 206.000 16.000 206.000 L 240.000 206.000 C 243.314 206.000 246.000 203.314 246.000 200.000 C 246.000 196.686 243.314 194.000 240.000 194.000 ZM 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 L 218.000 194.000 L 198.000 194.000 L 198.000 168.000 C 198.000 164.686 195.314 162.000 192.000 162.000 L 120.000 162.000 C 116.686 162.000 114.000 164.686 114.000 168.000 L 114.000 194.000 L 70.000 194.000 L 70.000 86.000 L 186.000 86.000 L 186.000 136.000 C 186.000 139.314 188.686 142.000 192.000 142.000 C 195.314 142.000 198.000 139.314 198.000 136.000 L 198.000 80.000 C 198.000 76.686 195.314 74.000 192.000 74.000 L 64.000 74.000 C 60.686 74.000 58.000 76.686 58.000 80.000 L 58.000 194.000 L 38.000 194.000 ZM 186.000 194.000 L 126.000 194.000 L 126.000 174.000 L 186.000 174.000 Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
