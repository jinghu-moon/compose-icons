package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SuitcaseFill: ImageVector
    get() {
        if (_suitcaseFill != null) return _suitcaseFill!!
        _suitcaseFill = remixIcon(
            name = "SuitcaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3c.552 0 1 .448 1 1v2h5c.552 0 1 .448 1 1v13c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-13C2 6.448 2.448 6 3 6h5v-2C8 3.448 8.448 3 9 3h6ZM8 8h-2v11h2v-11ZM18 8h-2v11h2v-11ZM14 5h-4v1h4v-1Z"),
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
        return _suitcaseFill!!
    }

private var _suitcaseFill: ImageVector? = null
