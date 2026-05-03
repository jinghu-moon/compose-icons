package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Shining2Line: ImageVector
    get() {
        if (_shining2Line != null) return _shining2Line!!
        _shining2Line = remixIcon(
            name = "Shining2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 8.000 L 23.500 12.000 L 16.000 16.000 L 12.000 23.500 L 8.000 16.000 L 0.500 12.000 L 8.000 8.000 L 12.000 0.500 L 16.000 8.000 ZM 19.250 12.000 L 14.522 9.478 L 12.000 4.750 L 9.478 9.478 L 4.750 12.000 L 9.478 14.522 L 12.000 19.250 L 14.522 14.522 L 19.250 12.000 Z"),
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
        return _shining2Line!!
    }

private var _shining2Line: ImageVector? = null
