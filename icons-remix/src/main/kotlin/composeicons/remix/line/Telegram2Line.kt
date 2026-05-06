package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Telegram2Line: ImageVector
    get() {
        if (_telegram2Line != null) return _telegram2Line!!
        _telegram2Line = remixIcon(
            name = "Telegram2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.094 7.146c.593-.215 .888-.293 1.051-.32 .001 .052 0 .094-.003 .122-.233 2.444-1.252 8.457-1.775 11.254-.123 .655-.217 .967-.849 .595-.417-.245-.793-.553-1.197-.818-1.325-.868-3.221-2.162-3.065-2.084-1.304-.859-.758-1.386-.03-2.087 .118-.114 .24-.232 .361-.357 .054-.056 .316-.3 .687-.644 1.188-1.105 3.484-3.239 3.542-3.486 .01-.041 .018-.192-.071-.271-.09-.08-.222-.052-.318-.031-.136 .031-2.293 1.457-6.473 4.279-.612 .421-1.167 .626-1.664 .615l.004 .002c-.655-.231-1.308-.43-1.964-.63-.431-.131-.864-.263-1.3-.405-.107-.035-.211-.068-.308-.098C8.248 10.811 11.263 9.512 12.774 8.884c2.194-.913 3.496-1.438 4.32-1.738ZM19.517 5.218c-.253-.206-.532-.3-.725-.346-.2-.048-.39-.063-.534-.061-.476 .008-.988 .144-1.846 .455-.875 .317-2.219 .861-4.406 1.771C10.464 7.679 7.394 9.001 2.804 11.001c-.403 .161-.773 .344-1.065 .561-.27 .2-.647 .559-.716 1.109-.052 .416 .069 .8 .315 1.102 .214 .263 .489 .423 .697 .524 .31 .15 .727 .281 1.094 .396 .573 .18 1.145 .363 1.719 .539 1.778 .544 3.242 .992 4.852 2.054 1.181 .778 2.34 1.591 3.523 2.366 .432 .283 .835 .608 1.281 .869 .487 .286 1.106 .547 1.859 .477 1.138-.105 1.731-1.152 1.969-2.43 .522-2.791 1.558-8.887 1.8-11.433 .032-.332-.005-.705-.036-.885-.032-.185-.129-.669-.58-1.035Z"),
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
        return _telegram2Line!!
    }

private var _telegram2Line: ImageVector? = null
