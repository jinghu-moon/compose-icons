package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseDiagonalFill: ImageVector
    get() {
        if (_collapseDiagonalFill != null) return _collapseDiagonalFill!!
        _collapseDiagonalFill = remixIcon(
            name = "CollapseDiagonalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.5 11h-7.5v-7.5l3.043 3.043L19.293 3.293l1.414 1.414L17.457 7.957l3.043 3.043ZM3.5 13h7.5v7.5L7.957 17.457 4.707 20.707 3.293 19.293 6.543 16.043 3.5 13Z"),
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
        return _collapseDiagonalFill!!
    }

private var _collapseDiagonalFill: ImageVector? = null
