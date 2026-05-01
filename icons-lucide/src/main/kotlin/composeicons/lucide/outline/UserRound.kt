package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRound: ImageVector
    get() {
        if (_userRound != null) return _userRound!!
        _userRound = lucideOutlineIcon(
            name = "UserRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 10.761424f, 14.761424f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(9.238576f, 13.0f, 7.0f, 10.761424f, 7.0f, 8.0f),
                    PathNode.CurveTo(7.0f, 5.238577f, 9.238576f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.761424f, 3.0f, 17.0f, 5.238577f, 17.0f, 8.0f),
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 16.581722f, 16.418278f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(7.581722f, 13.0f, 4.0f, 16.581722f, 4.0f, 21.0f)
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
        return _userRound!!
    }

private var _userRound: ImageVector? = null
