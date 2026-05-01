package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationOff: ImageVector
    get() {
        if (_navigationOff != null) return _navigationOff!!
        _navigationOff = tablerOutlineIcon(
            name = "NavigationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.28f, 12.28f),
                    PathNode.CurveTo(15.33f, 10.216f, 13.903f, 7.123f, 12.0f, 3.0f),
                    PathNode.CurveTo(11.3f, 4.515f, 10.777f, 5.652f, 10.427f, 6.41f),
                    PathNode.MoveTo(9.157f, 9.16f),
                    PathNode.CurveTo(8.275f, 11.073f, 6.567f, 14.778f, 4.03f, 20.275f),
                    PathNode.CurveTo(3.96f, 20.475f, 4.013f, 20.699f, 4.165f, 20.847f),
                    PathNode.CurveTo(4.315f, 20.995f, 4.539f, 21.04f, 4.735f, 20.963f),
                    PathNode.LineTo(12.0f, 18.5f),
                    PathNode.LineTo(19.265f, 20.963f),
                    PathNode.CurveTo(19.461f, 21.04f, 19.685f, 20.995f, 19.835f, 20.847f),
                    PathNode.CurveTo(19.98673f, 20.698406f, 20.038944f, 20.475525f, 19.969f, 20.275f),
                    PathNode.LineTo(19.709f, 19.712f)
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
        return _navigationOff!!
    }

private var _navigationOff: ImageVector? = null
