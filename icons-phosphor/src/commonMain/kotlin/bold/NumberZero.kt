package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorBoldIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.62f, 61.05f),
                    PathNode.CurveTo(172.86f, 39.43f, 152.62f, 28.05f, 128.0f, 28.05f),
                    PathNode.CurveTo(103.38f, 28.05f, 83.14f, 39.43f, 69.38f, 61.05f),
                    PathNode.CurveTo(58.17f, 78.66f, 52.0f, 102.44f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 153.56f, 58.17f, 177.33f, 69.38f, 194.94f),
                    PathNode.CurveTo(83.14f, 216.57f, 103.41f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(152.59f, 228.0f, 172.86f, 216.57f, 186.62f, 194.94f),
                    PathNode.CurveTo(197.83f, 177.33f, 204.0f, 153.56f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 102.44f, 197.83f, 78.66f, 186.62f, 61.05f),
                    PathNode.Close,
                    PathNode.MoveTo(166.37f, 182.05f),
                    PathNode.CurveTo(157.11f, 196.62f, 144.2f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(111.8f, 204.0f, 98.89f, 196.62f, 89.63f, 182.06f),
                    PathNode.CurveTo(80.84f, 168.25f, 76.0f, 149.05f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 106.95f, 80.84f, 87.75f, 89.63f, 73.94f),
                    PathNode.CurveTo(98.89f, 59.38f, 111.8f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(144.2f, 52.0f, 157.11f, 59.38f, 166.37f, 73.94f),
                    PathNode.CurveTo(175.16f, 87.75f, 180.0f, 107.0f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 149.0f, 175.16f, 168.25f, 166.37f, 182.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
