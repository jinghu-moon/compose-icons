package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CurrentLocation: ImageVector
    get() {
        if (_currentLocation != null) return _currentLocation!!
        _currentLocation = tablerFilledIcon(
            name = "CurrentLocation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(12.552285f, 1.0f, 13.0f, 1.447715f, 13.0f, 2.0f),
                    PathNode.LineTo(13.0f, 3.055f),
                    PathNode.CurveTo(17.178959f, 3.522935f, 20.47754f, 6.821101f, 20.946f, 11.0f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(22.552284f, 11.0f, 23.0f, 11.447715f, 23.0f, 12.0f),
                    PathNode.CurveTo(23.0f, 12.552285f, 22.552284f, 13.0f, 22.0f, 13.0f),
                    PathNode.LineTo(20.945f, 13.0f),
                    PathNode.CurveTo(20.47672f, 17.178238f, 17.179178f, 20.476194f, 13.001f, 20.945f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.CurveTo(13.0f, 22.552284f, 12.552285f, 23.0f, 12.0f, 23.0f),
                    PathNode.CurveTo(11.447715f, 23.0f, 11.0f, 22.552284f, 11.0f, 22.0f),
                    PathNode.LineTo(11.0f, 20.945f),
                    PathNode.CurveTo(6.821762f, 20.47672f, 3.523805f, 17.179178f, 3.055f, 13.001f),
                    PathNode.LineTo(2.0f, 13.0f),
                    PathNode.CurveTo(1.447715f, 13.0f, 1.0f, 12.552285f, 1.0f, 12.0f),
                    PathNode.CurveTo(1.0f, 11.447715f, 1.447715f, 11.0f, 2.0f, 11.0f),
                    PathNode.LineTo(3.055f, 11.0f),
                    PathNode.CurveTo(3.52337f, 6.821432f, 6.821432f, 3.52337f, 11.0f, 3.055f),
                    PathNode.LineTo(11.0f, 2.0f),
                    PathNode.CurveTo(11.0f, 1.447715f, 11.447715f, 1.0f, 12.0f, 1.0f),
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.CurveTo(8.134007f, 5.0f, 5.0f, 8.134007f, 5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 15.865993f, 8.134007f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(15.865993f, 19.0f, 19.0f, 15.865993f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 8.134007f, 15.865993f, 5.0f, 12.0f, 5.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(14.209139f, 8.0f, 16.0f, 9.790861f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 14.209139f, 14.209139f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(9.790861f, 16.0f, 8.0f, 14.209139f, 8.0f, 12.0f),
                    PathNode.LineTo(8.005f, 11.8f),
                    PathNode.CurveTo(8.111571f, 9.671265f, 9.868599f, 7.999999f, 12.0f, 8.0f)
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
        return _currentLocation!!
    }

private var _currentLocation: ImageVector? = null
