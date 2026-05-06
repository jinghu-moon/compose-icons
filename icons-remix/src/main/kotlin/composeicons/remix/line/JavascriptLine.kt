package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.JavascriptLine: ImageVector
    get() {
        if (_javascriptLine != null) return _javascriptLine!!
        _javascriptLine = remixIcon(
            name = "JavascriptLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.334 16.055l-.858 1.188c.814 .726 1.826 1.089 3.036 1.089 .924-.022 1.628-.26 2.112-.715 .491-.462 .737-1.012 .737-1.65 0-.623-.172-1.137-.517-1.54-.345-.403-.924-.726-1.738-.968-.675-.205-1.151-.392-1.43-.561-.279-.176-.418-.389-.418-.638 0-.227 .114-.411 .341-.55 .227-.139 .532-.209 .913-.209 .279 0 .594 .055 .946 .165 .352 .095 .664 .249 .935 .462l.77-1.199c-.675-.543-1.569-.814-2.684-.814-.799 0-1.456 .205-1.969 .616-.528 .411-.792 .92-.792 1.529 .007 .645 .22 1.148 .638 1.507 .425 .359 1.03 .653 1.815 .88 .653 .205 1.096 .411 1.331 .616 .227 .205 .341 .455 .341 .748 0 .286-.114 .506-.341 .66-.235 .161-.572 .242-1.012 .242-.719 .007-1.437-.279-2.156-.858ZM7.804 16.693c-.22-.132-.425-.326-.616-.583l-1.034 .847c.308 .521 .689 .884 1.144 1.089 .425 .191 .913 .286 1.463 .286 .301 0 .612-.048 .935-.143 .323-.095 .62-.257 .891-.484 .477-.381 .726-1.005 .748-1.87v-5.588h-1.485v5.302c0 .506-.114 .862-.341 1.067-.227 .198-.513 .297-.858 .297-.33 0-.612-.073-.847-.22ZM3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12ZM6 5C5.448 5 5 5.448 5 6v12c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-12C19 5.448 18.552 5 18 5h-12Z"),
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
        return _javascriptLine!!
    }

private var _javascriptLine: ImageVector? = null
