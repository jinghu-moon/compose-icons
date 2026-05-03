package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeCc: ImageVector
    get() {
        if (_badgeCc != null) return _badgeCc!!
        _badgeCc = tablerOutlineIcon(
            name = "BadgeCc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 5.895431f, 3.895431f, 5.0f, 5.0f, 5.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(20.10457f, 5.0f, 21.0f, 5.895431f, 21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 18.10457f, 20.10457f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.895431f, 19.0f, 3.0f, 18.10457f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f)
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
                    PathNode.MoveTo(10.0f, 10.5f),
                    PathNode.CurveTo(10.0f, 9.671573f, 9.328427f, 9.0f, 8.5f, 9.0f),
                    PathNode.CurveTo(7.671573f, 9.0f, 7.0f, 9.671573f, 7.0f, 10.5f),
                    PathNode.LineTo(7.0f, 13.5f),
                    PathNode.CurveTo(7.0f, 14.328427f, 7.671573f, 15.0f, 8.5f, 15.0f),
                    PathNode.CurveTo(9.328427f, 15.0f, 10.0f, 14.328427f, 10.0f, 13.5f)
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
                    PathNode.MoveTo(17.0f, 10.5f),
                    PathNode.CurveTo(17.0f, 9.671573f, 16.328426f, 9.0f, 15.5f, 9.0f),
                    PathNode.CurveTo(14.671573f, 9.0f, 14.0f, 9.671573f, 14.0f, 10.5f),
                    PathNode.LineTo(14.0f, 13.5f),
                    PathNode.CurveTo(14.0f, 14.328427f, 14.671573f, 15.0f, 15.5f, 15.0f),
                    PathNode.CurveTo(16.328426f, 15.0f, 17.0f, 14.328427f, 17.0f, 13.5f)
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
        return _badgeCc!!
    }

private var _badgeCc: ImageVector? = null
