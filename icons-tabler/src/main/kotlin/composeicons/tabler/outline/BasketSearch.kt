package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BasketSearch: ImageVector
    get() {
        if (_basketSearch != null) return _basketSearch!!
        _basketSearch = tablerOutlineIcon(
            name = "BasketSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(15.0f, 4.0f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(9.0f, 4.0f)
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
                    PathNode.MoveTo(11.0f, 20.0f),
                    PathNode.LineTo(7.244f, 20.0f),
                    PathNode.CurveTo(5.763275f, 19.99993f, 4.504071f, 18.91952f, 4.279f, 17.456f),
                    PathNode.LineTo(3.024f, 10.304f),
                    PathNode.CurveTo(2.935299f, 9.727221f, 3.102933f, 9.140471f, 3.482946f, 8.697603f),
                    PathNode.CurveTo(3.862958f, 8.254736f, 4.417441f, 7.999931f, 5.001f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.58356f, 7.999931f, 20.138042f, 8.254736f, 20.518053f, 8.697603f),
                    PathNode.CurveTo(20.898067f, 9.140471f, 21.0657f, 9.727221f, 20.977f, 10.304f),
                    PathNode.LineTo(20.762f, 11.531f)
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
                    PathNode.MoveTo(13.483f, 12.658f),
                    PathNode.CurveTo(12.924248f, 12.041595f, 12.042256f, 11.835466f, 11.268185f, 12.140382f),
                    PathNode.CurveTo(10.494113f, 12.445297f, 9.989644f, 13.197567f, 10.001387f, 14.029446f),
                    PathNode.CurveTo(10.013129f, 14.861324f, 10.53863f, 15.599055f, 11.321f, 15.882f)
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
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 19.656855f, 16.343145f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(19.656855f, 21.0f, 21.0f, 19.656855f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 16.343145f, 19.656855f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(16.343145f, 15.0f, 15.0f, 16.343145f, 15.0f, 18.0f)
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
                    PathNode.MoveTo(20.2f, 20.2f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _basketSearch!!
    }

private var _basketSearch: ImageVector? = null
