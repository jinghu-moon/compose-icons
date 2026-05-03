package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RidingFill: ImageVector
    get() {
        if (_ridingFill != null) return _ridingFill!!
        _ridingFill = remixIcon(
            name = "RidingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.500 21.000 C 3.015 21.000 1.000 18.985 1.000 16.500 C 1.000 14.015 3.015 12.000 5.500 12.000 C 7.985 12.000 10.000 14.015 10.000 16.500 C 10.000 18.985 7.985 21.000 5.500 21.000 ZM 5.500 18.000 C 6.328 18.000 7.000 17.328 7.000 16.500 C 7.000 15.672 6.328 15.000 5.500 15.000 C 4.672 15.000 4.000 15.672 4.000 16.500 C 4.000 17.328 4.672 18.000 5.500 18.000 ZM 18.500 21.000 C 16.015 21.000 14.000 18.985 14.000 16.500 C 14.000 14.015 16.015 12.000 18.500 12.000 C 20.985 12.000 23.000 14.015 23.000 16.500 C 23.000 18.985 20.985 21.000 18.500 21.000 ZM 18.500 18.000 C 19.328 18.000 20.000 17.328 20.000 16.500 C 20.000 15.672 19.328 15.000 18.500 15.000 C 17.672 15.000 17.000 15.672 17.000 16.500 C 17.000 17.328 17.672 18.000 18.500 18.000 ZM 11.531 9.797 L 13.000 12.000 L 13.000 18.000 L 11.000 18.000 L 11.000 13.000 L 8.281 10.734 C 8.182 10.666 8.088 10.588 8.000 10.500 C 7.219 9.719 7.219 8.453 8.000 7.672 L 10.828 4.843 C 11.609 4.062 12.876 4.062 13.657 4.843 L 15.071 6.257 C 16.175 7.361 17.555 8.019 18.988 8.232 L 18.978 10.247 C 17.034 10.022 15.149 9.163 13.657 7.672 L 11.531 9.797 ZM 16.000 5.000 C 14.895 5.000 14.000 4.105 14.000 3.000 C 14.000 1.895 14.895 1.000 16.000 1.000 C 17.105 1.000 18.000 1.895 18.000 3.000 C 18.000 4.105 17.105 5.000 16.000 5.000 Z"),
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
        return _ridingFill!!
    }

private var _ridingFill: ImageVector? = null
