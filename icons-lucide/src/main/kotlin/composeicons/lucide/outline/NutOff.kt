package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NutOff: ImageVector
    get() {
        if (_nutOff != null) return _nutOff!!
        _nutOff = lucideOutlineIcon(
            name = "NutOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 2.0f)
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
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(5.000341f, 17.202763f, 7.173126f, 19.997284f, 10.277f, 20.787f),
                    PathNode.CurveTo(10.689f, 20.891f, 11.079f, 21.079f, 11.379f, 21.379f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(12.621f, 21.379f),
                    PathNode.CurveTo(12.921f, 21.079f, 13.311f, 20.891f, 13.723f, 20.787f),
                    PathNode.CurveTo(15.416233f, 20.35567f, 16.88734f, 19.307526f, 17.848f, 17.848f)
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
                    PathNode.MoveTo(19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 13.343f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.CurveTo(10.651f, 11.427f, 10.095f, 10.995f, 9.5f, 10.0f),
                    PathNode.CurveTo(8.954f, 10.902f, 8.452f, 11.353f, 7.0f, 12.0f),
                    PathNode.CurveTo(5.982f, 11.356f, 5.54f, 10.92f, 5.0f, 10.0f),
                    PathNode.CurveTo(3.972f, 10.71f, 3.31f, 10.918f, 2.0f, 11.0f),
                    PathNode.CurveTo(3.081f, 9.952f, 3.757f, 8.97f, 4.0f, 8.0f),
                    PathNode.CurveTo(4.194f, 7.224f, 4.84f, 6.449f, 5.79f, 5.79f),
                    PathNode.MoveTo(17.444f, 11.787f),
                    PathNode.CurveTo(18.331f, 11.33f, 18.724f, 10.896f, 19.0f, 10.0f),
                    PathNode.CurveTo(20.032f, 10.916f, 20.683f, 11.157f, 22.0f, 11.0f),
                    PathNode.CurveTo(20.703f, 9.964f, 20.242f, 8.97f, 20.0f, 8.0f),
                    PathNode.CurveTo(19.5f, 6.0f, 16.0f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(11.26f, 4.0f, 10.539f, 4.068f, 9.85f, 4.192f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _nutOff!!
    }

private var _nutOff: ImageVector? = null
