package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Anticlockwise2Fill: ImageVector
    get() {
        if (_anticlockwise2Fill != null) return _anticlockwise2Fill!!
        _anticlockwise2Fill = remixIcon(
            name = "Anticlockwise2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 4h2c2.761 0 5 2.239 5 5v4h-2v-4C19 7.343 17.657 6 16 6h-2v3L9 5 14 1v3ZM15 11v10c0 .552-.448 1-1 1h-10C3.448 22 3 21.552 3 21v-10c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1Z"),
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
        return _anticlockwise2Fill!!
    }

private var _anticlockwise2Fill: ImageVector? = null
