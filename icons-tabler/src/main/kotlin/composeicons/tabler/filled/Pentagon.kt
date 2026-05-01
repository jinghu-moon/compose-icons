package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = tablerFilledIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.205f, 2.6f),
                    PathNode.LineTo(3.245f, 7.838f),
                    PathNode.CurveTo(2.216962f, 8.611494f, 1.796561f, 9.954365f, 2.2f, 11.176f),
                    PathNode.LineTo(5.096f, 19.941f),
                    PathNode.CurveTo(5.502132f, 21.170444f, 6.651213f, 22.000605f, 7.946f, 22.0f),
                    PathNode.LineTo(16.066f, 22.0f),
                    PathNode.CurveTo(17.351646f, 21.999899f, 18.494307f, 21.180609f, 18.907f, 19.963f),
                    PathNode.LineTo(21.88f, 11.199f),
                    PathNode.CurveTo(22.297804f, 9.966827f, 21.873743f, 8.605795f, 20.83f, 7.829f),
                    PathNode.LineTo(13.797f, 2.592f),
                    PathNode.LineTo(13.706f, 2.531f),
                    PathNode.LineTo(13.688f, 2.521f),
                    PathNode.LineTo(13.582f, 2.451f),
                    PathNode.CurveTo(12.533024f, 1.801114f, 11.1931f, 1.859837f, 10.205f, 2.599f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
