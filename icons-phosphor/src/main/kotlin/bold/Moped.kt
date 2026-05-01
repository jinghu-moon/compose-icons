package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorBoldIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 124.0f),
                    PathNode.CurveTo(210.78f, 124.0f, 209.57f, 124.06f, 208.38f, 124.16f),
                    PathNode.LineTo(175.24f, 35.79f),
                    PathNode.CurveTo(173.48425f, 31.103596f, 169.0045f, 27.998856f, 164.0f, 28.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.CurveTo(125.37258f, 28.0f, 120.0f, 33.37258f, 120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 46.62742f, 125.37258f, 52.0f, 132.0f, 52.0f),
                    PathNode.LineTo(155.68f, 52.0f),
                    PathNode.LineTo(185.91f, 132.6f),
                    PathNode.CurveTo(179.21655f, 137.53793f, 174.04926f, 144.2613f, 171.0f, 152.0f),
                    PathNode.LineTo(141.8f, 152.0f),
                    PathNode.LineTo(119.24f, 91.79f),
                    PathNode.CurveTo(117.48425f, 87.1036f, 113.0045f, 83.998856f, 108.0f, 84.0f),
                    PathNode.LineTo(28.0f, 84.0f),
                    PathNode.CurveTo(21.372583f, 84.0f, 16.0f, 89.37258f, 16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 102.62742f, 21.372583f, 108.0f, 28.0f, 108.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.LineTo(32.0f, 110.92f),
                    PathNode.CurveTo(12.33534f, 121.33127f, 0.026037f, 141.74933f, 0f, 164.0f),
                    PathNode.CurveTo(0f, 170.62741f, 5.372583f, 176.0f, 12.0f, 176.0f),
                    PathNode.LineTo(16.74f, 176.0f),
                    PathNode.CurveTo(20.612007f, 196.84488f, 38.798553f, 211.96431f, 60.0f, 211.96431f),
                    PathNode.CurveTo(81.20145f, 211.96431f, 99.38799f, 196.84488f, 103.26f, 176.0f),
                    PathNode.LineTo(168.74f, 176.0f),
                    PathNode.CurveTo(172.9692f, 198.87294f, 194.27078f, 214.50266f, 217.3587f, 211.67328f),
                    PathNode.CurveTo(240.44662f, 208.84389f, 257.34372f, 188.53299f, 255.92465f, 165.31567f),
                    PathNode.CurveTo(254.50558f, 142.09836f, 235.26065f, 123.996506f, 212.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 130.05f),
                    PathNode.CurveTo(52.796734f, 128.3541f, 56.002666f, 123.8177f, 56.0f, 118.73f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.LineTo(99.68f, 108.0f),
                    PathNode.LineTo(116.18f, 152.0f),
                    PathNode.LineTo(26.06f, 152.0f),
                    PathNode.CurveTo(29.682163f, 141.7448f, 37.74644f, 133.67683f, 48.0f, 130.05f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 188.0f),
                    PathNode.CurveTo(52.051296f, 187.99591f, 44.85948f, 183.28511f, 41.68f, 176.0f),
                    PathNode.LineTo(78.32f, 176.0f),
                    PathNode.CurveTo(75.14052f, 183.28511f, 67.94869f, 187.99591f, 60.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 188.0f),
                    PathNode.CurveTo(200.9543f, 188.0f, 192.0f, 179.0457f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 156.9543f, 200.9543f, 148.0f, 212.0f, 148.0f),
                    PathNode.CurveTo(223.0457f, 148.0f, 232.0f, 156.9543f, 232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 179.0457f, 223.0457f, 188.0f, 212.0f, 188.0f),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
