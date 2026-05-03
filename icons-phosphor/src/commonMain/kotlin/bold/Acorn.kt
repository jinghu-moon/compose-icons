package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorBoldIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 104.0f),
                    PathNode.CurveTo(235.96143f, 70.87891f, 209.1211f, 44.038574f, 176.0f, 44.0f),
                    PathNode.LineTo(140.4f, 44.0f),
                    PathNode.CurveTo(142.30107f, 34.686676f, 150.49463f, 27.99806f, 160.0f, 28.0f),
                    PathNode.CurveTo(166.62741f, 28.0f, 172.0f, 22.627417f, 172.0f, 16.0f),
                    PathNode.CurveTo(172.0f, 9.372583f, 166.62741f, 4.0f, 160.0f, 4.0f),
                    PathNode.CurveTo(137.26335f, 4.032277f, 118.285095f, 21.360054f, 116.19f, 44.0f),
                    PathNode.LineTo(80.0f, 44.0f),
                    PathNode.CurveTo(46.878906f, 44.038574f, 20.038574f, 70.87891f, 20.0f, 104.0f),
                    PathNode.CurveTo(20.0f, 110.29514f, 22.963882f, 116.222916f, 28.0f, 120.0f),
                    PathNode.LineTo(28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 165.45f, 62.0f, 192.71f, 89.23f, 214.61f),
                    PathNode.CurveTo(99.45f, 222.81f, 114.86f, 235.19f, 116.0f, 240.17f),
                    PathNode.CurveTo(116.0f, 246.79742f, 121.37258f, 252.17f, 128.0f, 252.17f),
                    PathNode.CurveTo(134.62741f, 252.17f, 140.0f, 246.79742f, 140.0f, 240.17f),
                    PathNode.CurveTo(141.14f, 235.17f, 156.55f, 222.81f, 166.77f, 214.61f),
                    PathNode.CurveTo(194.05f, 192.71f, 228.0f, 165.45f, 228.0f, 128.0f),
                    PathNode.LineTo(228.0f, 120.0f),
                    PathNode.CurveTo(233.03612f, 116.222916f, 236.0f, 110.29514f, 236.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(194.32506f, 68.02578f, 209.7168f, 81.79144f, 211.78f, 100.0f),
                    PathNode.LineTo(44.22f, 100.0f),
                    PathNode.CurveTo(46.283203f, 81.79144f, 61.67494f, 68.02578f, 80.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.74f, 195.9f),
                    PathNode.CurveTo(142.57f, 203.26f, 134.28f, 209.9f, 128.0f, 216.45f),
                    PathNode.CurveTo(121.72f, 209.92f, 113.43f, 203.26f, 104.26f, 195.9f),
                    PathNode.CurveTo(81.0f, 177.2f, 52.0f, 153.94f, 52.0f, 128.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.LineTo(204.0f, 124.0f),
                    PathNode.LineTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 153.94f, 175.0f, 177.2f, 151.74f, 195.9f),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
