package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaHorizontalOff: ImageVector
    get() {
        if (_panoramaHorizontalOff != null) return _panoramaHorizontalOff!!
        _panoramaHorizontalOff = tablerOutlineIcon(
            name = "PanoramaHorizontalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.95f, 6.952f),
                    PathNode.CurveTo(13.851f, 7.102f, 16.753f, 6.629f, 19.655f, 5.532f),
                    PathNode.CurveTo(19.960997f, 5.419522f, 20.302614f, 5.463268f, 20.570395f, 5.649221f),
                    PathNode.CurveTo(20.838177f, 5.835175f, 20.9985f, 6.139989f, 21.0f, 6.466f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.MoveTo(17.788f, 17.806f),
                    PathNode.CurveTo(13.305f, 16.525f, 8.822f, 16.732f, 4.339f, 18.428f),
                    PathNode.CurveTo(4.033496f, 18.54157f, 3.69171f, 18.497988f, 3.424482f, 18.311386f),
                    PathNode.CurveTo(3.157254f, 18.124786f, 2.998611f, 17.818928f, 3.0f, 17.493f),
                    PathNode.LineTo(3.0f, 6.466f),
                    PathNode.CurveTo(3.001992f, 6.141577f, 3.161245f, 5.838282f, 3.427177f, 5.652447f),
                    PathNode.CurveTo(3.693109f, 5.466613f, 4.032667f, 5.421337f, 4.338f, 5.531f),
                    PathNode.CurveTo(4.926f, 5.752f, 5.514f, 5.949f, 6.102f, 6.121f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _panoramaHorizontalOff!!
    }

private var _panoramaHorizontalOff: ImageVector? = null
