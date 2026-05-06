package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandWidthLine: ImageVector
    get() {
        if (_expandWidthLine != null) return _expandWidthLine!!
        _expandWidthLine = remixIcon(
            name = "ExpandWidthLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 18v-12h2v12h-2ZM9.45 7.05 4.5 12l4.947 4.947 1.414-1.414L8.328 13h7.342l-2.535 2.535 1.414 1.414 4.95-4.95L14.55 7.05 13.136 8.464 15.672 11h-7.344L10.864 8.464 9.45 7.05ZM20 6h2v12h-2v-12Z"),
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
        return _expandWidthLine!!
    }

private var _expandWidthLine: ImageVector? = null
