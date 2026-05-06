package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoopLeftLine: ImageVector
    get() {
        if (_loopLeftLine != null) return _loopLeftLine!!
        _loopLeftLine = remixIcon(
            name = "LoopLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4C9.251 4 6.825 5.386 5.384 7.5h2.616v2h-6v-6h2v2.499C5.824 3.572 8.728 2 12 2c5.523 0 10 4.477 10 10h-2C20 7.582 16.418 4 12 4ZM4 12c0 4.418 3.582 8 8 8 2.749 0 5.175-1.386 6.616-3.5h-2.616v-2h6v6h-2v-2.499C18.176 20.428 15.272 22 12 22 6.477 22 2 17.523 2 12h2Z"),
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
        return _loopLeftLine!!
    }

private var _loopLeftLine: ImageVector? = null
