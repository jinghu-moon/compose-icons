package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Baguette: ImageVector
    get() {
        if (_baguette != null) return _baguette!!
        _baguette = tablerOutlineIcon(
            name = "Baguette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.628f, 11.283f),
                    PathNode.LineTo(11.272f, 5.646f),
                    PathNode.CurveTo(13.937f, 2.983f, 17.196f, 1.899f, 19.935f, 4.441f),
                    PathNode.LineTo(20.123f, 4.622f),
                    PathNode.CurveTo(20.684317f, 5.182323f, 20.999746f, 5.942881f, 20.999746f, 6.736f),
                    PathNode.CurveTo(20.999746f, 7.52912f, 20.684317f, 8.289678f, 20.123f, 8.85f),
                    PathNode.LineTo(8.836f, 20.124f),
                    PathNode.CurveTo(7.719826f, 21.235548f, 5.93406f, 21.294506f, 4.747f, 20.259f),
                    PathNode.LineTo(4.604f, 20.124f),
                    PathNode.CurveTo(1.876f, 17.4f, 2.9f, 14.007f, 5.628f, 11.283f)
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
                    PathNode.MoveTo(9.5f, 7.5f),
                    PathNode.LineTo(11.0f, 11.0f)
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
                    PathNode.MoveTo(6.5f, 10.5f),
                    PathNode.LineTo(8.0f, 14.0f)
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
                    PathNode.MoveTo(12.5f, 4.5f),
                    PathNode.LineTo(14.0f, 8.0f)
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
        return _baguette!!
    }

private var _baguette: ImageVector? = null
