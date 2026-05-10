package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brain4Fill: ImageVector
    get() {
        if (_brain4Fill != null) return _brain4Fill!!
        _brain4Fill = remixIcon(
            name = "Brain4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 4.783v2.888L22 9.114v5.772l-2.501 1.444 .001 2.887-5 2.887L13 21.238v-6.315L9.036 12.634l-1 1.732L11 16.077v5.16l-1.5 .867-5-2.887v-2.887L2 14.888 2.001 9.113 4.5 7.67v-2.886l5-2.887L11 2.764v6.313l3.965 2.289 1-1.732L12.999 7.922v-5.159l1.502-.866 4.999 2.887Z"),
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
        return _brain4Fill!!
    }

private var _brain4Fill: ImageVector? = null
