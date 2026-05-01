package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorThinIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 138.16f, 197.74f, 149.21f, 162.89f, 153.8f),
                    PathNode.CurveTo(163.61f, 145.62f, 164.0f, 137.0f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 86.84f, 155.93f, 53.0f, 143.72f, 37.35f),
                    PathNode.CurveTo(187.77776f, 45.048504f, 219.94429f, 83.274734f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(141.24f, 36.0f, 156.0f, 73.78f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 137.45f, 155.54f, 146.39f, 154.73f, 154.73f),
                    PathNode.CurveTo(146.39f, 155.54f, 137.45f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(73.78f, 156.0f, 36.0f, 141.24f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.055115f, 77.21265f, 77.21265f, 36.055115f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(37.35f, 143.72f),
                    PathNode.CurveTo(53.0f, 155.93f, 86.84f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(137.0f, 164.0f, 145.62f, 163.61f, 153.8f, 162.89f),
                    PathNode.CurveTo(149.21f, 197.74f, 138.16f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(83.274734f, 219.94429f, 45.048504f, 187.77776f, 37.35f, 143.72f),
                    PathNode.Close,
                    PathNode.MoveTo(143.72f, 218.65f),
                    PathNode.CurveTo(152.35f, 207.59f, 158.91f, 187.43f, 162.02f, 162.02f),
                    PathNode.CurveTo(187.43f, 158.91f, 207.59f, 152.35f, 218.65f, 143.72f),
                    PathNode.CurveTo(211.94608f, 181.98442f, 181.98442f, 211.94608f, 143.72f, 218.65f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sphere!!
    }

private var _sphere: ImageVector? = null
