package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Variable: ImageVector
    get() {
        if (_variable != null) return _variable!!
        _variable = tablerOutlineIcon(
            name = "Variable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 4.0f),
                    PathNode.CurveTo(2.5f, 9.0f, 2.5f, 14.0f, 5.0f, 20.0f),
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(21.5f, 9.0f, 21.5f, 14.0f, 19.0f, 20.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 9.0f, 11.0f, 10.0f, 12.016f, 12.527f),
                    PathNode.CurveTo(13.0f, 15.0f, 13.0f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.CurveTo(9.5f, 16.0f, 11.0f, 14.0f, 12.0f, 12.5f),
                    PathNode.CurveTo(13.0f, 11.0f, 14.5f, 9.0f, 16.0f, 9.0f)
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
        return _variable!!
    }

private var _variable: ImageVector? = null
