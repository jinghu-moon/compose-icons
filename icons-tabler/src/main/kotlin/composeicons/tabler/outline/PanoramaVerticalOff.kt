package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaVerticalOff: ImageVector
    get() {
        if (_panoramaVerticalOff != null) return _panoramaVerticalOff!!
        _panoramaVerticalOff = tablerOutlineIcon(
            name = "PanoramaVerticalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.LineTo(17.53f, 3.0f),
                    PathNode.CurveTo(18.223f, 3.0f, 18.71f, 3.691f, 18.465f, 4.338f),
                    PathNode.CurveTo(17.367f, 7.236f, 16.892f, 10.133f, 17.04f, 13.03f),
                    PathNode.MoveTo(17.868f, 17.877f),
                    PathNode.CurveTo(18.04f, 18.469f, 18.238f, 19.062f, 18.463f, 19.655f),
                    PathNode.CurveTo(18.575478f, 19.960997f, 18.531733f, 20.302614f, 18.34578f, 20.570395f),
                    PathNode.CurveTo(18.159826f, 20.838177f, 17.85501f, 20.9985f, 17.529f, 21.0f),
                    PathNode.LineTo(6.529f, 21.0f),
                    PathNode.CurveTo(5.837f, 21.0f, 5.321f, 20.308f, 5.567f, 19.66f),
                    PathNode.CurveTo(7.264f, 15.174f, 7.47f, 10.687f, 6.186f, 6.2f)
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
        return _panoramaVerticalOff!!
    }

private var _panoramaVerticalOff: ImageVector? = null
