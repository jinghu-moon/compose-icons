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
                pathData = parseSvgPathData("M 13.000 9.874 L 13.000 19.928 C 16.619 19.475 19.487 16.592 19.938 12.956 L 17.000 12.956 L 20.704 7.000 C 21.529 8.461 22.000 10.151 22.000 11.951 C 22.000 17.501 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.501 2.000 11.951 C 2.000 10.151 2.471 8.461 3.296 7.000 L 7.000 12.956 L 4.062 12.956 C 4.513 16.592 7.381 19.475 11.000 19.928 L 11.000 9.874 C 9.275 9.430 8.000 7.864 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 C 16.000 7.864 14.725 9.430 13.000 9.874 ZM 12.000 8.000 C 13.105 8.000 14.000 7.105 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 C 10.895 4.000 10.000 4.895 10.000 6.000 C 10.000 7.105 10.895 8.000 12.000 8.000 Z"),
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
