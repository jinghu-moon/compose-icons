package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Menu4Fill: ImageVector
    get() {
        if (_menu4Fill != null) return _menu4Fill!!
        _menu4Fill = remixIcon(
            name = "Menu4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 18.000 L 16.000 20.000 L 5.000 20.000 L 5.000 18.000 L 16.000 18.000 ZM 21.000 11.000 L 21.000 13.000 L 3.000 13.000 L 3.000 11.000 L 21.000 11.000 ZM 19.000 4.000 L 19.000 6.000 L 8.000 6.000 L 8.000 4.000 L 19.000 4.000 Z"),
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
        return _menu4Fill!!
    }

private var _menu4Fill: ImageVector? = null
