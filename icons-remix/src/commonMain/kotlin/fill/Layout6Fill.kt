package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Layout6Fill: ImageVector
    get() {
        if (_layout6Fill != null) return _layout6Fill!!
        _layout6Fill = remixIcon(
            name = "Layout6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 10.000 L 15.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 10.000 L 15.000 10.000 ZM 22.000 10.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 17.000 21.000 L 17.000 10.000 L 22.000 10.000 ZM 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 8.000 L 2.000 8.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 Z"),
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
        return _layout6Fill!!
    }

private var _layout6Fill: ImageVector? = null
