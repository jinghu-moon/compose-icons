package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoorOpenFill: ImageVector
    get() {
        if (_doorOpenFill != null) return _doorOpenFill!!
        _doorOpenFill = remixIcon(
            name = "DoorOpenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.998 21v-2l2-0v-14.165c0-.483 .346-.897 .821-.984L14.291 2.129c.326-.059 .638 .157 .698 .483 .006 .035 .01 .071 .01 .107v1.281l4 0c.552 0 1 .448 1 1v14l2 0v2h-4v-15L14.998 6v15h-13ZM11.998 11h-2v2h2v-2Z"),
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
        return _doorOpenFill!!
    }

private var _doorOpenFill: ImageVector? = null
