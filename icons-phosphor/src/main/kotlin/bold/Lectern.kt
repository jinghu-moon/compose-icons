package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorBoldIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.87f, 119.06f),
                    PathNode.LineTo(209.87f, 39.06f),
                    PathNode.CurveTo(206.50624f, 32.270496f, 199.57707f, 27.981934f, 192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(56.42293f, 27.981934f, 49.493763f, 32.270496f, 46.13f, 39.06f),
                    PathNode.LineTo(6.13f, 119.06f),
                    PathNode.CurveTo(3.033616f, 125.25646f, 3.364068f, 132.61394f, 7.003477f, 138.50786f),
                    PathNode.CurveTo(10.642886f, 144.4018f, 17.072977f, 147.99284f, 24.0f, 148.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(89.37258f, 204.0f, 84.0f, 209.37259f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 222.62741f, 89.37258f, 228.0f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(166.62741f, 228.0f, 172.0f, 222.62741f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 209.37259f, 166.62741f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(232.0f, 148.0f),
                    PathNode.CurveTo(238.93059f, 147.99977f, 245.36703f, 144.4115f, 249.01126f, 138.51636f),
                    PathNode.CurveTo(252.65549f, 132.62123f, 252.98799f, 125.25964f, 249.89f, 119.06f),
                    PathNode.Close,
                    PathNode.MoveTo(30.49f, 124.0f),
                    PathNode.LineTo(66.49f, 52.0f),
                    PathNode.LineTo(189.49f, 52.0f),
                    PathNode.LineTo(225.49f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 100.0f),
                    PathNode.CurveTo(192.0f, 106.62742f, 186.62741f, 112.0f, 180.0f, 112.0f),
                    PathNode.LineTo(76.0f, 112.0f),
                    PathNode.CurveTo(69.37258f, 112.0f, 64.0f, 106.62742f, 64.0f, 100.0f),
                    PathNode.CurveTo(64.0f, 93.37258f, 69.37258f, 88.0f, 76.0f, 88.0f),
                    PathNode.LineTo(180.0f, 88.0f),
                    PathNode.CurveTo(186.62741f, 88.0f, 192.0f, 93.37258f, 192.0f, 100.0f),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
