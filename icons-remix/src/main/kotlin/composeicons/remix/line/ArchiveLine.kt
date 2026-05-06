package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArchiveLine: ImageVector
    get() {
        if (_archiveLine != null) return _archiveLine!!
        _archiveLine = remixIcon(
            name = "ArchiveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 10h-1v-5.997C2 3.449 2.455 3 2.992 3h18.016c.548 0 .992 .438 .992 1.003v5.997h-1v10.001c0 .552-.445 .999-.993 .999h-16.013C3.445 21 3 20.552 3 20.001v-10.001ZM19 10h-14v9h14v-9ZM4 5v3h16v-3h-16ZM9 12h6v2h-6v-2Z"),
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
        return _archiveLine!!
    }

private var _archiveLine: ImageVector? = null
