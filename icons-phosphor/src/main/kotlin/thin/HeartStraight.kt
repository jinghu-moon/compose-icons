package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorThinIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.18f, 59.79f),
                    PathNode.CurveTo(199.08691f, 38.767513f, 164.96309f, 38.767513f, 143.87f, 59.79f),
                    PathNode.LineTo(128.0f, 74.51f),
                    PathNode.LineTo(112.13f, 59.74f),
                    PathNode.CurveTo(91.02996f, 38.662052f, 56.837948f, 38.679962f, 35.760002f, 59.780003f),
                    PathNode.CurveTo(14.682054f, 80.88004f, 14.699962f, 115.07206f, 35.8f, 136.15f),
                    PathNode.LineTo(125.15f, 226.81f),
                    PathNode.CurveTo(125.90183f, 227.57343f, 126.92852f, 228.00331f, 128.0f, 228.00331f),
                    PathNode.CurveTo(129.07149f, 228.00331f, 130.09818f, 227.57343f, 130.85f, 226.81f),
                    PathNode.LineTo(220.18f, 136.17f),
                    PathNode.CurveTo(230.31076f, 126.04253f, 236.00246f, 112.30475f, 236.00246f, 97.98f),
                    PathNode.CurveTo(236.00246f, 83.65525f, 230.31076f, 69.91747f, 220.18f, 59.79f),
                    PathNode.Close,
                    PathNode.MoveTo(214.51f, 130.53f),
                    PathNode.LineTo(128.0f, 218.3f),
                    PathNode.LineTo(41.47f, 130.51f),
                    PathNode.CurveTo(23.504177f, 112.544174f, 23.504177f, 83.415825f, 41.47f, 65.45f),
                    PathNode.CurveTo(59.43582f, 47.484177f, 88.56418f, 47.484177f, 106.53f, 65.45f),
                    PathNode.LineTo(106.63f, 65.55f),
                    PathNode.LineTo(125.27f, 82.91f),
                    PathNode.CurveTo(126.80703f, 84.34527f, 129.19296f, 84.34527f, 130.73f, 82.91f),
                    PathNode.LineTo(149.37f, 65.55f),
                    PathNode.LineTo(149.47f, 65.45f),
                    PathNode.CurveTo(161.0127f, 53.43632f, 178.14903f, 48.60276f, 194.2682f, 52.814014f),
                    PathNode.CurveTo(210.38737f, 57.025265f, 222.96967f, 69.62304f, 227.16109f, 85.74737f),
                    PathNode.CurveTo(231.35251f, 101.871704f, 226.49785f, 119.0021f, 214.47f, 130.53f),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
