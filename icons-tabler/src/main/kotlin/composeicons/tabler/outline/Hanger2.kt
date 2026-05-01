package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) return _hanger2!!
        _hanger2 = tablerOutlineIcon(
            name = "Hanger2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(4.029f, 13.428f),
                    PathNode.CurveTo(3.393745f, 13.780784f, 2.999809f, 14.45036f, 3.0f, 15.177f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f)
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
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(20.10457f, 18.0f, 21.0f, 17.10457f, 21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 15.177f),
                    PathNode.CurveTo(21.00019f, 14.45036f, 20.606255f, 13.780784f, 19.971f, 13.428f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(10.543f, 8.19f, 10.007f, 6.667f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 3.895431f, 10.895431f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.104569f, 3.0f, 14.0f, 3.895431f, 14.0f, 5.0f)
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
                    PathNode.MoveTo(6.0f, 18.0f),
                    PathNode.CurveTo(6.0f, 16.89543f, 6.895431f, 16.0f, 8.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(17.10457f, 16.0f, 18.0f, 16.89543f, 18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 20.10457f, 17.10457f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(6.895431f, 21.0f, 6.0f, 20.10457f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 18.0f)
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
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
