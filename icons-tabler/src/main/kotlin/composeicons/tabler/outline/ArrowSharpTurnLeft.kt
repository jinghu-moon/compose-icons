package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowSharpTurnLeft: ImageVector
    get() {
        if (_arrowSharpTurnLeft != null) return _arrowSharpTurnLeft!!
        _arrowSharpTurnLeft = tablerOutlineIcon(
            name = "ArrowSharpTurnLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 18.0f),
                    PathNode.LineTo(17.0f, 6.69f),
                    PathNode.CurveTo(17.00002f, 6.406861f, 16.829472f, 6.151593f, 16.567884f, 6.043237f),
                    PathNode.CurveTo(16.3063f, 5.934881f, 16.0052f, 5.99478f, 15.805f, 6.195f),
                    PathNode.LineTo(6.0f, 16.0f)
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
                    PathNode.MoveTo(11.0f, 16.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 11.0f)
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
        return _arrowSharpTurnLeft!!
    }

private var _arrowSharpTurnLeft: ImageVector? = null
