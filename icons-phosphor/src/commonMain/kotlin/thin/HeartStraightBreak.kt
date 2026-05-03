package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorThinIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.21f, 59.8f),
                    PathNode.CurveTo(199.11118f, 38.76307f, 164.96883f, 38.76307f, 143.87f, 59.8f),
                    PathNode.LineTo(128.0f, 75.0f),
                    PathNode.LineTo(112.18f, 59.8f),
                    PathNode.CurveTo(91.09653f, 38.702724f, 56.90228f, 38.69153f, 35.805f, 59.775f),
                    PathNode.CurveTo(14.707723f, 80.85847f, 14.696529f, 115.05272f, 35.78f, 136.15f),
                    PathNode.LineTo(125.15f, 226.81f),
                    PathNode.CurveTo(125.90183f, 227.57343f, 126.92852f, 228.00331f, 128.0f, 228.00331f),
                    PathNode.CurveTo(129.07149f, 228.00331f, 130.09818f, 227.57343f, 130.85f, 226.81f),
                    PathNode.LineTo(220.21f, 136.17f),
                    PathNode.CurveTo(241.26138f, 115.06544f, 241.26138f, 80.90456f, 220.21f, 59.8f),
                    PathNode.Close,
                    PathNode.MoveTo(214.53f, 130.54f),
                    PathNode.LineTo(128.0f, 218.3f),
                    PathNode.LineTo(41.45f, 130.52f),
                    PathNode.CurveTo(23.500746f, 112.53484f, 23.529848f, 83.40425f, 41.515f, 65.455f),
                    PathNode.CurveTo(59.500153f, 47.505745f, 88.630745f, 47.534847f, 106.58f, 65.52f),
                    PathNode.LineTo(122.23f, 80.59f),
                    PathNode.LineTo(109.23f, 93.11f),
                    PathNode.CurveTo(108.443115f, 93.86534f, 107.99882f, 94.909256f, 108.0f, 96.0f),
                    PathNode.CurveTo(107.99116f, 97.07157f, 108.41264f, 98.101875f, 109.17f, 98.86f),
                    PathNode.LineTo(138.35f, 128.0f),
                    PathNode.LineTo(125.17f, 141.17f),
                    PathNode.CurveTo(123.60703f, 142.73297f, 123.60703f, 145.26703f, 125.17f, 146.83f),
                    PathNode.CurveTo(126.73296f, 148.39296f, 129.26703f, 148.39296f, 130.83f, 146.83f),
                    PathNode.LineTo(146.83f, 130.83f),
                    PathNode.CurveTo(147.58112f, 130.07973f, 148.00314f, 129.06163f, 148.00314f, 128.0f),
                    PathNode.CurveTo(148.00314f, 126.93836f, 147.58112f, 125.92027f, 146.83f, 125.17f),
                    PathNode.LineTo(117.71f, 96.0f),
                    PathNode.LineTo(149.48f, 65.42f),
                    PathNode.CurveTo(167.45134f, 47.45694f, 196.58194f, 47.463654f, 214.545f, 65.435f),
                    PathNode.CurveTo(232.50806f, 83.40635f, 232.50134f, 112.53694f, 214.53f, 130.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
