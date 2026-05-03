package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonalS2Line: ImageVector
    get() {
        if (_expandDiagonalS2Line != null) return _expandDiagonalS2Line!!
        _expandDiagonalS2Line = remixIcon(
            name = "ExpandDiagonalS2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 8.414 L 7.000 12.000 L 5.000 12.000 L 5.000 5.000 L 12.000 5.000 L 12.000 7.000 L 8.414 7.000 L 17.000 15.586 L 17.000 12.000 L 19.000 12.000 L 19.000 19.000 L 12.000 19.000 L 12.000 17.000 L 15.586 17.000 L 7.000 8.414 Z"),
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
        return _expandDiagonalS2Line!!
    }

private var _expandDiagonalS2Line: ImageVector? = null
