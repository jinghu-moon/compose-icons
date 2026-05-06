package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StickyNote2Line: ImageVector
    get() {
        if (_stickyNote2Line != null) return _stickyNote2Line!!
        _stickyNote2Line = remixIcon(
            name = "StickyNote2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.998 21C3.447 21 3 20.555 3 20.007v-16.013C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .447 .993 .999v12.001l-5.003 5h-11.999ZM5 19h10.169L19 15.171v-10.171h-14v14Z"),
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
        return _stickyNote2Line!!
    }

private var _stickyNote2Line: ImageVector? = null
