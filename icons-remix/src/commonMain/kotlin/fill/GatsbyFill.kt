package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GatsbyFill: ImageVector
    get() {
        if (_gatsbyFill != null) return _gatsbyFill!!
        _gatsbyFill = remixIcon(
            name = "GatsbyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 2.000 C 6.501 2.000 2.001 6.500 2.001 12.000 C 2.001 17.500 6.501 22.000 12.001 22.000 C 17.501 22.000 22.001 17.500 22.001 12.000 C 22.001 6.500 17.501 2.000 12.001 2.000 ZM 6.430 17.571 C 4.930 16.071 4.144 14.071 4.144 12.143 L 11.930 19.857 C 9.930 19.786 7.930 19.071 6.430 17.571 ZM 13.715 19.643 L 4.358 10.286 C 5.144 6.786 8.287 4.143 12.001 4.143 C 14.644 4.143 16.930 5.429 18.358 7.357 L 17.287 8.286 C 16.072 6.643 14.144 5.571 12.001 5.571 C 9.215 5.571 6.858 7.357 5.930 9.857 L 14.144 18.071 C 16.215 17.357 17.787 15.571 18.287 13.429 L 14.858 13.429 L 14.858 12.000 L 19.858 12.000 C 19.858 15.714 17.215 18.857 13.715 19.643 Z"),
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
        return _gatsbyFill!!
    }

private var _gatsbyFill: ImageVector? = null
