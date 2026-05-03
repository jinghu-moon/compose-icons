package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatOffLine: ImageVector
    get() {
        if (_chatOffLine != null) return _chatOffLine!!
        _chatOffLine = remixIcon(
            name = "ChatOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.808 1.393 L 22.607 21.192 L 21.192 22.607 L 17.585 18.999 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.831 2.042 3.671 2.116 3.531 L 1.394 2.808 L 2.808 1.393 ZM 4.000 5.413 L 4.000 18.385 L 5.763 17.000 L 15.585 16.999 L 4.000 5.413 ZM 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 17.785 L 20.000 15.785 L 20.000 5.000 L 9.213 4.999 L 7.214 3.000 L 21.000 3.000 Z"),
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
        return _chatOffLine!!
    }

private var _chatOffLine: ImageVector? = null
