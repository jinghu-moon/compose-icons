package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Skull2Fill: ImageVector
    get() {
        if (_skull2Fill != null) return _skull2Fill!!
        _skull2Fill = remixIcon(
            name = "Skull2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 22.000 15.764 C 22.000 16.521 21.572 17.214 20.894 17.553 L 18.000 19.000 L 18.000 20.000 C 18.000 21.598 16.751 22.904 15.176 22.995 L 14.950 23.000 C 14.972 22.893 14.987 22.782 14.994 22.670 L 15.000 22.500 L 15.000 22.000 C 15.000 20.946 14.184 20.082 13.149 20.006 L 13.000 20.000 L 11.000 20.000 C 9.946 20.000 9.082 20.816 9.005 21.851 L 9.000 22.000 L 9.000 22.500 C 9.000 22.671 9.017 22.839 9.050 23.000 L 9.000 23.000 C 7.343 23.000 6.000 21.657 6.000 20.000 L 6.000 19.000 L 3.106 17.553 C 2.428 17.214 2.000 16.521 2.000 15.764 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 8.000 11.000 C 6.895 11.000 6.000 11.895 6.000 13.000 C 6.000 14.105 6.895 15.000 8.000 15.000 C 9.105 15.000 10.000 14.105 10.000 13.000 C 10.000 11.895 9.105 11.000 8.000 11.000 ZM 16.000 11.000 C 14.895 11.000 14.000 11.895 14.000 13.000 C 14.000 14.105 14.895 15.000 16.000 15.000 C 17.105 15.000 18.000 14.105 18.000 13.000 C 18.000 11.895 17.105 11.000 16.000 11.000 Z"),
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
        return _skull2Fill!!
    }

private var _skull2Fill: ImageVector? = null
