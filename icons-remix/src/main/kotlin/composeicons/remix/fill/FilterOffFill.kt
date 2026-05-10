package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilterOffFill: ImageVector
    get() {
        if (_filterOffFill != null) return _filterOffFill!!
        _filterOffFill = remixIcon(
            name = "FilterOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.929 .515 21.071 14.657l-1.414 1.414L15.834 12.249 14 15v7h-4v-7L4 6h-1v-2L7.585 4 5.515 1.929 6.929 .515ZM21 4v2h-1L18.085 8.872 13.213 4h7.787Z"),
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
        return _filterOffFill!!
    }

private var _filterOffFill: ImageVector? = null
