package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArchiveDrawerFill: ImageVector
    get() {
        if (_archiveDrawerFill != null) return _archiveDrawerFill!!
        _archiveDrawerFill = remixIcon(
            name = "ArchiveDrawerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 13h18v8.003c0 .551-.445 .997-.993 .997h-16.013C3.445 22 3 21.554 3 21.003v-8.003ZM3 2.998C3 2.447 3.445 2 3.993 2h16.013c.549 0 .993 .446 .993 .998v8.002h-18v-8.002ZM9 5v2h6v-2h-6ZM9 16v2h6v-2h-6Z"),
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
        return _archiveDrawerFill!!
    }

private var _archiveDrawerFill: ImageVector? = null
