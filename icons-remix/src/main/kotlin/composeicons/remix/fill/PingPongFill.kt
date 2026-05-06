package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PingPongFill: ImageVector
    get() {
        if (_pingPongFill != null) return _pingPongFill!!
        _pingPongFill = remixIcon(
            name = "PingPongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 2C16.747 2 21 6.253 21 11.5c0 1.529-.361 2.974-1.003 4.254l2.463 2.464c.391 .39 .391 1.024 0 1.414l-2.828 2.828c-.391 .391-1.024 .391-1.414 0L15.754 19.997C14.474 20.639 13.029 21 11.5 21 6.253 21 2 16.747 2 11.5 2 6.253 6.253 2 11.5 2ZM16.803 15.388l-1.414 1.414 3.536 3.536 1.414-1.414L16.803 15.388ZM18.667 9.283 9.283 18.667c.701 .216 1.445 .333 2.217 .333 .967 0 1.891-.183 2.74-.516l-.972-.973c-.391-.391-.391-1.024 0-1.414l2.828-2.828c.39-.391 1.024-.391 1.414 0l.973 .972c.333-.849 .516-1.773 .516-2.74 0-.772-.117-1.516-.333-2.217Z"),
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
        return _pingPongFill!!
    }

private var _pingPongFill: ImageVector? = null
