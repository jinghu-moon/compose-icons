package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = tablerOutlineIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 15.104569f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 12.895431f, 13.104569f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(10.895431f, 12.0f, 10.0f, 12.895431f, 10.0f, 14.0f)
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
                    PathNode.MoveTo(5.001f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.58356f, 7.999931f, 20.138042f, 8.254736f, 20.518053f, 8.697603f),
                    PathNode.CurveTo(20.898067f, 9.140471f, 21.0657f, 9.727221f, 20.977f, 10.304f),
                    PathNode.LineTo(19.722f, 17.456f),
                    PathNode.CurveTo(19.496872f, 18.919895f, 18.237104f, 20.000423f, 16.756f, 20.0f),
                    PathNode.LineTo(7.244f, 20.0f),
                    PathNode.CurveTo(5.763275f, 19.99993f, 4.504071f, 18.91952f, 4.279f, 17.456f),
                    PathNode.LineTo(3.024f, 10.304f),
                    PathNode.CurveTo(2.935299f, 9.727221f, 3.102933f, 9.140471f, 3.482946f, 8.697603f),
                    PathNode.CurveTo(3.862958f, 8.254736f, 4.417441f, 7.999931f, 5.001f, 8.0f)
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
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(15.0f, 4.0f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(9.0f, 4.0f)
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
        return _basket!!
    }

private var _basket: ImageVector? = null
