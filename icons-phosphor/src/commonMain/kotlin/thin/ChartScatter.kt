package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorThinIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 45.79086f, 29.790861f, 44.0f, 32.0f, 44.0f),
                    PathNode.CurveTo(34.20914f, 44.0f, 36.0f, 45.79086f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 156.0f),
                    PathNode.CurveTo(136.41827f, 156.0f, 140.0f, 152.41827f, 140.0f, 148.0f),
                    PathNode.CurveTo(140.0f, 143.58173f, 136.41827f, 140.0f, 132.0f, 140.0f),
                    PathNode.CurveTo(127.58172f, 140.0f, 124.0f, 143.58173f, 124.0f, 148.0f),
                    PathNode.CurveTo(124.0f, 152.41827f, 127.58172f, 156.0f, 132.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 100.0f),
                    PathNode.CurveTo(112.41828f, 100.0f, 116.0f, 96.41828f, 116.0f, 92.0f),
                    PathNode.CurveTo(116.0f, 87.58172f, 112.41828f, 84.0f, 108.0f, 84.0f),
                    PathNode.CurveTo(103.58172f, 84.0f, 100.0f, 87.58172f, 100.0f, 92.0f),
                    PathNode.CurveTo(100.0f, 96.41828f, 103.58172f, 100.0f, 108.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 172.0f),
                    PathNode.CurveTo(80.41828f, 172.0f, 84.0f, 168.41827f, 84.0f, 164.0f),
                    PathNode.CurveTo(84.0f, 159.58173f, 80.41828f, 156.0f, 76.0f, 156.0f),
                    PathNode.CurveTo(71.58172f, 156.0f, 68.0f, 159.58173f, 68.0f, 164.0f),
                    PathNode.CurveTo(68.0f, 168.41827f, 71.58172f, 172.0f, 76.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 124.0f),
                    PathNode.CurveTo(176.41827f, 124.0f, 180.0f, 120.41828f, 180.0f, 116.0f),
                    PathNode.CurveTo(180.0f, 111.58172f, 176.41827f, 108.0f, 172.0f, 108.0f),
                    PathNode.CurveTo(167.58173f, 108.0f, 164.0f, 111.58172f, 164.0f, 116.0f),
                    PathNode.CurveTo(164.0f, 120.41828f, 167.58173f, 124.0f, 172.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 84.0f),
                    PathNode.CurveTo(200.41827f, 84.0f, 204.0f, 80.41828f, 204.0f, 76.0f),
                    PathNode.CurveTo(204.0f, 71.58172f, 200.41827f, 68.0f, 196.0f, 68.0f),
                    PathNode.CurveTo(191.58173f, 68.0f, 188.0f, 71.58172f, 188.0f, 76.0f),
                    PathNode.CurveTo(188.0f, 80.41828f, 191.58173f, 84.0f, 196.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 172.0f),
                    PathNode.CurveTo(192.41827f, 172.0f, 196.0f, 168.41827f, 196.0f, 164.0f),
                    PathNode.CurveTo(196.0f, 159.58173f, 192.41827f, 156.0f, 188.0f, 156.0f),
                    PathNode.CurveTo(183.58173f, 156.0f, 180.0f, 159.58173f, 180.0f, 164.0f),
                    PathNode.CurveTo(180.0f, 168.41827f, 183.58173f, 172.0f, 188.0f, 172.0f),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
