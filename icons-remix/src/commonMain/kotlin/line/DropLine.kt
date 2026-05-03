package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DropLine: ImageVector
    get() {
        if (_dropLine != null) return _dropLine!!
        _dropLine = remixIcon(
            name = "DropLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.097 L 7.050 8.047 C 4.317 10.781 4.317 15.213 7.050 17.947 C 9.784 20.680 14.216 20.680 16.950 17.947 C 19.683 15.213 19.683 10.781 16.950 8.047 L 12.000 3.097 ZM 12.000 0.269 L 18.364 6.633 C 21.879 10.148 21.879 15.846 18.364 19.361 C 14.849 22.875 9.151 22.875 5.636 19.361 C 2.121 15.846 2.121 10.148 5.636 6.633 L 12.000 0.269 Z"),
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
        return _dropLine!!
    }

private var _dropLine: ImageVector? = null
