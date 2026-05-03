package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Slideshow3Line: ImageVector
    get() {
        if (_slideshow3Line != null) return _slideshow3Line!!
        _slideshow3Line = remixIcon(
            name = "Slideshow3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 18.000 L 13.000 20.000 L 17.000 20.000 L 17.000 22.000 L 7.000 22.000 L 7.000 20.000 L 11.000 20.000 L 11.000 18.000 L 3.000 18.000 C 2.448 18.000 2.000 17.552 2.000 17.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 13.000 18.000 ZM 4.000 5.000 L 4.000 16.000 L 20.000 16.000 L 20.000 5.000 L 4.000 5.000 ZM 10.000 7.500 L 15.000 10.500 L 10.000 13.500 L 10.000 7.500 Z"),
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
        return _slideshow3Line!!
    }

private var _slideshow3Line: ImageVector? = null
