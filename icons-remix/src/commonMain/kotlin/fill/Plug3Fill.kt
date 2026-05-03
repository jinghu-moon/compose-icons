package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Plug3Fill: ImageVector
    get() {
        if (_plug3Fill != null) return _plug3Fill!!
        _plug3Fill = remixIcon(
            name = "Plug3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 22.000 L 7.000 22.000 L 7.000 20.000 L 17.000 20.000 L 17.000 22.000 ZM 10.000 5.000 L 14.000 5.000 L 14.000 2.000 L 16.000 2.000 L 16.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 15.000 C 21.000 17.209 19.209 19.000 17.000 19.000 L 7.000 19.000 C 4.791 19.000 3.000 17.209 3.000 15.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 8.000 5.000 L 8.000 2.000 L 10.000 2.000 L 10.000 5.000 Z"),
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
        return _plug3Fill!!
    }

private var _plug3Fill: ImageVector? = null
