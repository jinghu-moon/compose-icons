package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brush4Fill: ImageVector
    get() {
        if (_brush4Fill != null) return _brush4Fill!!
        _brush4Fill = remixIcon(
            name = "Brush4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 15.997 L 4.000 15.997 L 4.000 17.997 L 20.000 17.997 L 20.000 15.997 ZM 3.000 13.997 L 3.000 3.997 C 3.000 3.444 3.448 2.997 4.000 2.997 L 7.000 2.997 L 7.000 11.269 L 9.000 11.269 L 9.000 2.997 L 20.000 2.997 C 20.552 2.997 21.000 3.444 21.000 3.997 L 21.000 13.997 L 22.000 13.997 L 22.000 18.997 C 22.000 19.549 21.552 19.997 21.000 19.997 L 13.000 19.997 L 13.000 22.997 L 11.000 22.997 L 11.000 19.997 L 3.000 19.997 C 2.448 19.997 2.000 19.549 2.000 18.997 L 2.000 13.997 L 3.000 13.997 Z"),
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
        return _brush4Fill!!
    }

private var _brush4Fill: ImageVector? = null
