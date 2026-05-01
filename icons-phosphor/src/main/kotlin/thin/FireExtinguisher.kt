package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorThinIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.15f, 52.17f),
                    PathNode.LineTo(146.81f, 31.07f),
                    PathNode.LineTo(185.81f, 11.58f),
                    PathNode.CurveTo(187.78719f, 10.591411f, 188.5886f, 8.18718f, 187.6f, 6.21f),
                    PathNode.CurveTo(186.6114f, 4.232821f, 184.20718f, 3.43141f, 182.23f, 4.42f),
                    PathNode.LineTo(135.0f, 28.0f),
                    PathNode.CurveTo(93.433395f, 28.584719f, 60.03414f, 62.4293f, 60.0f, 104.0f),
                    PathNode.LineTo(60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 210.20914f, 61.79086f, 212.0f, 64.0f, 212.0f),
                    PathNode.CurveTo(66.20914f, 212.0f, 68.0f, 210.20914f, 68.0f, 208.0f),
                    PathNode.LineTo(68.0f, 172.0f),
                    PathNode.LineTo(92.0f, 172.0f),
                    PathNode.LineTo(92.0f, 232.0f),
                    PathNode.CurveTo(92.0f, 238.62741f, 97.37258f, 244.0f, 104.0f, 244.0f),
                    PathNode.LineTo(168.0f, 244.0f),
                    PathNode.CurveTo(174.62741f, 244.0f, 180.0f, 238.62741f, 180.0f, 232.0f),
                    PathNode.LineTo(180.0f, 104.0f),
                    PathNode.CurveTo(179.96773f, 81.26334f, 162.63995f, 62.285095f, 140.0f, 60.19f),
                    PathNode.LineTo(140.0f, 37.38f),
                    PathNode.LineTo(214.85f, 59.83f),
                    PathNode.CurveTo(215.22241f, 59.945004f, 215.61024f, 60.002335f, 216.0f, 60.0f),
                    PathNode.CurveTo(217.98322f, 59.998154f, 219.66563f, 58.54342f, 219.95381f, 56.58125f),
                    PathNode.CurveTo(220.242f, 54.619083f, 219.04893f, 52.742023f, 217.15f, 52.17f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 164.0f),
                    PathNode.LineTo(68.0f, 104.0f),
                    PathNode.CurveTo(68.04632f, 68.018845f, 96.08348f, 38.286304f, 132.0f, 36.13f),
                    PathNode.LineTo(132.0f, 60.19f),
                    PathNode.CurveTo(109.360054f, 62.285095f, 92.03228f, 81.26334f, 92.0f, 104.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 236.0f),
                    PathNode.LineTo(104.0f, 236.0f),
                    PathNode.CurveTo(101.79086f, 236.0f, 100.0f, 234.20914f, 100.0f, 232.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(172.0f, 232.0f),
                    PathNode.CurveTo(172.0f, 234.20914f, 170.20914f, 236.0f, 168.0f, 236.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 104.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 84.11775f, 116.11775f, 68.0f, 136.0f, 68.0f),
                    PathNode.CurveTo(155.88223f, 68.0f, 172.0f, 84.11775f, 172.0f, 104.0f),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
