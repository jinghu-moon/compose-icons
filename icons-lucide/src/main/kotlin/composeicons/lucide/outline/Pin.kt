package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = lucideOutlineIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(9.0f, 10.76f),
                    PathNode.CurveTo(8.999598f, 11.518944f, 8.569657f, 12.21227f, 7.89f, 12.55f),
                    PathNode.LineTo(6.11f, 13.45f),
                    PathNode.CurveTo(5.430342f, 13.78773f, 5.000403f, 14.481056f, 5.0f, 15.24f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(5.0f, 16.552284f, 5.447716f, 17.0f, 6.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.CurveTo(18.552284f, 17.0f, 19.0f, 16.552284f, 19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 15.24f),
                    PathNode.CurveTo(18.999598f, 14.481056f, 18.569658f, 13.78773f, 17.89f, 13.45f),
                    PathNode.LineTo(16.11f, 12.55f),
                    PathNode.CurveTo(15.430343f, 12.21227f, 15.000402f, 11.518944f, 15.0f, 10.76f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 6.447716f, 15.447715f, 6.0f, 16.0f, 6.0f),
                    PathNode.CurveTo(17.10457f, 6.0f, 18.0f, 5.10457f, 18.0f, 4.0f),
                    PathNode.CurveTo(18.0f, 2.895431f, 17.10457f, 2.0f, 16.0f, 2.0f),
                    PathNode.LineTo(8.0f, 2.0f),
                    PathNode.CurveTo(6.895431f, 2.0f, 6.0f, 2.895431f, 6.0f, 4.0f),
                    PathNode.CurveTo(6.0f, 5.10457f, 6.895431f, 6.0f, 8.0f, 6.0f),
                    PathNode.CurveTo(8.552285f, 6.0f, 9.0f, 6.447716f, 9.0f, 7.0f),
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
        return _pin!!
    }

private var _pin: ImageVector? = null
