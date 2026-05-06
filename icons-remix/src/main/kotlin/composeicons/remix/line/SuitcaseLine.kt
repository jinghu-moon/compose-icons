package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SuitcaseLine: ImageVector
    get() {
        if (_suitcaseLine != null) return _suitcaseLine!!
        _suitcaseLine = remixIcon(
            name = "SuitcaseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3c.552 0 1 .448 1 1v2h5c.552 0 1 .448 1 1v13c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-13C2 6.448 2.448 6 3 6h5v-2C8 3.448 8.448 3 9 3h6ZM16 8h-8v11h8v-11ZM4 8v11h2v-11h-2ZM14 5h-4v1h4v-1ZM18 8v11h2v-11h-2Z"),
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
        return _suitcaseLine!!
    }

private var _suitcaseLine: ImageVector? = null
