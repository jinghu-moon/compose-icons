package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorBoldIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 120.0f),
                    PathNode.CurveTo(251.96693f, 91.2949f, 228.7051f, 68.033066f, 200.0f, 68.0f),
                    PathNode.LineTo(160.32f, 68.0f),
                    PathNode.CurveTo(156.88f, 67.79f, 107.72f, 64.0f, 60.86f, 24.7f),
                    PathNode.CurveTo(54.90884f, 19.703568f, 46.602333f, 18.606405f, 39.557995f, 21.886332f),
                    PathNode.CurveTo(32.513653f, 25.166258f, 28.00673f, 32.229504f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(27.950851f, 207.78317f, 32.466225f, 214.87317f, 39.54f, 218.12f),
                    PathNode.CurveTo(46.582886f, 221.44473f, 54.91907f, 220.34602f, 60.86f, 215.31f),
                    PathNode.CurveTo(84.84541f, 195.14677f, 113.38124f, 181.12941f, 144.0f, 174.47f),
                    PathNode.LineTo(144.0f, 200.67f),
                    PathNode.CurveTo(143.999f, 207.35558f, 147.33861f, 213.5995f, 152.9f, 217.31f),
                    PathNode.CurveTo(153.34389f, 217.60912f, 153.80838f, 217.87645f, 154.29f, 218.11f),
                    PathNode.LineTo(168.73f, 225.17f),
                    PathNode.CurveTo(174.1417f, 228.40958f, 180.76447f, 228.90657f, 186.59904f, 226.51093f),
                    PathNode.CurveTo(192.43361f, 224.11528f, 196.79626f, 219.10776f, 198.37f, 213.0f),
                    PathNode.LineTo(209.46f, 171.18f),
                    PathNode.CurveTo(234.11458f, 166.59012f, 251.99496f, 145.07819f, 252.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 191.63f),
                    PathNode.LineTo(52.0f, 48.4f),
                    PathNode.CurveTo(88.17f, 76.47f, 124.17f, 86.5f, 144.0f, 90.06f),
                    PathNode.LineTo(144.0f, 150.0f),
                    PathNode.CurveTo(124.17f, 153.52f, 88.17f, 163.55f, 52.0f, 191.63f),
                    PathNode.Close,
                    PathNode.MoveTo(176.39f, 202.2f),
                    PathNode.LineTo(168.0f, 198.1f),
                    PathNode.LineTo(168.0f, 172.0f),
                    PathNode.LineTo(184.4f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 148.0f),
                    PathNode.LineTo(168.0f, 148.0f),
                    PathNode.LineTo(168.0f, 92.0f),
                    PathNode.LineTo(200.0f, 92.0f),
                    PathNode.CurveTo(215.46397f, 92.0f, 228.0f, 104.536026f, 228.0f, 120.0f),
                    PathNode.CurveTo(228.0f, 135.46397f, 215.46397f, 148.0f, 200.0f, 148.0f),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
