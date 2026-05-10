package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Drinks2Fill: ImageVector
    get() {
        if (_drinks2Fill != null) return _drinks2Fill!!
        _drinks2Fill = remixIcon(
            name = "Drinks2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.323 2h-3.323v-2h4.677l2 5h10.323v2h-2.118l-.827 14.059c-.031 .529-.469 .941-.998 .941h-10.114c-.529 0-.967-.413-.998-.941L5.118 7h-2.118v-2h5.523L7.323 2ZM7.121 7l.178 3.025c2.672 .11 3.969 .605 5.061 1.042 1.051 .42 1.92 .786 4.227 .901L16.879 7h-9.758Z"),
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
        return _drinks2Fill!!
    }

private var _drinks2Fill: ImageVector? = null
