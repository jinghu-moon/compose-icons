package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailAiFill: ImageVector
    get() {
        if (_mailAiFill != null) return _mailAiFill!!
        _mailAiFill = remixIcon(
            name = "MailAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM20 11c.701 0 1.374-.12 2-.341v9.341c0 .552-.448 1-1 1h-19v-17C2 3.448 2.448 3 3 3h11.341c-.221 .626-.341 1.299-.341 2 0 1.444 .51 2.768 1.359 3.803l-3.359 2.879L5.651 6.241 4.349 7.759l7.651 6.558 4.886-4.188c.908 .552 1.974 .871 3.114 .871Z"),
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
        return _mailAiFill!!
    }

private var _mailAiFill: ImageVector? = null
