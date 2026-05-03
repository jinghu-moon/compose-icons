package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlameKindling: ImageVector
    get() {
        if (_flameKindling != null) return _flameKindling!!
        _flameKindling = lucideOutlineIcon(
            name = "FlameKindling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.0f, 5.0f, 14.5f, 5.5f, 15.5f, 6.5f),
                    PathNode.CurveTo(16.442072f, 7.423153f, 16.981215f, 8.681153f, 17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 12.761424f, 14.761424f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(9.238576f, 15.0f, 7.0f, 12.761424f, 7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 9.7f, 7.0f, 9.4f, 7.1f, 9.1f),
                    PathNode.CurveTo(7.331644f, 9.910666f, 8.046788f, 10.489004f, 8.887975f, 10.545938f),
                    PathNode.CurveTo(9.729162f, 10.602872f, 10.515715f, 10.126174f, 10.854482f, 9.354115f),
                    PathNode.CurveTo(11.19325f, 8.582057f, 11.011468f, 7.680469f, 10.4f, 7.1f),
                    PathNode.CurveTo(8.0f, 4.5f, 11.0f, 2.0f, 12.0f, 2.0f),
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
                    PathNode.MoveTo(5.0f, 22.0f),
                    PathNode.LineTo(19.0f, 18.0f)
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
                    PathNode.MoveTo(5.0f, 18.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _flameKindling!!
    }

private var _flameKindling: ImageVector? = null
