package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorBoldIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.0f, 116.09f),
                    PathNode.LineTo(214.13f, 40.0f),
                    PathNode.CurveTo(212.39145f, 33.23089f, 206.44623f, 28.383713f, 199.46568f, 28.044094f),
                    PathNode.CurveTo(192.48512f, 27.704475f, 186.09744f, 31.951628f, 183.71f, 38.52f),
                    PathNode.LineTo(167.0f, 84.0f),
                    PathNode.LineTo(89.0f, 84.0f),
                    PathNode.LineTo(72.29f, 38.49f),
                    PathNode.CurveTo(69.896805f, 31.92274f, 63.504303f, 27.680729f, 56.52317f, 28.027258f),
                    PathNode.CurveTo(49.542034f, 28.37379f, 43.601055f, 33.22802f, 41.87f, 40.0f),
                    PathNode.LineTo(22.0f, 116.09f),
                    PathNode.CurveTo(15.585424f, 140.61655f, 24.959272f, 166.55869f, 45.57f, 181.32f),
                    PathNode.LineTo(118.84f, 233.09f),
                    PathNode.CurveTo(124.34458f, 236.97144f, 131.69542f, 236.97144f, 137.2f, 233.09f),
                    PathNode.LineTo(210.47f, 181.32f),
                    PathNode.CurveTo(231.06583f, 166.54826f, 240.42305f, 140.60811f, 234.0f, 116.09f),
                    PathNode.Close,
                    PathNode.MoveTo(58.61f, 70.86f),
                    PathNode.LineTo(69.37f, 100.14f),
                    PathNode.CurveTo(71.10649f, 104.86428f, 75.60669f, 108.00284f, 80.64f, 108.0f),
                    PathNode.LineTo(175.36f, 108.0f),
                    PathNode.CurveTo(180.39331f, 108.00284f, 184.89351f, 104.86428f, 186.63f, 100.14f),
                    PathNode.LineTo(197.39f, 70.86f),
                    PathNode.LineTo(206.53f, 105.86f),
                    PathNode.LineTo(128.0f, 161.31f),
                    PathNode.LineTo(49.47f, 105.83f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 131.37f),
                    PathNode.LineTo(107.2f, 176.0f),
                    PathNode.LineTo(93.41f, 185.74f),
                    PathNode.LineTo(59.41f, 161.74f),
                    PathNode.CurveTo(49.624306f, 154.73865f, 43.871853f, 143.40172f, 44.0f, 131.37f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 210.19f),
                    PathNode.LineTo(114.21f, 200.44f),
                    PathNode.LineTo(128.0f, 190.7f),
                    PathNode.LineTo(141.79f, 200.44f),
                    PathNode.Close,
                    PathNode.MoveTo(196.6f, 161.72f),
                    PathNode.LineTo(162.6f, 185.72f),
                    PathNode.LineTo(148.8f, 176.0f),
                    PathNode.LineTo(212.0f, 131.37f),
                    PathNode.CurveTo(212.12389f, 143.39287f, 206.37608f, 154.72054f, 196.6f, 161.72f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
