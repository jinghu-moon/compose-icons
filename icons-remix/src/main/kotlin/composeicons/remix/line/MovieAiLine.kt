package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MovieAiLine: ImageVector
    get() {
        if (_movieAiLine != null) return _movieAiLine!!
        _movieAiLine = remixIcon(
            name = "MovieAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM2.992 3h11.008v2h-10v14h16v-8h2v9.007c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013C2 3.445 2.455 3 2.992 3ZM10.622 8.415l4.879 3.253c.184 .122 .233 .371 .111 .555-.029 .044-.067 .082-.111 .111l-4.879 3.253c-.184 .123-.432 .073-.555-.111C10.023 15.409 10 15.332 10 15.253v-6.505c0-.221 .179-.4 .4-.4 .079 0 .156 .023 .222 .067Z"),
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
        return _movieAiLine!!
    }

private var _movieAiLine: ImageVector? = null
