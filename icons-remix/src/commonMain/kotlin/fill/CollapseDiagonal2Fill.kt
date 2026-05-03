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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.500 11.000 L 11.000 11.000 L 11.000 3.500 L 7.957 6.543 L 4.707 3.293 L 3.293 4.707 L 6.543 7.957 L 3.500 11.000 ZM 20.500 13.000 L 13.000 13.000 L 13.000 20.500 L 16.043 17.457 L 19.293 20.707 L 20.707 19.293 L 17.457 16.043 L 20.500 13.000 Z"),
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
        return _collapseDiagonal2Fill!!
    }

private var _collapseDiagonal2Fill: ImageVector? = null
