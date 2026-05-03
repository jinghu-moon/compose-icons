package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArmchairFill: ImageVector
    get() {
        if (_armchairFill != null) return _armchairFill!!
        _armchairFill = remixIcon(
            name = "ArmchairFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 3.000 L 8.000 3.000 C 5.791 3.000 4.000 4.791 4.000 7.000 L 4.000 8.000 C 6.761 8.000 9.000 10.239 9.000 13.000 L 15.000 13.000 C 15.000 10.239 17.239 8.000 20.000 8.000 L 20.000 7.000 C 20.000 4.791 18.209 3.000 16.000 3.000 ZM 20.000 10.000 C 18.343 10.000 17.000 11.343 17.000 13.000 L 17.000 16.000 L 15.000 16.000 L 15.000 15.000 L 9.000 15.000 L 9.000 16.000 L 7.000 16.000 L 7.000 13.000 C 7.000 11.343 5.657 10.000 4.000 10.000 C 2.343 10.000 1.000 11.343 1.000 13.000 C 1.000 14.306 1.835 15.417 3.000 15.829 L 3.000 21.000 L 5.000 21.000 L 5.000 20.000 L 19.000 20.000 L 19.000 21.000 L 21.000 21.000 L 21.000 15.829 C 22.165 15.417 23.000 14.306 23.000 13.000 C 23.000 11.343 21.657 10.000 20.000 10.000 Z"),
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
        return _armchairFill!!
    }

private var _armchairFill: ImageVector? = null
