package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EBike2Line: ImageVector
    get() {
        if (_eBike2Line != null) return _eBike2Line!!
        _eBike2Line = remixIcon(
            name = "EBike2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 1.000 C 16.552 1.000 17.000 1.448 17.000 2.000 L 17.000 3.000 L 22.000 3.000 L 22.000 9.000 L 19.981 9.000 L 22.727 16.544 C 22.903 16.995 23.000 17.486 23.000 17.999 C 23.000 20.208 21.209 21.999 19.000 21.999 C 17.136 21.999 15.571 20.725 15.126 19.000 L 10.874 19.000 C 10.430 20.725 8.864 22.000 7.000 22.000 C 5.056 22.000 3.435 20.612 3.075 18.774 C 2.436 18.440 2.000 17.771 2.000 17.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 L 10.000 6.000 C 10.552 6.000 11.000 6.448 11.000 7.000 L 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 L 14.000 13.000 C 14.552 13.000 15.000 12.552 15.000 12.000 L 15.000 3.000 L 12.000 3.000 L 12.000 1.000 L 16.000 1.000 ZM 7.000 16.000 C 5.895 16.000 5.000 16.895 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000 C 8.105 20.000 9.000 19.105 9.000 18.000 C 9.000 16.895 8.105 16.000 7.000 16.000 ZM 19.000 15.999 C 17.895 15.999 17.000 16.894 17.000 17.999 C 17.000 19.104 17.895 19.999 19.000 19.999 C 20.105 19.999 21.000 19.104 21.000 17.999 C 21.000 17.759 20.958 17.528 20.880 17.315 L 20.864 17.271 C 20.573 16.527 19.848 15.999 19.000 15.999 ZM 17.853 9.000 L 17.000 9.000 L 17.000 12.000 C 17.000 13.657 15.657 15.000 14.000 15.000 L 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 L 4.000 12.000 L 4.000 15.354 C 4.733 14.524 5.805 14.000 7.000 14.000 C 8.864 14.000 10.430 15.275 10.874 17.000 L 15.126 17.000 C 15.569 15.274 17.136 13.999 19.000 13.999 C 19.237 13.999 19.469 14.020 19.694 14.059 L 17.853 9.000 ZM 9.000 8.000 L 4.000 8.000 L 4.000 10.000 L 9.000 10.000 L 9.000 8.000 ZM 20.000 5.000 L 17.000 5.000 L 17.000 7.000 L 20.000 7.000 L 20.000 5.000 Z"),
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
        return _eBike2Line!!
    }

private var _eBike2Line: ImageVector? = null
