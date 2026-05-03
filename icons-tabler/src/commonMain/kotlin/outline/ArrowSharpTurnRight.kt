package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowSharpTurnRight: ImageVector
    get() {
        if (_arrowSharpTurnRight != null) return _arrowSharpTurnRight!!
        _arrowSharpTurnRight = tablerOutlineIcon(
            name = "ArrowSharpTurnRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 18.0f),
                    PathNode.LineTo(7.0f, 6.69f),
                    PathNode.CurveTo(6.99998f, 6.406861f, 7.17053f, 6.151593f, 7.432115f, 6.043237f),
                    PathNode.CurveTo(7.693701f, 5.934881f, 7.994801f, 5.99478f, 8.195f, 6.195f),
                    PathNode.LineTo(18.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 16.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.LineTo(18.0f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowSharpTurnRight!!
    }

private var _arrowSharpTurnRight: ImageVector? = null
