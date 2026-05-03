package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorLightIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 42.000 L 96.000 42.000 C 61.758 42.000 34.000 69.758 34.000 104.000 C 34.000 138.242 61.758 166.000 96.000 166.000 L 138.000 166.000 L 138.000 208.000 C 138.000 211.314 140.686 214.000 144.000 214.000 C 147.314 214.000 150.000 211.314 150.000 208.000 L 150.000 54.000 L 178.000 54.000 L 178.000 208.000 C 178.000 211.314 180.686 214.000 184.000 214.000 C 187.314 214.000 190.000 211.314 190.000 208.000 L 190.000 54.000 L 208.000 54.000 C 211.314 54.000 214.000 51.314 214.000 48.000 C 214.000 44.686 211.314 42.000 208.000 42.000 ZM 138.000 154.000 L 96.000 154.000 C 68.386 154.000 46.000 131.614 46.000 104.000 C 46.000 76.386 68.386 54.000 96.000 54.000 L 138.000 54.000 Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
