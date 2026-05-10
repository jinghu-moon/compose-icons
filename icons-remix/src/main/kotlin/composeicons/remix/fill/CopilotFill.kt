package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CopilotFill: ImageVector
    get() {
        if (_copilotFill != null) return _copilotFill!!
        _copilotFill = remixIcon(
            name = "CopilotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.662 14.484c0-.553 .448-1.001 1.001-1.001 .553 0 1.001 .448 1.001 1.001v1.997c0 .553-.448 1.001-1.001 1.001-.553 0-1.001-.448-1.001-1.001v-1.997ZM15.337 14.484c0-.553-.448-1.001-1.001-1.001-.553 0-1.001 .449-1.001 1.001v1.997c0 .553 .448 1.001 1.001 1.001 .553 0 1.001-.448 1.001-1.001v-1.997ZM12 4.028C11.154 2.809 9.401 2.719 8.054 2.84 6.511 2.994 5.211 3.525 4.48 4.304 3.213 5.69 3.154 8.595 3.765 10.195c-.061 .273-.12 .55-.162 .844-1.13 .298-2.283 1.899-2.283 3.043v2.163c0 .6 .28 1.148 .774 1.521 2.824 2.099 6.344 3.724 9.905 3.724 3.56 0 7.081-1.626 9.905-3.724 .494-.374 .774-.921 .774-1.521v-2.163c0-1.145-1.153-2.746-2.283-3.043-.042-.293-.101-.57-.162-.844 .612-1.6 .553-4.505-.715-5.891C18.788 3.525 17.488 2.994 15.945 2.84 14.598 2.719 12.845 2.809 12 4.028ZM18.674 17.487c-1.535 .854-4.085 2-6.674 2-2.59 0-5.14-1.146-6.675-2v-5.798c2.477 .959 5.327 .465 6.673-1.758h.004c1.345 2.222 4.196 2.717 6.673 1.758v5.798ZM10.665 6.829c0 1.585-.48 3.311-2.67 3.311C5.805 10.14 5.388 9.616 5.388 8.143c0-2.336 .357-3.336 3.316-3.336 1.71 0 1.961 .549 1.961 2.022ZM13.334 6.829c0-1.473 .25-2.022 1.961-2.022 2.96 0 3.316 1 3.316 3.336 0 1.473-.417 1.997-2.607 1.997-2.19 0-2.67-1.726-2.67-3.311Z"),
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
        return _copilotFill!!
    }

private var _copilotFill: ImageVector? = null
