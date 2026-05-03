package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorBoldIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 92.68f),
                    PathNode.CurveTo(252.01437f, 87.37303f, 249.90411f, 82.28106f, 246.14f, 78.54f),
                    PathNode.LineTo(177.46f, 9.85f),
                    PathNode.CurveTo(173.70905f, 6.09752f, 168.62073f, 3.989271f, 163.315f, 3.989271f),
                    PathNode.CurveTo(158.00926f, 3.989271f, 152.92096f, 6.09752f, 149.17f, 9.85f),
                    PathNode.LineTo(121.35f, 37.67f),
                    PathNode.LineTo(64.11f, 59.14f),
                    PathNode.CurveTo(57.419617f, 61.647f, 52.5747f, 67.53256f, 51.4f, 74.58f),
                    PathNode.LineTo(28.16f, 214.0f),
                    PathNode.CurveTo(27.571062f, 217.48419f, 28.547712f, 221.05086f, 30.829538f, 223.74896f),
                    PathNode.CurveTo(33.111362f, 226.44707f, 36.466377f, 228.0023f, 40.0f, 228.0f),
                    PathNode.CurveTo(40.669983f, 228.00307f, 41.339027f, 227.94954f, 42.0f, 227.84f),
                    PathNode.LineTo(181.45f, 204.59f),
                    PathNode.CurveTo(188.48894f, 203.40363f, 194.36803f, 198.56786f, 196.89f, 191.89f),
                    PathNode.LineTo(218.35f, 134.64f),
                    PathNode.LineTo(246.17f, 106.82f),
                    PathNode.CurveTo(249.92406f, 103.07462f, 252.02342f, 97.98286f, 252.0f, 92.68f),
                    PathNode.Close,
                    PathNode.MoveTo(175.2f, 181.3f),
                    PathNode.LineTo(75.0f, 198.0f),
                    PathNode.LineTo(108.0f, 165.0f),
                    PathNode.CurveTo(122.9668f, 171.75626f, 140.62364f, 166.85008f, 149.95947f, 153.34105f),
                    PathNode.CurveTo(159.29532f, 139.832f, 157.64198f, 121.58094f, 146.03052f, 109.96948f),
                    PathNode.CurveTo(134.41905f, 98.358025f, 116.168f, 96.70469f, 102.65896f, 106.04053f),
                    PathNode.CurveTo(89.14992f, 115.37636f, 84.243744f, 133.0332f, 91.0f, 148.0f),
                    PathNode.LineTo(58.0f, 181.0f),
                    PathNode.LineTo(74.7f, 80.8f),
                    PathNode.LineTo(125.0f, 61.94f),
                    PathNode.LineTo(194.05f, 131.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 134.0f),
                    PathNode.CurveTo(112.0f, 128.47716f, 116.47715f, 124.0f, 122.0f, 124.0f),
                    PathNode.CurveTo(127.52285f, 124.0f, 132.0f, 128.47716f, 132.0f, 134.0f),
                    PathNode.CurveTo(132.0f, 139.52284f, 127.52285f, 144.0f, 122.0f, 144.0f),
                    PathNode.CurveTo(116.47715f, 144.0f, 112.0f, 139.52284f, 112.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 111.0f),
                    PathNode.LineTo(145.0f, 48.0f),
                    PathNode.LineTo(163.34f, 29.66f),
                    PathNode.LineTo(226.34f, 92.66f),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
