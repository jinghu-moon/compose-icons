package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FriendicaFill: ImageVector
    get() {
        if (_friendicaFill != null) return _friendicaFill!!
        _friendicaFill = remixIcon(
            name = "FriendicaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 3.000 L 15.000 7.500 L 9.000 7.500 L 9.000 11.500 L 15.000 11.500 L 15.000 16.500 L 9.000 16.500 L 9.000 21.000 L 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 L 21.000 6.000 C 21.000 4.343 19.657 3.000 18.000 3.000 L 15.000 3.000 ZM 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000 L 18.000 2.000 C 20.209 2.000 22.000 3.791 22.000 6.000 L 22.000 18.000 C 22.000 20.209 20.209 22.000 18.000 22.000 L 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 L 2.000 6.000 Z"),
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
        return _friendicaFill!!
    }

private var _friendicaFill: ImageVector? = null
