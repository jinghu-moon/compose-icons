package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = tablerFilledIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414 3.65 5.41C2.631 5.977 1.999 7.051 2 8.217v7.285c.002 1.178 .645 2.261 1.678 2.826l6.695 4.237c1.034 .57 2.22 .57 3.2 .032l6.804-4.302C21.357 17.758 22 16.677 22 15.502v-7.284l-.005-.204C21.939 7.067 21.47 6.193 20.711 5.624l-.107-.075-.007-.007c-.056-.051-.116-.095-.181-.133L13.64 1.414c-1.001-.552-2.215-.552-3.216 0Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
