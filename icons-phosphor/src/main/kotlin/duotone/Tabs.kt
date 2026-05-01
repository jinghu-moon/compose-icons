package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorDuotoneIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 168.0f),
                    PathNode.LineTo(8.0f, 168.0f),
                    PathNode.LineTo(30.29f, 93.7f),
                    PathNode.CurveTo(31.310593f, 90.29976f, 34.449955f, 87.97883f, 38.0f, 88.0f),
                    PathNode.LineTo(122.1f, 88.0f),
                    PathNode.CurveTo(125.63157f, 88.00099f, 128.74467f, 90.317535f, 129.76f, 93.7f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.66f, 165.7f),
                    PathNode.LineTo(255.66f, 165.7f),
                    PathNode.LineTo(255.66f, 165.7f),
                    PathNode.CurveTo(255.66447f, 165.67352f, 255.66447f, 165.64648f, 255.66f, 165.62f),
                    PathNode.LineTo(233.37f, 91.4f),
                    PathNode.CurveTo(231.37085f, 84.61305f, 225.12517f, 79.96549f, 218.05f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(203.58173f, 80.0f, 200.0f, 83.58172f, 200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 92.41828f, 203.58173f, 96.0f, 208.0f, 96.0f),
                    PathNode.LineTo(218.05f, 96.0f),
                    PathNode.LineTo(237.25f, 160.0f),
                    PathNode.LineTo(206.0f, 160.0f),
                    PathNode.LineTo(185.37f, 91.4f),
                    PathNode.CurveTo(183.37085f, 84.61305f, 177.12517f, 79.96549f, 170.05f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(155.58173f, 80.0f, 152.0f, 83.58172f, 152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 92.41828f, 155.58173f, 96.0f, 160.0f, 96.0f),
                    PathNode.LineTo(170.05f, 96.0f),
                    PathNode.LineTo(189.25f, 160.0f),
                    PathNode.LineTo(158.0f, 160.0f),
                    PathNode.LineTo(137.37f, 91.4f),
                    PathNode.CurveTo(135.37085f, 84.61305f, 129.12517f, 79.96549f, 122.05f, 80.0f),
                    PathNode.LineTo(38.0f, 80.0f),
                    PathNode.CurveTo(30.906351f, 79.94312f, 24.634272f, 84.59515f, 22.63f, 91.4f),
                    PathNode.LineTo(0.37f, 165.6f),
                    PathNode.LineTo(0.37f, 165.65f),
                    PathNode.LineTo(0.37f, 165.65f),
                    PathNode.CurveTo(0.37f, 165.65f, 0.37f, 165.7f, 0.37f, 165.73f),
                    PathNode.CurveTo(0.139322f, 166.46521f, 0.014733f, 167.22958f, 0f, 168.0f),
                    PathNode.CurveTo(0f, 172.41827f, 3.581722f, 176.0f, 8.0f, 176.0f),
                    PathNode.LineTo(248.0f, 176.0f),
                    PathNode.CurveTo(250.52867f, 175.99928f, 252.90816f, 174.8031f, 254.41714f, 172.77403f),
                    PathNode.CurveTo(255.92615f, 170.74496f, 256.387f, 168.12192f, 255.66f, 165.7f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 96.0f),
                    PathNode.LineTo(122.1f, 96.0f),
                    PathNode.LineTo(141.3f, 160.0f),
                    PathNode.LineTo(18.75f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tabs!!
    }

private var _tabs: ImageVector? = null
