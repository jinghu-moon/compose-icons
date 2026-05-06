package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VideoOnAiLine: ImageVector
    get() {
        if (_videoOnAiLine != null) return _videoOnAiLine!!
        _videoOnAiLine = remixIcon(
            name = "VideoOnAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.713 9.128l-.247 .566c-.18 .414-.753 .414-.934 0L3.287 9.128C2.847 8.119 2.055 7.316 1.068 6.877L.308 6.539c-.411-.183-.411-.78 0-.963l.717-.319C2.038 4.807 2.844 3.974 3.276 2.931l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338C5.945 7.316 5.153 8.119 4.713 9.128ZM1 19v-7h2v6h12v-12h-5v-2h6c.552 0 1 .448 1 1v4.2L22.213 5.551c.226-.158 .538-.103 .696 .123 .059 .084 .09 .184 .09 .287v12.079c0 .276-.224 .5-.5 .5-.103 0-.203-.032-.287-.09L17 14.8v4.2c0 .552-.448 1-1 1h-14C1.448 20 1 19.552 1 19ZM17 12.359l4 2.8v-6.317l-4 2.8v.717Z"),
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
        return _videoOnAiLine!!
    }

private var _videoOnAiLine: ImageVector? = null
