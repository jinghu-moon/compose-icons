package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandDiagonal2Fill: ImageVector
    get() {
        if (_expandDiagonal2Fill != null) return _expandDiagonal2Fill!!
        _expandDiagonal2Fill = remixIcon(
            name = "ExpandDiagonal2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h7.5L7.457 6.043l3.25 3.25L9.293 10.707 6.043 7.457 3 10.5v-7.5ZM21 21h-7.5l3.043-3.043L13.293 14.707l1.414-1.414 3.25 3.25L21 13.5v7.5Z"),
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
        return _expandDiagonal2Fill!!
    }

private var _expandDiagonal2Fill: ImageVector? = null
