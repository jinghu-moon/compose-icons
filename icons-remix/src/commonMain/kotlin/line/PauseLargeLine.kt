package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PauseLargeLine: ImageVector
    get() {
        if (_pauseLargeLine != null) return _pauseLargeLine!!
        _pauseLargeLine = remixIcon(
            name = "PauseLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 3.000 L 8.000 3.000 L 8.000 21.000 L 6.000 21.000 L 6.000 3.000 ZM 16.000 3.000 L 18.000 3.000 L 18.000 21.000 L 16.000 21.000 L 16.000 3.000 Z"),
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
        return _pauseLargeLine!!
    }

private var _pauseLargeLine: ImageVector? = null
