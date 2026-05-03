package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = tablerFilledIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.364f, 4.636f),
                    PathNode.CurveTo(21.798885f, 8.070483f, 21.888725f, 13.610957f, 18.567f, 17.155f),
                    PathNode.LineTo(18.364f, 17.365f),
                    PathNode.LineTo(14.121f, 21.607f),
                    PathNode.CurveTo(13.003802f, 22.723488f, 11.212274f, 22.78252f, 10.024f, 21.742f),
                    PathNode.LineTo(9.88f, 21.607f),
                    PathNode.LineTo(5.636f, 17.364f),
                    PathNode.CurveTo(2.12126f, 13.849259f, 2.12126f, 8.150741f, 5.636f, 4.636f),
                    PathNode.CurveTo(9.150741f, 1.12126f, 14.849259f, 1.12126f, 18.364f, 4.636f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 9.343145f, 9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 12.656855f, 10.343145f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.656855f, 14.0f, 15.0f, 12.656855f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
