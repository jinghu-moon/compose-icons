package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Spam2Fill: ImageVector
    get() {
        if (_spam2Fill != null) return _spam2Fill!!
        _spam2Fill = remixIcon(
            name = "Spam2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.936 2.501l5.565 5.565v7.87l-5.565 5.565h-7.87L2.501 15.936v-7.87L8.066 2.501h7.87ZM11 15v2h2v-2h-2ZM11 7v6h2v-6h-2Z"),
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
        return _spam2Fill!!
    }

private var _spam2Fill: ImageVector? = null
