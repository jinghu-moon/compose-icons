package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorThinIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 124.0f),
                    PathNode.CurveTo(243.97314f, 103.01569f, 231.3598f, 84.095665f, 212.0f, 76.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.CurveTo(211.98576f, 51.319977f, 197.57211f, 33.44072f, 177.36604f, 29.038683f),
                    PathNode.CurveTo(157.15996f, 24.636642f, 136.61525f, 34.89997f, 128.0f, 53.7f),
                    PathNode.CurveTo(119.38476f, 34.89997f, 98.84004f, 24.636642f, 78.633965f, 29.038683f),
                    PathNode.CurveTo(58.427883f, 33.44072f, 44.014233f, 51.319977f, 44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.CurveTo(24.622358f, 84.07402f, 12.0f, 103.00755f, 12.0f, 124.0f),
                    PathNode.CurveTo(12.0f, 144.99245f, 24.622358f, 163.92598f, 44.0f, 172.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.014233f, 196.68002f, 58.427883f, 214.55928f, 78.633965f, 218.96132f),
                    PathNode.CurveTo(98.84004f, 223.36336f, 119.38476f, 213.10004f, 128.0f, 194.3f),
                    PathNode.CurveTo(136.61525f, 213.10004f, 157.15996f, 223.36336f, 177.36604f, 218.96132f),
                    PathNode.CurveTo(197.57211f, 214.55928f, 211.98576f, 196.68002f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.CurveTo(231.36514f, 163.91081f, 243.9812f, 144.98674f, 244.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 212.0f),
                    PathNode.CurveTo(68.11775f, 212.0f, 52.0f, 195.88223f, 52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 174.59f),
                    PathNode.CurveTo(55.931828f, 175.52353f, 59.958866f, 175.9967f, 64.0f, 176.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.CurveTo(74.20914f, 176.0f, 76.0f, 174.20914f, 76.0f, 172.0f),
                    PathNode.CurveTo(76.0f, 169.79086f, 74.20914f, 168.0f, 72.0f, 168.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(42.551662f, 168.02432f, 24.210901f, 152.58022f, 20.583818f, 131.44077f),
                    PathNode.CurveTo(16.956736f, 110.30133f, 29.100292f, 89.626755f, 49.33f, 82.5f),
                    PathNode.CurveTo(50.929073f, 81.93623f, 51.998978f, 80.425545f, 52.0f, 78.73f),
                    PathNode.LineTo(52.0f, 72.0f),
                    PathNode.CurveTo(52.0f, 52.11775f, 68.11775f, 36.0f, 88.0f, 36.0f),
                    PathNode.CurveTo(107.88225f, 36.0f, 124.0f, 52.11775f, 124.0f, 72.0f),
                    PathNode.LineTo(124.0f, 150.75f),
                    PathNode.CurveTo(115.77181f, 139.00769f, 102.338234f, 132.01103f, 88.0f, 132.0f),
                    PathNode.CurveTo(85.79086f, 132.0f, 84.0f, 133.79086f, 84.0f, 136.0f),
                    PathNode.CurveTo(84.0f, 138.20914f, 85.79086f, 140.0f, 88.0f, 140.0f),
                    PathNode.CurveTo(107.88225f, 140.0f, 124.0f, 156.11777f, 124.0f, 176.0f),
                    PathNode.CurveTo(124.0f, 195.88223f, 107.88225f, 212.0f, 88.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(181.79086f, 168.0f, 180.0f, 169.79086f, 180.0f, 172.0f),
                    PathNode.CurveTo(180.0f, 174.20914f, 181.79086f, 176.0f, 184.0f, 176.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(196.04114f, 175.9967f, 200.06818f, 175.52353f, 204.0f, 174.59f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 195.88223f, 187.88223f, 212.0f, 168.0f, 212.0f),
                    PathNode.CurveTo(148.11777f, 212.0f, 132.0f, 195.88223f, 132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 156.11777f, 148.11777f, 140.0f, 168.0f, 140.0f),
                    PathNode.CurveTo(170.20914f, 140.0f, 172.0f, 138.20914f, 172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 133.79086f, 170.20914f, 132.0f, 168.0f, 132.0f),
                    PathNode.CurveTo(153.66176f, 132.01103f, 140.2282f, 139.00769f, 132.0f, 150.75f),
                    PathNode.LineTo(132.0f, 72.0f),
                    PathNode.CurveTo(132.0f, 52.11775f, 148.11777f, 36.0f, 168.0f, 36.0f),
                    PathNode.CurveTo(187.88223f, 36.0f, 204.0f, 52.11775f, 204.0f, 72.0f),
                    PathNode.LineTo(204.0f, 78.73f),
                    PathNode.CurveTo(204.00102f, 80.425545f, 205.07092f, 81.93623f, 206.67f, 82.5f),
                    PathNode.CurveTo(226.89969f, 89.626755f, 239.04326f, 110.30133f, 235.41618f, 131.44077f),
                    PathNode.CurveTo(231.7891f, 152.58022f, 213.44833f, 168.02432f, 192.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 114.20914f, 202.20914f, 116.0f, 200.0f, 116.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.CurveTo(178.32689f, 116.0f, 164.0f, 101.67311f, 164.0f, 84.0f),
                    PathNode.LineTo(164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 77.79086f, 165.79086f, 76.0f, 168.0f, 76.0f),
                    PathNode.CurveTo(170.20914f, 76.0f, 172.0f, 77.79086f, 172.0f, 80.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.CurveTo(172.0f, 97.25484f, 182.74516f, 108.0f, 196.0f, 108.0f),
                    PathNode.LineTo(200.0f, 108.0f),
                    PathNode.CurveTo(202.20914f, 108.0f, 204.0f, 109.79086f, 204.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 84.0f),
                    PathNode.CurveTo(92.0f, 101.67311f, 77.67311f, 116.0f, 60.0f, 116.0f),
                    PathNode.LineTo(56.0f, 116.0f),
                    PathNode.CurveTo(53.79086f, 116.0f, 52.0f, 114.20914f, 52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 109.79086f, 53.79086f, 108.0f, 56.0f, 108.0f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.CurveTo(73.25484f, 108.0f, 84.0f, 97.25484f, 84.0f, 84.0f),
                    PathNode.LineTo(84.0f, 80.0f),
                    PathNode.CurveTo(84.0f, 77.79086f, 85.79086f, 76.0f, 88.0f, 76.0f),
                    PathNode.CurveTo(90.20914f, 76.0f, 92.0f, 77.79086f, 92.0f, 80.0f),
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
        return _brain!!
    }

private var _brain: ImageVector? = null
