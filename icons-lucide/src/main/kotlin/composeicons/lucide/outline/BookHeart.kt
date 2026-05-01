package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) return _bookHeart!!
        _bookHeart = lucideOutlineIcon(
            name = "BookHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 19.5f),
                    PathNode.LineTo(4.0f, 4.5f),
                    PathNode.CurveTo(4.0f, 3.119288f, 5.119288f, 2.0f, 6.5f, 2.0f),
                    PathNode.LineTo(19.0f, 2.0f),
                    PathNode.CurveTo(19.552284f, 2.0f, 20.0f, 2.447715f, 20.0f, 3.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(6.5f, 22.0f),
                    PathNode.CurveTo(5.119288f, 22.0f, 4.0f, 20.880713f, 4.0f, 19.5f),
                    PathNode.CurveTo(4.0f, 18.119287f, 5.119288f, 17.0f, 6.5f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f)
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
                    PathNode.MoveTo(8.62f, 9.8f),
                    PathNode.CurveTo(8.046981f, 9.202571f, 7.848298f, 8.338743f, 8.102723f, 7.550999f),
                    PathNode.CurveTo(8.357148f, 6.763255f, 9.023583f, 6.178843f, 9.837807f, 6.029464f),
                    PathNode.CurveTo(10.652029f, 5.880086f, 11.482515f, 6.189872f, 12.0f, 6.836f),
                    PathNode.CurveTo(12.519876f, 6.196738f, 13.347599f, 5.892778f, 14.157637f, 6.043663f),
                    PathNode.CurveTo(14.967675f, 6.194547f, 15.630447f, 6.776139f, 15.885295f, 7.559708f),
                    PathNode.CurveTo(16.140144f, 8.343277f, 15.9463f, 9.203475f, 15.38f, 9.802f),
                    PathNode.LineTo(12.754f, 12.658f),
                    PathNode.CurveTo(12.564449f, 12.876255f, 12.289576f, 13.001598f, 12.0005f, 13.001598f),
                    PathNode.CurveTo(11.711425f, 13.001598f, 11.436551f, 12.876255f, 11.247f, 12.658f),
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
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
