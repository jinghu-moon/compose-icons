package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = tablerFilledIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.552285f, 2.0f, 16.0f, 2.447715f, 16.0f, 3.0f),
                    PathNode.CurveTo(16.0f, 3.552285f, 15.552285f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 8.826f),
                    PathNode.LineTo(18.932f, 19.64f),
                    PathNode.LineTo(18.966f, 19.717f),
                    PathNode.CurveTo(19.10947f, 20.10185f, 19.10876f, 20.525633f, 18.964f, 20.91f),
                    PathNode.LineTo(18.894f, 21.072f),
                    PathNode.CurveTo(18.655083f, 21.549236f, 18.205917f, 21.886574f, 17.681f, 21.983f),
                    PathNode.LineTo(17.5f, 22.0f),
                    PathNode.LineTo(6.5f, 22.0f),
                    PathNode.LineTo(6.319f, 21.983f),
                    PathNode.CurveTo(5.824681f, 21.891993f, 5.395973f, 21.5869f, 5.148035f, 21.149681f),
                    PathNode.CurveTo(4.900097f, 20.712461f, 4.858347f, 20.187935f, 5.034f, 19.717f),
                    PathNode.LineTo(5.073f, 19.627f),
                    PathNode.LineTo(9.0f, 8.823f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(8.447715f, 4.0f, 8.0f, 3.552285f, 8.0f, 3.0f),
                    PathNode.CurveTo(8.0f, 2.447715f, 8.447715f, 2.0f, 9.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 4.0f),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
