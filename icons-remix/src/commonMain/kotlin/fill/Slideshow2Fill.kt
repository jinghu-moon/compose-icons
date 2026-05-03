package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Slideshow2Fill: ImageVector
    get() {
        if (_slideshow2Fill != null) return _slideshow2Fill!!
        _slideshow2Fill = remixIcon(
            name = "Slideshow2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 17.000 L 13.000 20.000 L 18.000 20.000 L 18.000 22.000 L 6.000 22.000 L 6.000 20.000 L 11.000 20.000 L 11.000 17.000 L 4.000 17.000 C 3.448 17.000 3.000 16.552 3.000 16.000 L 3.000 4.000 L 2.000 4.000 L 2.000 2.000 L 22.000 2.000 L 22.000 4.000 L 21.000 4.000 L 21.000 16.000 C 21.000 16.552 20.552 17.000 20.000 17.000 L 13.000 17.000 ZM 10.000 6.000 L 10.000 13.000 L 15.000 9.500 L 10.000 6.000 Z"),
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
        return _slideshow2Fill!!
    }

private var _slideshow2Fill: ImageVector? = null
