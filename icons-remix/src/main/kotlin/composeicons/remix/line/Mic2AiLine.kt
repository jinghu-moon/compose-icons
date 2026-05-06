package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Mic2AiLine: ImageVector
    get() {
        if (_mic2AiLine != null) return _mic2AiLine!!
        _mic2AiLine = remixIcon(
            name = "Mic2AiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 7.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 6.119 18.056 5.316 17.068 4.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319C18.038 2.807 18.844 1.974 19.276 .931l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM7 6C7 3.239 9.239 1 12 1c.991 0 1.918 .29 2.697 .789L13.617 3.472C13.151 3.173 12.597 3 12 3 10.343 3 9 4.343 9 6v6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-5h2v5c0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12v-6ZM2.192 13.962l1.962-.392c.729 3.667 3.965 6.431 7.846 6.431 3.881 0 7.117-2.764 7.846-6.431l1.962 .392c-.912 4.584-4.956 8.038-9.808 8.038-4.852 0-8.896-3.455-9.808-8.038Z"),
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
        return _mic2AiLine!!
    }

private var _mic2AiLine: ImageVector? = null
