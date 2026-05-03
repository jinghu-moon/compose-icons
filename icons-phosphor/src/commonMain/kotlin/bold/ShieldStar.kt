package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorBoldIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.86f, 115.54f),
                    PathNode.CurveTo(79.32335f, 109.3877f, 86.30755f, 106.397026f, 92.46f, 108.86f),
                    PathNode.LineTo(116.0f, 118.28f),
                    PathNode.LineTo(116.0f, 96.0f),
                    PathNode.CurveTo(116.0f, 89.37258f, 121.37258f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(134.62741f, 84.0f, 140.0f, 89.37258f, 140.0f, 96.0f),
                    PathNode.LineTo(140.0f, 118.28f),
                    PathNode.LineTo(163.54f, 108.86f),
                    PathNode.CurveTo(169.67763f, 106.458244f, 176.60358f, 109.45607f, 179.05325f, 115.57473f),
                    PathNode.CurveTo(181.50291f, 121.69339f, 178.55933f, 128.64258f, 172.46f, 131.14f),
                    PathNode.LineTo(147.0f, 141.33f),
                    PathNode.LineTo(161.6f, 160.8f),
                    PathNode.CurveTo(165.57645f, 166.10193f, 164.50194f, 173.62355f, 159.2f, 177.6f),
                    PathNode.CurveTo(153.89807f, 181.57645f, 146.37645f, 180.50194f, 142.4f, 175.2f),
                    PathNode.LineTo(128.0f, 156.0f),
                    PathNode.LineTo(113.6f, 175.2f),
                    PathNode.CurveTo(109.62355f, 180.50194f, 102.10194f, 181.57645f, 96.8f, 177.6f),
                    PathNode.CurveTo(91.49807f, 173.62355f, 90.42355f, 166.10193f, 94.4f, 160.8f),
                    PathNode.LineTo(109.0f, 141.33f),
                    PathNode.LineTo(83.54f, 131.14f),
                    PathNode.CurveTo(77.3877f, 128.67665f, 74.397026f, 121.69245f, 76.86f, 115.54f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 166.29f, 201.68f, 199.22f, 179.6f, 217.29f),
                    PathNode.CurveTo(155.89f, 236.68f, 132.16f, 243.29f, 131.16f, 243.58f),
                    PathNode.CurveTo(129.09053f, 244.1399f, 126.90947f, 244.1399f, 124.84f, 243.58f),
                    PathNode.CurveTo(123.84f, 243.3f, 100.11f, 236.68f, 76.4f, 217.29f),
                    PathNode.CurveTo(54.32f, 199.22f, 28.0f, 166.29f, 28.0f, 112.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 44.954304f, 36.954304f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(219.0457f, 36.0f, 228.0f, 44.954304f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 60.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 147.71f, 65.09f, 176.69f, 90.91f, 198.15f),
                    PathNode.CurveTo(101.97583f, 207.28476f, 114.51915f, 214.46443f, 128.0f, 219.38f),
                    PathNode.CurveTo(141.47969f, 214.46194f, 154.02261f, 207.28249f, 165.09f, 198.15f),
                    PathNode.CurveTo(190.91f, 176.69f, 204.0f, 147.71f, 204.0f, 112.0f),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
