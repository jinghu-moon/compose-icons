package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonalLine: ImageVector
    get() {
        if (_expandDiagonalLine != null) return _expandDiagonalLine!!
        _expandDiagonalLine = remixIcon(
            name = "ExpandDiagonalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.586 5.000 L 14.000 5.000 L 14.000 3.000 L 21.000 3.000 L 21.000 10.000 L 19.000 10.000 L 19.000 6.414 L 14.707 10.707 L 13.293 9.293 L 17.586 5.000 ZM 3.000 14.000 L 5.000 14.000 L 5.000 17.586 L 9.293 13.293 L 10.707 14.707 L 6.414 19.000 L 10.000 19.000 L 10.000 21.000 L 3.000 21.000 L 3.000 14.000 Z"),
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
        return _expandDiagonalLine!!
    }

private var _expandDiagonalLine: ImageVector? = null
