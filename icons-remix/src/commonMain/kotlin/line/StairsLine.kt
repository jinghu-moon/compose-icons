package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StairsLine: ImageVector
    get() {
        if (_stairsLine != null) return _stairsLine!!
        _stairsLine = remixIcon(
            name = "StairsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 3.000 L 21.000 3.000 L 21.000 21.000 L 3.000 21.000 L 3.000 15.000 L 7.000 15.000 L 7.000 11.000 L 11.000 11.000 L 11.000 7.000 L 15.000 7.000 L 15.000 3.000 ZM 17.000 5.000 L 17.000 9.000 L 13.000 9.000 L 13.000 13.000 L 9.000 13.000 L 9.000 17.000 L 5.000 17.000 L 5.000 19.000 L 19.000 19.000 L 19.000 5.000 L 17.000 5.000 Z"),
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
        return _stairsLine!!
    }

private var _stairsLine: ImageVector? = null
