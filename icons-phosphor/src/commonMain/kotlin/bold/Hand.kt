package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorBoldIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 44.0f),
                    PathNode.CurveTo(185.30183f, 43.994728f, 182.61385f, 44.33073f, 180.0f, 45.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.CurveTo(180.01442f, 29.082127f, 169.719f, 16.133326f, 155.18164f, 12.78536f),
                    PathNode.CurveTo(140.64432f, 9.437396f, 125.72215f, 16.578564f, 119.21f, 30.0f),
                    PathNode.CurveTo(109.37971f, 26.323343f, 98.37139f, 27.70086f, 89.750175f, 33.686428f),
                    PathNode.CurveTo(81.12896f, 39.672f, 75.9909f, 49.50465f, 76.0f, 60.0f),
                    PathNode.LineTo(76.0f, 110.83f),
                    PathNode.CurveTo(65.20722f, 98.51765f, 46.861523f, 96.33825f, 33.48452f, 105.77932f),
                    PathNode.CurveTo(20.107521f, 115.2204f, 16.014889f, 133.23608f, 24.0f, 147.53f),
                    PathNode.CurveTo(55.82f, 214.6f, 75.35f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(178.78735f, 243.94489f, 219.94489f, 202.78735f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 76.0f),
                    PathNode.CurveTo(220.0f, 58.32689f, 205.67311f, 44.0f, 188.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 152.0f),
                    PathNode.CurveTo(195.95592f, 189.5371f, 165.5371f, 219.95592f, 128.0f, 220.0f),
                    PathNode.CurveTo(92.17f, 220.0f, 78.29f, 206.0f, 45.52f, 136.86f),
                    PathNode.CurveTo(45.38f, 136.57f, 45.23f, 136.28f, 45.07f, 136.0f),
                    PathNode.CurveTo(43.00076f, 132.18935f, 44.344128f, 127.423874f, 48.098976f, 125.255005f),
                    PathNode.CurveTo(51.853825f, 123.08614f, 56.653015f, 124.303566f, 58.92f, 128.0f),
                    PathNode.LineTo(59.13f, 128.35f),
                    PathNode.LineTo(77.81f, 158.35f),
                    PathNode.CurveTo(80.64104f, 162.90202f, 86.14778f, 165.02423f, 91.30146f, 163.54942f),
                    PathNode.CurveTo(96.45515f, 162.07462f, 100.00559f, 157.36055f, 100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.CurveTo(100.0f, 55.581722f, 103.58172f, 52.0f, 108.0f, 52.0f),
                    PathNode.CurveTo(112.41828f, 52.0f, 116.0f, 55.581722f, 116.0f, 60.0f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 126.62742f, 121.37258f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(134.62741f, 132.0f, 140.0f, 126.62742f, 140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 44.0f),
                    PathNode.CurveTo(140.0f, 39.581722f, 143.58173f, 36.0f, 148.0f, 36.0f),
                    PathNode.CurveTo(152.41827f, 36.0f, 156.0f, 39.581722f, 156.0f, 44.0f),
                    PathNode.LineTo(156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 126.62742f, 161.37259f, 132.0f, 168.0f, 132.0f),
                    PathNode.CurveTo(174.62741f, 132.0f, 180.0f, 126.62742f, 180.0f, 120.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.CurveTo(180.0f, 71.58172f, 183.58173f, 68.0f, 188.0f, 68.0f),
                    PathNode.CurveTo(192.41827f, 68.0f, 196.0f, 71.58172f, 196.0f, 76.0f),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
