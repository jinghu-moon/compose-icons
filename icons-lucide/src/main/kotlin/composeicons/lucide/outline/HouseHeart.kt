package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HouseHeart: ImageVector
    get() {
        if (_houseHeart != null) return _houseHeart!!
        _houseHeart = lucideOutlineIcon(
            name = "HouseHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.62f, 13.8f),
                    PathNode.CurveTo(8.046981f, 13.202571f, 7.848298f, 12.338742f, 8.102723f, 11.550999f),
                    PathNode.CurveTo(8.357148f, 10.763255f, 9.023583f, 10.178843f, 9.837807f, 10.029465f),
                    PathNode.CurveTo(10.652029f, 9.880086f, 11.482515f, 10.189872f, 12.0f, 10.836f),
                    PathNode.CurveTo(12.519876f, 10.196738f, 13.347599f, 9.892777f, 14.157637f, 10.043662f),
                    PathNode.CurveTo(14.967675f, 10.194547f, 15.630447f, 10.776139f, 15.885295f, 11.559708f),
                    PathNode.CurveTo(16.140144f, 12.343277f, 15.9463f, 13.203475f, 15.38f, 13.802f),
                    PathNode.LineTo(12.754f, 16.658f),
                    PathNode.CurveTo(12.564449f, 16.876257f, 12.289576f, 17.001598f, 12.0005f, 17.001598f),
                    PathNode.CurveTo(11.711425f, 17.001598f, 11.436551f, 16.876257f, 11.247f, 16.658f),
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
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.CurveTo(2.999859f, 9.411126f, 3.259242f, 8.852118f, 3.709f, 8.472f),
                    PathNode.LineTo(10.709f, 2.472f),
                    PathNode.CurveTo(11.454389f, 1.842027f, 12.545611f, 1.842027f, 13.291f, 2.472f),
                    PathNode.LineTo(20.291f, 8.472f),
                    PathNode.CurveTo(20.740759f, 8.852118f, 21.000141f, 9.411126f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
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
        return _houseHeart!!
    }

private var _houseHeart: ImageVector? = null
