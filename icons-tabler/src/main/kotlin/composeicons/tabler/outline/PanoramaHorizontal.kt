package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) return _panoramaHorizontal!!
        _panoramaHorizontal = tablerOutlineIcon(
            name = "PanoramaHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.338f, 5.53f),
                    PathNode.CurveTo(9.444f, 7.462f, 14.549f, 7.462f, 19.655f, 5.53f),
                    PathNode.CurveTo(19.960997f, 5.417522f, 20.302614f, 5.461267f, 20.570395f, 5.647221f),
                    PathNode.CurveTo(20.838177f, 5.833175f, 20.9985f, 6.137989f, 21.0f, 6.464f),
                    PathNode.LineTo(21.0f, 17.464f),
                    PathNode.CurveTo(21.0f, 18.156f, 20.308f, 18.664f, 19.66f, 18.426f),
                    PathNode.CurveTo(14.553f, 16.494f, 9.446f, 16.494f, 4.339f, 18.426f),
                    PathNode.CurveTo(3.691f, 18.672f, 3.0f, 18.184f, 3.0f, 17.491f),
                    PathNode.LineTo(3.0f, 6.464f),
                    PathNode.CurveTo(3.001992f, 6.139577f, 3.161245f, 5.836282f, 3.427177f, 5.650448f),
                    PathNode.CurveTo(3.693109f, 5.464613f, 4.032667f, 5.419337f, 4.338f, 5.529f),
                    PathNode.LineTo(4.338f, 5.53f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
