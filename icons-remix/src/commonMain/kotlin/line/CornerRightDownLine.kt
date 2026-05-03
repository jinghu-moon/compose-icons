package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerRightDownLine: ImageVector
    get() {
        if (_cornerRightDownLine != null) return _cornerRightDownLine!!
        _cornerRightDownLine = remixIcon(
            name = "CornerRightDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 5.000 L 5.000 5.000 L 5.000 7.000 L 12.000 7.000 L 12.000 17.172 L 8.050 13.222 L 6.636 14.636 L 13.000 21.000 L 19.364 14.636 L 17.950 13.222 L 14.000 17.172 L 14.000 5.000 Z"),
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
        return _cornerRightDownLine!!
    }

private var _cornerRightDownLine: ImageVector? = null
