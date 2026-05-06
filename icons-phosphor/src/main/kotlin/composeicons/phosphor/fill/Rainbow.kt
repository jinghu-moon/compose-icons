package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorFillIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 48C61.756 48.072 8.072 101.756 8 168v16c0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8v-16C247.928 101.756 194.244 48.072 128 48ZM160 176c-4.418 0-8-3.582-8-8 0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 4.418-3.582 8-8 8ZM192 176c-4.418 0-8-3.582-8-8 0-30.928-25.072-56-56-56-30.928 0-56 25.072-56 56 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C56 128.236 88.235 96 128 96c39.764 0 72 32.236 72 72 0 4.418-3.582 8-8 8ZM224 176c-4.418 0-8-3.582-8-8C216 119.399 176.601 80 128 80 79.399 80 40 119.399 40 168c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C24 110.562 70.562 64 128 64c57.438 0 104 46.562 104 104 0 4.418-3.582 8-8 8Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
