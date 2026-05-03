package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = phosphorThinIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 60.0f),
                    PathNode.LineTo(80.0f, 60.0f),
                    PathNode.CurveTo(77.79086f, 60.0f, 76.0f, 61.79086f, 76.0f, 64.0f),
                    PathNode.LineTo(76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 114.20914f, 77.79086f, 116.0f, 80.0f, 116.0f),
                    PathNode.LineTo(176.0f, 116.0f),
                    PathNode.CurveTo(178.20914f, 116.0f, 180.0f, 114.20914f, 180.0f, 112.0f),
                    PathNode.LineTo(180.0f, 64.0f),
                    PathNode.CurveTo(180.0f, 61.79086f, 178.20914f, 60.0f, 176.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 108.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(202.20914f, 36.0f, 204.0f, 37.79086f, 204.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 148.0f),
                    PathNode.CurveTo(96.0f, 152.41827f, 92.41828f, 156.0f, 88.0f, 156.0f),
                    PathNode.CurveTo(83.58172f, 156.0f, 80.0f, 152.41827f, 80.0f, 148.0f),
                    PathNode.CurveTo(80.0f, 143.58173f, 83.58172f, 140.0f, 88.0f, 140.0f),
                    PathNode.CurveTo(92.41828f, 140.0f, 96.0f, 143.58173f, 96.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 148.0f),
                    PathNode.CurveTo(136.0f, 152.41827f, 132.41827f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(123.58172f, 156.0f, 120.0f, 152.41827f, 120.0f, 148.0f),
                    PathNode.CurveTo(120.0f, 143.58173f, 123.58172f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(132.41827f, 140.0f, 136.0f, 143.58173f, 136.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 152.41827f, 172.41827f, 156.0f, 168.0f, 156.0f),
                    PathNode.CurveTo(163.58173f, 156.0f, 160.0f, 152.41827f, 160.0f, 148.0f),
                    PathNode.CurveTo(160.0f, 143.58173f, 163.58173f, 140.0f, 168.0f, 140.0f),
                    PathNode.CurveTo(172.41827f, 140.0f, 176.0f, 143.58173f, 176.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 188.0f),
                    PathNode.CurveTo(96.0f, 192.41827f, 92.41828f, 196.0f, 88.0f, 196.0f),
                    PathNode.CurveTo(83.58172f, 196.0f, 80.0f, 192.41827f, 80.0f, 188.0f),
                    PathNode.CurveTo(80.0f, 183.58173f, 83.58172f, 180.0f, 88.0f, 180.0f),
                    PathNode.CurveTo(92.41828f, 180.0f, 96.0f, 183.58173f, 96.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 188.0f),
                    PathNode.CurveTo(136.0f, 192.41827f, 132.41827f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(123.58172f, 196.0f, 120.0f, 192.41827f, 120.0f, 188.0f),
                    PathNode.CurveTo(120.0f, 183.58173f, 123.58172f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(132.41827f, 180.0f, 136.0f, 183.58173f, 136.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 188.0f),
                    PathNode.CurveTo(176.0f, 192.41827f, 172.41827f, 196.0f, 168.0f, 196.0f),
                    PathNode.CurveTo(163.58173f, 196.0f, 160.0f, 192.41827f, 160.0f, 188.0f),
                    PathNode.CurveTo(160.0f, 183.58173f, 163.58173f, 180.0f, 168.0f, 180.0f),
                    PathNode.CurveTo(172.41827f, 180.0f, 176.0f, 183.58173f, 176.0f, 188.0f),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
