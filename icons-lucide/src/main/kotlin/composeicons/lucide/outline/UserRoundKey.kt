package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundKey: ImageVector
    get() {
        if (_userRoundKey != null) return _userRoundKey!!
        _userRoundKey = lucideOutlineIcon(
            name = "UserRoundKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 11.0f),
                    PathNode.LineTo(19.0f, 17.0f)
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
                    PathNode.MoveTo(19.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f)
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.CurveTo(1.999783f, 17.954344f, 3.728957f, 15.172765f, 6.460253f, 13.825158f),
                    PathNode.CurveTo(9.19155f, 12.477551f, 12.451107f, 12.797718f, 14.868f, 14.651f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 10.761424f, 12.761424f, 13.0f, 10.0f, 13.0f),
                    PathNode.CurveTo(7.238577f, 13.0f, 5.0f, 10.761424f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 5.238577f, 7.238577f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.761424f, 3.0f, 15.0f, 5.238577f, 15.0f, 8.0f),
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
                    PathNode.MoveTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.CurveTo(17.89543f, 21.0f, 17.0f, 20.10457f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 17.89543f, 17.89543f, 17.0f, 19.0f, 17.0f),
                    PathNode.CurveTo(20.10457f, 17.0f, 21.0f, 17.89543f, 21.0f, 19.0f),
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
        return _userRoundKey!!
    }

private var _userRoundKey: ImageVector? = null
