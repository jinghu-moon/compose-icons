package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GatsbyLine: ImageVector
    get() {
        if (_gatsbyLine != null) return _gatsbyLine!!
        _gatsbyLine = remixIcon(
            name = "GatsbyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.752 21.997 C 6.531 21.869 2.302 17.740 2.016 12.559 L 2.004 12.246 L 11.752 21.997 ZM 12.001 2.000 C 15.390 2.000 18.385 3.686 20.194 6.265 L 18.556 7.413 C 17.109 5.349 14.713 4.000 12.001 4.000 C 8.598 4.000 5.691 6.125 4.535 9.120 L 14.881 19.466 C 17.268 18.545 19.103 16.511 19.749 14.000 L 15.501 14.000 L 15.501 12.000 L 22.001 12.000 C 22.001 16.726 18.722 20.687 14.316 21.731 L 2.270 9.685 C 3.314 5.279 7.275 2.000 12.001 2.000 Z"),
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
        return _gatsbyLine!!
    }

private var _gatsbyLine: ImageVector? = null
