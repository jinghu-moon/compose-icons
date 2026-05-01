package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorThinIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 96.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 210.20914f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.CurveTo(213.79086f, 212.0f, 212.0f, 210.20914f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 96.0f),
                    PathNode.CurveTo(211.96143f, 62.878906f, 185.1211f, 36.038574f, 152.0f, 36.0f),
                    PathNode.LineTo(104.0f, 36.0f),
                    PathNode.CurveTo(70.87891f, 36.038574f, 44.038574f, 62.878906f, 44.0f, 96.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 42.20914f, 212.0f, 40.0f, 212.0f),
                    PathNode.CurveTo(37.79086f, 212.0f, 36.0f, 210.20914f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.038586f, 58.460632f, 66.46063f, 28.038584f, 104.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(189.53935f, 28.038584f, 219.96141f, 58.460632f, 220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 96.0f),
                    PathNode.LineTo(180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 179.0457f, 171.0457f, 188.0f, 160.0f, 188.0f),
                    PathNode.LineTo(158.47f, 188.0f),
                    PathNode.LineTo(163.58f, 198.21f),
                    PathNode.CurveTo(164.05544f, 199.15936f, 164.13393f, 200.25879f, 163.79817f, 201.26605f),
                    PathNode.CurveTo(163.46242f, 202.27333f, 162.73994f, 203.10577f, 161.79f, 203.58f),
                    PathNode.CurveTo(161.23259f, 203.85304f, 160.62068f, 203.99663f, 160.0f, 204.0f),
                    PathNode.CurveTo(158.48434f, 204.00108f, 157.09825f, 203.14543f, 156.42f, 201.79f),
                    PathNode.LineTo(149.53f, 188.0f),
                    PathNode.LineTo(106.47f, 188.0f),
                    PathNode.LineTo(99.58f, 201.79f),
                    PathNode.CurveTo(98.90174f, 203.14543f, 97.515656f, 204.00108f, 96.0f, 204.0f),
                    PathNode.CurveTo(95.37931f, 203.99663f, 94.76741f, 203.85304f, 94.21f, 203.58f),
                    PathNode.CurveTo(93.26003f, 203.10577f, 92.53758f, 202.27333f, 92.201836f, 201.26605f),
                    PathNode.CurveTo(91.86607f, 200.25879f, 91.94456f, 199.15936f, 92.42f, 198.21f),
                    PathNode.LineTo(97.53f, 188.0f),
                    PathNode.LineTo(96.0f, 188.0f),
                    PathNode.CurveTo(84.95431f, 188.0f, 76.0f, 179.0457f, 76.0f, 168.0f),
                    PathNode.LineTo(76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 84.95431f, 84.95431f, 76.0f, 96.0f, 76.0f),
                    PathNode.LineTo(160.0f, 76.0f),
                    PathNode.CurveTo(171.0457f, 76.0f, 180.0f, 84.95431f, 180.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 96.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.LineTo(172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 89.37258f, 166.62741f, 84.0f, 160.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(89.37258f, 84.0f, 84.0f, 89.37258f, 84.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 156.0f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 180.0f),
                    PathNode.LineTo(108.0f, 180.0f),
                    PathNode.LineTo(108.0f, 156.0f),
                    PathNode.LineTo(84.0f, 156.0f),
                    PathNode.LineTo(84.0f, 168.0f),
                    PathNode.CurveTo(84.0f, 174.62741f, 89.37258f, 180.0f, 96.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 168.0f),
                    PathNode.LineTo(172.0f, 156.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(148.0f, 180.0f),
                    PathNode.LineTo(160.0f, 180.0f),
                    PathNode.CurveTo(166.62741f, 180.0f, 172.0f, 174.62741f, 172.0f, 168.0f),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
