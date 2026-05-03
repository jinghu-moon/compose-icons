package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Robot3Fill: ImageVector
    get() {
        if (_robot3Fill != null) return _robot3Fill!!
        _robot3Fill = remixIcon(
            name = "Robot3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 L 13.000 2.000 L 13.000 1.000 L 11.000 1.000 L 11.000 2.000 L 7.000 2.000 C 5.343 2.000 4.000 3.343 4.000 5.000 L 4.000 8.000 C 4.000 10.761 6.239 13.000 9.000 13.000 L 15.000 13.000 C 17.761 13.000 20.000 10.761 20.000 8.000 L 20.000 5.000 C 20.000 3.343 18.657 2.000 17.000 2.000 ZM 11.000 7.500 C 11.000 8.328 10.328 9.000 9.500 9.000 C 8.672 9.000 8.000 8.328 8.000 7.500 C 8.000 6.672 8.672 6.000 9.500 6.000 C 10.328 6.000 11.000 6.672 11.000 7.500 ZM 16.000 7.500 C 16.000 8.328 15.328 9.000 14.500 9.000 C 13.672 9.000 13.000 8.328 13.000 7.500 C 13.000 6.672 13.672 6.000 14.500 6.000 C 15.328 6.000 16.000 6.672 16.000 7.500 ZM 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 C 16.418 14.000 20.000 17.582 20.000 22.000 L 4.000 22.000 Z"),
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
        return _robot3Fill!!
    }

private var _robot3Fill: ImageVector? = null
