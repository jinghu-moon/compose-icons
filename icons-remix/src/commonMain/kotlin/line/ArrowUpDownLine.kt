package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowUpDownLine: ImageVector
    get() {
        if (_arrowUpDownLine != null) return _arrowUpDownLine!!
        _arrowUpDownLine = remixIcon(
            name = "ArrowUpDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.950 7.950 L 10.536 9.364 L 8.001 6.828 L 8.000 20.000 L 6.000 20.000 L 6.001 6.828 L 3.465 9.364 L 2.050 7.950 L 7.000 3.000 L 11.950 7.950 ZM 21.950 16.050 L 17.000 21.000 L 12.050 16.050 L 13.465 14.636 L 16.001 17.172 L 16.000 4.000 L 18.000 4.000 L 18.001 17.172 L 20.536 14.636 L 21.950 16.050 Z"),
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
        return _arrowUpDownLine!!
    }

private var _arrowUpDownLine: ImageVector? = null
