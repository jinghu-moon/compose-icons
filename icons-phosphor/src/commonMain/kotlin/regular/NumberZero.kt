package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorRegularIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.25f, 63.2f),
                    PathNode.CurveTo(170.25f, 42.79f, 151.15f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(104.85f, 32.0f, 85.75f, 42.79f, 72.75f, 63.2f),
                    PathNode.CurveTo(62.0f, 80.18f, 56.0f, 103.19f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 152.81f, 62.0f, 175.82f, 72.75f, 192.8f),
                    PathNode.CurveTo(85.75f, 213.21f, 104.85f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(151.15f, 224.0f, 170.25f, 213.21f, 183.25f, 192.8f),
                    PathNode.CurveTo(194.05f, 175.8f, 200.0f, 152.8f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 103.2f, 194.05f, 80.18f, 183.25f, 63.2f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(89.32f, 208.0f, 72.0f, 167.82f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 88.18f, 89.32f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(166.68f, 48.0f, 184.0f, 88.18f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 167.82f, 166.68f, 208.0f, 128.0f, 208.0f),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
