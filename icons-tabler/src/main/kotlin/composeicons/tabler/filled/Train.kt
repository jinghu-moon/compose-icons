package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Train: ImageVector
    get() {
        if (_train != null) return _train!!
        _train = tablerFilledIcon(
            name = "Train",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 5.0f),
                    PathNode.CurveTo(17.634f, 5.0f, 21.853f, 8.11f, 21.996f, 12.754f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 14.656855f, 20.656855f, 16.0f, 19.0f, 16.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(2.447715f, 16.0f, 2.0f, 15.552285f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 5.447716f, 2.447715f, 5.0f, 3.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 7.026f),
                    PathNode.CurveTo(11.666953f, 7.008559f, 11.333504f, 6.999889f, 11.0f, 7.0f),
                    PathNode.MoveTo(14.001f, 7.257f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(19.04f, 10.0f),
                    PathNode.CurveTo(18.061f, 8.663f, 16.351f, 7.694f, 14.001f, 7.257f),
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.552284f, 18.0f, 22.0f, 18.447716f, 22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 19.552284f, 21.552284f, 20.0f, 21.0f, 20.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(2.447715f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 18.447716f, 2.447715f, 18.0f, 3.0f, 18.0f),
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
        return _train!!
    }

private var _train: ImageVector? = null
