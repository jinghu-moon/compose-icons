package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = lucideOutlineIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(14.0f, 19.0f),
                    PathNode.CurveTo(14.0f, 19.552284f, 14.447715f, 20.0f, 15.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.552284f, 20.0f, 18.0f, 19.552284f, 18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(18.944466f, 15.685556f, 19.685556f, 14.944466f, 20.0f, 14.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.552284f, 14.0f, 22.0f, 13.552285f, 22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(22.0f, 10.447715f, 21.552284f, 10.0f, 21.0f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 8.426213f, 19.25903f, 6.944272f, 18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(16.74097f, 3.0f, 15.555417f, 3.592777f, 14.8f, 4.6f),
                    PathNode.LineTo(14.5f, 5.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(7.686292f, 5.0f, 5.0f, 7.686292f, 5.0f, 11.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 13.573787f, 5.740971f, 15.055728f, 7.0f, 16.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 19.552284f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(10.552285f, 20.0f, 11.0f, 19.552284f, 11.0f, 19.0f),
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
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.LineTo(16.01f, 10.0f)
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
                    PathNode.MoveTo(2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 10.104569f, 2.895431f, 11.0f, 4.0f, 11.0f),
                    PathNode.LineTo(5.0f, 11.0f)
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
