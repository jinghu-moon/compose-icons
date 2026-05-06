package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BnbFill: ImageVector
    get() {
        if (_bnbFill != null) return _bnbFill!!
        _bnbFill = remixIcon(
            name = "BnbFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.167 4.367 12 1l5.833 3.367L15.689 5.611 12 3.488 8.312 5.611 6.167 4.367ZM17.833 8.613 15.689 7.369 12 9.492 8.312 7.369 6.167 8.613v2.488l3.688 2.123v4.246L12 18.713l2.144-1.244v-4.246l3.689-2.123v-2.488ZM17.833 15.347v-2.488l-2.144 1.244v2.488l2.144-1.244ZM19.355 16.226l-3.688 2.123v2.488l5.833-3.367v-6.734l-2.145 1.244v4.246ZM17.211 6.49l2.144 1.244v2.488L21.5 8.977v-2.488L19.355 5.246 17.211 6.49ZM9.856 19.249v2.488L12 22.981l2.144-1.244v-2.488L12 20.493 9.856 19.249ZM6.167 15.347l2.144 1.244v-2.488L6.167 12.859v2.488ZM9.856 6.49 12 7.734 14.144 6.49 12 5.246 9.856 6.49ZM4.644 7.734 6.789 6.49 4.644 5.246 2.5 6.49v2.488l2.144 1.244v-2.488ZM4.644 11.98 2.5 10.736v6.734l5.833 3.367v-2.488L4.644 16.226v-4.246Z"),
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
        return _bnbFill!!
    }

private var _bnbFill: ImageVector? = null
