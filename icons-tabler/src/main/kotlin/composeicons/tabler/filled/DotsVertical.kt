package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DotsVertical: ImageVector
    get() {
        if (_dotsVertical != null) return _dotsVertical!!
        _dotsVertical = tablerFilledIcon(
            name = "DotsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 13.104569f, 13.104569f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(10.895431f, 14.0f, 10.0f, 13.104569f, 10.0f, 12.0f),
                    PathNode.QuadTo(10.0f, 11.947f, 10.005f, 11.898f),
                    PathNode.CurveTo(10.05728f, 10.834475f, 10.93519f, 9.999249f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.104569f, 10.0f, 14.0f, 10.895431f, 14.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 19.0f),
                    PathNode.CurveTo(14.0f, 20.10457f, 13.104569f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(10.895431f, 21.0f, 10.0f, 20.10457f, 10.0f, 19.0f),
                    PathNode.QuadTo(10.0f, 18.948f, 10.005f, 18.898f),
                    PathNode.CurveTo(10.05728f, 17.834475f, 10.93519f, 16.999249f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.104569f, 17.0f, 14.0f, 17.89543f, 14.0f, 19.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 6.10457f, 13.104569f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.895431f, 7.0f, 10.0f, 6.10457f, 10.0f, 5.0f),
                    PathNode.QuadTo(10.0f, 4.947f, 10.005f, 4.898f),
                    PathNode.CurveTo(10.05728f, 3.834474f, 10.93519f, 2.999249f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.104569f, 3.0f, 14.0f, 3.895431f, 14.0f, 5.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dotsVertical!!
    }

private var _dotsVertical: ImageVector? = null
