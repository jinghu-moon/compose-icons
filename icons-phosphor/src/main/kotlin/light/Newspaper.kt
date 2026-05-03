package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorLightIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 182.000 112.000 C 182.000 115.314 179.314 118.000 176.000 118.000 L 96.000 118.000 C 92.686 118.000 90.000 115.314 90.000 112.000 C 90.000 108.686 92.686 106.000 96.000 106.000 L 176.000 106.000 C 179.314 106.000 182.000 108.686 182.000 112.000 ZM 176.000 138.000 L 96.000 138.000 C 92.686 138.000 90.000 140.686 90.000 144.000 C 90.000 147.314 92.686 150.000 96.000 150.000 L 176.000 150.000 C 179.314 150.000 182.000 147.314 182.000 144.000 C 182.000 140.686 179.314 138.000 176.000 138.000 ZM 230.000 64.000 L 230.000 184.000 C 230.000 196.150 220.150 206.000 208.000 206.000 L 32.000 206.000 C 19.885 206.000 10.050 196.205 10.000 184.090 L 10.000 88.000 C 10.000 84.686 12.686 82.000 16.000 82.000 C 19.314 82.000 22.000 84.686 22.000 88.000 L 22.000 184.000 C 22.000 189.523 26.477 194.000 32.000 194.000 C 37.523 194.000 42.000 189.523 42.000 184.000 L 42.000 64.000 C 42.000 56.268 48.268 50.000 56.000 50.000 L 216.000 50.000 C 223.732 50.000 230.000 56.268 230.000 64.000 ZM 218.000 64.000 C 218.000 62.895 217.105 62.000 216.000 62.000 L 56.000 62.000 C 54.895 62.000 54.000 62.895 54.000 64.000 L 54.000 184.000 C 54.004 187.478 53.178 190.906 51.590 194.000 L 208.000 194.000 C 213.523 194.000 218.000 189.523 218.000 184.000 Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
