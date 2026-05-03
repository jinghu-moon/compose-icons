package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AddLargeLine: ImageVector
    get() {
        if (_addLargeLine != null) return _addLargeLine!!
        _addLargeLine = remixIcon(
            name = "AddLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 11.000 L 22.000 11.000 L 22.000 13.000 L 13.000 13.000 L 13.000 22.000 L 11.000 22.000 L 11.000 13.000 L 2.000 13.000 L 2.000 11.000 L 11.000 11.000 L 11.000 2.000 L 13.000 2.000 L 13.000 11.000 Z"),
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
        return _addLargeLine!!
    }

private var _addLargeLine: ImageVector? = null
