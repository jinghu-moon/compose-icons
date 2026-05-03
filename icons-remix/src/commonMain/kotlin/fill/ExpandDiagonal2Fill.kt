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
                pathData = parseSvgPathData("M 3.000 3.000 L 10.500 3.000 L 7.457 6.043 L 10.707 9.293 L 9.293 10.707 L 6.043 7.457 L 3.000 10.500 L 3.000 3.000 ZM 21.000 21.000 L 13.500 21.000 L 16.543 17.957 L 13.293 14.707 L 14.707 13.293 L 17.957 16.543 L 21.000 13.500 L 21.000 21.000 Z"),
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
