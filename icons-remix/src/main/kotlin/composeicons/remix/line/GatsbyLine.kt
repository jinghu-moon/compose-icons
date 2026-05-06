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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.752 21.997C6.531 21.869 2.302 17.74 2.016 12.559l-.012-.313 9.748 9.751ZM12.001 2c3.389 0 6.385 1.686 8.193 4.265L18.556 7.413C17.109 5.349 14.713 4 12.001 4 8.598 4 5.691 6.125 4.535 9.12L14.881 19.466c2.387-.921 4.222-2.955 4.868-5.466L15.501 14v-2h6.5c0 4.726-3.279 8.687-7.685 9.731L2.27 9.685C3.314 5.279 7.275 2 12.001 2Z"),
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
        return _gatsbyLine!!
    }

private var _gatsbyLine: ImageVector? = null
