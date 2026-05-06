package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTabler: ImageVector
    get() {
        if (_brandTabler != null) return _brandTabler!!
        _brandTabler = tablerFilledIcon(
            name = "BrandTabler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c2.761 0 5 2.239 5 5v10c0 2.761-2.239 5-5 5h-10C4.239 22 2 19.761 2 17v-10C2 4.239 4.239 2 7 2ZM16 14h-3c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h3c.552 0 1-.448 1-1 0-.552-.448-1-1-1M8.707 8.293c-.391-.39-1.023-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32L9.585 12 7.293 14.293c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l3-3c.39-.391 .39-1.023 0-1.414Z"),
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
        return _brandTabler!!
    }

private var _brandTabler: ImageVector? = null
