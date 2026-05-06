package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShapeLine: ImageVector
    get() {
        if (_shapeLine != null) return _shapeLine!!
        _shapeLine = remixIcon(
            name = "ShapeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.829 20C7.417 21.165 6.306 22 5 22 3.343 22 2 20.657 2 19c0-1.306 .835-2.417 2-2.829v-8.341C2.835 7.417 2 6.306 2 5 2 3.343 3.343 2 5 2c1.306 0 2.417 .835 2.829 2h8.341C16.583 2.835 17.694 2 19 2c1.657 0 3 1.343 3 3 0 1.306-.835 2.417-2 2.829v8.341c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3-1.306 0-2.417-.835-2.829-2h-8.341ZM7.829 18h8.341c.301-.852 .977-1.528 1.829-1.829v-8.341C17.148 7.528 16.472 6.852 16.171 6h-8.341C7.528 6.852 6.852 7.528 6 7.829v8.341c.852 .301 1.528 .977 1.829 1.829ZM5 6C5.552 6 6 5.552 6 5 6 4.448 5.552 4 5 4 4.448 4 4 4.448 4 5c0 .552 .448 1 1 1ZM19 6c.552 0 1-.448 1-1C20 4.448 19.552 4 19 4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM19 20c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM5 20c.552 0 1-.448 1-1C6 18.448 5.552 18 5 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _shapeLine!!
    }

private var _shapeLine: ImageVector? = null
