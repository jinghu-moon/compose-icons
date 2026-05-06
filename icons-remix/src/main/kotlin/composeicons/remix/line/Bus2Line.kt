package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Bus2Line: ImageVector
    get() {
        if (_bus2Line != null) return _bus2Line!!
        _bus2Line = remixIcon(
            name = "Bus2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 20h-10v1c0 .552-.448 1-1 1h-2C3.448 22 3 21.552 3 21v-9h-1v-4h1v-3C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v3h1v4h-1v9c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-1ZM5 5v6h14v-6h-14ZM19 13h-14v5h14v-5ZM7.5 17C6.672 17 6 16.328 6 15.5 6 14.672 6.672 14 7.5 14 8.328 14 9 14.672 9 15.5 9 16.328 8.328 17 7.5 17ZM16.5 17C15.672 17 15 16.328 15 15.5 15 14.672 15.672 14 16.5 14c.828 0 1.5 .672 1.5 1.5C18 16.328 17.328 17 16.5 17Z"),
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
        return _bus2Line!!
    }

private var _bus2Line: ImageVector? = null
