package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorLightIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 130.000 L 199.710 130.000 L 169.710 70.000 L 192.000 70.000 C 195.314 70.000 198.000 67.314 198.000 64.000 C 198.000 60.686 195.314 58.000 192.000 58.000 L 64.000 58.000 C 60.686 58.000 58.000 60.686 58.000 64.000 C 58.000 67.314 60.686 70.000 64.000 70.000 L 86.290 70.000 L 56.290 130.000 L 8.000 130.000 C 4.686 130.000 2.000 132.686 2.000 136.000 C 2.000 139.314 4.686 142.000 8.000 142.000 L 50.290 142.000 L 26.630 189.320 C 25.150 192.286 26.354 195.890 29.320 197.370 C 32.286 198.850 35.890 197.646 37.370 194.680 L 63.710 142.000 L 192.290 142.000 L 218.630 194.680 C 220.110 197.646 223.714 198.850 226.680 197.370 C 229.646 195.890 230.850 192.286 229.370 189.320 L 205.710 142.000 L 248.000 142.000 C 251.314 142.000 254.000 139.314 254.000 136.000 C 254.000 132.686 251.314 130.000 248.000 130.000 ZM 69.710 130.000 L 99.710 70.000 L 156.290 70.000 L 186.290 130.000 Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
