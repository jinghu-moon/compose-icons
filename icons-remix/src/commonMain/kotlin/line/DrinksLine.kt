package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DrinksLine: ImageVector
    get() {
        if (_drinksLine != null) return _drinksLine!!
        _drinksLine = remixIcon(
            name = "DrinksLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 L 6.205 2.000 C 5.609 2.000 5.096 2.421 4.979 3.005 L 4.180 7.000 L 2.000 7.000 L 2.000 9.000 L 4.109 9.000 L 5.481 20.893 C 5.554 21.524 6.088 22.000 6.723 22.000 L 17.277 22.000 C 17.912 22.000 18.446 21.524 18.519 20.893 L 19.891 9.000 L 22.000 9.000 L 22.000 7.000 L 19.820 7.000 L 19.021 3.005 C 18.904 2.421 18.391 2.000 17.795 2.000 L 16.000 2.000 L 16.000 0.000 L 14.000 0.000 L 14.000 2.000 ZM 17.780 7.000 L 6.220 7.000 L 6.820 4.000 L 17.180 4.000 L 17.780 7.000 ZM 6.122 9.000 L 17.878 9.000 L 16.609 20.000 L 7.391 20.000 L 6.122 9.000 Z"),
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
        return _drinksLine!!
    }

private var _drinksLine: ImageVector? = null
