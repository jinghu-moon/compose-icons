package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorFillIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 187.85c2.566 1.709 5.238 3.252 8 4.62v39.53c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-39.53c2.762-1.368 5.434-2.911 8-4.62ZM198.1 62.59C186.267 34.337 158.63 15.95 128 15.95c-30.63 0-58.267 18.388-70.1 46.64C32.377 74.256 16.004 99.737 16 127.8 15.9 166 48 199 86.14 200c11.731 .278 23.353-2.307 33.86-7.53v-35.53L76.42 135.16c-3.954-1.977-5.557-6.786-3.58-10.74 1.977-3.954 6.786-5.557 10.74-3.58L120 139.06v-51.06c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v27.06L172.42 96.84c3.954-1.977 8.763-.374 10.74 3.58 1.977 3.954 .374 8.763-3.58 10.74L136 132.94v59.53c9.945 4.938 20.896 7.515 32 7.53h1.82C208 199 240.11 166 240 127.8 239.996 99.737 223.623 74.256 198.1 62.59Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
