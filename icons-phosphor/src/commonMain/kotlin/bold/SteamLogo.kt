package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorBoldIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.16f, 142.22f),
                    PathNode.CurveTo(189.7458f, 132.35303f, 194.72906f, 116.76651f, 191.01633f, 102.00834f),
                    PathNode.CurveTo(187.30359f, 87.25017f, 175.53807f, 75.877174f, 160.66246f, 72.667145f),
                    PathNode.CurveTo(145.78685f, 69.45712f, 130.37833f, 74.96619f, 120.91f, 86.88f),
                    PathNode.LineTo(92.57f, 123.6f),
                    PathNode.LineTo(55.18f, 86.21f),
                    PathNode.CurveTo(76.96114f, 48.45533f, 124.106186f, 33.788124f, 163.4616f, 52.522724f),
                    PathNode.CurveTo(202.817f, 71.257324f, 221.15799f, 117.09824f, 205.58673f, 157.80905f),
                    PathNode.CurveTo(190.01547f, 198.51985f, 145.76445f, 220.42029f, 103.95206f, 208.10944f),
                    PathNode.CurveTo(62.13966f, 195.79857f, 36.81631f, 153.41333f, 45.79f, 110.76f),
                    PathNode.LineTo(78.55f, 143.52f),
                    PathNode.CurveTo(72.84393f, 157.0209f, 77.03985f, 172.67258f, 88.73408f, 181.50879f),
                    PathNode.CurveTo(100.4283f, 190.345f, 116.63088f, 190.10654f, 128.06f, 180.93f),
                    PathNode.Close,
                    PathNode.MoveTo(117.0f, 131.27f),
                    PathNode.CurveTo(120.66193f, 137.88661f, 126.11338f, 143.33807f, 132.73f, 147.0f),
                    PathNode.LineTo(113.3f, 162.0f),
                    PathNode.LineTo(113.05f, 162.2f),
                    PathNode.CurveTo(111.6386f, 163.3536f, 109.87286f, 163.98575f, 108.05f, 163.99f),
                    PathNode.CurveTo(103.63172f, 163.99f, 100.05f, 160.40828f, 100.05f, 155.99f),
                    PathNode.CurveTo(100.04271f, 154.14998f, 100.675514f, 152.36469f, 101.84f, 150.94f),
                    PathNode.LineTo(102.04f, 150.69f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.CurveTo(143.16344f, 128.0f, 136.0f, 120.836555f, 136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 103.163445f, 143.16344f, 96.0f, 152.0f, 96.0f),
                    PathNode.CurveTo(160.83656f, 96.0f, 168.0f, 103.163445f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 120.836555f, 160.83656f, 128.0f, 152.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
