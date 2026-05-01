package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorFillIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 128.51f, 232.0f, 129.0f, 232.0f, 129.52f),
                    PathNode.CurveTo(231.66f, 143.78f, 226.37f, 160.0f, 204.0f, 160.0f),
                    PathNode.CurveTo(180.86f, 160.0f, 176.0f, 142.6f, 176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(176.00487f, 85.783165f, 175.08966f, 83.6637f, 173.47269f, 82.147194f),
                    PathNode.CurveTo(171.85571f, 80.63069f, 169.68199f, 79.85313f, 167.47f, 80.0f),
                    PathNode.CurveTo(163.19453f, 80.36713f, 159.93175f, 83.97935f, 160.0f, 88.27f),
                    PathNode.LineTo(160.0f, 92.27f),
                    PathNode.CurveTo(145.2165f, 79.02033f, 123.80189f, 76.238464f, 106.12379f, 85.2712f),
                    PathNode.CurveTo(88.44569f, 94.30393f, 78.15215f, 113.28729f, 80.22668f, 133.03069f),
                    PathNode.CurveTo(82.30119f, 152.7741f, 96.315674f, 169.2033f, 115.48517f, 174.3643f),
                    PathNode.CurveTo(134.65466f, 179.52531f, 155.02336f, 172.3531f, 166.73f, 156.32f),
                    PathNode.CurveTo(167.72975f, 158.06903f, 168.8596f, 159.7404f, 170.11f, 161.32f),
                    PathNode.CurveTo(175.48f, 168.0f, 185.71f, 176.0f, 204.0f, 176.0f),
                    PathNode.CurveTo(207.08897f, 176.01025f, 210.1733f, 175.75937f, 213.22f, 175.25f),
                    PathNode.CurveTo(214.758f, 174.99353f, 216.30486f, 175.65414f, 217.18307f, 176.94254f),
                    PathNode.CurveTo(218.06131f, 178.23088f, 218.11086f, 179.91216f, 217.31f, 181.25f),
                    PathNode.CurveTo(198.17024f, 213.35544f, 163.28058f, 232.72798f, 125.91f, 232.0f),
                    PathNode.CurveTo(71.13f, 230.9f, 26.2f, 186.86f, 24.08f, 132.11f),
                    PathNode.CurveTo(22.604042f, 94.50088f, 41.5635f, 59.02912f, 73.65383f, 39.360992f),
                    PathNode.CurveTo(105.74415f, 19.692863f, 145.95703f, 18.897966f, 178.79955f, 37.282555f),
                    PathNode.CurveTo(211.64207f, 55.66714f, 231.98853f, 90.36193f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 145.67311f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 145.67311f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 110.32689f, 145.67311f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(110.32689f, 96.0f, 96.0f, 110.32689f, 96.0f, 128.0f),
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
        return _at!!
    }

private var _at: ImageVector? = null
