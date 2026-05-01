package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dots: ImageVector
    get() {
        if (_dots != null) return _dots!!
        _dots = tablerFilledIcon(
            name = "Dots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 13.104569f, 6.10457f, 14.0f, 5.0f, 14.0f),
                    PathNode.CurveTo(3.895431f, 14.0f, 3.0f, 13.104569f, 3.0f, 12.0f),
                    PathNode.QuadTo(3.0f, 11.947f, 3.005f, 11.898f),
                    PathNode.CurveTo(3.05728f, 10.834475f, 3.935191f, 9.999249f, 5.0f, 10.0f),
                    PathNode.CurveTo(6.10457f, 10.0f, 7.0f, 10.895431f, 7.0f, 12.0f)
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
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 13.104569f, 20.10457f, 14.0f, 19.0f, 14.0f),
                    PathNode.CurveTo(17.89543f, 14.0f, 17.0f, 13.104569f, 17.0f, 12.0f),
                    PathNode.QuadTo(17.0f, 11.947f, 17.005f, 11.898f),
                    PathNode.CurveTo(17.05728f, 10.834475f, 17.93519f, 9.999249f, 19.0f, 10.0f),
                    PathNode.CurveTo(20.10457f, 10.0f, 21.0f, 10.895431f, 21.0f, 12.0f)
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
        return _dots!!
    }

private var _dots: ImageVector? = null
