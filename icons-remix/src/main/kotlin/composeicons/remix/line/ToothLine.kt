package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ToothLine: ImageVector
    get() {
        if (_toothLine != null) return _toothLine!!
        _toothLine = remixIcon(
            name = "ToothLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.706 5.89C6.429 5.022 7.507 4.5 9 4.5c.907 0 1.749 .267 2.454 .727 .783 .51 1.396 1.257 1.74 2.137 .201 .514 .781 .769 1.295 .568 .514-.201 .769-.781 .568-1.295C14.769 5.9 14.351 5.229 13.832 4.653c.372-.1 .763-.153 1.168-.153 1.493 0 2.571 .522 3.294 1.39 .744 .892 1.206 2.264 1.206 4.11 0 2.903-.486 5.385-1.23 7.102-.785 1.811-1.667 2.398-2.27 2.398-.15 0-.275-.035-.462-.358-.226-.392-.384-.96-.591-1.72-.174-.639-.39-1.433-.752-2.062C13.787 14.652 13.1 14 12 14c-1.1 0-1.787 .652-2.195 1.36-.362 .629-.578 1.423-.752 2.062-.207 .76-.366 1.327-.591 1.72-.186 .323-.312 .358-.462 .358-.603 0-1.485-.586-2.27-2.398C4.986 15.385 4.5 12.903 4.5 10c0-1.846 .462-3.217 1.206-4.11ZM12 3.232C11.102 2.764 10.081 2.5 9 2.5c-2.007 0-3.679 .728-4.831 2.11C3.038 5.967 2.5 7.846 2.5 10c0 3.097 .514 5.865 1.395 7.898 .84 1.939 2.208 3.602 4.105 3.602 1.1 0 1.787-.652 2.195-1.36 .374-.65 .593-1.477 .77-2.127 .198-.726 .354-1.274 .574-1.655C11.725 16.035 11.85 16 12 16c.15 0 .275 .035 .462 .358 .219 .381 .376 .929 .574 1.655 .177 .649 .396 1.476 .77 2.127 .408 .708 1.094 1.36 2.195 1.36 1.897 0 3.265-1.664 4.105-3.602 .881-2.032 1.395-4.8 1.395-7.898 0-2.154-.538-4.033-1.669-5.39C18.679 3.228 17.007 2.5 15 2.5c-1.081 0-2.102 .264-3 .732Z"),
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
        return _toothLine!!
    }

private var _toothLine: ImageVector? = null
