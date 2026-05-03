package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorLightIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 112.000 L 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 C 220.686 214.000 218.000 211.314 218.000 208.000 L 218.000 123.210 L 203.330 133.000 C 200.569 134.839 196.839 134.091 195.000 131.330 C 193.161 128.569 193.909 124.839 196.670 123.000 L 220.670 107.000 C 222.512 105.771 224.882 105.656 226.834 106.703 C 228.786 107.749 230.003 109.785 230.000 112.000 ZM 144.000 50.000 C 140.686 50.000 138.000 52.686 138.000 56.000 L 138.000 110.000 L 46.000 110.000 L 46.000 56.000 C 46.000 52.686 43.314 50.000 40.000 50.000 C 36.686 50.000 34.000 52.686 34.000 56.000 L 34.000 176.000 C 34.000 179.314 36.686 182.000 40.000 182.000 C 43.314 182.000 46.000 179.314 46.000 176.000 L 46.000 122.000 L 138.000 122.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 L 150.000 56.000 C 150.000 52.686 147.314 50.000 144.000 50.000 Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
