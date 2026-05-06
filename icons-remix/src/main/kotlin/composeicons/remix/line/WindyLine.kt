package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WindyLine: ImageVector
    get() {
        if (_windyLine != null) return _windyLine!!
        _windyLine = remixIcon(
            name = "WindyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 17h-6.5v-2h6.5C12.433 15 14 16.567 14 18.5 14 20.433 12.433 22 10.5 22 9 22 7.72 21.056 7.222 19.729l1.873-.702c.213 .569 .762 .973 1.405 .973C11.328 20 12 19.328 12 18.5 12 17.672 11.328 17 10.5 17ZM5 11h13.5C20.433 11 22 12.567 22 14.5 22 16.433 20.433 18 18.5 18c-1.5 0-2.78-.944-3.278-2.271l1.873-.702c.213 .569 .762 .973 1.405 .973C19.328 16 20 15.328 20 14.5 20 13.672 19.328 13 18.5 13h-13.5C3.343 13 2 11.657 2 10 2 8.343 3.343 7 5 7h8.5C14.328 7 15 6.328 15 5.5 15 4.672 14.328 4 13.5 4c-.643 0-1.192 .405-1.405 .973L10.222 4.271C10.72 2.944 12 2 13.5 2 15.433 2 17 3.567 17 5.5 17 7.433 15.433 9 13.5 9h-8.5C4.448 9 4 9.448 4 10c0 .552 .448 1 1 1Z"),
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
        return _windyLine!!
    }

private var _windyLine: ImageVector? = null
