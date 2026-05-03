package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = lucideOutlineIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.01f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.01f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(20.10457f, 21.0f, 21.0f, 20.10457f, 21.0f, 19.0f),
                    PathNode.LineTo(21.0f, 8.5f),
                    PathNode.CurveTo(21.000193f, 8.317295f, 20.900717f, 8.149033f, 20.740543f, 8.061136f),
                    PathNode.CurveTo(20.580372f, 7.973239f, 20.38501f, 7.979705f, 20.231f, 8.078f),
                    PathNode.LineTo(15.769f, 10.922f),
                    PathNode.CurveTo(15.61499f, 11.020295f, 15.419628f, 11.026761f, 15.259457f, 10.938864f),
                    PathNode.CurveTo(15.099284f, 10.850967f, 14.999807f, 10.682705f, 15.0f, 10.5f),
                    PathNode.LineTo(15.0f, 8.5f),
                    PathNode.CurveTo(15.000193f, 8.317295f, 14.900716f, 8.149033f, 14.740543f, 8.061136f),
                    PathNode.CurveTo(14.580372f, 7.973239f, 14.38501f, 7.979705f, 14.231f, 8.078f),
                    PathNode.LineTo(9.77f, 10.922f),
                    PathNode.CurveTo(9.615949f, 11.020838f, 9.420203f, 11.027603f, 9.259695f, 10.939636f),
                    PathNode.CurveTo(9.099188f, 10.85167f, 8.999573f, 10.683032f, 9.0f, 10.5f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.895431f, 8.10457f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(8.01f, 16.0f)
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
        return _factory!!
    }

private var _factory: ImageVector? = null
