package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorBoldIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.86f, 133.1f),
                    PathNode.CurveTo(219.86f, 182.1f, 199.86f, 204.0f, 178.04f, 204.0f),
                    PathNode.CurveTo(150.4f, 204.0f, 134.24f, 169.56f, 117.14f, 133.1f),
                    PathNode.CurveTo(110.0f, 117.78f, 102.53f, 102.0f, 94.92f, 90.73f),
                    PathNode.CurveTo(88.39f, 81.09f, 82.53f, 76.0f, 78.0f, 76.0f),
                    PathNode.CurveTo(74.18f, 76.0f, 59.76f, 80.12f, 34.91f, 133.1f),
                    PathNode.CurveTo(32.09335f, 139.10057f, 24.945574f, 141.68164f, 18.945f, 138.865f),
                    PathNode.CurveTo(12.944427f, 136.04836f, 10.363348f, 128.90057f, 13.18f, 122.9f),
                    PathNode.CurveTo(36.18f, 73.9f, 56.18f, 52.0f, 78.0f, 52.0f),
                    PathNode.CurveTo(105.64f, 52.0f, 121.8f, 86.44f, 138.9f, 122.9f),
                    PathNode.CurveTo(146.09f, 138.22f, 153.51f, 154.05f, 161.12f, 165.27f),
                    PathNode.CurveTo(167.65f, 174.91f, 173.51f, 180.0f, 178.12f, 180.0f),
                    PathNode.CurveTo(181.94f, 180.0f, 196.36f, 175.88f, 221.21f, 122.9f),
                    PathNode.CurveTo(224.02666f, 116.89943f, 231.17442f, 114.31835f, 237.175f, 117.135f),
                    PathNode.CurveTo(243.17557f, 119.95165f, 245.75665f, 127.09943f, 242.94f, 133.1f),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
