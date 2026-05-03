package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UsersRound: ImageVector
    get() {
        if (_usersRound != null) return _usersRound!!
        _usersRound = lucideOutlineIcon(
            name = "UsersRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 21.0f),
                    PathNode.CurveTo(18.0f, 16.581722f, 14.418278f, 13.0f, 10.0f, 13.0f),
                    PathNode.CurveTo(5.581722f, 13.0f, 2.0f, 16.581722f, 2.0f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 10.761424f, 12.761424f, 13.0f, 10.0f, 13.0f),
                    PathNode.CurveTo(7.238577f, 13.0f, 5.0f, 10.761424f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 5.238577f, 7.238577f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.761424f, 3.0f, 15.0f, 5.238577f, 15.0f, 8.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 16.63f, 20.0f, 13.5f, 18.0f, 12.0f),
                    PathNode.CurveTo(19.335129f, 10.998315f, 20.08238f, 9.396467f, 19.992018f, 7.7298f),
                    PathNode.CurveTo(19.901657f, 6.063134f, 18.985601f, 4.551465f, 17.55f, 3.7f)
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
        return _usersRound!!
    }

private var _usersRound: ImageVector? = null
