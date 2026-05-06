package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MovieAiFill: ImageVector
    get() {
        if (_movieAiFill != null) return _movieAiFill!!
        _movieAiFill = remixIcon(
            name = "MovieAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM20 11c.701 0 1.374-.12 2-.341v9.348c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013C2 3.445 2.455 3 2.992 3h11.35C14.12 3.626 14 4.299 14 5c0 3.314 2.686 6 6 6ZM10.622 8.415c-.066-.044-.143-.067-.222-.067-.221 0-.4 .179-.4 .4v6.505c0 .079 .023 .156 .067 .222 .123 .184 .371 .234 .555 .111l4.879-3.253c.044-.029 .082-.067 .111-.111 .123-.184 .073-.432-.111-.555L10.622 8.415Z"),
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
        return _movieAiFill!!
    }

private var _movieAiFill: ImageVector? = null
