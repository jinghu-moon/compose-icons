package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerUpRightLine: ImageVector
    get() {
        if (_cornerUpRightLine != null) return _cornerUpRightLine!!
        _cornerUpRightLine = remixIcon(
            name = "CornerUpRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 10.000 L 5.000 19.000 L 7.000 19.000 L 7.000 12.000 L 17.172 12.000 L 13.222 15.950 L 14.636 17.364 L 21.000 11.000 L 14.636 4.636 L 13.222 6.050 L 17.172 10.000 L 5.000 10.000 Z"),
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
        return _cornerUpRightLine!!
    }

private var _cornerUpRightLine: ImageVector? = null
