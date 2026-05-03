package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PentagonLine: ImageVector
    get() {
        if (_pentagonLine != null) return _pentagonLine!!
        _pentagonLine = remixIcon(
            name = "PentagonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.030 L 20.531 9.228 L 17.272 19.256 L 6.728 19.256 L 3.470 9.228 L 12.000 3.030 ZM 22.747 8.508 L 12.000 0.700 L 1.253 8.508 L 5.358 21.142 L 18.642 21.142 L 22.747 8.508 Z"),
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
        return _pentagonLine!!
    }

private var _pentagonLine: ImageVector? = null
