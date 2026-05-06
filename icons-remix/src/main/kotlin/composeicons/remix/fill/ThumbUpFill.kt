package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThumbUpFill: ImageVector
    get() {
        if (_thumbUpFill != null) return _thumbUpFill!!
        _thumbUpFill = remixIcon(
            name = "ThumbUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 9h3v12h-3C1.448 21 1 20.552 1 20v-10c0-.552 .448-1 1-1ZM7.293 7.707 13.693 1.307c.176-.176 .454-.196 .653-.046l.853 .639c.485 .364 .703 .983 .554 1.57L14.6 8h6.4c1.105 0 2 .895 2 2v2.104c0 .261-.051 .52-.151 .762l-3.094 7.515c-.154 .375-.519 .619-.925 .619h-10.83C7.448 21 7 20.552 7 20v-11.586c0-.265 .105-.52 .293-.707Z"),
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
        return _thumbUpFill!!
    }

private var _thumbUpFill: ImageVector? = null
