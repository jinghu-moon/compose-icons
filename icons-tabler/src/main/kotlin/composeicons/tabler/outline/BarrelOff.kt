package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BarrelOff: ImageVector
    get() {
        if (_barrelOff != null) return _barrelOff!!
        _barrelOff = tablerOutlineIcon(
            name = "BarrelOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(16.722f, 4.0f),
                    PathNode.CurveTo(17.524923f, 4.000253f, 18.249859f, 4.480656f, 18.563f, 5.22f),
                    PathNode.CurveTo(19.521f, 7.48f, 20.0f, 9.74f, 20.0f, 12.0f),
                    PathNode.CurveTo(19.998781f, 13.214382f, 19.862274f, 14.424848f, 19.593f, 15.609f),
                    PathNode.MoveTo(18.629f, 18.622f),
                    PathNode.LineTo(18.563f, 18.78f),
                    PathNode.CurveTo(18.249859f, 19.519344f, 17.524923f, 19.999746f, 16.722f, 20.0f),
                    PathNode.LineTo(7.278f, 20.0f),
                    PathNode.CurveTo(6.475076f, 19.999746f, 5.75014f, 19.519344f, 5.437f, 18.78f),
                    PathNode.CurveTo(4.479f, 16.52f, 4.0f, 14.26f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 9.79f, 4.458f, 7.58f, 5.374f, 5.37f)
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
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.CurveTo(14.585f, 6.337f, 14.913f, 8.674f, 14.985f, 11.01f),
                    PathNode.MoveTo(14.871f, 14.87f),
                    PathNode.CurveTo(14.714452f, 16.60004f, 14.423236f, 18.315239f, 14.0f, 20.0f)
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
                    PathNode.MoveTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.864799f, 4.540955f, 9.742763f, 5.085116f, 9.634f, 5.632f),
                    PathNode.MoveTo(9.128f, 9.133f),
                    PathNode.CurveTo(9.042648f, 10.086283f, 8.999939f, 11.042904f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 14.667f, 9.333f, 17.333f, 10.0f, 20.0f)
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
                    PathNode.MoveTo(4.5f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(19.5f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(4.5f, 8.0f)
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
        return _barrelOff!!
    }

private var _barrelOff: ImageVector? = null
