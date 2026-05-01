package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeTm: ImageVector
    get() {
        if (_badgeTm != null) return _badgeTm!!
        _badgeTm = tablerFilledIcon(
            name = "BadgeTm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(5.447716f, 8.0f, 5.0f, 8.447715f, 5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 9.552285f, 5.447716f, 10.0f, 6.0f, 10.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.000067f, 15.506975f, 7.379507f, 15.933684f, 7.883f, 15.993f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.552285f, 16.0f, 9.0f, 15.552285f, 9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.506975f, 9.999933f, 10.933684f, 9.620493f, 10.993f, 9.117f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 8.447715f, 10.552285f, 8.0f, 10.0f, 8.0f),
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 8.01f, 16.717f, 7.622f, 16.168f, 8.445f),
                    PathNode.LineTo(15.0f, 10.197f),
                    PathNode.LineTo(13.832f, 8.445f),
                    PathNode.CurveTo(13.283f, 7.622f, 12.0f, 8.011f, 12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.CurveTo(12.0f, 15.552285f, 12.447715f, 16.0f, 13.0f, 16.0f),
                    PathNode.LineTo(13.117f, 15.993f),
                    PathNode.CurveTo(13.620493f, 15.933684f, 13.999933f, 15.506975f, 14.0f, 15.0f),
                    PathNode.LineTo(14.0f, 12.303f),
                    PathNode.LineTo(14.168f, 12.555f),
                    PathNode.LineTo(14.248f, 12.659f),
                    PathNode.CurveTo(14.453009f, 12.892987f, 14.755238f, 13.018237f, 15.065662f, 12.997856f),
                    PathNode.CurveTo(15.376087f, 12.977474f, 15.659345f, 12.813784f, 15.832f, 12.555f),
                    PathNode.LineTo(16.0f, 12.302f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 15.552285f, 16.447716f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(17.552284f, 16.0f, 18.0f, 15.552285f, 18.0f, 15.0f),
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
        return _badgeTm!!
    }

private var _badgeTm: ImageVector? = null
