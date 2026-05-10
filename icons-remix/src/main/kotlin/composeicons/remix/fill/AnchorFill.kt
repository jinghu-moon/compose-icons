package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AnchorFill: ImageVector
    get() {
        if (_anchorFill != null) return _anchorFill!!
        _anchorFill = remixIcon(
            name = "AnchorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 9.874v10.054c3.619-.453 6.487-3.336 6.938-6.972h-2.938L20.704 7C21.529 8.461 22 10.151 22 11.951 22 17.501 17.523 22 12 22 6.477 22 2 17.501 2 11.951 2 10.151 2.471 8.461 3.296 7L7 12.956h-2.938c.451 3.637 3.319 6.519 6.938 6.972v-10.054C9.275 9.43 8 7.864 8 6 8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4 0 1.864-1.275 3.43-3 3.874ZM12 8c1.105 0 2-.895 2-2C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _anchorFill!!
    }

private var _anchorFill: ImageVector? = null
