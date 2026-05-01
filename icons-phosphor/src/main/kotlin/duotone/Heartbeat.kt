package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorDuotoneIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 102.0f),
                    PathNode.CurveTo(232.0f, 168.0f, 128.0f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(128.0f, 224.0f, 24.0f, 168.0f, 24.0f, 102.0f),
                    PathNode.CurveTo(24.0f, 72.17662f, 48.176624f, 48.0f, 78.0f, 48.0f),
                    PathNode.CurveTo(100.59f, 48.0f, 119.94f, 60.31f, 128.0f, 80.0f),
                    PathNode.CurveTo(136.06f, 60.31f, 155.41f, 48.0f, 178.0f, 48.0f),
                    PathNode.CurveTo(207.82338f, 48.0f, 232.0f, 72.17662f, 232.0f, 102.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(27.581722f, 144.0f, 24.0f, 140.41827f, 24.0f, 136.0f),
                    PathNode.CurveTo(24.0f, 131.58173f, 27.581722f, 128.0f, 32.0f, 128.0f),
                    PathNode.LineTo(67.72f, 128.0f),
                    PathNode.LineTo(81.34f, 107.56f),
                    PathNode.CurveTo(82.8232f, 105.33129f, 85.32287f, 103.9922f, 88.0f, 103.9922f),
                    PathNode.CurveTo(90.67713f, 103.9922f, 93.1768f, 105.33129f, 94.66f, 107.56f),
                    PathNode.LineTo(120.0f, 145.56f),
                    PathNode.LineTo(129.34f, 131.56f),
                    PathNode.CurveTo(130.82498f, 129.33426f, 133.32436f, 127.99826f, 136.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(164.41827f, 128.0f, 168.0f, 131.58173f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 140.41827f, 164.41827f, 144.0f, 160.0f, 144.0f),
                    PathNode.LineTo(140.28f, 144.0f),
                    PathNode.LineTo(126.66f, 164.44f),
                    PathNode.CurveTo(125.1768f, 166.6687f, 122.67713f, 168.0078f, 120.0f, 168.0078f),
                    PathNode.CurveTo(117.32287f, 168.0078f, 114.8232f, 166.6687f, 113.34f, 164.44f),
                    PathNode.LineTo(88.0f, 126.42f),
                    PathNode.LineTo(78.66f, 140.42f),
                    PathNode.CurveTo(77.17961f, 142.65335f, 74.67944f, 143.99728f, 72.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 40.0f),
                    PathNode.CurveTo(157.35f, 40.0f, 139.27f, 48.88f, 128.0f, 63.89f),
                    PathNode.CurveTo(116.73f, 48.88f, 98.65f, 40.0f, 78.0f, 40.0f),
                    PathNode.CurveTo(43.774338f, 40.03858f, 16.038576f, 67.77434f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.0f, 102.75f, 16.0f, 103.5f, 16.0f, 104.25f),
                    PathNode.CurveTo(16.138071f, 108.66828f, 19.831722f, 112.13807f, 24.25f, 112.0f),
                    PathNode.CurveTo(28.668278f, 111.86193f, 32.138073f, 108.16828f, 32.0f, 103.75f),
                    PathNode.CurveTo(32.0f, 103.17f, 32.0f, 102.58f, 32.0f, 102.0f),
                    PathNode.CurveTo(32.033054f, 76.608604f, 52.608604f, 56.033054f, 78.0f, 56.0f),
                    PathNode.CurveTo(97.45f, 56.0f, 113.78f, 66.36f, 120.6f, 83.0f),
                    PathNode.CurveTo(121.83271f, 86.00094f, 124.755745f, 87.960266f, 128.0f, 87.960266f),
                    PathNode.CurveTo(131.24426f, 87.960266f, 134.16728f, 86.00094f, 135.4f, 83.0f),
                    PathNode.CurveTo(142.22f, 66.33f, 158.55f, 56.0f, 178.0f, 56.0f),
                    PathNode.CurveTo(203.39139f, 56.033054f, 223.96695f, 76.608604f, 224.0f, 102.0f),
                    PathNode.CurveTo(224.0f, 155.61f, 146.24f, 204.15f, 128.0f, 214.8f),
                    PathNode.CurveTo(117.17f, 208.49f, 85.37f, 188.8f, 61.32f, 162.59f),
                    PathNode.CurveTo(58.33214f, 159.33151f, 53.26848f, 159.11214f, 50.01f, 162.1f),
                    PathNode.CurveTo(46.75152f, 165.08786f, 46.53214f, 170.15152f, 49.52f, 173.41f),
                    PathNode.CurveTo(80.69f, 207.41f, 122.45f, 230.09f, 124.21f, 231.04f),
                    PathNode.CurveTo(126.57634f, 232.31297f, 129.42366f, 232.31297f, 131.79f, 231.04f),
                    PathNode.CurveTo(136.21f, 228.66f, 240.0f, 172.0f, 240.0f, 102.0f),
                    PathNode.CurveTo(239.96143f, 67.77434f, 212.22566f, 40.03858f, 178.0f, 40.0f),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
