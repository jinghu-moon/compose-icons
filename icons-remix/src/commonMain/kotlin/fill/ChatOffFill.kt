package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatOffFill: ImageVector
    get() {
        if (_chatOffFill != null) return _chatOffFill!!
        _chatOffFill = remixIcon(
            name = "ChatOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.808 1.393 L 22.607 21.192 L 21.192 22.607 L 17.585 18.999 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.831 2.042 3.671 2.116 3.531 L 1.394 2.808 L 2.808 1.393 ZM 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 17.785 L 7.214 3.000 L 21.000 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _chatOffFill!!
    }

private var _chatOffFill: ImageVector? = null
