package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = tablerOutlineIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 3.447715f, 15.552285f, 3.0f, 15.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(8.447715f, 3.0f, 8.0f, 3.447715f, 8.0f, 4.0f),
                    PathNode.LineTo(8.0f, 6.0f)
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
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(17.094f, 7.759f),
                    PathNode.CurveTo(17.686083f, 8.710336f, 17.999933f, 9.808463f, 18.0f, 10.929f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 20.10457f, 17.10457f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(6.895431f, 21.0f, 6.0f, 20.10457f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 10.929f),
                    PathNode.CurveTo(6.000067f, 9.808463f, 6.313916f, 8.710336f, 6.906f, 7.759f),
                    PathNode.LineTo(8.0f, 6.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 17.10457f, 10.895431f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.104569f, 18.0f, 14.0f, 17.10457f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 14.895431f, 13.104569f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(10.895431f, 14.0f, 10.0f, 14.895431f, 10.0f, 16.0f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(14.0f, 10.0f)
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
        return _milk!!
    }

private var _milk: ImageVector? = null
