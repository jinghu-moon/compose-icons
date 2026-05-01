package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PhoneForwarded: ImageVector
    get() {
        if (_phoneForwarded != null) return _phoneForwarded!!
        _phoneForwarded = lucideOutlineIcon(
            name = "PhoneForwarded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 6.0f),
                    PathNode.LineTo(22.0f, 6.0f)
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
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.LineTo(18.0f, 10.0f)
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
                    PathNode.MoveTo(13.832f, 16.568f),
                    PathNode.CurveTo(14.257413f, 16.76337f, 14.761431f, 16.63747f, 15.045f, 16.265f),
                    PathNode.LineTo(15.4f, 15.8f),
                    PathNode.CurveTo(15.777709f, 15.296389f, 16.370485f, 15.0f, 17.0f, 15.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(21.10457f, 15.0f, 22.0f, 15.895431f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 21.10457f, 21.10457f, 22.0f, 20.0f, 22.0f),
                    PathNode.CurveTo(10.058874f, 22.0f, 2.0f, 13.941126f, 2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.CurveTo(8.10457f, 2.0f, 9.0f, 2.895431f, 9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(9.0f, 7.629515f, 8.703611f, 8.222291f, 8.2f, 8.6f),
                    PathNode.LineTo(7.732f, 8.951f),
                    PathNode.CurveTo(7.353473f, 9.240028f, 7.231303f, 9.755904f, 7.44f, 10.184f),
                    PathNode.CurveTo(8.806681f, 12.959866f, 11.054424f, 15.204797f, 13.832f, 16.568f)
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
        return _phoneForwarded!!
    }

private var _phoneForwarded: ImageVector? = null
