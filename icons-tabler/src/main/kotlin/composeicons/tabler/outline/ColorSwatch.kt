package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorSwatch: ImageVector
    get() {
        if (_colorSwatch != null) return _colorSwatch!!
        _colorSwatch = tablerOutlineIcon(
            name = "ColorSwatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(13.895431f, 3.0f, 13.0f, 3.895431f, 13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 19.209139f, 14.790861f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(19.209139f, 21.0f, 21.0f, 19.209139f, 21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 20.10457f, 3.0f, 19.0f, 3.0f)
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
                    PathNode.MoveTo(13.0f, 7.35f),
                    PathNode.LineTo(11.0f, 5.35f),
                    PathNode.CurveTo(10.219f, 4.569237f, 8.953f, 4.569237f, 8.172f, 5.35f),
                    PathNode.LineTo(5.344f, 8.178001f),
                    PathNode.CurveTo(4.563236f, 8.959f, 4.563236f, 10.225f, 5.344f, 11.006f),
                    PathNode.LineTo(14.344f, 20.006f)
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
                    PathNode.MoveTo(7.3f, 13.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.CurveTo(3.895431f, 13.0f, 3.0f, 13.895431f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.01f)
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
        return _colorSwatch!!
    }

private var _colorSwatch: ImageVector? = null
