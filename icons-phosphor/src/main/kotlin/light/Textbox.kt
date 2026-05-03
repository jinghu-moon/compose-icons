package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorLightIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 42.000 C 108.686 42.000 106.000 44.686 106.000 48.000 L 106.000 66.000 L 24.000 66.000 C 16.268 66.000 10.000 72.268 10.000 80.000 L 10.000 176.000 C 10.000 183.732 16.268 190.000 24.000 190.000 L 106.000 190.000 L 106.000 208.000 C 106.000 211.314 108.686 214.000 112.000 214.000 C 115.314 214.000 118.000 211.314 118.000 208.000 L 118.000 48.000 C 118.000 44.686 115.314 42.000 112.000 42.000 ZM 24.000 178.000 C 22.895 178.000 22.000 177.105 22.000 176.000 L 22.000 80.000 C 22.000 78.895 22.895 78.000 24.000 78.000 L 106.000 78.000 L 106.000 178.000 ZM 246.000 80.000 L 246.000 176.000 C 246.000 183.732 239.732 190.000 232.000 190.000 L 144.000 190.000 C 140.686 190.000 138.000 187.314 138.000 184.000 C 138.000 180.686 140.686 178.000 144.000 178.000 L 232.000 178.000 C 233.105 178.000 234.000 177.105 234.000 176.000 L 234.000 80.000 C 234.000 78.895 233.105 78.000 232.000 78.000 L 144.000 78.000 C 140.686 78.000 138.000 75.314 138.000 72.000 C 138.000 68.686 140.686 66.000 144.000 66.000 L 232.000 66.000 C 239.732 66.000 246.000 72.268 246.000 80.000 ZM 86.000 112.000 C 86.000 115.314 83.314 118.000 80.000 118.000 L 70.000 118.000 L 70.000 144.000 C 70.000 147.314 67.314 150.000 64.000 150.000 C 60.686 150.000 58.000 147.314 58.000 144.000 L 58.000 118.000 L 48.000 118.000 C 44.686 118.000 42.000 115.314 42.000 112.000 C 42.000 108.686 44.686 106.000 48.000 106.000 L 80.000 106.000 C 83.314 106.000 86.000 108.686 86.000 112.000 Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
