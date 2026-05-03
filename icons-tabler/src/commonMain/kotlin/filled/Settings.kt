package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = tablerFilledIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.647f, 4.081f),
                    PathNode.CurveTo(14.701418f, 4.305592f, 14.85978f, 4.490713f, 15.073235f, 4.579257f),
                    PathNode.CurveTo(15.286688f, 4.667801f, 15.529587f, 4.649129f, 15.727f, 4.529f),
                    PathNode.CurveTo(18.166f, 3.044f, 20.957f, 5.834f, 19.472f, 8.273f),
                    PathNode.CurveTo(19.351864f, 8.470274f, 19.333063f, 8.713031f, 19.421394f, 8.926449f),
                    PathNode.CurveTo(19.509727f, 9.139868f, 19.694588f, 9.298331f, 19.919f, 9.353f),
                    PathNode.CurveTo(22.694f, 10.026f, 22.694f, 13.973f, 19.919f, 14.647f),
                    PathNode.CurveTo(19.694408f, 14.701418f, 19.509287f, 14.85978f, 19.420742f, 15.073235f),
                    PathNode.CurveTo(19.3322f, 15.286688f, 19.350872f, 15.529587f, 19.471f, 15.727f),
                    PathNode.CurveTo(20.956f, 18.166f, 18.166f, 20.957f, 15.727f, 19.472f),
                    PathNode.CurveTo(15.529726f, 19.351864f, 15.286969f, 19.333063f, 15.073551f, 19.421394f),
                    PathNode.CurveTo(14.860132f, 19.509727f, 14.701669f, 19.694588f, 14.647f, 19.919f),
                    PathNode.CurveTo(13.974f, 22.694f, 10.027f, 22.694f, 9.353f, 19.919f),
                    PathNode.CurveTo(9.298582f, 19.694408f, 9.14022f, 19.509287f, 8.926765f, 19.420742f),
                    PathNode.CurveTo(8.713312f, 19.3322f, 8.470413f, 19.350872f, 8.273f, 19.471f),
                    PathNode.CurveTo(5.834f, 20.956f, 3.043f, 18.166f, 4.528f, 15.727f),
                    PathNode.CurveTo(4.648137f, 15.529726f, 4.666937f, 15.286969f, 4.578605f, 15.073551f),
                    PathNode.CurveTo(4.490274f, 14.860132f, 4.305413f, 14.701669f, 4.081f, 14.647f),
                    PathNode.CurveTo(1.306f, 13.974f, 1.306f, 10.027f, 4.081f, 9.353f),
                    PathNode.CurveTo(4.305592f, 9.298582f, 4.490713f, 9.14022f, 4.579257f, 8.926765f),
                    PathNode.CurveTo(4.667801f, 8.713312f, 4.649129f, 8.470413f, 4.529f, 8.273f),
                    PathNode.CurveTo(3.044f, 5.834f, 5.834f, 3.043f, 8.273f, 4.528f),
                    PathNode.CurveTo(8.470097f, 4.649057f, 8.713262f, 4.668353f, 8.926983f, 4.579896f),
                    PathNode.CurveTo(9.140705f, 4.491439f, 9.299108f, 4.305939f, 9.353f, 4.081f),
                    PathNode.CurveTo(10.026f, 1.306f, 13.973f, 1.306f, 14.647f, 4.081f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f)
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
        return _settings!!
    }

private var _settings: ImageVector? = null
