package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brain3Fill: ImageVector
    get() {
        if (_brain3Fill != null) return _brain3Fill!!
        _brain3Fill = remixIcon(
            name = "Brain3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 4.783v2.888L22 9.114v5.772l-2.501 1.444 .001 2.887-5 2.887L13 21.238v-3.238h-2v3.237l-1.5 .867-5-2.887v-2.887L2 14.888 2.001 9.113 4.5 7.67v-2.886l5-2.887L11 2.764v3.236h2v-3.237l1.501-.866 4.999 2.887Z"),
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
        return _brain3Fill!!
    }

private var _brain3Fill: ImageVector? = null
