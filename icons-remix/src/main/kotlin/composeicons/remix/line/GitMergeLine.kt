package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitMergeLine: ImageVector
    get() {
        if (_gitMergeLine != null) return _gitMergeLine!!
        _gitMergeLine = remixIcon(
            name = "GitMergeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.105 8.79C7.452 10.064 8.617 11 10 11h4c2.47 0 4.522 1.792 4.927 4.146C20.13 15.537 21 16.667 21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.267 .785-2.35 1.895-2.79C16.548 13.936 15.384 13 14 13h-4C8.874 13 7.836 12.628 7 12v3.17c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18c0-1.306 .835-2.417 2-2.829v-6.341C3.835 8.417 3 7.306 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6 9 7.267 8.215 8.35 7.105 8.79ZM6 7C6.552 7 7 6.552 7 6 7 5.448 6.552 5 6 5 5.448 5 5 5.448 5 6c0 .552 .448 1 1 1ZM6 19c.552 0 1-.448 1-1C7 17.448 6.552 17 6 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM18 19c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _gitMergeLine!!
    }

private var _gitMergeLine: ImageVector? = null
