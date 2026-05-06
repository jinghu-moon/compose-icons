package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Home2: ImageVector
    get() {
        if (_home2 != null) return _home2!!
        _home2 = tablerFilledIcon(
            name = "Home2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.707 2.293l9 9C22.337 11.923 21.891 13 21 13h-1v6c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-6h-1C2.11 13 1.663 11.923 2.293 11.293L11.293 2.293c.391-.39 1.023-.39 1.414 0M13.5 11h-3C9.672 11 9 11.672 9 12.5v3C9 16.328 9.672 17 10.5 17h3C14.328 17 15 16.328 15 15.5v-3C15 11.672 14.328 11 13.5 11"),
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
        return _home2!!
    }

private var _home2: ImageVector? = null
