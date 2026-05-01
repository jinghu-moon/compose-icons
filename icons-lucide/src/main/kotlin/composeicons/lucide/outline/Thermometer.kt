package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = lucideOutlineIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(14.0f, 14.54f),
                    PathNode.CurveTo(15.567872f, 15.445211f, 16.332275f, 17.290644f, 15.863704f, 19.039377f),
                    PathNode.CurveTo(15.395131f, 20.788113f, 13.810423f, 22.0041f, 12.0f, 22.0041f),
                    PathNode.CurveTo(10.189577f, 22.0041f, 8.604869f, 20.788113f, 8.136297f, 19.039377f),
                    PathNode.CurveTo(7.667725f, 17.290644f, 8.432128f, 15.445211f, 10.0f, 14.54f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 2.895431f, 10.895431f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(13.104569f, 2.0f, 14.0f, 2.895431f, 14.0f, 4.0f),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
