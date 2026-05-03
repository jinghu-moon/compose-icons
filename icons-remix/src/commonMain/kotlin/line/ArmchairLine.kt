package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArmchairLine: ImageVector
    get() {
        if (_armchairLine != null) return _armchairLine!!
        _armchairLine = remixIcon(
            name = "ArmchairLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 3.000 C 5.791 3.000 4.000 4.791 4.000 7.000 L 4.000 9.126 C 2.275 9.570 1.000 11.136 1.000 13.000 C 1.000 14.482 1.805 15.773 3.000 16.465 L 3.000 19.000 L 3.000 21.000 L 5.000 21.000 L 5.000 20.000 L 19.000 20.000 L 19.000 21.000 L 21.000 21.000 L 21.000 19.000 L 21.000 16.465 C 22.195 15.773 23.000 14.482 23.000 13.000 C 23.000 11.136 21.725 9.570 20.000 9.126 L 20.000 7.000 C 20.000 4.791 18.209 3.000 16.000 3.000 L 8.000 3.000 ZM 18.000 9.126 C 16.275 9.570 15.000 11.136 15.000 13.000 L 9.000 13.000 C 9.000 11.136 7.725 9.570 6.000 9.126 L 6.000 7.000 C 6.000 5.895 6.895 5.000 8.000 5.000 L 16.000 5.000 C 17.105 5.000 18.000 5.895 18.000 7.000 L 18.000 9.126 ZM 9.000 15.000 L 15.000 15.000 L 15.000 16.000 L 17.000 16.000 L 17.000 13.000 C 17.000 11.895 17.895 11.000 19.000 11.000 C 20.105 11.000 21.000 11.895 21.000 13.000 C 21.000 13.869 20.445 14.611 19.667 14.887 C 19.267 15.028 19.000 15.406 19.000 15.829 L 19.000 18.000 L 5.000 18.000 L 5.000 15.829 C 5.000 15.406 4.733 15.028 4.333 14.887 C 3.555 14.611 3.000 13.869 3.000 13.000 C 3.000 11.895 3.895 11.000 5.000 11.000 C 6.105 11.000 7.000 11.895 7.000 13.000 L 7.000 16.000 L 9.000 16.000 L 9.000 15.000 Z"),
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
        return _armchairLine!!
    }

private var _armchairLine: ImageVector? = null
