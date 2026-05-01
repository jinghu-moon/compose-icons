package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) return _homeHeart!!
        _homeHeart = tablerOutlineIcon(
            name = "HomeHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(13.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 13.895431f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.39f, 13.0f, 13.754f, 13.112f, 14.061f, 13.304f)
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
                    PathNode.MoveTo(19.0f, 21.5f),
                    PathNode.LineTo(21.518f, 18.92f),
                    PathNode.CurveTo(22.166296f, 18.2463f, 22.166296f, 17.1807f, 21.518f, 16.507f),
                    PathNode.CurveTo(21.211235f, 16.18785f, 20.787674f, 16.007475f, 20.345f, 16.007475f),
                    PathNode.CurveTo(19.902327f, 16.007475f, 19.478764f, 16.18785f, 19.172f, 16.507f),
                    PathNode.LineTo(19.004f, 16.679f),
                    PathNode.LineTo(18.836f, 16.507f),
                    PathNode.CurveTo(18.529236f, 16.18785f, 18.105675f, 16.007475f, 17.663f, 16.007475f),
                    PathNode.CurveTo(17.220325f, 16.007475f, 16.796762f, 16.18785f, 16.49f, 16.507f),
                    PathNode.CurveTo(15.842344f, 17.180573f, 15.842344f, 18.245428f, 16.49f, 18.919f),
                    PathNode.LineTo(19.0f, 21.509f),
                    PathNode.LineTo(19.0f, 21.5f)
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
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
