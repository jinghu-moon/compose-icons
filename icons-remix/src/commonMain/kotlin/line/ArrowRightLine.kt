package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightLine: ImageVector
    get() {
        if (_arrowRightLine != null) return _arrowRightLine!!
        _arrowRightLine = remixIcon(
            name = "ArrowRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.172 11.000 L 10.808 5.636 L 12.222 4.222 L 20.000 12.000 L 12.222 19.778 L 10.808 18.364 L 16.172 13.000 L 4.000 13.000 L 4.000 11.000 L 16.172 11.000 Z"),
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
        return _arrowRightLine!!
    }

private var _arrowRightLine: ImageVector? = null
