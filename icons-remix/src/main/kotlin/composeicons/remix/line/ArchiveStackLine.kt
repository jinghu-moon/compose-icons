package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArchiveStackLine: ImageVector
    get() {
        if (_archiveStackLine != null) return _archiveStackLine!!
        _archiveStackLine = remixIcon(
            name = "ArchiveStackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5h16v-2h-16v2ZM20 9h-16v-2h16v2ZM3 11h7v2h4v-2h7v9c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-9ZM16 13v2h-8v-2h-3v6h14v-6h-3Z"),
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
        return _archiveStackLine!!
    }

private var _archiveStackLine: ImageVector? = null
