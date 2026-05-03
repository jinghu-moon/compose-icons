package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorBoldIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 63.51f),
                    PathNode.LineTo(192.49f, 15.51f),
                    PathNode.CurveTo(187.79558f, 10.815579f, 180.18442f, 10.815579f, 175.49f, 15.51f),
                    PathNode.CurveTo(170.79558f, 20.20442f, 170.79558f, 27.81558f, 175.49f, 32.51f),
                    PathNode.LineTo(191.0f, 48.0f),
                    PathNode.LineTo(168.0f, 71.0f),
                    PathNode.LineTo(136.49f, 39.51f),
                    PathNode.CurveTo(131.79558f, 34.81558f, 124.18442f, 34.81558f, 119.49f, 39.51f),
                    PathNode.CurveTo(114.79558f, 44.20442f, 114.79558f, 51.81558f, 119.49f, 56.51f),
                    PathNode.LineTo(123.0f, 60.0f),
                    PathNode.LineTo(41.86f, 141.17f),
                    PathNode.CurveTo(38.09588f, 144.91106f, 35.985634f, 150.00302f, 36.0f, 155.31f),
                    PathNode.LineTo(36.0f, 203.0f),
                    PathNode.LineTo(15.51f, 223.51f),
                    PathNode.CurveTo(10.815579f, 228.20442f, 10.815579f, 235.81558f, 15.51f, 240.51f),
                    PathNode.CurveTo(20.20442f, 245.20442f, 27.81558f, 245.20442f, 32.51f, 240.51f),
                    PathNode.LineTo(53.0f, 220.0f),
                    PathNode.LineTo(100.72f, 220.0f),
                    PathNode.CurveTo(106.02697f, 220.01437f, 111.118935f, 217.90411f, 114.86f, 214.14f),
                    PathNode.LineTo(196.0f, 133.0f),
                    PathNode.LineTo(199.51f, 136.52f),
                    PathNode.CurveTo(204.20442f, 141.21442f, 211.81558f, 141.21442f, 216.51f, 136.52f),
                    PathNode.CurveTo(221.20442f, 131.82558f, 221.20442f, 124.214424f, 216.51f, 119.52f),
                    PathNode.LineTo(185.0f, 88.0f),
                    PathNode.LineTo(208.0f, 65.0f),
                    PathNode.LineTo(223.51f, 80.52f),
                    PathNode.CurveTo(228.20442f, 85.214424f, 235.81558f, 85.214424f, 240.51f, 80.52f),
                    PathNode.CurveTo(245.20442f, 75.82558f, 245.20442f, 68.214424f, 240.51f, 63.52f),
                    PathNode.Close,
                    PathNode.MoveTo(99.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(60.0f, 157.0f),
                    PathNode.LineTo(74.0f, 143.0f),
                    PathNode.LineTo(91.51f, 160.52f),
                    PathNode.CurveTo(96.20442f, 165.21442f, 103.81558f, 165.21442f, 108.51f, 160.52f),
                    PathNode.CurveTo(113.20442f, 155.82558f, 113.20442f, 148.21442f, 108.51f, 143.52f),
                    PathNode.LineTo(91.0f, 126.0f),
                    PathNode.LineTo(102.0f, 115.0f),
                    PathNode.LineTo(119.51f, 132.52f),
                    PathNode.CurveTo(124.20442f, 137.21442f, 131.81558f, 137.21442f, 136.51f, 132.52f),
                    PathNode.CurveTo(141.20442f, 127.82558f, 141.20442f, 120.214424f, 136.51f, 115.52f),
                    PathNode.LineTo(119.0f, 98.0f),
                    PathNode.LineTo(140.0f, 77.0f),
                    PathNode.LineTo(179.0f, 116.0f),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
