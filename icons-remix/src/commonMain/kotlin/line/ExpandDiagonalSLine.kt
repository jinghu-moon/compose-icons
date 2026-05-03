package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonalSLine: ImageVector
    get() {
        if (_expandDiagonalSLine != null) return _expandDiagonalSLine!!
        _expandDiagonalSLine = remixIcon(
            name = "ExpandDiagonalSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.586 7.000 L 12.000 7.000 L 12.000 5.000 L 19.000 5.000 L 19.000 12.000 L 17.000 12.000 L 17.000 8.414 L 8.414 17.000 L 12.000 17.000 L 12.000 19.000 L 5.000 19.000 L 5.000 12.000 L 7.000 12.000 L 7.000 15.586 L 15.586 7.000 Z"),
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
        return _expandDiagonalSLine!!
    }

private var _expandDiagonalSLine: ImageVector? = null
