package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorFillIcon(
            name = "PauseCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.92838f, 70.59208f, 185.40791f, 24.071625f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 160.0f),
                    PathNode.CurveTo(112.0f, 164.41827f, 108.41828f, 168.0f, 104.0f, 168.0f),
                    PathNode.CurveTo(99.58172f, 168.0f, 96.0f, 164.41827f, 96.0f, 160.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.CurveTo(96.0f, 91.58172f, 99.58172f, 88.0f, 104.0f, 88.0f),
                    PathNode.CurveTo(108.41828f, 88.0f, 112.0f, 91.58172f, 112.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.CurveTo(160.0f, 164.41827f, 156.41827f, 168.0f, 152.0f, 168.0f),
                    PathNode.CurveTo(147.58173f, 168.0f, 144.0f, 164.41827f, 144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.CurveTo(144.0f, 91.58172f, 147.58173f, 88.0f, 152.0f, 88.0f),
                    PathNode.CurveTo(156.41827f, 88.0f, 160.0f, 91.58172f, 160.0f, 96.0f),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
