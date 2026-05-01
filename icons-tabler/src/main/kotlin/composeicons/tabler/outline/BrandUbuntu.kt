package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandUbuntu: ImageVector
    get() {
        if (_brandUbuntu != null) return _brandUbuntu!!
        _brandUbuntu = tablerOutlineIcon(
            name = "BrandUbuntu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 6.10457f, 10.895431f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.104569f, 7.0f, 14.0f, 6.10457f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.895431f, 13.104569f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.895431f, 3.0f, 10.0f, 3.895431f, 10.0f, 5.0f)
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
                    PathNode.MoveTo(17.723f, 7.41f),
                    PathNode.CurveTo(16.698435f, 6.359677f, 15.404494f, 5.611683f, 13.983f, 5.248f),
                    PathNode.MoveTo(10.012f, 5.248f),
                    PathNode.CurveTo(8.566951f, 5.618603f, 7.254455f, 6.386217f, 6.223f, 7.464f),
                    PathNode.MoveTo(4.342f, 10.679f),
                    PathNode.CurveTo(4.114658f, 11.431335f, 3.999421f, 12.213066f, 4.0f, 12.999f),
                    PathNode.CurveTo(4.0f, 13.737f, 4.1f, 14.452f, 4.287f, 15.131f),
                    PathNode.MoveTo(6.247f, 18.559f),
                    PathNode.CurveTo(7.273417f, 19.62251f, 8.574617f, 20.38059f, 10.006f, 20.749f),
                    PathNode.MoveTo(14.006f, 20.749f),
                    PathNode.CurveTo(15.432634f, 20.37968f, 16.729397f, 19.62315f, 17.753f, 18.563f),
                    PathNode.MoveTo(19.715f, 15.133f),
                    PathNode.CurveTo(19.906033f, 14.438799f, 20.00257f, 13.722006f, 20.002f, 13.002f),
                    PathNode.CurveTo(20.002f, 12.238f, 19.895f, 11.499f, 19.695f, 10.799f)
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
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 18.10457f, 3.895431f, 19.0f, 5.0f, 19.0f),
                    PathNode.CurveTo(6.10457f, 19.0f, 7.0f, 18.10457f, 7.0f, 17.0f),
                    PathNode.CurveTo(7.0f, 15.895431f, 6.10457f, 15.0f, 5.0f, 15.0f),
                    PathNode.CurveTo(3.895431f, 15.0f, 3.0f, 15.895431f, 3.0f, 17.0f)
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
                    PathNode.CurveTo(17.0f, 18.10457f, 17.89543f, 19.0f, 19.0f, 19.0f),
                    PathNode.CurveTo(20.10457f, 19.0f, 21.0f, 18.10457f, 21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 15.895431f, 20.10457f, 15.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(17.89543f, 15.0f, 17.0f, 15.895431f, 17.0f, 17.0f)
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
        return _brandUbuntu!!
    }

private var _brandUbuntu: ImageVector? = null
