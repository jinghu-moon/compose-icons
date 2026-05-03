package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) return _eyeOff!!
        _eyeOff = lucideOutlineIcon(
            name = "EyeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.733f, 5.076f),
                    PathNode.CurveTo(15.52014f, 4.505509f, 20.101173f, 7.193621f, 21.938f, 11.651f),
                    PathNode.CurveTo(22.021341f, 11.875515f, 22.021341f, 12.122484f, 21.938f, 12.347f),
                    PathNode.CurveTo(21.570498f, 13.237995f, 21.08481f, 14.075505f, 20.494f, 14.837f)
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
                    PathNode.MoveTo(14.084f, 14.158f),
                    PathNode.CurveTo(12.906863f, 15.294916f, 11.035746f, 15.278657f, 9.878544f, 14.121456f),
                    PathNode.CurveTo(8.721343f, 12.964254f, 8.705084f, 11.093137f, 9.842f, 9.916f)
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
                    PathNode.MoveTo(17.479f, 17.499f),
                    PathNode.CurveTo(14.794909f, 19.088947f, 11.552508f, 19.434477f, 8.593631f, 18.445883f),
                    PathNode.CurveTo(5.634754f, 17.457287f, 3.251267f, 15.23208f, 2.062f, 12.348f),
                    PathNode.CurveTo(1.978659f, 12.123485f, 1.978659f, 11.876515f, 2.062f, 11.652f),
                    PathNode.CurveTo(2.948632f, 9.501855f, 4.508673f, 7.697247f, 6.508f, 6.509f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
