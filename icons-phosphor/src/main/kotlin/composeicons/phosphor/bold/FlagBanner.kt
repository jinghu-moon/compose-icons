package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorBoldIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.15 49.59C239.95 46.108 236.118 43.998 232 44h-192c-4.855 0-9.231 2.925-11.087 7.411-1.856 4.486-.827 9.648 2.607 13.079L71 104 31.52 143.51c-3.435 3.431-4.464 8.593-2.607 13.079 1.856 4.486 6.233 7.411 11.087 7.411h127.28l-26.11 54.84c-1.969 3.886-1.677 8.535 .763 12.145 2.44 3.61 6.645 5.613 10.985 5.234 4.34-.379 8.134-3.081 9.912-7.058l80-168c1.774-3.718 1.518-8.086-.68-11.57ZM178.71 140h-109.71L96.52 112.48c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L69 68h144Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
