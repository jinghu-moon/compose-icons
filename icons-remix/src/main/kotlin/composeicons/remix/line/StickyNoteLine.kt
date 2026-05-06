package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StickyNoteLine: ImageVector
    get() {
        if (_stickyNoteLine != null) return _stickyNoteLine!!
        _stickyNoteLine = remixIcon(
            name = "StickyNoteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 15l-6 5.996L4.002 21C3.449 21 3 20.555 3 20.007v-16.013C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .456 .993 1.002v10.998ZM19 5h-14v14h8v-5c0-.513 .386-.936 .883-.993L14 13l5-.001v-7.999ZM18.171 14.999 15 15v3.169l3.171-3.17Z"),
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
        return _stickyNoteLine!!
    }

private var _stickyNoteLine: ImageVector? = null
