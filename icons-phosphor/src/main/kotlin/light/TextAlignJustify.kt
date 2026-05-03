package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAlignJustify: ImageVector
    get() {
        if (_textAlignJustify != null) return _textAlignJustify!!
        _textAlignJustify = phosphorLightIcon(
            name = "TextAlignJustify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 216.000 98.000 L 40.000 98.000 C 36.686 98.000 34.000 100.686 34.000 104.000 C 34.000 107.314 36.686 110.000 40.000 110.000 L 216.000 110.000 C 219.314 110.000 222.000 107.314 222.000 104.000 C 222.000 100.686 219.314 98.000 216.000 98.000 ZM 216.000 138.000 L 40.000 138.000 C 36.686 138.000 34.000 140.686 34.000 144.000 C 34.000 147.314 36.686 150.000 40.000 150.000 L 216.000 150.000 C 219.314 150.000 222.000 147.314 222.000 144.000 C 222.000 140.686 219.314 138.000 216.000 138.000 ZM 216.000 178.000 L 40.000 178.000 C 36.686 178.000 34.000 180.686 34.000 184.000 C 34.000 187.314 36.686 190.000 40.000 190.000 L 216.000 190.000 C 219.314 190.000 222.000 187.314 222.000 184.000 C 222.000 180.686 219.314 178.000 216.000 178.000 Z"),
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
        return _textAlignJustify!!
    }

private var _textAlignJustify: ImageVector? = null
