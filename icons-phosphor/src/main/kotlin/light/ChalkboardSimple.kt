package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorLightIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 194.000 L 230.000 194.000 L 230.000 168.000 C 230.000 164.686 227.314 162.000 224.000 162.000 L 160.000 162.000 C 156.686 162.000 154.000 164.686 154.000 168.000 L 154.000 194.000 L 38.000 194.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 L 218.000 136.000 C 218.000 139.314 220.686 142.000 224.000 142.000 C 227.314 142.000 230.000 139.314 230.000 136.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 194.000 L 16.000 194.000 C 12.686 194.000 10.000 196.686 10.000 200.000 C 10.000 203.314 12.686 206.000 16.000 206.000 L 240.000 206.000 C 243.314 206.000 246.000 203.314 246.000 200.000 C 246.000 196.686 243.314 194.000 240.000 194.000 ZM 166.000 174.000 L 218.000 174.000 L 218.000 194.000 L 166.000 194.000 Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
