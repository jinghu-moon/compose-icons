package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FahrenheitFill: ImageVector
    get() {
        if (_fahrenheitFill != null) return _fahrenheitFill!!
        _fahrenheitFill = remixIcon(
            name = "FahrenheitFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 12h7v2h-7v7h-2v-13C10 5.791 11.791 4 14 4h7v2h-7c-1.105 0-2 .895-2 2v4ZM4.5 10C2.567 10 1 8.433 1 6.5 1 4.567 2.567 3 4.5 3 6.433 3 8 4.567 8 6.5 8 8.433 6.433 10 4.5 10ZM4.5 8C5.328 8 6 7.328 6 6.5 6 5.672 5.328 5 4.5 5 3.672 5 3 5.672 3 6.5 3 7.328 3.672 8 4.5 8Z"),
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
        return _fahrenheitFill!!
    }

private var _fahrenheitFill: ImageVector? = null
