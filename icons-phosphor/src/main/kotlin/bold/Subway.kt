package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorBoldIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 96.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 214.62741f, 222.62741f, 220.0f, 216.0f, 220.0f),
                    PathNode.CurveTo(209.37259f, 220.0f, 204.0f, 214.62741f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.CurveTo(203.96693f, 67.2949f, 180.7051f, 44.033066f, 152.0f, 44.0f),
                    PathNode.LineTo(104.0f, 44.0f),
                    PathNode.CurveTo(75.2949f, 44.033066f, 52.033066f, 67.2949f, 52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 214.62741f, 46.62742f, 220.0f, 40.0f, 220.0f),
                    PathNode.CurveTo(33.37258f, 220.0f, 28.0f, 214.62741f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.044094f, 54.044636f, 62.044636f, 20.044094f, 104.0f, 20.0f),
                    PathNode.LineTo(152.0f, 20.0f),
                    PathNode.CurveTo(193.95538f, 20.044094f, 227.9559f, 54.044636f, 228.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 96.0f),
                    PathNode.LineTo(188.0f, 168.0f),
                    PathNode.CurveTo(187.9972f, 179.95038f, 180.41017f, 190.58186f, 169.11f, 194.47f),
                    PathNode.LineTo(171.11f, 199.54f),
                    PathNode.CurveTo(173.57297f, 205.69244f, 170.5823f, 212.67665f, 164.43f, 215.14f),
                    PathNode.CurveTo(163.02199f, 215.70755f, 161.5181f, 215.9995f, 160.0f, 216.0f),
                    PathNode.CurveTo(155.09459f, 215.99985f, 150.68318f, 213.01402f, 148.86f, 208.46f),
                    PathNode.LineTo(143.86f, 196.0f),
                    PathNode.LineTo(112.12f, 196.0f),
                    PathNode.LineTo(107.12f, 208.46f),
                    PathNode.CurveTo(105.29954f, 213.00725f, 100.89812f, 215.99167f, 96.0f, 216.0f),
                    PathNode.CurveTo(94.47181f, 216.00336f, 92.957375f, 215.71133f, 91.54f, 215.14f),
                    PathNode.CurveTo(85.3877f, 212.67665f, 82.397026f, 205.69244f, 84.86f, 199.54f),
                    PathNode.LineTo(86.86f, 194.47f),
                    PathNode.CurveTo(75.57167f, 190.57162f, 67.99838f, 179.94254f, 68.0f, 168.0f),
                    PathNode.LineTo(68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 80.536026f, 80.536026f, 68.0f, 96.0f, 68.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(175.46397f, 68.0f, 188.0f, 80.536026f, 188.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.LineTo(92.0f, 132.0f),
                    PathNode.LineTo(164.0f, 132.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 93.79086f, 162.20914f, 92.0f, 160.0f, 92.0f),
                    PathNode.LineTo(96.0f, 92.0f),
                    PathNode.CurveTo(93.79086f, 92.0f, 92.0f, 93.79086f, 92.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 168.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(162.20914f, 172.0f, 164.0f, 170.20914f, 164.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 172.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 170.20914f, 93.79086f, 172.0f, 96.0f, 172.0f),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
