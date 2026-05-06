package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StickyNote2Fill: ImageVector
    get() {
        if (_stickyNote2Fill != null) return _stickyNote2Fill!!
        _stickyNote2Fill = remixIcon(
            name = "StickyNote2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 16l-5.003 5h-11.999C3.447 21 3 20.555 3 20.007v-16.013C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .447 .993 .999v12.001Z"),
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
        return _stickyNote2Fill!!
    }

private var _stickyNote2Fill: ImageVector? = null
