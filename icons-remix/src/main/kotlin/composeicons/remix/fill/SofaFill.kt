package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SofaFill: ImageVector
    get() {
        if (_sofaFill != null) return _sofaFill!!
        _sofaFill = remixIcon(
            name = "SofaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3h-6C6.02 3 3.548 5.172 3.08 8.019 3.218 8.007 3.358 8 3.5 8 5.985 8 8 10.015 8 12.5v1.5h8v-1.5C16 10.015 18.015 8 20.5 8c.142 0 .282 .007 .42 .019C20.452 5.172 17.98 3 15 3ZM21 10.05C20.838 10.017 20.671 10 20.5 10 19.119 10 18 11.119 18 12.5v4.5h-2v-1h-8v1h-2v-4.5C6 11.119 4.881 10 3.5 10c-.171 0-.338 .017-.5 .05-1.141 .232-2 1.24-2 2.45 0 .589 .182 1.039 .39 1.555 .281 .695 .61 1.51 .61 2.945v3c0 .552 .448 1 1 1h9 9c.552 0 1-.448 1-1v-3c-0-1.434 .329-2.25 .61-2.945 .208-.517 .39-.967 .39-1.555 0-1.21-.859-2.218-2-2.45Z"),
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
        return _sofaFill!!
    }

private var _sofaFill: ImageVector? = null
