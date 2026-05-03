package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HistoryLine: ImageVector
    get() {
        if (_historyLine != null) return _historyLine!!
        _historyLine = remixIcon(
            name = "HistoryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.250 4.000 6.824 5.387 5.385 7.500 L 8.000 7.500 L 8.000 9.500 L 2.000 9.500 L 2.000 3.500 L 4.000 3.500 L 4.000 5.999 C 5.824 3.571 8.729 2.000 12.000 2.000 ZM 13.000 7.000 L 13.000 11.585 L 16.243 14.828 L 14.828 16.243 L 11.000 12.413 L 11.000 7.000 L 13.000 7.000 Z"),
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
        return _historyLine!!
    }

private var _historyLine: ImageVector? = null
