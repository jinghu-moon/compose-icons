package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorFillIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(88.2355f, 56.0f, 56.0f, 88.2355f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 167.7645f, 88.2355f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(167.7645f, 200.0f, 200.0f, 167.7645f, 200.0f, 128.0f),
                    PathNode.CurveTo(199.95592f, 88.25378f, 167.74623f, 56.04409f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(112.88073f, 176.05634f, 98.631546f, 168.93546f, 89.6f, 156.81f),
                    PathNode.CurveTo(86.94627f, 153.27538f, 87.66038f, 148.25874f, 91.195f, 145.605f),
                    PathNode.CurveTo(94.72962f, 142.95128f, 99.74627f, 143.66537f, 102.4f, 147.2f),
                    PathNode.CurveTo(110.66426f, 158.21902f, 125.05234f, 162.71352f, 138.1193f, 158.35786f),
                    PathNode.CurveTo(151.18623f, 154.00221f, 160.0f, 141.77377f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 114.22623f, 151.18623f, 101.99779f, 138.1193f, 97.642136f),
                    PathNode.CurveTo(125.05234f, 93.28648f, 110.66426f, 97.78098f, 102.4f, 108.8f),
                    PathNode.CurveTo(99.74627f, 112.334625f, 94.72962f, 113.04873f, 91.195f, 110.395f),
                    PathNode.CurveTo(87.66038f, 107.74127f, 86.94627f, 102.724625f, 89.6f, 99.19f),
                    PathNode.CurveTo(103.146706f, 81.13753f, 127.440384f, 74.961334f, 147.96399f, 84.3521f),
                    PathNode.CurveTo(168.48761f, 93.74287f, 179.6965f, 116.16358f, 174.89265f, 138.21643f),
                    PathNode.CurveTo(170.0888f, 160.26926f, 150.57f, 175.99648f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 70.562386f, 185.4376f, 24.0f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
