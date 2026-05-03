package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorBoldIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 100.0f),
                    PathNode.CurveTo(180.0f, 108.836555f, 172.83656f, 116.0f, 164.0f, 116.0f),
                    PathNode.CurveTo(155.16344f, 116.0f, 148.0f, 108.836555f, 148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 91.163445f, 155.16344f, 84.0f, 164.0f, 84.0f),
                    PathNode.CurveTo(172.83656f, 84.0f, 180.0f, 91.163445f, 180.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 116.0f),
                    PathNode.CurveTo(123.163445f, 116.0f, 116.0f, 123.163445f, 116.0f, 132.0f),
                    PathNode.CurveTo(116.0f, 140.83656f, 123.163445f, 148.0f, 132.0f, 148.0f),
                    PathNode.CurveTo(140.83656f, 148.0f, 148.0f, 140.83656f, 148.0f, 132.0f),
                    PathNode.CurveTo(148.0f, 123.163445f, 140.83656f, 116.0f, 132.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 146.8102f, 178.8102f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(77.18981f, 188.0f, 36.0f, 146.8102f, 36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 45.189804f, 77.18981f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(178.78735f, 4.055114f, 219.94489f, 45.21265f, 220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 96.0f),
                    PathNode.CurveTo(196.0f, 58.444637f, 165.55536f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(90.44463f, 28.0f, 60.0f, 58.444637f, 60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 133.55536f, 90.44463f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(165.53935f, 163.96141f, 195.96141f, 133.53937f, 196.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 197.86f),
                    PathNode.CurveTo(140.6981f, 206.04646f, 115.301895f, 206.04646f, 92.0f, 197.86f),
                    PathNode.CurveTo(85.7509f, 195.65086f, 78.89414f, 198.9259f, 76.685f, 205.175f),
                    PathNode.CurveTo(74.47586f, 211.4241f, 77.7509f, 218.28085f, 84.0f, 220.49f),
                    PathNode.CurveTo(94.33417f, 224.14462f, 105.0838f, 226.49611f, 116.0f, 227.49f),
                    PathNode.LineTo(116.0f, 244.0f),
                    PathNode.CurveTo(116.0f, 250.62741f, 121.37258f, 256.0f, 128.0f, 256.0f),
                    PathNode.CurveTo(134.62741f, 256.0f, 140.0f, 250.62741f, 140.0f, 244.0f),
                    PathNode.LineTo(140.0f, 227.46f),
                    PathNode.CurveTo(150.9162f, 226.46611f, 161.66583f, 224.11462f, 172.0f, 220.46f),
                    PathNode.CurveTo(178.2491f, 218.25085f, 181.52414f, 211.39412f, 179.315f, 205.145f),
                    PathNode.CurveTo(177.10587f, 198.8959f, 170.2491f, 195.62086f, 164.0f, 197.83f),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
