package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorThinIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.71f, 134.51f),
                    PathNode.LineTo(203.71f, 54.51f),
                    PathNode.LineTo(203.71f, 54.51f),
                    PathNode.CurveTo(202.97935f, 52.698673f, 201.04742f, 51.679863f, 199.14f, 52.1f),
                    PathNode.LineTo(132.0f, 67.0f),
                    PathNode.LineTo(132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 37.79086f, 130.20914f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(125.79086f, 36.0f, 124.0f, 37.79086f, 124.0f, 40.0f),
                    PathNode.LineTo(124.0f, 68.79f),
                    PathNode.LineTo(55.13f, 84.1f),
                    PathNode.CurveTo(53.844242f, 84.38667f, 52.782066f, 85.288025f, 52.29f, 86.51f),
                    PathNode.LineTo(52.29f, 86.51f),
                    PathNode.LineTo(52.29f, 86.51f),
                    PathNode.LineTo(52.29f, 86.51f),
                    PathNode.LineTo(20.29f, 166.51f),
                    PathNode.CurveTo(20.099115f, 166.9836f, 20.000677f, 167.48938f, 20.0f, 168.0f),
                    PathNode.CurveTo(20.0f, 188.4f, 42.08f, 196.0f, 56.0f, 196.0f),
                    PathNode.CurveTo(69.92f, 196.0f, 92.0f, 188.4f, 92.0f, 168.0f),
                    PathNode.CurveTo(91.99932f, 167.48938f, 91.90089f, 166.9836f, 91.71f, 166.51f),
                    PathNode.LineTo(61.46f, 90.88f),
                    PathNode.LineTo(124.0f, 77.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(104.0f, 212.0f),
                    PathNode.CurveTo(101.79086f, 212.0f, 100.0f, 213.79086f, 100.0f, 216.0f),
                    PathNode.CurveTo(100.0f, 218.20914f, 101.79086f, 220.0f, 104.0f, 220.0f),
                    PathNode.LineTo(152.0f, 220.0f),
                    PathNode.CurveTo(154.20914f, 220.0f, 156.0f, 218.20914f, 156.0f, 216.0f),
                    PathNode.CurveTo(156.0f, 213.79086f, 154.20914f, 212.0f, 152.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 75.21f),
                    PathNode.LineTo(193.47f, 61.55f),
                    PathNode.LineTo(164.29f, 134.55f),
                    PathNode.CurveTo(164.10406f, 135.01111f, 164.0057f, 135.50284f, 164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 156.4f, 186.08f, 164.0f, 200.0f, 164.0f),
                    PathNode.CurveTo(213.92f, 164.0f, 236.0f, 156.4f, 236.0f, 136.0f),
                    PathNode.CurveTo(235.99933f, 135.48938f, 235.90088f, 134.9836f, 235.71f, 134.51f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 188.0f),
                    PathNode.CurveTo(48.85f, 188.0f, 28.63f, 184.44f, 28.0f, 168.73f),
                    PathNode.LineTo(56.0f, 98.73f),
                    PathNode.LineTo(84.0f, 168.73f),
                    PathNode.CurveTo(83.37f, 184.44f, 63.15f, 188.0f, 56.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 156.0f),
                    PathNode.CurveTo(192.85f, 156.0f, 172.63f, 152.44f, 172.0f, 136.73f),
                    PathNode.LineTo(200.0f, 66.73f),
                    PathNode.LineTo(228.0f, 136.73f),
                    PathNode.CurveTo(227.37f, 152.44f, 207.15f, 156.0f, 200.0f, 156.0f),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
