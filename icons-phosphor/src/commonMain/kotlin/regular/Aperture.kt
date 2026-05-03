package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorRegularIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.54f, 54.46f),
                    PathNode.CurveTo(160.92497f, 13.84498f, 95.07501f, 13.84498f, 54.46f, 54.46f),
                    PathNode.CurveTo(13.84498f, 95.07501f, 13.84498f, 160.92497f, 54.46f, 201.54f),
                    PathNode.CurveTo(95.07501f, 242.15501f, 160.92497f, 242.15501f, 201.54f, 201.54f),
                    PathNode.CurveTo(242.15501f, 160.92497f, 242.15501f, 95.07501f, 201.54f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(190.23f, 65.78f),
                    PathNode.CurveTo(194.33208f, 69.899734f, 198.01666f, 74.41504f, 201.23f, 79.26f),
                    PathNode.LineTo(167.55f, 119.0f),
                    PathNode.LineTo(139.63f, 40.78f),
                    PathNode.CurveTo(158.79857f, 43.283916f, 176.5948f, 52.076523f, 190.23f, 65.78f),
                    PathNode.Close,
                    PathNode.MoveTo(155.59f, 133.0f),
                    PathNode.LineTo(137.43f, 154.37f),
                    PathNode.LineTo(109.84f, 149.37f),
                    PathNode.LineTo(100.41f, 123.0f),
                    PathNode.LineTo(118.57f, 101.63f),
                    PathNode.LineTo(146.16f, 106.63f),
                    PathNode.Close,
                    PathNode.MoveTo(65.77f, 65.78f),
                    PathNode.CurveTo(80.878685f, 50.589203f, 101.04392f, 41.481747f, 122.43f, 40.19f),
                    PathNode.LineTo(139.94f, 89.19f),
                    PathNode.LineTo(58.3f, 74.32f),
                    PathNode.CurveTo(60.603703f, 71.31561f, 63.09889f, 68.46301f, 65.77f, 65.78f),
                    PathNode.Close,
                    PathNode.MoveTo(46.65f, 161.54f),
                    PathNode.CurveTo(37.046944f, 138.08939f, 37.96822f, 111.64544f, 49.18f, 88.92f),
                    PathNode.LineTo(100.39f, 98.27f),
                    PathNode.Close,
                    PathNode.MoveTo(65.77f, 190.22f),
                    PathNode.CurveTo(61.66793f, 186.10027f, 57.983334f, 181.58496f, 54.77f, 176.74f),
                    PathNode.LineTo(88.45f, 137.0f),
                    PathNode.LineTo(116.37f, 215.18f),
                    PathNode.CurveTo(97.20647f, 212.68704f, 79.41084f, 203.90881f, 65.77f, 190.22f),
                    PathNode.Close,
                    PathNode.MoveTo(190.23f, 190.22f),
                    PathNode.CurveTo(175.1213f, 205.4108f, 154.95607f, 214.51825f, 133.57f, 215.81f),
                    PathNode.LineTo(116.06f, 166.81f),
                    PathNode.LineTo(197.7f, 181.72f),
                    PathNode.CurveTo(195.39494f, 184.71066f, 192.89978f, 187.54987f, 190.23f, 190.22f),
                    PathNode.Close,
                    PathNode.MoveTo(155.61f, 157.73f),
                    PathNode.LineTo(209.35f, 94.46f),
                    PathNode.CurveTo(218.95305f, 117.91061f, 218.0318f, 144.35455f, 206.82f, 167.08f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _aperture!!
    }

private var _aperture: ImageVector? = null
