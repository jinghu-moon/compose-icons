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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 18h-5v-8h5v8ZM7 16v-4h-1v4h1ZM13 16v-8h-1v8h1ZM15 18h-5v-12h5v12ZM19 16v-12h-1v12h1ZM21 18h-5v-16h5v16ZM22 22h-19v-2h19v2Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _numbersLine!!
    }

private var _numbersLine: ImageVector? = null
