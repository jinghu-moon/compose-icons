package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ram2Fill: ImageVector
    get() {
        if (_ram2Fill != null) return _ram2Fill!!
        _ram2Fill = remixIcon(
            name = "Ram2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5h20c.552 0 1 .448 1 1v9c0 .552-.448 1-1 1v2c0 .552-.448 1-1 1h-7.414l-1-1h-1.172l-1 1h-7.414C2.448 19 2 18.552 2 18v-2C1.448 16 1 15.552 1 15v-9C1 5.448 1.448 5 2 5ZM4 16v1h5.586l1-1h-6.586ZM13.414 16l1 1h5.586v-1h-6.586ZM7 9h-2v3h2v-3ZM9 9v3h2v-3h-2ZM15 9h-2v3h2v-3ZM17 9v3h2v-3h-2Z"),
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
        return _ram2Fill!!
    }

private var _ram2Fill: ImageVector? = null
