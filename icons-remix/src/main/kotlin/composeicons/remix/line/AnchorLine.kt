package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AnchorLine: ImageVector
    get() {
        if (_anchorLine != null) return _anchorLine!!
        _anchorLine = remixIcon(
            name = "AnchorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.049 11h4.951v2h-2.938c.451 3.619 3.319 6.487 6.938 6.938v-10.064C9.275 9.43 8 7.864 8 6 8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4 0 1.864-1.275 3.43-3 3.874v10.064c3.619-.451 6.487-3.319 6.938-6.938h-2.938v-2h4.951c.033 .329 .049 .663 .049 1 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12c0-.337 .017-.671 .049-1ZM12 8c1.105 0 2-.895 2-2C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _anchorLine!!
    }

private var _anchorLine: ImageVector? = null
