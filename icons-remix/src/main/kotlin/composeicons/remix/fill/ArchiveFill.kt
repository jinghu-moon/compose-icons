package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArchiveFill: ImageVector
    get() {
        if (_archiveFill != null) return _archiveFill!!
        _archiveFill = remixIcon(
            name = "ArchiveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 10h18v10.004c0 .55-.445 .996-.993 .996h-16.013C3.445 21 3 20.555 3 20.004v-10.004ZM9 12v2h6v-2h-6ZM2 4C2 3.448 2.455 3 2.992 3h18.016c.548 0 .992 .444 .992 1v4h-20v-4Z"),
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
        return _archiveFill!!
    }

private var _archiveFill: ImageVector? = null
