package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorBoldIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 63.51f),
                    PathNode.CurveTo(238.23837f, 61.250546f, 235.17982f, 59.980537f, 231.99f, 59.980537f),
                    PathNode.CurveTo(228.80019f, 59.980537f, 225.74162f, 61.250546f, 223.49f, 63.51f),
                    PathNode.LineTo(192.0f, 95.0f),
                    PathNode.LineTo(161.0f, 64.0f),
                    PathNode.LineTo(192.52f, 32.49f),
                    PathNode.CurveTo(197.21442f, 27.79558f, 197.21442f, 20.18442f, 192.52f, 15.49f),
                    PathNode.CurveTo(187.82558f, 10.79558f, 180.21442f, 10.79558f, 175.52f, 15.49f),
                    PathNode.LineTo(144.0f, 47.0f),
                    PathNode.LineTo(120.49f, 23.51f),
                    PathNode.CurveTo(115.79558f, 18.81558f, 108.18442f, 18.815578f, 103.49f, 23.51f),
                    PathNode.CurveTo(98.79558f, 28.20442f, 98.79558f, 35.81558f, 103.49f, 40.51f),
                    PathNode.LineTo(107.0f, 44.0f),
                    PathNode.LineTo(56.89f, 94.14f),
                    PathNode.CurveTo(48.63699f, 102.391785f, 44.000397f, 113.58434f, 44.000397f, 125.255f),
                    PathNode.CurveTo(44.000397f, 136.92566f, 48.63699f, 148.11821f, 56.89f, 156.37f),
                    PathNode.LineTo(69.77f, 169.25f),
                    PathNode.LineTo(23.51f, 215.51f),
                    PathNode.CurveTo(18.81558f, 220.20442f, 18.81558f, 227.81558f, 23.51f, 232.51f),
                    PathNode.CurveTo(28.20442f, 237.20442f, 35.81558f, 237.20442f, 40.51f, 232.51f),
                    PathNode.LineTo(86.77f, 186.25f),
                    PathNode.LineTo(99.65f, 199.13f),
                    PathNode.CurveTo(107.90179f, 207.38301f, 119.094345f, 212.0196f, 130.765f, 212.0196f),
                    PathNode.CurveTo(142.43565f, 212.0196f, 153.62822f, 207.38301f, 161.88f, 199.13f),
                    PathNode.LineTo(212.0f, 149.0f),
                    PathNode.LineTo(215.51f, 152.52f),
                    PathNode.CurveTo(220.20442f, 157.21442f, 227.81558f, 157.21442f, 232.51f, 152.52f),
                    PathNode.CurveTo(237.20442f, 147.82558f, 237.20442f, 140.21442f, 232.51f, 135.52f),
                    PathNode.LineTo(209.0f, 112.0f),
                    PathNode.LineTo(240.52f, 80.49f),
                    PathNode.CurveTo(242.76935f, 78.2352f, 244.03008f, 75.178696f, 244.02444f, 71.99378f),
                    PathNode.CurveTo(244.01881f, 68.80887f, 242.7473f, 65.756836f, 240.49f, 63.51f),
                    PathNode.Close,
                    PathNode.MoveTo(144.89f, 182.14f),
                    PathNode.CurveTo(141.13904f, 185.89249f, 136.05074f, 188.00073f, 130.745f, 188.00073f),
                    PathNode.CurveTo(125.43927f, 188.00073f, 120.35096f, 185.89249f, 116.6f, 182.14f),
                    PathNode.LineTo(73.86f, 139.4f),
                    PathNode.CurveTo(70.10752f, 135.64903f, 67.99927f, 130.56073f, 67.99927f, 125.255f),
                    PathNode.CurveTo(67.99927f, 119.949265f, 70.10752f, 114.86096f, 73.86f, 111.11f),
                    PathNode.LineTo(124.0f, 61.0f),
                    PathNode.LineTo(195.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _plug!!
    }

private var _plug: ImageVector? = null
