package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorRegularIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 204.5f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(200.0f, 236.41827f, 196.41827f, 240.0f, 192.0f, 240.0f),
                    PathNode.CurveTo(187.58173f, 240.0f, 184.0f, 236.41827f, 184.0f, 232.0f),
                    PathNode.LineTo(184.0f, 204.5f),
                    PathNode.CurveTo(184.08003f, 180.23378f, 170.35948f, 158.03195f, 148.62f, 147.25f),
                    PathNode.LineTo(100.22f, 123.06f),
                    PathNode.CurveTo(73.04715f, 109.58292f, 55.898197f, 81.83125f, 56.0f, 51.5f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(56.0f, 19.581722f, 59.581722f, 16.0f, 64.0f, 16.0f),
                    PathNode.CurveTo(68.41828f, 16.0f, 72.0f, 19.581722f, 72.0f, 24.0f),
                    PathNode.LineTo(72.0f, 51.5f),
                    PathNode.CurveTo(71.919975f, 75.76623f, 85.64051f, 97.968056f, 107.38f, 108.75f),
                    PathNode.LineTo(155.78f, 132.94f),
                    PathNode.CurveTo(182.95285f, 146.41707f, 200.1018f, 174.16875f, 200.0f, 204.5f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 200.0f),
                    PathNode.LineTo(72.17f, 200.0f),
                    PathNode.CurveTo(72.554855f, 194.55005f, 73.640465f, 189.17244f, 75.4f, 184.0f),
                    PathNode.LineTo(148.11f, 184.0f),
                    PathNode.CurveTo(152.52827f, 184.0f, 156.11f, 180.41827f, 156.11f, 176.0f),
                    PathNode.CurveTo(156.11f, 171.58173f, 152.52827f, 168.0f, 148.11f, 168.0f),
                    PathNode.LineTo(83.46f, 168.0f),
                    PathNode.CurveTo(87.4745f, 162.1967f, 92.42523f, 157.10066f, 98.11f, 152.92f),
                    PathNode.CurveTo(101.67776f, 150.30493f, 102.450066f, 145.29276f, 99.835f, 141.725f),
                    PathNode.CurveTo(97.21993f, 138.15724f, 92.20776f, 137.38493f, 88.64f, 140.0f),
                    PathNode.CurveTo(68.14676f, 155.10706f, 56.035408f, 179.04033f, 56.0f, 204.5f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(56.0f, 236.41827f, 59.581722f, 240.0f, 64.0f, 240.0f),
                    PathNode.CurveTo(68.41828f, 240.0f, 72.0f, 236.41827f, 72.0f, 232.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 212.41827f, 168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 203.58173f, 164.41827f, 200.0f, 160.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 16.0f),
                    PathNode.CurveTo(187.58173f, 16.0f, 184.0f, 19.581722f, 184.0f, 24.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.CurveTo(91.58172f, 40.0f, 88.0f, 43.581722f, 88.0f, 48.0f),
                    PathNode.CurveTo(88.0f, 52.418278f, 91.58172f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(183.83f, 56.0f),
                    PathNode.CurveTo(183.44514f, 61.449944f, 182.35954f, 66.82757f, 180.6f, 72.0f),
                    PathNode.LineTo(107.89f, 72.0f),
                    PathNode.CurveTo(103.471725f, 72.0f, 99.89f, 75.58172f, 99.89f, 80.0f),
                    PathNode.CurveTo(99.89f, 84.41828f, 103.471725f, 88.0f, 107.89f, 88.0f),
                    PathNode.LineTo(172.54f, 88.0f),
                    PathNode.CurveTo(168.5255f, 93.8033f, 163.57477f, 98.89934f, 157.89f, 103.08f),
                    PathNode.CurveTo(154.32776f, 105.69507f, 153.55994f, 110.70277f, 156.175f, 114.265f),
                    PathNode.CurveTo(158.79007f, 117.82724f, 163.79776f, 118.59507f, 167.36f, 115.98f),
                    PathNode.CurveTo(187.84758f, 100.87713f, 199.95825f, 76.95262f, 200.0f, 51.5f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(200.0f, 19.581722f, 196.41827f, 16.0f, 192.0f, 16.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dna!!
    }

private var _dna: ImageVector? = null
