package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorRegularIcon(
            name = "Copyleft",
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
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 128.0f),
                    PathNode.CurveTo(176.0043f, 148.6625f, 162.78517f, 167.00912f, 143.18367f, 173.54521f),
                    PathNode.CurveTo(123.58219f, 180.08131f, 101.9975f, 173.34f, 89.6f, 156.81f),
                    PathNode.CurveTo(86.94627f, 153.27538f, 87.66038f, 148.25874f, 91.195f, 145.605f),
                    PathNode.CurveTo(94.72962f, 142.95128f, 99.74627f, 143.66537f, 102.4f, 147.2f),
                    PathNode.CurveTo(110.66426f, 158.21902f, 125.05234f, 162.71352f, 138.1193f, 158.35786f),
                    PathNode.CurveTo(151.18623f, 154.00221f, 160.0f, 141.77377f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 114.22623f, 151.18623f, 101.99779f, 138.1193f, 97.642136f),
                    PathNode.CurveTo(125.05234f, 93.28648f, 110.66426f, 97.78098f, 102.4f, 108.8f),
                    PathNode.CurveTo(99.74627f, 112.334625f, 94.72962f, 113.04873f, 91.195f, 110.395f),
                    PathNode.CurveTo(87.66038f, 107.74127f, 86.94627f, 102.724625f, 89.6f, 99.19f),
                    PathNode.CurveTo(101.9975f, 82.66f, 123.58219f, 75.918686f, 143.18367f, 82.45478f),
                    PathNode.CurveTo(162.78517f, 88.99088f, 176.0043f, 107.3375f, 176.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
