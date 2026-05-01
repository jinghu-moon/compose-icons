package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AerialLift: ImageVector
    get() {
        if (_aerialLift != null) return _aerialLift!!
        _aerialLift = tablerFilledIcon(
            name = "AerialLift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.876f, 2.008f),
                    PathNode.CurveTo(20.23494f, 1.954478f, 20.594704f, 2.09962f, 20.816015f, 2.387238f),
                    PathNode.CurveTo(21.037327f, 2.674855f, 21.085445f, 3.059799f, 20.941742f, 3.393043f),
                    PathNode.CurveTo(20.798038f, 3.726287f, 20.485071f, 3.955521f, 20.124f, 3.992f),
                    PathNode.LineTo(13.0f, 4.883f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(17.2f, 7.0f),
                    PathNode.CurveTo(17.455948f, 6.999922f, 17.702183f, 7.097986f, 17.888f, 7.274f),
                    PathNode.LineTo(17.975f, 7.367f),
                    PathNode.CurveTo(20.765f, 10.784f, 20.692f, 17.33f, 17.749f, 20.662f),
                    PathNode.CurveTo(17.559296f, 20.87678f, 17.286564f, 20.999857f, 17.0f, 21.0f),
                    PathNode.LineTo(6.894f, 21.0f),
                    PathNode.CurveTo(6.600156f, 21.00015f, 6.321118f, 20.871054f, 6.131f, 20.647f),
                    PathNode.CurveTo(3.271f, 17.274f, 3.271f, 10.727f, 6.131f, 7.353f),
                    PathNode.CurveTo(6.321118f, 7.128947f, 6.600156f, 6.999851f, 6.894f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 5.133f),
                    PathNode.LineTo(4.124f, 5.993f),
                    PathNode.CurveTo(3.620582f, 6.055812f, 3.149898f, 5.731705f, 3.029f, 5.239f),
                    PathNode.LineTo(3.008f, 5.124f),
                    PathNode.CurveTo(2.939678f, 4.576178f, 3.328216f, 4.076629f, 3.876f, 4.008f),
                    PathNode.LineTo(11.872f, 3.008f),
                    PathNode.LineTo(11.883f, 3.007f),
                    PathNode.LineTo(11.891f, 3.006f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 9.0f),
                    PathNode.LineTo(7.383f, 9.0f),
                    PathNode.LineTo(7.332f, 9.072f),
                    PathNode.CurveTo(6.614f, 10.114f, 6.183f, 11.482f, 6.04f, 12.916f),
                    PathNode.LineTo(6.032f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.698f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(17.979f, 13.0f),
                    PathNode.LineTo(17.974f, 12.928f),
                    PathNode.CurveTo(17.851f, 11.492f, 17.441f, 10.117f, 16.742f, 9.064f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _aerialLift!!
    }

private var _aerialLift: ImageVector? = null
