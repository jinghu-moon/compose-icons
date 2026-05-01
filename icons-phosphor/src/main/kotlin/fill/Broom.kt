package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorFillIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.29f, 216.7f),
                    PathNode.CurveTo(212.86f, 205.69f, 200.0f, 182.12f, 200.0f, 152.0f),
                    PathNode.LineTo(200.0f, 134.69f),
                    PathNode.CurveTo(200.0174f, 128.12917f, 196.01305f, 122.22782f, 189.91f, 119.82f),
                    PathNode.LineTo(161.26f, 108.36f),
                    PathNode.CurveTo(157.17374f, 106.72432f, 155.17636f, 102.09499f, 156.79f, 98.0f),
                    PathNode.LineTo(179.11f, 41.33f),
                    PathNode.CurveTo(184.0f, 28.79f, 178.0f, 14.21f, 165.34f, 9.51f),
                    PathNode.CurveTo(153.08044f, 4.950812f, 139.42769f, 11.04786f, 134.64f, 23.22f),
                    PathNode.LineTo(112.25f, 80.08f),
                    PathNode.CurveTo(111.47048f, 82.06055f, 109.93387f, 83.6488f, 107.98016f, 84.49335f),
                    PathNode.CurveTo(106.02647f, 85.33788f, 103.81676f, 85.36907f, 101.84f, 84.58f),
                    PathNode.LineTo(73.11f, 73.08f),
                    PathNode.CurveTo(67.11146f, 70.651825f, 60.23984f, 72.09889f, 55.73f, 76.74f),
                    PathNode.CurveTo(34.68f, 98.4f, 24.0f, 123.71f, 24.0f, 152.0f),
                    PathNode.CurveTo(23.944986f, 180.90335f, 35.11284f, 208.6993f, 55.15f, 229.53f),
                    PathNode.CurveTo(56.679848f, 231.11916f, 58.794163f, 232.01187f, 61.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(236.23378f, 232.00795f, 239.74069f, 228.71585f, 240.0f, 224.49f),
                    PathNode.CurveTo(240.14513f, 221.18097f, 238.28764f, 218.10884f, 235.29f, 216.7f),
                    PathNode.Close,
                    PathNode.MoveTo(115.11f, 216.0f),
                    PathNode.CurveTo(103.27473f, 204.64458f, 94.868546f, 190.19191f, 90.85f, 174.29f),
                    PathNode.CurveTo(89.844864f, 170.13664f, 85.82179f, 167.44879f, 81.6f, 168.11f),
                    PathNode.CurveTo(79.407776f, 168.50583f, 77.47988f, 169.79779f, 76.28034f, 171.67491f),
                    PathNode.CurveTo(75.080795f, 173.55205f, 74.71826f, 175.84431f, 75.28f, 178.0f),
                    PathNode.CurveTo(78.77374f, 191.77557f, 85.01908f, 204.70166f, 93.64f, 216.0f),
                    PathNode.LineTo(64.44f, 216.0f),
                    PathNode.CurveTo(48.668423f, 198.4174f, 39.962536f, 175.61967f, 40.0f, 152.0f),
                    PathNode.CurveTo(39.901337f, 139.48134f, 42.539543f, 127.09235f, 47.73f, 115.7f),
                    PathNode.LineTo(185.53f, 170.83f),
                    PathNode.CurveTo(188.53f, 188.89f, 196.08f, 204.33f, 207.42f, 216.02f),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
