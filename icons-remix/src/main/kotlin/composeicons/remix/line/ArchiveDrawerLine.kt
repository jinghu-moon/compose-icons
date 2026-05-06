package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArchiveDrawerLine: ImageVector
    get() {
        if (_archiveDrawerLine != null) return _archiveDrawerLine!!
        _archiveDrawerLine = remixIcon(
            name = "ArchiveDrawerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 2.992C3 2.444 3.445 2 3.993 2h16.013c.549 0 .993 .455 .993 .992v18.016c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.545 3 21.008v-18.016ZM19 11v-7h-14v7h14ZM19 13h-14v7h14v-7ZM9 6h6v2h-6v-2ZM9 15h6v2h-6v-2Z"),
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
        return _archiveDrawerLine!!
    }

private var _archiveDrawerLine: ImageVector? = null
