package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) return _panoramaVertical!!
        _panoramaVertical = tablerOutlineIcon(
            name = "PanoramaVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.463f, 4.338f),
                    PathNode.CurveTo(16.531f, 9.444f, 16.531f, 14.549f, 18.463f, 19.655f),
                    PathNode.CurveTo(18.575478f, 19.960997f, 18.531733f, 20.302614f, 18.34578f, 20.570395f),
                    PathNode.CurveTo(18.159826f, 20.838177f, 17.85501f, 20.9985f, 17.529f, 21.0f),
                    PathNode.LineTo(6.529f, 21.0f),
                    PathNode.CurveTo(5.837f, 21.0f, 5.321f, 20.308f, 5.567f, 19.66f),
                    PathNode.CurveTo(7.499f, 14.553f, 7.499f, 9.446f, 5.567f, 4.339f),
                    PathNode.CurveTo(5.321f, 3.691f, 5.81f, 3.0f, 6.502f, 3.0f),
                    PathNode.LineTo(17.53f, 3.0f),
                    PathNode.CurveTo(18.223f, 3.0f, 18.71f, 3.691f, 18.465f, 4.338f),
                    PathNode.LineTo(18.463f, 4.338f)
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
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
