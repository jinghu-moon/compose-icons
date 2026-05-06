package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlassesLine: ImageVector
    get() {
        if (_glassesLine != null) return _glassesLine!!
        _glassesLine = remixIcon(
            name = "GlassesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 9C4.343 9 3 10.343 3 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-.637-.198-1.225-.535-1.71C7.922 9.508 7.02 9 6 9ZM1 12C1 9.239 3.239 7 6 7c1.214 0 2.327 .433 3.192 1.151C9.914 7.44 10.905 7 12 7c1.095 0 2.086 .44 2.808 1.151C15.673 7.433 16.786 7 18 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5-2.761 0-5-2.239-5-5 0-.816 .196-1.589 .545-2.271C13.177 9.283 12.621 9 12 9c-.621 0-1.177 .283-1.545 .729 .348 .682 .545 1.454 .545 2.271 0 2.761-2.239 5-5 5C3.239 17 1 14.761 1 12ZM18 9c-1.02 0-1.922 .508-2.465 1.29C15.198 10.775 15 11.363 15 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 10.343 19.657 9 18 9Z"),
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
        return _glassesLine!!
    }

private var _glassesLine: ImageVector? = null
