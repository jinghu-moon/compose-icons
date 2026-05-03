package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorThinIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 69.17f),
                    PathNode.CurveTo(234.07973f, 68.418884f, 233.06163f, 67.99686f, 232.0f, 67.99686f),
                    PathNode.CurveTo(230.93837f, 67.99686f, 229.92027f, 68.418884f, 229.17f, 69.17f),
                    PathNode.LineTo(192.0f, 106.34f),
                    PathNode.LineTo(149.66f, 64.0f),
                    PathNode.LineTo(186.83f, 26.83f),
                    PathNode.CurveTo(188.39296f, 25.267035f, 188.39296f, 22.732965f, 186.83f, 21.17f),
                    PathNode.CurveTo(185.26703f, 19.607035f, 182.73297f, 19.607035f, 181.17f, 21.17f),
                    PathNode.LineTo(144.0f, 58.34f),
                    PathNode.LineTo(114.83f, 29.17f),
                    PathNode.CurveTo(113.26704f, 27.607035f, 110.73296f, 27.607035f, 109.17f, 29.17f),
                    PathNode.CurveTo(107.60703f, 30.732965f, 107.60703f, 33.267033f, 109.17f, 34.83f),
                    PathNode.LineTo(118.34f, 44.0f),
                    PathNode.LineTo(62.54f, 99.8f),
                    PathNode.CurveTo(48.509796f, 113.87008f, 48.509796f, 136.63992f, 62.54f, 150.71f),
                    PathNode.LineTo(81.09f, 169.25f),
                    PathNode.LineTo(29.17f, 221.17f),
                    PathNode.CurveTo(27.607035f, 222.73297f, 27.607035f, 225.26703f, 29.17f, 226.83f),
                    PathNode.CurveTo(30.732965f, 228.39296f, 33.267033f, 228.39296f, 34.83f, 226.83f),
                    PathNode.LineTo(86.75f, 174.91f),
                    PathNode.LineTo(105.29f, 193.46f),
                    PathNode.CurveTo(119.36235f, 207.48471f, 142.12766f, 207.48471f, 156.2f, 193.46f),
                    PathNode.LineTo(212.0f, 137.66f),
                    PathNode.LineTo(221.17f, 146.83f),
                    PathNode.CurveTo(222.73297f, 148.39296f, 225.26703f, 148.39296f, 226.83f, 146.83f),
                    PathNode.CurveTo(228.39296f, 145.26703f, 228.39296f, 142.73297f, 226.83f, 141.17f),
                    PathNode.LineTo(197.66f, 112.0f),
                    PathNode.LineTo(234.83f, 74.83f),
                    PathNode.CurveTo(235.58112f, 74.07973f, 236.00314f, 73.06164f, 236.00314f, 72.0f),
                    PathNode.CurveTo(236.00314f, 70.93836f, 235.58112f, 69.92027f, 234.83f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(150.54f, 187.8f),
                    PathNode.CurveTo(139.60622f, 198.72935f, 121.883766f, 198.72935f, 110.95f, 187.8f),
                    PathNode.LineTo(68.2f, 145.05f),
                    PathNode.CurveTo(57.270638f, 134.11623f, 57.270638f, 116.39377f, 68.2f, 105.46f),
                    PathNode.LineTo(124.0f, 49.66f),
                    PathNode.LineTo(206.34f, 132.0f),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
