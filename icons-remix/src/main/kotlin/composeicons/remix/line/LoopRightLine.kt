package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopRightLine: ImageVector
    get() {
        if (_loopRightLine != null) return _loopRightLine!!
        _loopRightLine = remixIcon(
            name = "LoopRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c2.749 0 5.175 1.386 6.616 3.5h-2.616v2h6v-6h-2v2.499C18.176 3.572 15.272 2 12 2 6.477 2 2 6.477 2 12h2C4 7.582 7.582 4 12 4ZM20 12c0 4.418-3.582 8-8 8C9.251 20 6.825 18.614 5.384 16.5h2.616v-2h-6v6h2v-2.499C5.824 20.428 8.728 22 12 22c5.523 0 10-4.477 10-10h-2Z"),
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
        return _loopRightLine!!
    }

private var _loopRightLine: ImageVector? = null
