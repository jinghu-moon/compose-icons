package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dashboard: ImageVector
    get() {
        if (_dashboard != null) return _dashboard!!
        _dashboard = tablerFilledIcon(
            name = "Dashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2.954c4.253-0 8.041 2.69 9.442 6.705 1.401 4.015 .11 8.478-3.22 11.124-.177 .141-.396 .217-.622 .217h-11.2c-.226-0-.445-.076-.622-.217C2.448 18.137 1.157 13.675 2.558 9.659 3.959 5.644 7.747 2.954 12 2.954M16.207 8.793c-.391-.39-1.024-.39-1.414 0l-2.276 2.274c-.581-.154-1.2-.04-1.687 .312-.487 .352-.791 .903-.827 1.503L10 13c.001 .776 .452 1.482 1.156 1.809 .704 .328 1.533 .219 2.129-.28 .595-.498 .848-1.296 .649-2.047l2.274-2.276c.39-.391 .39-1.023 0-1.414"),
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
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
