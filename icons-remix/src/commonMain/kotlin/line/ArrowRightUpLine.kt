package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightUpLine: ImageVector
    get() {
        if (_arrowRightUpLine != null) return _arrowRightUpLine!!
        _arrowRightUpLine = remixIcon(
            name = "ArrowRightUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.004 9.414 L 7.397 18.021 L 5.983 16.607 L 14.590 8.000 L 7.004 8.000 L 7.004 6.000 L 18.004 6.000 L 18.004 17.000 L 16.004 17.000 L 16.004 9.414 Z"),
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
        return _arrowRightUpLine!!
    }

private var _arrowRightUpLine: ImageVector? = null
