package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Group2Fill: ImageVector
    get() {
        if (_group2Fill != null) return _group2Fill!!
        _group2Fill = remixIcon(
            name = "Group2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 19.748v-3.348c0-1.283 .995-2.292 2.467-2.868C11.543 13.188 10.543 13 9.5 13c-1.89 0-3.636 .617-5.047 1.66 .879 2.494 2.96 4.422 5.547 5.088ZM18.879 16.086C18.486 15.553 17.171 15 15.5 15 13.494 15 12 15.797 12 16.4v3.6c2.925 0 5.484-1.57 6.879-3.914ZM9.55 11.5c1.243 0 2.25-1.007 2.25-2.25C11.8 8.007 10.793 7 9.55 7 8.307 7 7.3 8.007 7.3 9.25c0 1.243 1.007 2.25 2.25 2.25ZM15.5 12.5c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _group2Fill!!
    }

private var _group2Fill: ImageVector? = null
