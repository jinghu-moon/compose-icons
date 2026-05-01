package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScribbleOff: ImageVector
    get() {
        if (_scribbleOff != null) return _scribbleOff!!
        _scribbleOff = tablerOutlineIcon(
            name = "ScribbleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 18.0f, 7.0f, 19.0f, 10.0f, 19.0f),
                    PathNode.CurveTo(11.95f, 19.0f, 14.324f, 17.732f, 15.746f, 15.744f),
                    PathNode.MoveTo(16.927f, 12.932f),
                    PathNode.CurveTo(16.975657f, 12.623719f, 17.000065f, 12.312098f, 17.0f, 12.0f),
                    PathNode.CurveTo(17.0f, 8.0f, 14.0f, 5.0f, 11.0f, 5.0f),
                    PathNode.CurveTo(10.358f, 5.0f, 9.761f, 5.069f, 9.22f, 5.201f),
                    PathNode.MoveTo(6.728f, 6.716f),
                    PathNode.CurveTo(6.258f, 7.333f, 6.0f, 8.102f, 6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 11.5f, 8.0f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(12.597f, 14.0f, 13.203f, 13.945f, 13.808f, 13.844f),
                    PathNode.MoveTo(16.91f, 12.923f),
                    PathNode.CurveTo(19.145f, 11.97f, 21.062f, 10.5f, 22.0f, 9.0f)
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
        return _scribbleOff!!
    }

private var _scribbleOff: ImageVector? = null
