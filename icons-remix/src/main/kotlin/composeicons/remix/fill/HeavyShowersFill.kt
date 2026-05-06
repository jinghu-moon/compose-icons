package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeavyShowersFill: ImageVector
    get() {
        if (_heavyShowersFill != null) return _heavyShowersFill!!
        _heavyShowersFill = remixIcon(
            name = "HeavyShowersFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 18v5h-2v-5h-2v3h-2v-3.252C3.55 16.86 1 13.728 1 10 1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5 23 15.538 20.538 18 17.5 18h-.5v3h-2v-3h-2Z"),
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
        return _heavyShowersFill!!
    }

private var _heavyShowersFill: ImageVector? = null
