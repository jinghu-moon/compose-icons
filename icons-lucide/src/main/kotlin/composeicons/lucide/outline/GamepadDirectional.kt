package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GamepadDirectional: ImageVector
    get() {
        if (_gamepadDirectional != null) return _gamepadDirectional!!
        _gamepadDirectional = lucideOutlineIcon(
            name = "GamepadDirectional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.146f, 15.854f),
                    PathNode.CurveTo(11.372398f, 15.627324f, 11.679627f, 15.499955f, 12.0f, 15.499955f),
                    PathNode.CurveTo(12.320373f, 15.499955f, 12.627602f, 15.627324f, 12.854f, 15.854f),
                    PathNode.LineTo(14.414f, 17.414f),
                    PathNode.CurveTo(14.789099f, 17.788986f, 14.999887f, 18.297611f, 15.0f, 18.828f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 21.552284f, 14.552285f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(9.447715f, 22.0f, 9.0f, 21.552284f, 9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 18.828f),
                    PathNode.CurveTo(9.000113f, 18.297611f, 9.210901f, 17.788986f, 9.586f, 17.414f),
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
                    PathNode.MoveTo(18.828f, 15.0f),
                    PathNode.CurveTo(18.297611f, 14.999887f, 17.788986f, 14.789099f, 17.414f, 14.414f),
                    PathNode.LineTo(15.854f, 12.854f),
                    PathNode.CurveTo(15.627324f, 12.627602f, 15.499955f, 12.320373f, 15.499955f, 12.0f),
                    PathNode.CurveTo(15.499955f, 11.679627f, 15.627324f, 11.372398f, 15.854f, 11.146f),
                    PathNode.LineTo(17.414f, 9.586f),
                    PathNode.CurveTo(17.788986f, 9.210901f, 18.297611f, 9.000113f, 18.828f, 9.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.CurveTo(21.552284f, 9.0f, 22.0f, 9.447715f, 22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 14.552285f, 21.552284f, 15.0f, 21.0f, 15.0f),
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
                    PathNode.MoveTo(6.586f, 14.414f),
                    PathNode.CurveTo(6.211015f, 14.789099f, 5.70239f, 14.999887f, 5.172f, 15.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(2.447715f, 15.0f, 2.0f, 14.552285f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 9.447715f, 2.447715f, 9.0f, 3.0f, 9.0f),
                    PathNode.LineTo(5.172f, 9.0f),
                    PathNode.CurveTo(5.70239f, 9.000113f, 6.211015f, 9.210901f, 6.586f, 9.586f),
                    PathNode.LineTo(8.146f, 11.146f),
                    PathNode.CurveTo(8.372676f, 11.372398f, 8.500045f, 11.679627f, 8.500045f, 12.0f),
                    PathNode.CurveTo(8.500045f, 12.320373f, 8.372676f, 12.627602f, 8.146f, 12.854f),
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.0f, 2.447715f, 9.447715f, 2.0f, 10.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.552285f, 2.0f, 15.0f, 2.447715f, 15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 5.172f),
                    PathNode.CurveTo(14.999887f, 5.70239f, 14.789099f, 6.211015f, 14.414f, 6.586f),
                    PathNode.LineTo(12.854f, 8.146f),
                    PathNode.CurveTo(12.627602f, 8.372676f, 12.320373f, 8.500045f, 12.0f, 8.500045f),
                    PathNode.CurveTo(11.679627f, 8.500045f, 11.372398f, 8.372676f, 11.146f, 8.146f),
                    PathNode.LineTo(9.586f, 6.586f),
                    PathNode.CurveTo(9.210901f, 6.211015f, 9.000113f, 5.70239f, 9.0f, 5.172f),
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
        return _gamepadDirectional!!
    }

private var _gamepadDirectional: ImageVector? = null
