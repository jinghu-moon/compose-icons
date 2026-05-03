package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorBoldIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 36.0f),
                    PathNode.CurveTo(157.91f, 36.0f, 140.08f, 43.93f, 128.0f, 57.56f),
                    PathNode.CurveTo(115.92f, 43.93f, 98.09f, 36.0f, 78.0f, 36.0f),
                    PathNode.CurveTo(41.56748f, 36.04408f, 12.044081f, 65.56748f, 12.0f, 102.0f),
                    PathNode.CurveTo(12.0f, 174.34f, 117.81f, 232.14f, 122.31f, 234.57f),
                    PathNode.CurveTo(125.86214f, 236.48305f, 130.13786f, 236.48305f, 133.69f, 234.57f),
                    PathNode.CurveTo(138.19f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f),
                    PathNode.CurveTo(243.95592f, 65.56748f, 214.43253f, 36.04408f, 178.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.51f, 178.36f),
                    PathNode.CurveTo(158.5827f, 190.17833f, 143.69449f, 200.81517f, 128.0f, 210.16f),
                    PathNode.CurveTo(112.30551f, 200.81517f, 97.417305f, 190.17833f, 83.49f, 178.36f),
                    PathNode.CurveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f),
                    PathNode.CurveTo(36.0f, 78.80404f, 54.80404f, 60.0f, 78.0f, 60.0f),
                    PathNode.CurveTo(95.8f, 60.0f, 110.7f, 69.4f, 116.89f, 84.54f),
                    PathNode.CurveTo(118.732796f, 89.05436f, 123.124f, 92.004814f, 128.0f, 92.004814f),
                    PathNode.CurveTo(132.87599f, 92.004814f, 137.26721f, 89.05436f, 139.11f, 84.54f),
                    PathNode.CurveTo(145.3f, 69.4f, 160.2f, 60.0f, 178.0f, 60.0f),
                    PathNode.CurveTo(201.19595f, 60.0f, 220.0f, 78.80404f, 220.0f, 102.0f),
                    PathNode.CurveTo(220.0f, 131.42f, 194.18f, 159.77f, 172.51f, 178.36f),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
