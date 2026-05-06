package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings2Fill: ImageVector
    get() {
        if (_settings2Fill != null) return _settings2Fill!!
        _settings2Fill = remixIcon(
            name = "Settings2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.686 4 11.293 1.393c.391-.391 1.024-.391 1.414 0l2.607 2.607h3.686c.552 0 1 .448 1 1v3.686l2.607 2.607c.39 .391 .39 1.024 0 1.414l-2.607 2.607v3.686c0 .552-.448 1-1 1h-3.686l-2.607 2.607c-.391 .39-1.024 .39-1.414 0L8.686 20h-3.686c-.552 0-1-.448-1-1v-3.686L1.393 12.707c-.391-.391-.391-1.024 0-1.414L4 8.686v-3.686c0-.552 .448-1 1-1h3.686ZM12 15c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3Z"),
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
        return _settings2Fill!!
    }

private var _settings2Fill: ImageVector? = null
