package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FinderLine: ImageVector
    get() {
        if (_finderLine != null) return _finderLine!!
        _finderLine = remixIcon(
            name = "FinderLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.001 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h18ZM10.482 4.999 4.001 5v14l8.746-0c-.062-.344-.116-.683-.163-1.02-.297 .013-.491 .02-.583 .02C9.793 18 7.603 17.27 5.446 15.832L6.556 14.168C8.399 15.397 10.209 16 12.001 16c.133 0 .265-.003 .398-.01-.025-.497-.025-1.41 .007-1.99h-2.905v-1c0-3.275 .32-5.939 .981-8.001ZM12.601 4.999C11.936 6.582 11.557 9.411 11.512 12h3.122l-.14 1.124c-.101 .805-.137 1.645-.108 2.52 1.013-.299 2.032-.79 3.061-1.476l1.109 1.664c-1.32 .88-2.652 1.495-3.993 1.839 .057 .434 .131 .877 .219 1.328L20.001 19v-14L12.601 4.999ZM7.001 7c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1ZM17.001 7c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1Z"),
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
        return _finderLine!!
    }

private var _finderLine: ImageVector? = null
