package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContactsFill: ImageVector
    get() {
        if (_contactsFill != null) return _contactsFill!!
        _contactsFill = remixIcon(
            name = "ContactsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 22c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h-16ZM10 13C6.685 13 4 10.315 4 7 4 3.685 6.685 1 10 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM20 17h4v2h-4v-2ZM17 12h7v2h-7v-2ZM19 7h5v2h-5v-2Z"),
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
        return _contactsFill!!
    }

private var _contactsFill: ImageVector? = null
