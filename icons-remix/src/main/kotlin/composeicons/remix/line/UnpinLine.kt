package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UnpinLine: ImageVector
    get() {
        if (_unpinLine != null) return _unpinLine!!
        _unpinLine = remixIcon(
            name = "UnpinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.97 17.172l-1.414 1.414L16.021 15.051l-.074 .074-.707 3.536-1.414 1.414L9.584 15.832 4.634 20.782 3.22 19.368 8.169 14.418 3.927 10.175 5.341 8.761 8.877 8.054l.074-.074L5.414 4.444 6.828 3.03 20.97 17.172ZM10.365 9.394l-.502 .502-2.822 .564 6.5 6.5 .564-2.822 .502-.502L10.365 9.394ZM18.776 9.468l-1.34 1.34 1.414 1.414 1.34-1.341 .707 .707 1.414-1.414L13.826 1.69 12.412 3.104l.707 .707L11.779 5.152l1.414 1.414L14.533 5.226l4.243 4.243Z"),
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
        return _unpinLine!!
    }

private var _unpinLine: ImageVector? = null
