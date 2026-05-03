package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorLightIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 112.000 134.000 C 108.686 134.000 106.000 131.314 106.000 128.000 C 106.000 124.686 108.686 122.000 112.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 112.000 70.000 L 216.000 70.000 C 219.314 70.000 222.000 67.314 222.000 64.000 C 222.000 60.686 219.314 58.000 216.000 58.000 L 112.000 58.000 C 108.686 58.000 106.000 60.686 106.000 64.000 C 106.000 67.314 108.686 70.000 112.000 70.000 ZM 216.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 ZM 35.760 140.240 C 38.103 142.580 41.897 142.580 44.240 140.240 L 84.240 100.240 C 86.580 97.897 86.580 94.103 84.240 91.760 L 44.240 51.760 C 41.876 49.557 38.192 49.622 35.907 51.907 C 33.622 54.192 33.557 57.876 35.760 60.240 L 71.510 96.000 L 35.760 131.760 C 33.420 134.103 33.420 137.897 35.760 140.240 Z"),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
