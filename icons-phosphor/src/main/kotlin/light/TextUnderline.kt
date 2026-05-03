package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorLightIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.000 224.000 C 198.000 227.314 195.314 230.000 192.000 230.000 L 64.000 230.000 C 60.686 230.000 58.000 227.314 58.000 224.000 C 58.000 220.686 60.686 218.000 64.000 218.000 L 192.000 218.000 C 195.314 218.000 198.000 220.686 198.000 224.000 ZM 128.000 198.000 C 162.226 197.961 189.961 170.226 190.000 136.000 L 190.000 56.000 C 190.000 52.686 187.314 50.000 184.000 50.000 C 180.686 50.000 178.000 52.686 178.000 56.000 L 178.000 136.000 C 178.000 163.614 155.614 186.000 128.000 186.000 C 100.386 186.000 78.000 163.614 78.000 136.000 L 78.000 56.000 C 78.000 52.686 75.314 50.000 72.000 50.000 C 68.686 50.000 66.000 52.686 66.000 56.000 L 66.000 136.000 C 66.039 170.226 93.774 197.961 128.000 198.000 Z"),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
