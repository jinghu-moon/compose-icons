package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RedditFill: ImageVector
    get() {
        if (_redditFill != null) return _redditFill!!
        _redditFill = remixIcon(
            name = "RedditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM18.671 12c-.021-.575-.378-1.084-.911-1.3-.533-.216-1.144-.098-1.559 .3C15.063 10.227 13.726 9.8 12.351 9.77l.65-3.12 2.14 .45c.052 .489 .452 .866 .943 .892 .491 .025 .927-.31 1.029-.79 .102-.481-.16-.964-.618-1.141-.458-.177-.977 .005-1.225 .43L12.821 6c-.081-.018-.166-.002-.235 .043-.069 .045-.118 .116-.135 .197l-.74 3.47c-1.392 .021-2.748 .448-3.9 1.23-.421-.396-1.037-.507-1.569-.281-.533 .225-.882 .744-.891 1.322-.009 .578 .325 1.107 .85 1.349-.011 .146-.011 .293 0 .44 0 2.24 2.61 4.06 5.83 4.06 3.22 0 5.83-1.82 5.83-4.06 .011-.147 .011-.294 0-.44 .504-.25 .819-.768 .81-1.33ZM8.671 13c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1-.265 0-.52-.105-.707-.293C8.776 13.52 8.671 13.265 8.671 13ZM14.481 15.75c-.71 .535-1.582 .807-2.47 .77-.888 .037-1.76-.235-2.47-.77-.088-.107-.08-.264 .018-.362 .098-.098 .255-.106 .362-.018 .601 .441 1.335 .663 2.08 .63 .746 .041 1.483-.175 2.09-.61 .071-.07 .175-.096 .271-.069 .096 .027 .17 .103 .195 .2 .025 .097-.004 .199-.076 .269v-.04ZM14.301 14.04c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 .011 .274-.091 .54-.282 .737-.191 .197-.454 .306-.728 .303l.01-.04Z"),
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
        return _redditFill!!
    }

private var _redditFill: ImageVector? = null
