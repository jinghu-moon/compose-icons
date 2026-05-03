package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BracketsLine: ImageVector
    get() {
        if (_bracketsLine != null) return _bracketsLine!!
        _bracketsLine = remixIcon(
            name = "BracketsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 L 9.000 5.000 L 6.000 5.000 L 6.000 19.000 L 9.000 19.000 L 9.000 21.000 L 4.000 21.000 L 4.000 3.000 L 9.000 3.000 ZM 15.000 3.000 L 20.000 3.000 L 20.000 21.000 L 15.000 21.000 L 15.000 19.000 L 18.000 19.000 L 18.000 5.000 L 15.000 5.000 L 15.000 3.000 Z"),
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
        return _bracketsLine!!
    }

private var _bracketsLine: ImageVector? = null
