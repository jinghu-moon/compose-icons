package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorThinIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(56.53603f, 36.0f, 44.0f, 48.53603f, 44.0f, 64.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 214.62741f, 49.37258f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(86.62742f, 220.0f, 92.0f, 214.62741f, 92.0f, 208.0f),
                    PathNode.LineTo(92.0f, 188.0f),
                    PathNode.LineTo(164.0f, 188.0f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 214.62741f, 169.37259f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(206.62741f, 220.0f, 212.0f, 214.62741f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 48.53603f, 199.46397f, 36.0f, 184.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 180.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.LineTo(204.0f, 116.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 108.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 210.20914f, 82.20914f, 212.0f, 80.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(53.79086f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(84.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 212.0f),
                    PathNode.LineTo(176.0f, 212.0f),
                    PathNode.CurveTo(173.79086f, 212.0f, 172.0f, 210.20914f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 188.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.LineTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 68.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.LineTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 52.954304f, 60.954304f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.CurveTo(195.0457f, 44.0f, 204.0f, 52.954304f, 204.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 152.41827f, 96.41828f, 156.0f, 92.0f, 156.0f),
                    PathNode.CurveTo(87.58172f, 156.0f, 84.0f, 152.41827f, 84.0f, 148.0f),
                    PathNode.CurveTo(84.0f, 143.58173f, 87.58172f, 140.0f, 92.0f, 140.0f),
                    PathNode.CurveTo(96.41828f, 140.0f, 100.0f, 143.58173f, 100.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 148.0f),
                    PathNode.CurveTo(172.0f, 152.41827f, 168.41827f, 156.0f, 164.0f, 156.0f),
                    PathNode.CurveTo(159.58173f, 156.0f, 156.0f, 152.41827f, 156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 143.58173f, 159.58173f, 140.0f, 164.0f, 140.0f),
                    PathNode.CurveTo(168.41827f, 140.0f, 172.0f, 143.58173f, 172.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 80.0f),
                    PathNode.LineTo(244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 106.20914f, 242.20914f, 108.0f, 240.0f, 108.0f),
                    PathNode.CurveTo(237.79086f, 108.0f, 236.0f, 106.20914f, 236.0f, 104.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 77.79086f, 237.79086f, 76.0f, 240.0f, 76.0f),
                    PathNode.CurveTo(242.20914f, 76.0f, 244.0f, 77.79086f, 244.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 104.0f),
                    PathNode.CurveTo(20.0f, 106.20914f, 18.209139f, 108.0f, 16.0f, 108.0f),
                    PathNode.CurveTo(13.790861f, 108.0f, 12.0f, 106.20914f, 12.0f, 104.0f),
                    PathNode.LineTo(12.0f, 80.0f),
                    PathNode.CurveTo(12.0f, 77.79086f, 13.790861f, 76.0f, 16.0f, 76.0f),
                    PathNode.CurveTo(18.209139f, 76.0f, 20.0f, 77.79086f, 20.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bus!!
    }

private var _bus: ImageVector? = null
