package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorThinIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.66f, 63.94f),
                    PathNode.CurveTo(234.91309f, 60.835575f, 232.95386f, 58.159653f, 230.22f, 56.51f),
                    PathNode.CurveTo(167.37415f, 18.497738f, 88.62585f, 18.497738f, 25.78f, 56.51f),
                    PathNode.CurveTo(20.134787f, 59.958916f, 18.345585f, 67.32596f, 21.78f, 72.98f),
                    PathNode.LineTo(117.78f, 230.25f),
                    PathNode.CurveTo(119.95318f, 233.84567f, 123.8486f, 236.043f, 128.05f, 236.043f),
                    PathNode.CurveTo(132.25139f, 236.043f, 136.14682f, 233.84567f, 138.32f, 230.25f),
                    PathNode.LineTo(234.25f, 73.0f),
                    PathNode.CurveTo(235.9113f, 70.28957f, 236.41904f, 67.0271f, 235.66f, 63.94f),
                    PathNode.Close,
                    PathNode.MoveTo(58.59f, 118.0f),
                    PathNode.CurveTo(66.43278f, 108.65273f, 79.4256f, 105.46045f, 90.707085f, 110.10896f),
                    PathNode.CurveTo(101.98857f, 114.75748f, 108.96089f, 126.17635f, 107.94203f, 138.3354f),
                    PathNode.CurveTo(106.92318f, 150.49446f, 98.147766f, 160.59377f, 86.25f, 163.3f),
                    PathNode.Close,
                    PathNode.MoveTo(152.59f, 191.41f),
                    PathNode.CurveTo(140.1023f, 183.06766f, 136.41985f, 166.35905f, 144.24376f, 153.54018f),
                    PathNode.CurveTo(152.06767f, 140.7213f, 168.61145f, 136.35764f, 181.74f, 143.65f),
                    PathNode.Close,
                    PathNode.MoveTo(185.92f, 136.8f),
                    PathNode.CurveTo(180.47476f, 133.64703f, 174.2922f, 131.99098f, 168.0f, 132.0f),
                    PathNode.CurveTo(152.04706f, 132.00179f, 137.99783f, 142.50246f, 133.4787f, 157.80194f),
                    PathNode.CurveTo(128.95955f, 173.10141f, 135.04839f, 189.55045f, 148.44f, 198.22f),
                    PathNode.LineTo(131.44f, 226.08f),
                    PathNode.CurveTo(130.71945f, 227.29434f, 129.41203f, 228.03882f, 128.0f, 228.03882f),
                    PathNode.CurveTo(126.58797f, 228.03882f, 125.280556f, 227.29434f, 124.56f, 226.08f),
                    PathNode.LineTo(90.56f, 170.41f),
                    PathNode.CurveTo(104.938065f, 166.00734f, 115.0651f, 153.13194f, 115.95635f, 138.12135f),
                    PathNode.CurveTo(116.8476f, 123.11075f, 108.31531f, 109.127464f, 94.559235f, 103.054344f),
                    PathNode.CurveTo(80.80316f, 96.981224f, 64.721504f, 100.09779f, 54.23f, 110.87f),
                    PathNode.LineTo(43.33f, 93.0f),
                    PathNode.CurveTo(94.8646f, 59.69715f, 161.1354f, 59.69715f, 212.67f, 93.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.4f, 68.8f),
                    PathNode.LineTo(216.85f, 86.14f),
                    PathNode.CurveTo(162.74371f, 51.28646f, 93.25629f, 51.28646f, 39.15f, 86.14f),
                    PathNode.LineTo(28.58f, 68.81f),
                    PathNode.CurveTo(28.027884f, 67.91313f, 27.86197f, 66.83109f, 28.12f, 65.81f),
                    PathNode.CurveTo(28.371834f, 64.77378f, 29.027008f, 63.881016f, 29.94f, 63.33f),
                    PathNode.CurveTo(90.22811f, 26.86425f, 165.77188f, 26.86425f, 226.06f, 63.33f),
                    PathNode.CurveTo(226.97299f, 63.881016f, 227.62816f, 64.77378f, 227.88f, 65.81f),
                    PathNode.CurveTo(228.13803f, 66.83109f, 227.97212f, 67.91313f, 227.42f, 68.81f),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
