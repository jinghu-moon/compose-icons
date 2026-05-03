package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KeynoteLine: ImageVector
    get() {
        if (_keynoteLine != null) return _keynoteLine!!
        _keynoteLine = remixIcon(
            name = "KeynoteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.440 10.000 L 19.560 10.000 L 18.361 4.000 L 5.640 4.000 L 4.440 10.000 ZM 13.000 12.000 L 13.000 20.000 L 17.000 20.000 L 17.000 22.000 L 7.000 22.000 L 7.000 20.000 L 11.000 20.000 L 11.000 12.000 L 2.992 12.000 C 2.444 12.000 2.086 11.570 2.195 11.023 L 3.805 2.977 C 3.913 2.437 4.445 2.000 5.001 2.000 L 18.999 2.000 C 19.552 2.000 20.086 2.430 20.195 2.977 L 21.805 11.023 C 21.913 11.563 21.545 12.000 21.008 12.000 L 13.000 12.000 Z"),
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
        return _keynoteLine!!
    }

private var _keynoteLine: ImageVector? = null
