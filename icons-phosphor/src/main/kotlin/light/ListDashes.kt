package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorLightIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 90.000 64.000 C 90.000 60.686 92.686 58.000 96.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 96.000 70.000 C 92.686 70.000 90.000 67.314 90.000 64.000 ZM 216.000 122.000 L 96.000 122.000 C 92.686 122.000 90.000 124.686 90.000 128.000 C 90.000 131.314 92.686 134.000 96.000 134.000 L 216.000 134.000 C 219.314 134.000 222.000 131.314 222.000 128.000 C 222.000 124.686 219.314 122.000 216.000 122.000 ZM 216.000 186.000 L 96.000 186.000 C 92.686 186.000 90.000 188.686 90.000 192.000 C 90.000 195.314 92.686 198.000 96.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 ZM 56.000 58.000 L 40.000 58.000 C 36.686 58.000 34.000 60.686 34.000 64.000 C 34.000 67.314 36.686 70.000 40.000 70.000 L 56.000 70.000 C 59.314 70.000 62.000 67.314 62.000 64.000 C 62.000 60.686 59.314 58.000 56.000 58.000 ZM 56.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 L 56.000 134.000 C 59.314 134.000 62.000 131.314 62.000 128.000 C 62.000 124.686 59.314 122.000 56.000 122.000 ZM 56.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 56.000 198.000 C 59.314 198.000 62.000 195.314 62.000 192.000 C 62.000 188.686 59.314 186.000 56.000 186.000 Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
