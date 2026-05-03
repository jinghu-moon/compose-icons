package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightDownLine: ImageVector
    get() {
        if (_arrowRightDownLine != null) return _arrowRightDownLine!!
        _arrowRightDownLine = remixIcon(
            name = "ArrowRightDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.590 16.003 L 5.983 7.397 L 7.397 5.982 L 16.004 14.589 L 16.004 7.003 L 18.004 7.003 L 18.004 18.003 L 7.004 18.003 L 7.004 16.003 L 14.590 16.003 Z"),
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
        return _arrowRightDownLine!!
    }

private var _arrowRightDownLine: ImageVector? = null
