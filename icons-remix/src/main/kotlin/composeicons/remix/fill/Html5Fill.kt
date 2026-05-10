package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Html5Fill: ImageVector
    get() {
        if (_html5Fill != null) return _html5Fill!!
        _html5Fill = remixIcon(
            name = "Html5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18.178l4.619-1.256 .624-6.778h-8.217L8.822 7.889h8.626l.227-2.211h-11.349l.636 6.678h7.82l-.261 2.867L12 15.889 9.48 15.222 9.322 13.378h-2.27l.329 3.544L12 18.178ZM3 2h18L19.377 20 12 22 4.623 20 3 2Z"),
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
        return _html5Fill!!
    }

private var _html5Fill: ImageVector? = null
