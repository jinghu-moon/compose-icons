package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = tablerFilledIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.117f, 7.625f),
                    PathNode.CurveTo(19.923271f, 7.602626f, 19.727228f, 7.637385f, 19.553f, 7.725f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(19.553f, 16.275f),
                    PathNode.CurveTo(19.862585f, 16.4297f, 20.23015f, 16.413332f, 20.524757f, 16.231722f),
                    PathNode.CurveTo(20.819363f, 16.050112f, 20.999125f, 15.729084f, 21.0f, 15.383f),
                    PathNode.LineTo(21.0f, 8.617f),
                    PathNode.CurveTo(20.999426f, 8.110407f, 20.620113f, 7.684272f, 20.117f, 7.625f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(3.355f, 5.0f, 2.0f, 6.355f, 2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 17.645f, 3.355f, 19.0f, 5.0f, 19.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(14.645f, 19.0f, 16.0f, 17.645f, 16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 6.355f, 14.645f, 5.0f, 13.0f, 5.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
