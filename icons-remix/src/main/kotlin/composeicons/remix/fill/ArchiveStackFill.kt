package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArchiveStackFill: ImageVector
    get() {
        if (_archiveStackFill != null) return _archiveStackFill!!
        _archiveStackFill = remixIcon(
            name = "ArchiveStackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5h16v-2h-16v2ZM20 9h-16v-2h16v2ZM9 13h6v-2h6v9c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-9h6v2Z"),
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
        return _archiveStackFill!!
    }

private var _archiveStackFill: ImageVector? = null
