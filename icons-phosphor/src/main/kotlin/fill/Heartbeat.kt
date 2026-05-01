package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorFillIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 102.0f),
                    PathNode.CurveTo(240.0f, 172.0f, 136.21f, 228.66f, 131.79f, 231.0f),
                    PathNode.CurveTo(129.42366f, 232.27296f, 126.57634f, 232.27296f, 124.21f, 231.0f),
                    PathNode.CurveTo(120.86f, 229.2f, 60.66f, 196.31f, 31.53f, 150.11f),
                    PathNode.CurveTo(30.764845f, 148.8777f, 30.726774f, 147.32774f, 31.430506f, 146.05937f),
                    PathNode.CurveTo(32.13424f, 144.79099f, 33.46948f, 144.00298f, 34.92f, 144.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(74.67564f, 144.00174f, 77.17502f, 142.66574f, 78.66f, 140.44f),
                    PathNode.LineTo(88.0f, 126.44f),
                    PathNode.LineTo(113.34f, 164.44f),
                    PathNode.CurveTo(115.33561f, 167.43298f, 119.08347f, 168.7259f, 122.5f, 167.6f),
                    PathNode.CurveTo(124.26338f, 167.00282f, 125.77218f, 165.8254f, 126.78f, 164.26f),
                    PathNode.LineTo(140.28f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.CurveTo(162.21684f, 144.00487f, 164.3363f, 143.08966f, 165.85281f, 141.47269f),
                    PathNode.CurveTo(167.36931f, 139.85571f, 168.14687f, 137.68199f, 168.0f, 135.47f),
                    PathNode.CurveTo(167.62871f, 131.20465f, 164.03116f, 127.947235f, 159.75f, 128.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(133.32436f, 127.99826f, 130.82498f, 129.33426f, 129.34f, 131.56f),
                    PathNode.LineTo(120.0f, 145.56f),
                    PathNode.LineTo(94.66f, 107.56f),
                    PathNode.CurveTo(92.66316f, 104.562546f, 88.90951f, 103.26903f, 85.49f, 104.4f),
                    PathNode.CurveTo(83.73107f, 105.00056f, 82.22646f, 106.17746f, 81.22f, 107.74f),
                    PathNode.LineTo(67.72f, 128.0f),
                    PathNode.LineTo(23.53f, 128.0f),
                    PathNode.CurveTo(21.77516f, 128.00487f, 20.222061f, 126.865395f, 19.7f, 125.19f),
                    PathNode.CurveTo(17.287169f, 117.6949f, 16.0393f, 109.8738f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.038576f, 67.77434f, 43.774338f, 40.03858f, 78.0f, 40.0f),
                    PathNode.CurveTo(98.65f, 40.0f, 116.73f, 48.88f, 128.0f, 63.89f),
                    PathNode.CurveTo(139.27f, 48.88f, 157.35f, 40.0f, 178.0f, 40.0f),
                    PathNode.CurveTo(212.22566f, 40.03858f, 239.96143f, 67.77434f, 240.0f, 102.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
