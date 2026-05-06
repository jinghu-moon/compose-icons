package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PingPongLine: ImageVector
    get() {
        if (_pingPongLine != null) return _pingPongLine!!
        _pingPongLine = remixIcon(
            name = "PingPongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 2C16.747 2 21 6.253 21 11.5c0 1.529-.361 2.974-1.003 4.254l2.463 2.464c.391 .39 .391 1.024 0 1.414l-2.828 2.828c-.391 .391-1.024 .391-1.414 0L15.754 19.997C14.474 20.639 13.029 21 11.5 21 6.253 21 2 16.747 2 11.5 2 6.253 6.253 2 11.5 2ZM16.803 15.388l-1.414 1.414 3.536 3.536 1.414-1.414L16.803 15.388ZM18.667 9.283 9.283 18.667c.701 .216 1.445 .333 2.217 .333 .967 0 1.891-.183 2.74-.516l-.972-.973c-.391-.391-.391-1.024 0-1.414l2.828-2.828c.39-.391 1.024-.391 1.414 0l.973 .972c.333-.849 .516-1.773 .516-2.74 0-.772-.117-1.516-.333-2.217ZM11.5 4C7.358 4 4 7.358 4 11.5c0 2.613 1.337 4.915 3.364 6.257L17.757 7.364C16.415 5.337 14.113 4 11.5 4Z"),
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
        return _pingPongLine!!
    }

private var _pingPongLine: ImageVector? = null
