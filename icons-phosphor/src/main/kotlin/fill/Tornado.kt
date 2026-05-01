package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorFillIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 228.0f),
                    PathNode.CurveTo(144.0f, 234.62741f, 138.62741f, 240.0f, 132.0f, 240.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(109.37258f, 240.0f, 104.0f, 234.62741f, 104.0f, 228.0f),
                    PathNode.CurveTo(104.0f, 221.37259f, 109.37258f, 216.0f, 116.0f, 216.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(138.62741f, 216.0f, 144.0f, 221.37259f, 144.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 32.0f),
                    PathNode.LineTo(60.0f, 32.0f),
                    PathNode.CurveTo(53.37258f, 32.0f, 48.0f, 37.37258f, 48.0f, 44.0f),
                    PathNode.CurveTo(48.0f, 50.62742f, 53.37258f, 56.0f, 60.0f, 56.0f),
                    PathNode.CurveTo(66.62742f, 56.0f, 72.0f, 61.37258f, 72.0f, 68.0f),
                    PathNode.CurveTo(72.0f, 74.62742f, 66.62742f, 80.0f, 60.0f, 80.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(37.37258f, 80.0f, 32.0f, 85.37258f, 32.0f, 92.0f),
                    PathNode.CurveTo(32.0f, 98.62742f, 37.37258f, 104.0f, 44.0f, 104.0f),
                    PathNode.LineTo(76.0f, 104.0f),
                    PathNode.CurveTo(82.62742f, 104.0f, 88.0f, 109.37258f, 88.0f, 116.0f),
                    PathNode.CurveTo(88.0f, 122.62742f, 82.62742f, 128.0f, 76.0f, 128.0f),
                    PathNode.CurveTo(69.37258f, 128.0f, 64.0f, 133.37259f, 64.0f, 140.0f),
                    PathNode.CurveTo(64.0f, 146.62741f, 69.37258f, 152.0f, 76.0f, 152.0f),
                    PathNode.LineTo(124.0f, 152.0f),
                    PathNode.CurveTo(130.62741f, 152.0f, 136.0f, 157.37259f, 136.0f, 164.0f),
                    PathNode.CurveTo(136.0f, 170.62741f, 130.62741f, 176.0f, 124.0f, 176.0f),
                    PathNode.CurveTo(117.37258f, 176.0f, 112.0f, 181.37259f, 112.0f, 188.0f),
                    PathNode.CurveTo(112.0f, 194.62741f, 117.37258f, 200.0f, 124.0f, 200.0f),
                    PathNode.LineTo(172.0f, 200.0f),
                    PathNode.CurveTo(178.62741f, 200.0f, 184.0f, 194.62741f, 184.0f, 188.0f),
                    PathNode.CurveTo(184.0f, 181.37259f, 178.62741f, 176.0f, 172.0f, 176.0f),
                    PathNode.CurveTo(165.37259f, 176.0f, 160.0f, 170.62741f, 160.0f, 164.0f),
                    PathNode.CurveTo(160.0f, 157.37259f, 165.37259f, 152.0f, 172.0f, 152.0f),
                    PathNode.LineTo(188.0f, 152.0f),
                    PathNode.CurveTo(194.62741f, 152.0f, 200.0f, 146.62741f, 200.0f, 140.0f),
                    PathNode.CurveTo(200.0f, 133.37259f, 194.62741f, 128.0f, 188.0f, 128.0f),
                    PathNode.LineTo(164.0f, 128.0f),
                    PathNode.CurveTo(157.37259f, 128.0f, 152.0f, 122.62742f, 152.0f, 116.0f),
                    PathNode.CurveTo(152.0f, 109.37258f, 157.37259f, 104.0f, 164.0f, 104.0f),
                    PathNode.CurveTo(170.62741f, 104.0f, 176.0f, 98.62742f, 176.0f, 92.0f),
                    PathNode.CurveTo(176.0f, 85.37258f, 170.62741f, 80.0f, 164.0f, 80.0f),
                    PathNode.CurveTo(157.37259f, 80.0f, 152.0f, 74.62742f, 152.0f, 68.0f),
                    PathNode.CurveTo(152.0f, 61.37258f, 157.37259f, 56.0f, 164.0f, 56.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(226.62741f, 56.0f, 232.0f, 50.62742f, 232.0f, 44.0f),
                    PathNode.CurveTo(232.0f, 37.37258f, 226.62741f, 32.0f, 220.0f, 32.0f),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
