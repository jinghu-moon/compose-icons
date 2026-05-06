package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowGoBackLine: ImageVector
    get() {
        if (_arrowGoBackLine != null) return _arrowGoBackLine!!
        _arrowGoBackLine = remixIcon(
            name = "ArrowGoBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.828 7 8.364 9.535 6.95 10.949 2 6 6.95 1.05 8.364 2.464 5.828 5h7.172c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-9v-2h9c3.314 0 6-2.686 6-6C19 9.686 16.314 7 13 7h-7.172Z"),
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
        return _arrowGoBackLine!!
    }

private var _arrowGoBackLine: ImageVector? = null
