package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseDiagonalLine: ImageVector
    get() {
        if (_collapseDiagonalLine != null) return _collapseDiagonalLine!!
        _collapseDiagonalLine = remixIcon(
            name = "CollapseDiagonalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 4.000 L 13.000 4.000 L 13.000 11.000 L 20.000 11.000 L 20.000 9.000 L 16.414 9.000 L 20.707 4.707 L 19.293 3.293 L 15.000 7.586 L 15.000 4.000 ZM 4.000 15.000 L 7.586 15.000 L 3.293 19.293 L 4.707 20.707 L 9.000 16.414 L 9.000 20.000 L 11.000 20.000 L 11.000 13.000 L 4.000 13.000 L 4.000 15.000 Z"),
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
        return _collapseDiagonalLine!!
    }

private var _collapseDiagonalLine: ImageVector? = null
