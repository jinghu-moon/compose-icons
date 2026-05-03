package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ToggleFill: ImageVector
    get() {
        if (_toggleFill != null) return _toggleFill!!
        _toggleFill = remixIcon(
            name = "ToggleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 5.000 L 16.000 5.000 C 19.866 5.000 23.000 8.134 23.000 12.000 C 23.000 15.866 19.866 19.000 16.000 19.000 L 8.000 19.000 C 4.134 19.000 1.000 15.866 1.000 12.000 C 1.000 8.134 4.134 5.000 8.000 5.000 ZM 16.000 15.000 C 17.657 15.000 19.000 13.657 19.000 12.000 C 19.000 10.343 17.657 9.000 16.000 9.000 C 14.343 9.000 13.000 10.343 13.000 12.000 C 13.000 13.657 14.343 15.000 16.000 15.000 Z"),
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
        return _toggleFill!!
    }

private var _toggleFill: ImageVector? = null
