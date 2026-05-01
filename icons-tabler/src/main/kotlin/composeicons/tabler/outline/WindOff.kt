package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindOff: ImageVector
    get() {
        if (_windOff != null) return _windOff!!
        _windOff = tablerOutlineIcon(
            name = "WindOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(13.5f, 8.0f),
                    PathNode.CurveTo(14.789711f, 8.024678f, 15.886452f, 7.064045f, 16.031887f, 5.782323f),
                    PathNode.CurveTo(16.177324f, 4.500601f, 15.3237f, 3.31866f, 14.061249f, 3.053746f),
                    PathNode.CurveTo(12.798798f, 2.788832f, 11.54206f, 3.527932f, 11.16f, 4.76f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(18.5f, 12.0f),
                    PathNode.CurveTo(19.523523f, 11.980324f, 20.45562f, 12.586642f, 20.852514f, 13.530286f),
                    PathNode.CurveTo(21.249409f, 14.473929f, 21.030891f, 15.564194f, 20.301f, 16.282f)
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
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.LineTo(9.5f, 16.0f),
                    PathNode.CurveTo(10.789711f, 15.975322f, 11.886452f, 16.935955f, 12.031888f, 18.217678f),
                    PathNode.CurveTo(12.177324f, 19.4994f, 11.3237f, 20.68134f, 10.061249f, 20.946255f),
                    PathNode.CurveTo(8.798798f, 21.211168f, 7.542061f, 20.472069f, 7.16f, 19.24f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _windOff!!
    }

private var _windOff: ImageVector? = null
