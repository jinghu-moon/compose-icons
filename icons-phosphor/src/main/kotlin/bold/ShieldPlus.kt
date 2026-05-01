package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorBoldIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 121.37258f, 89.37258f, 116.0f, 96.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(116.0f, 96.0f),
                    PathNode.CurveTo(116.0f, 89.37258f, 121.37258f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(134.62741f, 84.0f, 140.0f, 89.37258f, 140.0f, 96.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(160.0f, 116.0f),
                    PathNode.CurveTo(166.62741f, 116.0f, 172.0f, 121.37258f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 134.62741f, 166.62741f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(140.0f, 160.0f),
                    PathNode.CurveTo(140.0f, 166.62741f, 134.62741f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(121.37258f, 172.0f, 116.0f, 166.62741f, 116.0f, 160.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(89.37258f, 140.0f, 84.0f, 134.62741f, 84.0f, 128.0f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
