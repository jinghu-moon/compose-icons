package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorLightIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.56f, 64.28f),
                    PathNode.CurveTo(169.0f, 44.47f, 150.43f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(105.57f, 34.0f, 87.05f, 44.47f, 74.44f, 64.28f),
                    PathNode.CurveTo(63.84f, 80.94f, 58.0f, 103.57f, 58.0f, 128.0f),
                    PathNode.CurveTo(58.0f, 152.43f, 63.84f, 175.06f, 74.44f, 191.72f),
                    PathNode.CurveTo(87.05f, 211.53f, 105.57f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(150.43f, 222.0f, 168.95f, 211.53f, 181.56f, 191.72f),
                    PathNode.CurveTo(192.16f, 175.06f, 198.0f, 152.43f, 198.0f, 128.0f),
                    PathNode.CurveTo(198.0f, 103.57f, 192.16f, 80.94f, 181.56f, 64.28f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 210.0f),
                    PathNode.CurveTo(87.93f, 210.0f, 70.0f, 168.82f, 70.0f, 128.0f),
                    PathNode.CurveTo(70.0f, 87.18f, 87.93f, 46.0f, 128.0f, 46.0f),
                    PathNode.CurveTo(168.07f, 46.0f, 186.0f, 87.18f, 186.0f, 128.0f),
                    PathNode.CurveTo(186.0f, 168.82f, 168.07f, 210.0f, 128.0f, 210.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
