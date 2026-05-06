package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilterOffLine: ImageVector
    get() {
        if (_filterOffLine != null) return _filterOffLine!!
        _filterOffLine = remixIcon(
            name = "FilterOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.929 .515 21.071 14.657l-1.414 1.414L15.834 12.249 15 13.5v8.5h-6v-8.5L4 6h-1v-2L7.585 4 5.515 1.929 6.929 .515ZM9.585 6 6.404 6 11 12.894v7.106h2v-7.106l1.392-2.088L9.585 6ZM21 4v2h-1L18.085 8.872 16.643 7.429l.953-1.429h-2.383l-2-2h7.787Z"),
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
        return _filterOffLine!!
    }

private var _filterOffLine: ImageVector? = null
