package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StopMiniFill: ImageVector
    get() {
        if (_stopMiniFill != null) return _stopMiniFill!!
        _stopMiniFill = remixIcon(
            name = "StopMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 7.000 L 6.000 17.000 C 6.000 17.552 6.448 18.000 7.000 18.000 L 17.000 18.000 C 17.552 18.000 18.000 17.552 18.000 17.000 L 18.000 7.000 C 18.000 6.448 17.552 6.000 17.000 6.000 L 7.000 6.000 C 6.448 6.000 6.000 6.448 6.000 7.000 Z"),
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
        return _stopMiniFill!!
    }

private var _stopMiniFill: ImageVector? = null
