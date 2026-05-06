package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InfinityFill: ImageVector
    get() {
        if (_infinityFill != null) return _infinityFill!!
        _infinityFill = remixIcon(
            name = "InfinityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 12c0 1.933 1.567 3.5 3.5 3.5 1.203 0 2.02-.434 2.699-1.113 .622-.622 1.122-1.44 1.655-2.387C10.321 11.053 9.821 10.236 9.199 9.613 8.52 8.934 7.703 8.5 6.5 8.5 4.567 8.5 3 10.067 3 12ZM6.5 17.5C3.462 17.5 1 15.038 1 12 1 8.962 3.462 6.5 6.5 6.5c1.797 0 3.105 .691 4.113 1.699 .535 .535 .986 1.162 1.387 1.803 .4-.64 .851-1.267 1.387-1.803C14.395 7.191 15.703 6.5 17.5 6.5 20.538 6.5 23 8.962 23 12c0 3.038-2.462 5.5-5.5 5.5-1.797 0-3.105-.691-4.113-1.699C12.851 15.266 12.4 14.638 12 13.998c-.4 .64-.851 1.267-1.387 1.803C9.605 16.809 8.297 17.5 6.5 17.5ZM13.145 12c.533 .947 1.033 1.764 1.656 2.387 .679 .68 1.496 1.113 2.699 1.113C19.433 15.5 21 13.933 21 12 21 10.067 19.433 8.5 17.5 8.5c-1.204 0-2.02 .434-2.699 1.113-.622 .622-1.122 1.44-1.656 2.387Z"),
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
        return _infinityFill!!
    }

private var _infinityFill: ImageVector? = null
