package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gamepad2: ImageVector
    get() {
        if (_gamepad2 != null) return _gamepad2!!
        _gamepad2 = lucideOutlineIcon(
            name = "Gamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f)
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
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.LineTo(8.0f, 13.0f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(15.01f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 10.0f),
                    PathNode.LineTo(18.01f, 10.0f)
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
                    PathNode.MoveTo(17.32f, 5.0f),
                    PathNode.LineTo(6.68f, 5.0f),
                    PathNode.CurveTo(4.629961f, 5.000478f, 2.912129f, 6.550759f, 2.702f, 8.59f),
                    PathNode.CurveTo(2.696f, 8.642f, 2.692f, 8.691f, 2.685f, 8.742f),
                    PathNode.CurveTo(2.604f, 9.416f, 2.0f, 14.456f, 2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 17.656855f, 3.343146f, 19.0f, 5.0f, 19.0f),
                    PathNode.CurveTo(6.0f, 19.0f, 6.5f, 18.5f, 7.0f, 18.0f),
                    PathNode.LineTo(8.414f, 16.586f),
                    PathNode.CurveTo(8.788985f, 16.210901f, 9.29761f, 16.000113f, 9.828f, 16.0f),
                    PathNode.LineTo(14.172f, 16.0f),
                    PathNode.CurveTo(14.70239f, 16.000113f, 15.211015f, 16.210901f, 15.586f, 16.586f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(17.5f, 18.5f, 18.0f, 19.0f, 19.0f, 19.0f),
                    PathNode.CurveTo(20.656855f, 19.0f, 22.0f, 17.656855f, 22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 14.455f, 21.396f, 9.416f, 21.315f, 8.742f),
                    PathNode.CurveTo(21.308f, 8.692f, 21.304f, 8.642f, 21.298f, 8.591f),
                    PathNode.CurveTo(21.088348f, 6.551363f, 19.370384f, 5.000531f, 17.32f, 5.0f),
                    PathNode.Close
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
        return _gamepad2!!
    }

private var _gamepad2: ImageVector? = null
