package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoorOpenLine: ImageVector
    get() {
        if (_doorOpenLine != null) return _doorOpenLine!!
        _doorOpenLine = remixIcon(
            name = "DoorOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.998 21v-2l2-0v-14.165c0-.483 .346-.897 .821-.984L14.291 2.129c.326-.059 .638 .157 .698 .483 .006 .035 .01 .071 .01 .107v1.281l4 0c.552 0 1 .448 1 1v14l2 0v2h-4v-15L14.998 6v15h-13ZM12.998 4.397 5.998 5.669v13.331h7v-14.604ZM11.998 11v2h-2v-2h2Z"),
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
        return _doorOpenLine!!
    }

private var _doorOpenLine: ImageVector? = null
