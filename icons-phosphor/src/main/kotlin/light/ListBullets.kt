package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorLightIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 82.000 64.000 C 82.000 60.686 84.686 58.000 88.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 88.000 70.000 C 84.686 70.000 82.000 67.314 82.000 64.000 ZM 216.000 122.000 L 88.000 122.000 C 84.686 122.000 82.000 124.686 82.000 128.000 C 82.000 131.314 84.686 134.000 88.000 134.000 L 216.000 134.000 C 219.314 134.000 222.000 131.314 222.000 128.000 C 222.000 124.686 219.314 122.000 216.000 122.000 ZM 216.000 186.000 L 88.000 186.000 C 84.686 186.000 82.000 188.686 82.000 192.000 C 82.000 195.314 84.686 198.000 88.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 ZM 44.000 54.000 C 38.477 54.000 34.000 58.477 34.000 64.000 C 34.000 69.523 38.477 74.000 44.000 74.000 C 49.523 74.000 54.000 69.523 54.000 64.000 C 54.000 58.477 49.523 54.000 44.000 54.000 ZM 44.000 182.000 C 38.477 182.000 34.000 186.477 34.000 192.000 C 34.000 197.523 38.477 202.000 44.000 202.000 C 49.523 202.000 54.000 197.523 54.000 192.000 C 54.000 186.477 49.523 182.000 44.000 182.000 ZM 44.000 118.000 C 38.477 118.000 34.000 122.477 34.000 128.000 C 34.000 133.523 38.477 138.000 44.000 138.000 C 49.523 138.000 54.000 133.523 54.000 128.000 C 54.000 122.477 49.523 118.000 44.000 118.000 Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
