package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandWidthFill: ImageVector
    get() {
        if (_expandWidthFill != null) return _expandWidthFill!!
        _expandWidthFill = remixIcon(
            name = "ExpandWidthFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 6v12h2v-12h-2ZM9.45 7.05 4.5 12l4.947 4.947L9.448 13h5.102l-0 3.949 4.95-4.95L14.55 7.05 14.55 11h-5.101L9.45 7.05ZM20 6h2v12h-2v-12Z"),
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
        return _expandWidthFill!!
    }

private var _expandWidthFill: ImageVector? = null
