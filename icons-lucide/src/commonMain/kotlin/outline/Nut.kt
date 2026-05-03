package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = lucideOutlineIcon(
            name = "Nut",
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
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(5.000341f, 17.202763f, 7.173126f, 19.997284f, 10.277f, 20.787f),
                    PathNode.CurveTo(10.689f, 20.891f, 11.079f, 21.079f, 11.379f, 21.379f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(12.621f, 21.379f),
                    PathNode.CurveTo(12.921f, 21.079f, 13.311f, 20.891f, 13.723f, 20.787f),
                    PathNode.CurveTo(16.82708f, 19.997599f, 19.000015f, 17.202883f, 19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 10.0f)
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
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(8.0f, 4.0f, 4.5f, 6.0f, 4.0f, 8.0f),
                    PathNode.CurveTo(3.757f, 8.97f, 3.081f, 9.952f, 2.0f, 11.0f),
                    PathNode.CurveTo(3.31f, 10.918f, 3.972f, 10.71f, 5.0f, 10.0f),
                    PathNode.CurveTo(5.54f, 10.92f, 5.982f, 11.356f, 7.0f, 12.0f),
                    PathNode.CurveTo(8.452f, 11.353f, 8.954f, 10.902f, 9.5f, 10.0f),
                    PathNode.CurveTo(10.095f, 10.995f, 10.651f, 11.427f, 12.0f, 12.0f),
                    PathNode.CurveTo(13.31f, 11.379f, 13.862f, 10.942f, 14.5f, 10.0f),
                    PathNode.CurveTo(15.129f, 10.977f, 15.662f, 11.423f, 17.0f, 12.0f),
                    PathNode.CurveTo(18.209f, 11.452f, 18.68f, 11.033f, 19.0f, 10.0f),
                    PathNode.CurveTo(20.032f, 10.916f, 20.683f, 11.157f, 22.0f, 11.0f),
                    PathNode.CurveTo(20.703f, 9.964f, 20.242f, 8.97f, 20.0f, 8.0f),
                    PathNode.CurveTo(19.5f, 6.0f, 16.0f, 4.0f, 12.0f, 4.0f),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
