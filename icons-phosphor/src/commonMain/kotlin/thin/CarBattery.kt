package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorThinIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 138.20914f, 186.20914f, 140.0f, 184.0f, 140.0f),
                    PathNode.LineTo(172.0f, 140.0f),
                    PathNode.LineTo(172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 154.20914f, 170.20914f, 156.0f, 168.0f, 156.0f),
                    PathNode.CurveTo(165.79086f, 156.0f, 164.0f, 154.20914f, 164.0f, 152.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(152.0f, 140.0f),
                    PathNode.CurveTo(149.79086f, 140.0f, 148.0f, 138.20914f, 148.0f, 136.0f),
                    PathNode.CurveTo(148.0f, 133.79086f, 149.79086f, 132.0f, 152.0f, 132.0f),
                    PathNode.LineTo(164.0f, 132.0f),
                    PathNode.LineTo(164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 117.79086f, 165.79086f, 116.0f, 168.0f, 116.0f),
                    PathNode.CurveTo(170.20914f, 116.0f, 172.0f, 117.79086f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(186.20914f, 132.0f, 188.0f, 133.79086f, 188.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 132.0f),
                    PathNode.LineTo(72.0f, 132.0f),
                    PathNode.CurveTo(69.79086f, 132.0f, 68.0f, 133.79086f, 68.0f, 136.0f),
                    PathNode.CurveTo(68.0f, 138.20914f, 69.79086f, 140.0f, 72.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(106.20914f, 140.0f, 108.0f, 138.20914f, 108.0f, 136.0f),
                    PathNode.CurveTo(108.0f, 133.79086f, 106.20914f, 132.0f, 104.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 88.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 190.62741f, 230.62741f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(25.372583f, 196.0f, 20.0f, 190.62741f, 20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 81.37258f, 25.372583f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 49.37258f, 57.37258f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(102.62742f, 44.0f, 108.0f, 49.37258f, 108.0f, 56.0f),
                    PathNode.LineTo(108.0f, 76.0f),
                    PathNode.LineTo(148.0f, 76.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 49.37258f, 153.37259f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(198.62741f, 44.0f, 204.0f, 49.37258f, 204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(230.62741f, 76.0f, 236.0f, 81.37258f, 236.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 76.0f),
                    PathNode.LineTo(196.0f, 76.0f),
                    PathNode.LineTo(196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 53.79086f, 194.20914f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(157.79086f, 52.0f, 156.0f, 53.79086f, 156.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 53.79086f, 98.20914f, 52.0f, 96.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(61.79086f, 52.0f, 60.0f, 53.79086f, 60.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 85.79086f, 226.20914f, 84.0f, 224.0f, 84.0f),
                    PathNode.LineTo(32.0f, 84.0f),
                    PathNode.CurveTo(29.790861f, 84.0f, 28.0f, 85.79086f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 186.20914f, 29.790861f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(226.20914f, 188.0f, 228.0f, 186.20914f, 228.0f, 184.0f),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
