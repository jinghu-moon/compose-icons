package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Flag2Fill: ImageVector
    get() {
        if (_flag2Fill != null) return _flag2Fill!!
        _flag2Fill = remixIcon(
            name = "Flag2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 3h19.138c.276 0 .5 .224 .5 .5 0 .087-.023 .173-.066 .248L18 10l3.573 6.252c.137 .24 .054 .545-.186 .682-.076 .043-.161 .066-.248 .066h-17.138v5h-2v-19Z"),
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
        return _flag2Fill!!
    }

private var _flag2Fill: ImageVector? = null
