package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TaxiFill: ImageVector
    get() {
        if (_taxiFill != null) return _taxiFill!!
        _taxiFill = remixIcon(
            name = "TaxiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12v9c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-9L4.481 6.212C4.796 5.477 5.519 5 6.319 5h2.681v-2h6v2h2.681c.8 0 1.523 .477 1.838 1.212L22 12ZM4.176 12h15.648L17.681 7h-11.362L4.176 12ZM6.5 17C7.328 17 8 16.328 8 15.5 8 14.672 7.328 14 6.5 14 5.672 14 5 14.672 5 15.5 5 16.328 5.672 17 6.5 17ZM17.5 17C18.328 17 19 16.328 19 15.5 19 14.672 18.328 14 17.5 14 16.672 14 16 14.672 16 15.5c0 .828 .672 1.5 1.5 1.5Z"),
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
        return _taxiFill!!
    }

private var _taxiFill: ImageVector? = null
