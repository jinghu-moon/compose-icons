package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorLightIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 128.000 C 245.967 157.810 221.810 181.967 192.000 182.000 L 48.000 182.000 C 27.013 182.000 10.000 164.987 10.000 144.000 C 10.000 123.013 27.013 106.000 48.000 106.000 L 192.000 106.000 C 204.150 106.000 214.000 115.850 214.000 128.000 C 214.000 140.150 204.150 150.000 192.000 150.000 L 80.000 150.000 C 76.686 150.000 74.000 147.314 74.000 144.000 C 74.000 140.686 76.686 138.000 80.000 138.000 L 192.000 138.000 C 197.523 138.000 202.000 133.523 202.000 128.000 C 202.000 122.477 197.523 118.000 192.000 118.000 L 48.000 118.000 C 33.641 118.000 22.000 129.641 22.000 144.000 C 22.000 158.359 33.641 170.000 48.000 170.000 L 192.000 170.000 C 215.196 170.000 234.000 151.196 234.000 128.000 C 234.000 104.804 215.196 86.000 192.000 86.000 L 80.000 86.000 C 76.686 86.000 74.000 83.314 74.000 80.000 C 74.000 76.686 76.686 74.000 80.000 74.000 L 192.000 74.000 C 221.810 74.033 245.967 98.190 246.000 128.000 Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
