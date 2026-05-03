package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) return _panoramaVertical!!
        _panoramaVertical = tablerFilledIcon(
            name = "PanoramaVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.53f, 2.0f),
                    PathNode.CurveTo(18.92f, 2.0f, 19.894f, 3.389f, 19.4f, 4.692f),
                    PathNode.LineTo(19.387f, 4.718f),
                    PathNode.LineTo(19.231f, 5.149f),
                    PathNode.CurveTo(17.608f, 9.721f, 17.609f, 14.272f, 19.234f, 18.852f),
                    PathNode.LineTo(19.402f, 19.31f),
                    PathNode.CurveTo(19.627254f, 19.922823f, 19.539202f, 20.607014f, 19.166122f, 21.14283f),
                    PathNode.CurveTo(18.793041f, 21.678648f, 18.181908f, 21.998629f, 17.529f, 22.0f),
                    PathNode.LineTo(6.529f, 22.0f),
                    PathNode.CurveTo(5.143f, 22.0f, 4.135f, 20.614f, 4.632f, 19.306f),
                    PathNode.CurveTo(6.477f, 14.427f, 6.477f, 9.572f, 4.632f, 4.694f),
                    PathNode.CurveTo(4.137f, 3.39f, 5.112f, 2.0f, 6.502f, 2.0f),
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
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
