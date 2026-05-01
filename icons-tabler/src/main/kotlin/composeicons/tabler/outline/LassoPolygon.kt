package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LassoPolygon: ImageVector
    get() {
        if (_lassoPolygon != null) return _lassoPolygon!!
        _lassoPolygon = tablerOutlineIcon(
            name = "LassoPolygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.028f, 13.252f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(6.856f, 15.745f)
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
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 16.10457f, 3.895431f, 17.0f, 5.0f, 17.0f),
                    PathNode.CurveTo(6.10457f, 17.0f, 7.0f, 16.10457f, 7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 13.895431f, 6.10457f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(3.895431f, 13.0f, 3.0f, 13.895431f, 3.0f, 15.0f)
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
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.42f, 5.316f, 19.805f, 6.0f, 21.0f)
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
        return _lassoPolygon!!
    }

private var _lassoPolygon: ImageVector? = null
