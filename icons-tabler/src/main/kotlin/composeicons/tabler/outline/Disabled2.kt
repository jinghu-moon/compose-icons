package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Disabled2: ImageVector
    get() {
        if (_disabled2 != null) return _disabled2!!
        _disabled2 = tablerOutlineIcon(
            name = "Disabled2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 7.10457f, 15.895431f, 8.0f, 17.0f, 8.0f),
                    PathNode.CurveTo(18.10457f, 8.0f, 19.0f, 7.10457f, 19.0f, 6.0f),
                    PathNode.CurveTo(19.0f, 4.895431f, 18.10457f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(15.895431f, 4.0f, 15.0f, 4.895431f, 15.0f, 6.0f)
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
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.CurveTo(6.630576f, 10.959017f, 4.557826f, 12.586967f, 4.036174f, 14.898618f),
                    PathNode.CurveTo(3.514522f, 17.210268f, 4.687268f, 19.570604f, 6.844667f, 20.551153f),
                    PathNode.CurveTo(9.002066f, 21.531702f, 11.551476f, 20.863108f, 12.95f, 18.95f)
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
                    PathNode.MoveTo(19.0f, 20.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(6.0f, 8.0f)
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
        return _disabled2!!
    }

private var _disabled2: ImageVector? = null
