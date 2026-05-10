package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CompassesFill: ImageVector
    get() {
        if (_compassesFill != null) return _compassesFill!!
        _compassesFill = remixIcon(
            name = "CompassesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 4.123v-2.126h2v2.126c1.725 .444 3 2.01 3 3.874 0 1.118-.458 2.128-1.197 2.854l6.064 10.502-1.732 1L13.071 11.852c-.341 .095-.7 .145-1.071 .145-.371 0-.73-.05-1.071-.145L4.866 22.353l-1.732-1L9.197 10.851C8.458 10.125 8 9.114 8 7.997c0-1.864 1.275-3.43 3-3.874ZM12 8.997c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _compassesFill!!
    }

private var _compassesFill: ImageVector? = null
