package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MarkPenLine: ImageVector
    get() {
        if (_markPenLine != null) return _markPenLine!!
        _markPenLine = remixIcon(
            name = "MarkPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.243 4.511 8.505 11.249l-.707 2.121L6.757 14.411l2.828 2.828 1.041-1.041 2.121-.707L19.485 8.754 15.243 4.511ZM21.607 8.047c.391 .391 .391 1.024 0 1.414l-7.778 7.778-2.121 .707-1.414 1.414c-.39 .391-1.024 .391-1.414 0L4.636 15.118c-.391-.391-.391-1.024 0-1.414L6.05 12.29l.707-2.121L14.536 2.39c.391-.391 1.024-.391 1.414 0l5.657 5.657ZM15.243 7.34l1.414 1.414-4.95 4.95L10.293 12.29 15.243 7.34ZM4.283 16.886l2.828 2.828L5.697 21.128 1.454 19.714 4.283 16.886Z"),
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
        return _markPenLine!!
    }

private var _markPenLine: ImageVector? = null
