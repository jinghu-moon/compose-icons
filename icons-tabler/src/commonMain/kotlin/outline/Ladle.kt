package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ladle: ImageVector
    get() {
        if (_ladle != null) return _ladle!!
        _ladle = tablerOutlineIcon(
            name = "Ladle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 18.31371f, 5.686292f, 21.0f, 9.0f, 21.0f),
                    PathNode.CurveTo(12.313708f, 21.0f, 15.0f, 18.31371f, 15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 4.343146f, 16.343145f, 3.0f, 18.0f, 3.0f),
                    PathNode.CurveTo(19.656855f, 3.0f, 21.0f, 4.343146f, 21.0f, 6.0f)
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
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.337f, 16.0f, 7.7f, 15.964f, 7.104f, 15.898f),
                    PathNode.LineTo(6.604f, 15.834f),
                    PathNode.CurveTo(4.481f, 15.526f, 3.0f, 14.821f, 3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 13.18f, 4.482f, 12.474f, 6.603f, 12.166f),
                    PathNode.LineTo(7.103f, 12.102f),
                    PathNode.CurveTo(7.732983f, 12.03322f, 8.366274f, 11.999168f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.663f, 12.0f, 10.3f, 12.036f, 10.896f, 12.102f),
                    PathNode.LineTo(11.396f, 12.166f),
                    PathNode.CurveTo(13.519f, 12.474f, 15.0f, 13.179f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 14.82f, 13.518f, 15.526f, 11.397f, 15.834f),
                    PathNode.LineTo(10.897f, 15.898f),
                    PathNode.CurveTo(10.267017f, 15.96678f, 9.633726f, 16.000832f, 9.0f, 16.0f)
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
        return _ladle!!
    }

private var _ladle: ImageVector? = null
