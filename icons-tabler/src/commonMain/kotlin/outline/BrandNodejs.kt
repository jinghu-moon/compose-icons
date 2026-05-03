package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNodejs: ImageVector
    get() {
        if (_brandNodejs != null) return _brandNodejs!!
        _brandNodejs = tablerOutlineIcon(
            name = "BrandNodejs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 17.044f),
                    PathNode.CurveTo(8.999874f, 17.757643f, 8.619497f, 18.41715f, 8.001845f, 18.77463f),
                    PathNode.CurveTo(7.384192f, 19.13211f, 6.622855f, 19.133394f, 6.004f, 18.778f),
                    PathNode.LineTo(4.436f, 17.878f),
                    PathNode.CurveTo(3.543751f, 17.332905f, 2.999672f, 16.36258f, 3.0f, 15.317f),
                    PathNode.LineTo(3.0f, 8.682f),
                    PathNode.CurveTo(3.000021f, 7.636776f, 3.544055f, 6.66691f, 4.436f, 6.122f),
                    PathNode.LineTo(10.436f, 2.455f),
                    PathNode.CurveTo(11.396166f, 1.868413f, 12.603834f, 1.868413f, 13.564f, 2.455f),
                    PathNode.LineTo(19.564f, 6.122f),
                    PathNode.CurveTo(20.45625f, 6.667096f, 21.000328f, 7.63742f, 21.0f, 8.683f),
                    PathNode.LineTo(21.0f, 15.317f),
                    PathNode.CurveTo(20.99998f, 16.362225f, 20.455946f, 17.33209f, 19.564f, 17.877f),
                    PathNode.LineTo(13.564f, 21.544f),
                    PathNode.CurveTo(12.603834f, 22.130587f, 11.396166f, 22.130587f, 10.436f, 21.544f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(13.5f, 9.0f),
                    PathNode.CurveTo(12.671573f, 9.0f, 12.0f, 9.671573f, 12.0f, 10.5f),
                    PathNode.CurveTo(12.0f, 11.328427f, 12.671573f, 12.0f, 13.5f, 12.0f),
                    PathNode.LineTo(15.5f, 12.0f),
                    PathNode.CurveTo(16.328426f, 12.0f, 17.0f, 12.671573f, 17.0f, 13.5f),
                    PathNode.CurveTo(17.0f, 14.328427f, 16.328426f, 15.0f, 15.5f, 15.0f),
                    PathNode.LineTo(12.0f, 15.0f)
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
        return _brandNodejs!!
    }

private var _brandNodejs: ImageVector? = null
