package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Leaf2: ImageVector
    get() {
        if (_leaf2 != null) return _leaf2!!
        _leaf2 = tablerOutlineIcon(
            name = "Leaf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.CurveTo(5.5f, 16.5f, 7.5f, 13.0f, 12.0f, 11.0f)
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
                    PathNode.MoveTo(7.5f, 15.0f),
                    PathNode.QuadTo(4.0f, 15.0f, 3.0f, 9.0f),
                    PathNode.CurveTo(4.161481f, 8.893867f, 5.332336f, 9.030774f, 6.438f, 9.402f),
                    PathNode.CurveTo(6.411917f, 9.138313f, 6.394573f, 8.873835f, 6.386f, 8.609f),
                    PathNode.CurveTo(6.386f, 5.003f, 9.59f, 3.0f, 9.59f, 3.0f),
                    PathNode.CurveTo(9.59f, 3.0f, 11.593f, 4.252f, 12.432f, 6.557f),
                    PathNode.QuadTo(15.0f, 5.0f, 19.0f, 5.0f),
                    PathNode.QuadTo(19.396f, 8.775f, 17.443f, 11.568f),
                    PathNode.CurveTo(19.748f, 12.407f, 21.0f, 14.41f, 21.0f, 14.41f),
                    PathNode.CurveTo(21.0f, 14.41f, 18.0f, 17.0f, 14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 18.0f, 14.0f, 18.0f, 14.5f, 20.0f),
                    PathNode.QuadTo(8.5f, 20.0f, 7.5f, 15.0f)
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
        return _leaf2!!
    }

private var _leaf2: ImageVector? = null
