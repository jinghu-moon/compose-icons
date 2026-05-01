package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Trees: ImageVector
    get() {
        if (_trees != null) return _trees!!
        _trees = lucideOutlineIcon(
            name = "Trees",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.2f),
                    PathNode.CurveTo(11.353412f, 10.720467f, 12.140851f, 12.134449f, 11.87066f, 13.559091f),
                    PathNode.CurveTo(11.60047f, 14.983732f, 10.349994f, 16.011213f, 8.9f, 16.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(3.568386f, 15.964381f, 2.361553f, 14.921884f, 2.118237f, 13.510649f),
                    PathNode.CurveTo(1.87492f, 12.099414f, 2.66297f, 10.712971f, 4.0f, 10.2f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 8.343146f, 5.343146f, 7.0f, 7.0f, 7.0f),
                    PathNode.CurveTo(8.656855f, 7.0f, 10.0f, 8.343146f, 10.0f, 10.0f),
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
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.LineTo(7.0f, 22.0f)
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
                    PathNode.MoveTo(13.0f, 19.0f),
                    PathNode.LineTo(13.0f, 22.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(20.3f, 19.0f),
                    PathNode.CurveTo(20.700075f, 18.99438f, 21.058289f, 18.750826f, 21.210632f, 18.380848f),
                    PathNode.CurveTo(21.362976f, 18.010872f, 21.280119f, 17.5857f, 21.0f, 17.3f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(18.3f, 14.0f),
                    PathNode.CurveTo(18.700075f, 13.99438f, 19.058289f, 13.750826f, 19.210632f, 13.380849f),
                    PathNode.CurveTo(19.362976f, 13.010871f, 19.280119f, 12.5857f, 19.0f, 12.3f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.LineTo(16.2f, 9.0f),
                    PathNode.CurveTo(16.618402f, 9.037744f, 17.015785f, 8.809957f, 17.194662f, 8.429841f),
                    PathNode.CurveTo(17.37354f, 8.049726f, 17.295769f, 7.598337f, 17.0f, 7.3f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(11.6f, 4.5f)
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
        return _trees!!
    }

private var _trees: ImageVector? = null
