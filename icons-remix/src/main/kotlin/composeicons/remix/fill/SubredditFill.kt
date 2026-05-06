package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SubredditFill: ImageVector
    get() {
        if (_subredditFill != null) return _subredditFill!!
        _subredditFill = remixIcon(
            name = "SubredditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c1.994 0 3.849 .585 5.409 1.591L12.027 16.211h2.173L19.016 4.876C20.857 6.69 22 9.211 22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12.188 7.788c-.51-.009-1.013 .119-1.456 .372-.423 .248-.775 .563-1.054 .945h-.039v-1.193h-2.084v8.299h2.139v-4.4c0-.408 .095-.759 .287-1.054 .177-.282 .427-.511 .724-.662 .292-.148 .588-.222 .888-.222l-.001-.001c.13-0 .26 .012 .388 .036 .094 .012 .186 .039 .271 .081l.86-2.054c-.083-.037-.21-.07-.38-.101-.17-.031-.352-.047-.543-.047Z"),
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
        return _subredditFill!!
    }

private var _subredditFill: ImageVector? = null
