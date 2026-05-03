package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorBoldIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 60.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.CurveTo(34.044636f, 60.044098f, 0.044094f, 94.04464f, 0f, 136.0f),
                    PathNode.LineTo(0f, 140.0f),
                    PathNode.CurveTo(0.002462f, 149.27806f, 5.352495f, 157.72363f, 13.74f, 161.69f),
                    PathNode.CurveTo(16.89f, 170.4f, 24.25f, 178.44f, 35.26f, 184.96f),
                    PathNode.CurveTo(46.78f, 191.77f, 60.86f, 195.96f, 72.0f, 195.96f),
                    PathNode.CurveTo(91.6677f, 195.93439f, 108.936615f, 182.87662f, 114.32f, 163.96f),
                    PathNode.LineTo(141.68f, 163.96f),
                    PathNode.CurveTo(147.04857f, 182.89247f, 164.3211f, 195.9693f, 184.0f, 196.0f),
                    PathNode.CurveTo(202.53f, 196.0f, 234.62f, 183.19f, 242.31f, 161.67f),
                    PathNode.CurveTo(250.6715f, 157.69232f, 255.99898f, 149.2594f, 256.0f, 140.0f),
                    PathNode.LineTo(256.0f, 136.0f),
                    PathNode.CurveTo(255.9559f, 94.04464f, 221.95538f, 60.044098f, 180.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 84.0f),
                    PathNode.LineTo(180.0f, 84.0f),
                    PathNode.CurveTo(205.07814f, 84.03449f, 226.56905f, 101.94008f, 231.13f, 126.6f),
                    PathNode.CurveTo(227.92667f, 123.72912f, 224.44627f, 121.1833f, 220.74f, 119.0f),
                    PathNode.CurveTo(209.22f, 112.19f, 195.14f, 108.0f, 184.0f, 108.0f),
                    PathNode.CurveTo(164.3323f, 108.025604f, 147.06339f, 121.08339f, 141.68f, 140.0f),
                    PathNode.LineTo(114.32f, 140.0f),
                    PathNode.CurveTo(108.936615f, 121.08339f, 91.6677f, 108.025604f, 72.0f, 108.0f),
                    PathNode.CurveTo(58.6f, 108.0f, 38.1f, 114.71f, 24.87f, 126.56f),
                    PathNode.CurveTo(29.4516f, 101.91812f, 50.935844f, 84.0349f, 76.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 172.0f),
                    PathNode.CurveTo(57.87f, 172.0f, 36.0f, 159.85f, 36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 149.26f, 39.55f, 144.39f, 47.48f, 139.7f),
                    PathNode.CurveTo(56.48f, 134.38f, 66.28f, 132.0f, 72.0f, 132.0f),
                    PathNode.CurveTo(83.04569f, 132.0f, 92.0f, 140.9543f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 163.0457f, 83.04569f, 172.0f, 72.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.52f, 164.3f),
                    PathNode.CurveTo(199.52f, 169.62f, 189.72f, 172.0f, 184.0f, 172.0f),
                    PathNode.CurveTo(172.9543f, 172.0f, 164.0f, 163.0457f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 140.9543f, 172.9543f, 132.0f, 184.0f, 132.0f),
                    PathNode.CurveTo(198.13f, 132.0f, 220.0f, 144.15f, 220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 154.74f, 216.45f, 159.61f, 208.52f, 164.3f),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
