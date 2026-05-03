package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreePine: ImageVector
    get() {
        if (_treePine != null) return _treePine!!
        _treePine = lucideOutlineIcon(
            name = "TreePine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 14.0f),
                    PathNode.LineTo(20.0f, 17.3f),
                    PathNode.CurveTo(20.280119f, 17.5857f, 20.362976f, 18.010872f, 20.210632f, 18.380848f),
                    PathNode.CurveTo(20.058289f, 18.750826f, 19.700075f, 18.99438f, 19.3f, 19.0f),
                    PathNode.LineTo(4.7f, 19.0f),
                    PathNode.CurveTo(4.299925f, 18.99438f, 3.941712f, 18.750826f, 3.789368f, 18.380848f),
                    PathNode.CurveTo(3.637025f, 18.010872f, 3.71988f, 17.5857f, 4.0f, 17.3f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(6.7f, 14.0f),
                    PathNode.CurveTo(6.299925f, 13.99438f, 5.941712f, 13.750826f, 5.789368f, 13.380849f),
                    PathNode.CurveTo(5.637025f, 13.010871f, 5.71988f, 12.5857f, 6.0f, 12.3f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(8.8f, 9.0f),
                    PathNode.CurveTo(8.381598f, 9.037744f, 7.984216f, 8.809957f, 7.805338f, 8.429841f),
                    PathNode.CurveTo(7.62646f, 8.049726f, 7.704231f, 7.598337f, 8.0f, 7.3f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(16.0f, 7.3f),
                    PathNode.CurveTo(16.295769f, 7.598337f, 16.37354f, 8.049726f, 16.194662f, 8.429841f),
                    PathNode.CurveTo(16.015785f, 8.809957f, 15.618402f, 9.037744f, 15.2f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(18.0f, 12.3f),
                    PathNode.CurveTo(18.280119f, 12.5857f, 18.362976f, 13.010871f, 18.210632f, 13.380849f),
                    PathNode.CurveTo(18.058289f, 13.750826f, 17.700075f, 13.99438f, 17.3f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f),
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
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 19.0f)
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
        return _treePine!!
    }

private var _treePine: ImageVector? = null
