package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowDownLine: ImageVector
    get() {
        if (_arrowDownLine != null) return _arrowDownLine!!
        _arrowDownLine = remixIcon(
            name = "ArrowDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 16.172 L 18.364 10.808 L 19.778 12.222 L 12.000 20.000 L 4.222 12.222 L 5.636 10.808 L 11.000 16.172 L 11.000 4.000 L 13.000 4.000 L 13.000 16.172 Z"),
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
        return _arrowDownLine!!
    }

private var _arrowDownLine: ImageVector? = null
