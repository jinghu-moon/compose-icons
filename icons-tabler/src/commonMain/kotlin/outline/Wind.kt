package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = tablerOutlineIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(13.5f, 8.0f),
                    PathNode.CurveTo(14.789711f, 8.024678f, 15.886452f, 7.064045f, 16.031887f, 5.782323f),
                    PathNode.CurveTo(16.177324f, 4.500601f, 15.3237f, 3.31866f, 14.061249f, 3.053746f),
                    PathNode.CurveTo(12.798798f, 2.788832f, 11.54206f, 3.527932f, 11.16f, 4.76f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(18.5f, 12.0f),
                    PathNode.CurveTo(19.78971f, 11.975322f, 20.886452f, 12.935956f, 21.031887f, 14.217677f),
                    PathNode.CurveTo(21.177324f, 15.499399f, 20.3237f, 16.68134f, 19.061249f, 16.946255f),
                    PathNode.CurveTo(17.798798f, 17.211168f, 16.54206f, 16.472069f, 16.16f, 15.24f)
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
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.LineTo(9.5f, 16.0f),
                    PathNode.CurveTo(10.789711f, 15.975322f, 11.886452f, 16.935955f, 12.031888f, 18.217678f),
                    PathNode.CurveTo(12.177324f, 19.4994f, 11.3237f, 20.68134f, 10.061249f, 20.946255f),
                    PathNode.CurveTo(8.798798f, 21.211168f, 7.542061f, 20.472069f, 7.16f, 19.24f)
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
        return _wind!!
    }

private var _wind: ImageVector? = null
