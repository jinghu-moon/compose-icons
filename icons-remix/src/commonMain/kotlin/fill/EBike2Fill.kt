package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EBike2Fill: ImageVector
    get() {
        if (_eBike2Fill != null) return _eBike2Fill!!
        _eBike2Fill = remixIcon(
            name = "EBike2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 1.000 C 16.552 1.000 17.000 1.448 17.000 2.000 L 17.000 3.000 L 22.000 3.000 L 22.000 9.000 L 19.981 9.000 L 22.727 16.545 C 22.903 16.996 23.000 17.487 23.000 18.000 C 23.000 20.209 21.209 22.000 19.000 22.000 C 17.136 22.000 15.570 20.725 15.126 19.000 L 10.874 19.000 C 10.430 20.725 8.864 22.000 7.000 22.000 C 5.056 22.000 3.435 20.612 3.075 18.774 C 2.436 18.440 2.000 17.771 2.000 17.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 L 10.000 6.000 C 10.552 6.000 11.000 6.448 11.000 7.000 L 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 L 14.000 13.000 C 14.552 13.000 15.000 12.552 15.000 12.000 L 15.000 3.000 L 12.000 3.000 L 12.000 1.000 L 16.000 1.000 ZM 19.000 16.000 C 17.895 16.000 17.000 16.895 17.000 18.000 C 17.000 19.105 17.895 20.000 19.000 20.000 C 20.105 20.000 21.000 19.105 21.000 18.000 C 21.000 17.760 20.958 17.529 20.880 17.316 L 20.864 17.272 C 20.573 16.528 19.848 16.000 19.000 16.000 ZM 7.000 16.000 C 5.895 16.000 5.000 16.895 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000 C 8.105 20.000 9.000 19.105 9.000 18.000 C 9.000 16.895 8.105 16.000 7.000 16.000 ZM 9.000 8.000 L 4.000 8.000 L 4.000 10.000 L 9.000 10.000 L 9.000 8.000 ZM 20.000 5.000 L 17.000 5.000 L 17.000 7.000 L 20.000 7.000 L 20.000 5.000 Z"),
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
        return _eBike2Fill!!
    }

private var _eBike2Fill: ImageVector? = null
