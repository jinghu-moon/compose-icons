package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) return _panoramaHorizontal!!
        _panoramaHorizontal = tablerFilledIcon(
            name = "PanoramaHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.31f, 4.591f),
                    PathNode.CurveTo(19.922823f, 4.365745f, 20.607014f, 4.453799f, 21.14283f, 4.826879f),
                    PathNode.CurveTo(21.678648f, 5.199959f, 21.998629f, 5.811093f, 22.0f, 6.464f),
                    PathNode.LineTo(22.0f, 17.464f),
                    PathNode.CurveTo(22.0f, 18.846f, 20.62f, 19.844f, 19.306f, 19.361f),
                    PathNode.CurveTo(14.427f, 17.516f, 9.572f, 17.516f, 4.694f, 19.361f),
                    PathNode.CurveTo(3.39f, 19.856f, 2.0f, 18.88f, 2.0f, 17.49f),
                    PathNode.LineTo(2.0f, 6.458f),
                    PathNode.CurveTo(2.003984f, 5.809154f, 2.32249f, 5.202564f, 2.854354f, 4.830895f),
                    PathNode.CurveTo(3.386218f, 4.459226f, 4.065334f, 4.368674f, 4.676f, 4.588f),
                    PathNode.LineTo(4.701f, 4.6f),
                    PathNode.LineTo(5.149f, 4.762f),
                    PathNode.CurveTo(9.721f, 6.385f, 14.272f, 6.384f, 18.852f, 4.759f),
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
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
