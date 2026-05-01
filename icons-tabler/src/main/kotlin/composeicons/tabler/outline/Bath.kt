package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bath: ImageVector
    get() {
        if (_bath != null) return _bath!!
        _bath = tablerOutlineIcon(
            name = "Bath",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.552284f, 12.0f, 21.0f, 12.447715f, 21.0f, 13.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 18.209139f, 19.209139f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(4.790861f, 20.0f, 3.0f, 18.209139f, 3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(3.0f, 12.447715f, 3.447715f, 12.0f, 4.0f, 12.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 3.895431f, 6.895431f, 3.0f, 8.0f, 3.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 5.25f)
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
                    PathNode.MoveTo(4.0f, 21.0f),
                    PathNode.LineTo(5.0f, 19.5f)
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.LineTo(19.0f, 19.5f)
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
        return _bath!!
    }

private var _bath: ImageVector? = null
