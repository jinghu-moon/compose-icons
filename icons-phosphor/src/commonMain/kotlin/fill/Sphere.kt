package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorFillIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(136.15f, 40.0f, 152.0f, 71.06f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 136.24f, 151.66f, 143.92f, 151.07f, 151.07f),
                    PathNode.CurveTo(143.92f, 151.66f, 136.24f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(71.06f, 152.0f, 40.0f, 136.15f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.055107f, 79.42178f, 79.42178f, 40.055107f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(43.4f, 152.26f),
                    PathNode.CurveTo(63.28f, 162.65f, 95.76f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(135.09f, 168.0f, 142.19f, 167.74f, 149.17f, 167.23f),
                    PathNode.CurveTo(144.23f, 199.0f, 134.0f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(88.75767f, 215.94751f, 54.273174f, 189.96593f, 43.4f, 152.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sphere!!
    }

private var _sphere: ImageVector? = null
