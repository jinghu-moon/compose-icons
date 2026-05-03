package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorLightIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 112.000 134.000 C 108.686 134.000 106.000 131.314 106.000 128.000 C 106.000 124.686 108.686 122.000 112.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 112.000 70.000 L 216.000 70.000 C 219.314 70.000 222.000 67.314 222.000 64.000 C 222.000 60.686 219.314 58.000 216.000 58.000 L 112.000 58.000 C 108.686 58.000 106.000 60.686 106.000 64.000 C 106.000 67.314 108.686 70.000 112.000 70.000 ZM 216.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 ZM 72.000 142.000 C 74.425 141.998 76.611 140.536 77.538 138.295 C 78.466 136.055 77.954 133.476 76.240 131.760 L 40.490 96.000 L 76.240 60.240 C 78.443 57.876 78.378 54.192 76.093 51.907 C 73.808 49.622 70.124 49.557 67.760 51.760 L 27.760 91.760 C 25.420 94.103 25.420 97.897 27.760 100.240 L 67.760 140.240 C 68.884 141.366 70.409 141.999 72.000 142.000 Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
