package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VideoOnAiFill: ImageVector
    get() {
        if (_videoOnAiFill != null) return _videoOnAiFill!!
        _videoOnAiFill = remixIcon(
            name = "VideoOnAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.713 9.128l-.247 .566c-.18 .414-.753 .414-.934 0L3.287 9.128C2.847 8.119 2.055 7.316 1.068 6.877L.308 6.539c-.411-.183-.411-.78 0-.963l.717-.319C2.038 4.807 2.844 3.974 3.276 2.931l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338C5.945 7.316 5.153 8.119 4.713 9.128ZM10 6c0 3.314-2.686 6-6 6C2.907 12 1.883 11.708 1 11.197v7.803c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-4.2l5.213 3.649c.084 .059 .184 .09 .287 .09 .276 0 .5-.224 .5-.5v-12.079c0-.103-.032-.203-.09-.287-.158-.226-.47-.281-.696-.123L17 9.2v-4.2C17 4.448 16.552 4 16 4h-6.341C9.88 4.626 10 5.299 10 6Z"),
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
        return _videoOnAiFill!!
    }

private var _videoOnAiFill: ImageVector? = null
