package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.KeyRound: ImageVector
    get() {
        if (_keyRound != null) return _keyRound!!
        _keyRound = lucideOutlineIcon(
            name = "KeyRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.586f, 17.414f),
                    PathNode.CurveTo(2.210901f, 17.788986f, 2.000113f, 18.297611f, 2.0f, 18.828f),
                    PathNode.LineTo(2.0f, 21.0f),
                    PathNode.CurveTo(2.0f, 21.552284f, 2.447715f, 22.0f, 3.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(6.552285f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 19.447716f, 7.447716f, 19.0f, 8.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(9.552285f, 19.0f, 10.0f, 18.552284f, 10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 16.447716f, 10.447715f, 16.0f, 11.0f, 16.0f),
                    PathNode.LineTo(11.172f, 16.0f),
                    PathNode.CurveTo(11.70239f, 15.999887f, 12.211015f, 15.789099f, 12.586f, 15.414f),
                    PathNode.LineTo(13.4f, 14.6f),
                    PathNode.CurveTo(16.26221f, 15.597043f, 19.433619f, 14.483586f, 21.04436f, 11.916125f),
                    PathNode.CurveTo(22.6551f, 9.348663f, 22.2776f, 6.008739f, 20.13443f, 3.86557f),
                    PathNode.CurveTo(17.991262f, 1.722401f, 14.651337f, 1.3449f, 12.083875f, 2.955641f),
                    PathNode.CurveTo(9.516414f, 4.566382f, 8.402957f, 7.737789f, 9.4f, 10.6f),
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
                    PathNode.MoveTo(17.0f, 7.5f),
                    PathNode.CurveTo(17.0f, 7.776143f, 16.776142f, 8.0f, 16.5f, 8.0f),
                    PathNode.CurveTo(16.223858f, 8.0f, 16.0f, 7.776143f, 16.0f, 7.5f),
                    PathNode.CurveTo(16.0f, 7.223858f, 16.223858f, 7.0f, 16.5f, 7.0f),
                    PathNode.CurveTo(16.776142f, 7.0f, 17.0f, 7.223858f, 17.0f, 7.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _keyRound!!
    }

private var _keyRound: ImageVector? = null
