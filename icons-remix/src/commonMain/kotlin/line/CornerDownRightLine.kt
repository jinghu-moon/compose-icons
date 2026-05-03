package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerDownRightLine: ImageVector
    get() {
        if (_cornerDownRightLine != null) return _cornerDownRightLine!!
        _cornerDownRightLine = remixIcon(
            name = "CornerDownRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 14.000 L 5.000 5.000 L 7.000 5.000 L 7.000 12.000 L 17.172 12.000 L 13.222 8.050 L 14.636 6.636 L 21.000 13.000 L 14.636 19.364 L 13.222 17.950 L 17.172 14.000 L 5.000 14.000 Z"),
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
        return _cornerDownRightLine!!
    }

private var _cornerDownRightLine: ImageVector? = null
