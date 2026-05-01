package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HazeMoon: ImageVector
    get() {
        if (_hazeMoon != null) return _hazeMoon!!
        _hazeMoon = tablerOutlineIcon(
            name = "HazeMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.LineTo(21.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f)
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
                    PathNode.MoveTo(8.296f, 16.0f),
                    PathNode.CurveTo(6.028f, 14.6f, 4.698f, 11.913f, 5.059f, 9.084f),
                    PathNode.CurveTo(5.502f, 5.604f, 8.367f, 3.001f, 11.757f, 3.0f),
                    PathNode.LineTo(11.757f, 3.006f),
                    PathNode.LineTo(12.053f, 3.006f),
                    PathNode.CurveTo(10.062f, 4.922f, 9.676f, 8.036001f, 11.135f, 10.411f),
                    PathNode.CurveTo(12.594f, 12.785f, 15.481f, 13.741f, 18.0f, 12.686f),
                    PathNode.CurveTo(17.45402f, 14.060091f, 16.480368f, 15.222023f, 15.223f, 16.0f)
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
        return _hazeMoon!!
    }

private var _hazeMoon: ImageVector? = null
