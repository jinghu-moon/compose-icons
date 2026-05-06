package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandHeightFill: ImageVector
    get() {
        if (_expandHeightFill != null) return _expandHeightFill!!
        _expandHeightFill = remixIcon(
            name = "ExpandHeightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2h-12v2h12v-2ZM16.95 9.45 12 4.5 7.053 9.447 11 9.448v5.102L7.051 14.55l4.95 4.95 4.95-4.95L13 14.55v-5.101l3.95 .001ZM18 20v2h-12v-2h12Z"),
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
        return _expandHeightFill!!
    }

private var _expandHeightFill: ImageVector? = null
