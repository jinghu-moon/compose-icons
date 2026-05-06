package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorLightIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c0 3.314-2.686 6-6 6h-112c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h112c3.314 0 6 2.686 6 6ZM104 70h112c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-112c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 186h-112c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h112c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM42.68 53.37 50 49.71v54.29c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-64c.001-2.079-1.075-4.01-2.843-5.104-1.768-1.094-3.977-1.194-5.837-.266l-16 8c-2.966 1.48-4.17 5.084-2.69 8.05 1.48 2.966 5.084 4.17 8.05 2.69ZM72 202h-20L73.48 173.26c3.585-4.61 5.141-10.48 4.31-16.26C76.973 151.133 73.799 145.853 69 142.38c-9.916-7.197-23.744-5.296-31.35 4.31-1.39 1.794-2.496 3.79-3.28 5.92-1.135 3.115 .47 6.56 3.585 7.695 3.115 1.135 6.56-.47 7.695-3.585 .352-.961 .851-1.862 1.48-2.67 3.596-4.517 10.113-5.399 14.78-2 2.174 1.57 3.618 3.955 4 6.61 .351 2.598-.371 5.226-2 7.28l-.06 .09L35.2 204.41c-1.358 1.818-1.574 4.246-.558 6.276 1.016 2.029 3.089 3.312 5.358 3.314h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
