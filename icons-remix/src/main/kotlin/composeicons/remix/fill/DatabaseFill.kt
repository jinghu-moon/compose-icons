package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DatabaseFill: ImageVector
    get() {
        if (_databaseFill != null) return _databaseFill!!
        _databaseFill = remixIcon(
            name = "DatabaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 7v-3c0-.552 .448-1 1-1h9c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-12C2 7.448 2.448 7 3 7h8ZM5 16v2h5v-2h-5ZM14 16v2h5v-2h-5ZM14 13v2h5v-2h-5ZM14 10v2h5v-2h-5ZM5 13v2h5v-2h-5Z"),
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
        return _databaseFill!!
    }

private var _databaseFill: ImageVector? = null
