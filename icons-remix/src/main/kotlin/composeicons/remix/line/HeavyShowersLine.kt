package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeavyShowersLine: ImageVector
    get() {
        if (_heavyShowersLine != null) return _heavyShowersLine!!
        _heavyShowersLine = remixIcon(
            name = "HeavyShowersLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 16.93C2.609 15.547 1 12.961 1 10 1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5c0 2.518-1.691 4.64-4 5.293v-2.13c1.183-.562 2-1.767 2-3.163C21 10.567 19.433 9 17.5 9c-.979 0-1.865 .402-2.5 1.051C15 10.034 15 10.017 15 10 15 6.686 12.314 4 9 4 5.686 4 3 6.686 3 10c0 1.777 .773 3.374 2 4.472v2.458ZM7 14h2v6h-2v-6ZM15 14h2v6h-2v-6ZM11 17h2v6h-2v-6Z"),
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
        return _heavyShowersLine!!
    }

private var _heavyShowersLine: ImageVector? = null
