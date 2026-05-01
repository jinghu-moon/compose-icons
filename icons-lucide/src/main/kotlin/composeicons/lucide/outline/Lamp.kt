package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = lucideOutlineIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(4.077f, 10.615f),
                    PathNode.CurveTo(3.94824f, 10.923662f, 3.982305f, 11.276258f, 4.167774f, 11.554562f),
                    PathNode.CurveTo(4.353243f, 11.832865f, 4.665559f, 12.000028f, 5.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.334442f, 12.000028f, 19.646757f, 11.832865f, 19.832226f, 11.554562f),
                    PathNode.CurveTo(20.017694f, 11.276258f, 20.05176f, 10.923662f, 19.923f, 10.615f),
                    PathNode.LineTo(16.846f, 3.231f),
                    PathNode.CurveTo(16.535555f, 2.485667f, 15.807402f, 2.000101f, 15.0f, 2.0f),
                    PathNode.LineTo(9.0f, 2.0f),
                    PathNode.CurveTo(8.192841f, 1.999933f, 7.464757f, 2.48506f, 7.154f, 3.23f),
                    PathNode.Close
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
                    PathNode.MoveTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 18.89543f, 8.895431f, 18.0f, 10.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.CurveTo(15.104569f, 18.0f, 16.0f, 18.89543f, 16.0f, 20.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(16.0f, 21.552284f, 15.552285f, 22.0f, 15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(8.447715f, 22.0f, 8.0f, 21.552284f, 8.0f, 21.0f),
                    PathNode.Close
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
