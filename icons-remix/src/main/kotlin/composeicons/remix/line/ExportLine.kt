package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExportLine: ImageVector
    get() {
        if (_exportLine != null) return _exportLine!!
        _exportLine = remixIcon(
            name = "ExportLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 4C22 3.448 21.552 3 21 3h-18C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-16ZM4 15h3.416c.772 1.766 2.534 3 4.584 3 2.05 0 3.812-1.234 4.584-3h3.416v4h-16v-4ZM4 5h16v8h-5c0 1.657-1.343 3-3 3C10.343 16 9 14.657 9 13h-5v-8ZM16 11h-3v3h-2v-3h-3L12 6.5 16 11Z"),
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
        return _exportLine!!
    }

private var _exportLine: ImageVector? = null
