package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NumbersLine: ImageVector
    get() {
        if (_numbersLine != null) return _numbersLine!!
        _numbersLine = remixIcon(
            name = "NumbersLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 18.000 L 4.000 18.000 L 4.000 10.000 L 9.000 10.000 L 9.000 18.000 ZM 7.000 16.000 L 7.000 12.000 L 6.000 12.000 L 6.000 16.000 L 7.000 16.000 ZM 13.000 16.000 L 13.000 8.000 L 12.000 8.000 L 12.000 16.000 L 13.000 16.000 ZM 15.000 18.000 L 10.000 18.000 L 10.000 6.000 L 15.000 6.000 L 15.000 18.000 ZM 19.000 16.000 L 19.000 4.000 L 18.000 4.000 L 18.000 16.000 L 19.000 16.000 ZM 21.000 18.000 L 16.000 18.000 L 16.000 2.000 L 21.000 2.000 L 21.000 18.000 ZM 22.000 22.000 L 3.000 22.000 L 3.000 20.000 L 22.000 20.000 L 22.000 22.000 Z"),
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
        return _numbersLine!!
    }

private var _numbersLine: ImageVector? = null
