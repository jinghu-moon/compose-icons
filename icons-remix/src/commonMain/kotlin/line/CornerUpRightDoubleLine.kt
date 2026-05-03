package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerUpRightDoubleLine: ImageVector
    get() {
        if (_cornerUpRightDoubleLine != null) return _cornerUpRightDoubleLine!!
        _cornerUpRightDoubleLine = remixIcon(
            name = "CornerUpRightDoubleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 10.000 L 4.000 19.000 L 6.000 19.000 L 6.000 12.000 L 12.172 12.000 L 8.222 15.950 L 9.636 17.364 L 16.000 11.000 L 9.636 4.636 L 8.222 6.050 L 12.172 10.000 L 4.000 10.000 ZM 15.250 4.636 L 13.836 6.050 L 18.786 11.000 L 13.836 15.950 L 15.250 17.364 L 21.614 11.000 L 15.250 4.636 Z"),
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
        return _cornerUpRightDoubleLine!!
    }

private var _cornerUpRightDoubleLine: ImageVector? = null
