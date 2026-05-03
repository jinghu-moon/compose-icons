package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Nurse: ImageVector
    get() {
        if (_nurse != null) return _nurse!!
        _nurse = tablerFilledIcon(
            name = "Nurse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.002f, 4.0f),
                    PathNode.CurveTo(14.868f, 4.0f, 18.702f, 5.365f, 21.534f, 7.155f),
                    PathNode.CurveTo(21.878717f, 7.372688f, 22.056767f, 7.777848f, 21.984f, 8.179f),
                    PathNode.LineTo(19.984f, 19.179f),
                    PathNode.CurveTo(19.89749f, 19.654493f, 19.4833f, 20.000072f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(4.516701f, 20.000072f, 4.102511f, 19.654493f, 4.016f, 19.179f),
                    PathNode.LineTo(2.016f, 8.179f),
                    PathNode.CurveTo(1.943234f, 7.777848f, 2.121283f, 7.372688f, 2.466f, 7.155f),
                    PathNode.CurveTo(5.3f, 5.363f, 9.19f, 3.995f, 12.002f, 4.0f),
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(11.447715f, 9.0f, 11.0f, 9.447715f, 11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(9.493025f, 11.000067f, 9.066316f, 11.379507f, 9.007f, 11.883f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 12.552285f, 9.447715f, 13.0f, 10.0f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(11.000067f, 14.506975f, 11.379507f, 14.933684f, 11.883f, 14.993f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.CurveTo(12.552285f, 15.0f, 13.0f, 14.552285f, 13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.506975f, 12.999933f, 14.933684f, 12.620493f, 14.993f, 12.117f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 11.447715f, 14.552285f, 11.0f, 14.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(12.999933f, 9.493025f, 12.620493f, 9.066316f, 12.117f, 9.007f),
                    PathNode.Close
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
        return _nurse!!
    }

private var _nurse: ImageVector? = null
