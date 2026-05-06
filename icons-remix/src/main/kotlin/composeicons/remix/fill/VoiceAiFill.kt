package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VoiceAiFill: ImageVector
    get() {
        if (_voiceAiFill != null) return _voiceAiFill!!
        _voiceAiFill = remixIcon(
            name = "VoiceAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 7.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 6.119 18.056 5.316 17.068 4.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319C18.038 2.807 18.844 1.974 19.276 .931l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM8.5 6h-2v12h2v-12ZM4 10h-2v4h2v-4ZM13 2h-2v20h2v-20ZM17.5 8h-2v10h2v-10ZM22 10h-2v4h2v-4Z"),
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
        return _voiceAiFill!!
    }

private var _voiceAiFill: ImageVector? = null
