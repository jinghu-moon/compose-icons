package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PauseLargeFill: ImageVector
    get() {
        if (_pauseLargeFill != null) return _pauseLargeFill!!
        _pauseLargeFill = remixIcon(
            name = "PauseLargeFill",
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
        return _pauseLargeFill!!
    }

private var _pauseLargeFill: ImageVector? = null
