package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorDuotoneIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 156.18f, 184.0f, 184.0f, 152.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 184.0f, 110.37f, 162.93f, 110.37f, 162.93f),
                    PathNode.LineTo(110.37f, 162.93f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.LineTo(141.14f, 32.17f),
                    PathNode.LineTo(141.14f, 32.17f),
                    PathNode.CurveTo(183.23824f, 34.880413f, 215.99751f, 69.8146f, 216.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 134.57f, 216.1f, 155.2f, 201.77f, 170.11f),
                    PathNode.CurveTo(188.39f, 184.0f, 170.25f, 192.0f, 152.0f, 192.0f),
                    PathNode.CurveTo(134.12f, 192.0f, 122.18f, 186.14f, 114.57f, 180.0f),
                    PathNode.LineTo(103.79f, 225.82f),
                    PathNode.CurveTo(102.94437f, 229.43959f, 99.71706f, 231.9999f, 96.0f, 232.0f),
                    PathNode.CurveTo(95.38072f, 231.99936f, 94.7635f, 231.92892f, 94.16f, 231.79f),
                    PathNode.CurveTo(92.08629f, 231.31406f, 90.28759f, 230.03166f, 89.16164f, 228.22638f),
                    PathNode.CurveTo(88.03568f, 226.4211f, 87.67524f, 224.24167f, 88.16f, 222.17f),
                    PathNode.LineTo(120.16f, 86.17f),
                    PathNode.CurveTo(121.170685f, 81.8677f, 125.4777f, 79.19932f, 129.78f, 80.21f),
                    PathNode.CurveTo(134.08229f, 81.22068f, 136.75069f, 85.5277f, 135.74f, 89.83f),
                    PathNode.LineTo(118.84f, 161.63f),
                    PathNode.CurveTo(122.0f, 166.0f, 131.3f, 176.0f, 152.0f, 176.0f),
                    PathNode.CurveTo(179.53f, 176.0f, 208.0f, 152.06f, 208.0f, 112.0f),
                    PathNode.CurveTo(207.98822f, 81.73869f, 189.05551f, 54.714317f, 160.61803f, 44.367462f),
                    PathNode.CurveTo(132.18057f, 34.020607f, 100.3082f, 42.559753f, 80.85267f, 65.73795f),
                    PathNode.CurveTo(61.39714f, 88.91615f, 58.511127f, 121.78614f, 73.63f, 148.0f),
                    PathNode.CurveTo(75.69924f, 151.81065f, 74.35587f, 156.57613f, 70.60102f, 158.745f),
                    PathNode.CurveTo(66.846176f, 160.91385f, 62.046986f, 159.69644f, 59.78f, 156.0f),
                    PathNode.CurveTo(41.29181f, 123.96109f, 44.81336f, 83.7804f, 68.592834f, 55.445953f),
                    PathNode.CurveTo(92.372314f, 27.111502f, 131.33281f, 16.67269f, 166.09329f, 29.322338f),
                    PathNode.CurveTo(200.85378f, 41.97199f, 223.99289f, 75.0094f, 224.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
