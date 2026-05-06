package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollapseDiagonal2Fill: ImageVector
    get() {
        if (_collapseDiagonal2Fill != null) return _collapseDiagonal2Fill!!
        _collapseDiagonal2Fill = remixIcon(
            name = "CollapseDiagonal2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 11h7.5v-7.5L7.957 6.543 4.707 3.293 3.293 4.707 6.543 7.957 3.5 11ZM20.5 13h-7.5v7.5l3.043-3.043 3.25 3.25 1.414-1.414L17.457 16.043 20.5 13Z"),
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
        return _collapseDiagonal2Fill!!
    }

private var _collapseDiagonal2Fill: ImageVector? = null
