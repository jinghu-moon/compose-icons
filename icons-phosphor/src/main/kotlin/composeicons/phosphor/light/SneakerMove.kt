package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorLightIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.26 168.42 201.64 154.11C184.655 145.692 173.935 128.347 174 109.39v-29.39c0-3.314-2.686-6-6-6C140.399 73.967 118.033 51.601 118 24c-.002-2.276-1.292-4.355-3.33-5.368-2.038-1.013-4.475-.785-6.29 .588L31.38 77.63l-.15 .11c-3.093 2.491-4.982 6.178-5.197 10.143-.216 3.965 1.263 7.835 4.067 10.647L143.82 212.24c1.124 1.126 2.649 1.759 4.24 1.76h75.94c7.732 0 14-6.268 14-14v-19.06c.013-5.306-2.987-10.16-7.74-12.52ZM226 200c0 1.105-.895 2-2 2h-73.46L38.59 90c-.393-.39-.607-.926-.59-1.48 .028-.544 .277-1.054 .69-1.41L53.05 76.22l40 40c2.347 2.312 6.12 2.299 8.451-.029 2.331-2.328 2.349-6.101 .039-8.451L62.71 68.91 107 35.3c5.081 27.166 27.495 47.71 55 50.41v23.68c-.081 23.505 13.21 45.011 34.27 55.45l28.62 14.32c.676 .336 1.106 1.025 1.11 1.78ZM70.8 182h-38.8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h38.8c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM108.8 208c0 3.314-2.686 6-6 6h-54.8c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h54.8c3.314 0 6 2.686 6 6Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
