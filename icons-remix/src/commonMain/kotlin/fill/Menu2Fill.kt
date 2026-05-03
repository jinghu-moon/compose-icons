package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Menu2Fill: ImageVector
    get() {
        if (_menu2Fill != null) return _menu2Fill!!
        _menu2Fill = remixIcon(
            name = "Menu2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 4.000 L 21.000 4.000 L 21.000 6.000 L 3.000 6.000 L 3.000 4.000 ZM 3.000 11.000 L 15.000 11.000 L 15.000 13.000 L 3.000 13.000 L 3.000 11.000 ZM 3.000 18.000 L 21.000 18.000 L 21.000 20.000 L 3.000 20.000 L 3.000 18.000 Z"),
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
        return _menu2Fill!!
    }

private var _menu2Fill: ImageVector? = null
