package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorBoldIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.15f, 70.54f),
                    PathNode.LineTo(185.46f, 25.86f),
                    PathNode.CurveTo(177.65001f, 18.05236f, 164.98999f, 18.05236f, 157.18f, 25.86f),
                    PathNode.LineTo(33.86f, 149.17f),
                    PathNode.CurveTo(30.095879f, 152.91106f, 27.98563f, 158.00302f, 28.0f, 163.31f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(92.69f, 228.0f),
                    PathNode.CurveTo(97.99719f, 228.01549f, 103.08957f, 225.90506f, 106.83f, 222.14f),
                    PathNode.LineTo(186.29f, 142.69f),
                    PathNode.LineTo(190.45f, 156.58f),
                    PathNode.LineTo(155.52f, 191.51f),
                    PathNode.CurveTo(150.82558f, 196.20442f, 150.82558f, 203.81558f, 155.52f, 208.51f),
                    PathNode.CurveTo(160.21442f, 213.20442f, 167.82558f, 213.20442f, 172.52f, 208.51f),
                    PathNode.LineTo(212.52f, 168.51f),
                    PathNode.CurveTo(215.64095f, 165.38527f, 216.79333f, 160.79881f, 215.52f, 156.57f),
                    PathNode.LineTo(205.58f, 123.44f),
                    PathNode.LineTo(230.17f, 98.85f),
                    PathNode.CurveTo(233.92595f, 95.09557f, 236.0345f, 90.00149f, 236.03075f, 84.69085f),
                    PathNode.CurveTo(236.027f, 79.38022f, 233.91125f, 74.28911f, 230.15f, 70.54f),
                    PathNode.Close,
                    PathNode.MoveTo(65.0f, 152.0f),
                    PathNode.LineTo(136.0f, 81.0f),
                    PathNode.LineTo(175.0f, 120.0f),
                    PathNode.LineTo(104.0f, 191.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 173.0f),
                    PathNode.LineTo(83.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 103.0f),
                    PathNode.LineTo(153.0f, 64.0f),
                    PathNode.LineTo(171.34f, 45.66f),
                    PathNode.LineTo(210.34f, 84.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pen!!
    }

private var _pen: ImageVector? = null
