package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WomenFill: ImageVector
    get() {
        if (_womenFill != null) return _womenFill!!
        _womenFill = remixIcon(
            name = "WomenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 15.934C7.331 15.445 4.5 12.303 4.5 8.5 4.5 4.358 7.858 1 12 1c4.142 0 7.5 3.358 7.5 7.5 0 3.803-2.831 6.945-6.5 7.434v2.066h5v2h-5v4h-2v-4h-5v-2h5v-2.066Z"),
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
        return _womenFill!!
    }

private var _womenFill: ImageVector? = null
