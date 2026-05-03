package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Menu3Fill: ImageVector
    get() {
        if (_menu3Fill != null) return _menu3Fill!!
        _menu3Fill = remixIcon(
            name = "Menu3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 4.000 L 21.000 4.000 L 21.000 6.000 L 3.000 6.000 L 3.000 4.000 ZM 9.000 11.000 L 21.000 11.000 L 21.000 13.000 L 9.000 13.000 L 9.000 11.000 ZM 3.000 18.000 L 21.000 18.000 L 21.000 20.000 L 3.000 20.000 L 3.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _menu3Fill!!
    }

private var _menu3Fill: ImageVector? = null
