package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorLightIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 96.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 211.3137f, 219.3137f, 214.0f, 216.0f, 214.0f),
                    PathNode.CurveTo(212.6863f, 214.0f, 210.0f, 211.3137f, 210.0f, 208.0f),
                    PathNode.LineTo(210.0f, 96.0f),
                    PathNode.CurveTo(209.96143f, 63.983475f, 184.01653f, 38.03857f, 152.0f, 38.0f),
                    PathNode.LineTo(104.0f, 38.0f),
                    PathNode.CurveTo(71.983475f, 38.03857f, 46.03857f, 63.983475f, 46.0f, 96.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 211.3137f, 43.31371f, 214.0f, 40.0f, 214.0f),
                    PathNode.CurveTo(36.68629f, 214.0f, 34.0f, 211.3137f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 96.0f),
                    PathNode.CurveTo(34.044086f, 57.358345f, 65.358345f, 26.044086f, 104.0f, 26.0f),
                    PathNode.LineTo(152.0f, 26.0f),
                    PathNode.CurveTo(190.64166f, 26.044086f, 221.95592f, 57.358345f, 222.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 96.0f),
                    PathNode.LineTo(182.0f, 168.0f),
                    PathNode.CurveTo(181.99658f, 179.49997f, 173.1368f, 189.05705f, 161.67f, 189.93f),
                    PathNode.LineTo(165.37f, 197.32f),
                    PathNode.CurveTo(166.85013f, 200.28577f, 165.64577f, 203.88988f, 162.68f, 205.37f),
                    PathNode.CurveTo(159.71423f, 206.85013f, 156.11012f, 205.64577f, 154.63f, 202.68f),
                    PathNode.LineTo(148.29f, 190.0f),
                    PathNode.LineTo(107.71f, 190.0f),
                    PathNode.LineTo(101.37f, 202.68f),
                    PathNode.CurveTo(99.88988f, 205.64577f, 96.28577f, 206.85013f, 93.32f, 205.37f),
                    PathNode.CurveTo(90.35423f, 203.88988f, 89.14988f, 200.28577f, 90.63f, 197.32f),
                    PathNode.LineTo(94.33f, 189.93f),
                    PathNode.CurveTo(82.86321f, 189.05705f, 74.00341f, 179.49997f, 74.0f, 168.0f),
                    PathNode.LineTo(74.0f, 96.0f),
                    PathNode.CurveTo(74.0f, 83.84974f, 83.84974f, 74.0f, 96.0f, 74.0f),
                    PathNode.LineTo(160.0f, 74.0f),
                    PathNode.CurveTo(172.15027f, 74.0f, 182.0f, 83.84974f, 182.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 96.0f),
                    PathNode.LineTo(86.0f, 146.0f),
                    PathNode.LineTo(170.0f, 146.0f),
                    PathNode.LineTo(170.0f, 96.0f),
                    PathNode.CurveTo(170.0f, 90.47715f, 165.52284f, 86.0f, 160.0f, 86.0f),
                    PathNode.LineTo(96.0f, 86.0f),
                    PathNode.CurveTo(90.47715f, 86.0f, 86.0f, 90.47715f, 86.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 158.0f),
                    PathNode.LineTo(118.0f, 178.0f),
                    PathNode.LineTo(138.0f, 178.0f),
                    PathNode.LineTo(138.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 178.0f),
                    PathNode.LineTo(106.0f, 178.0f),
                    PathNode.LineTo(106.0f, 158.0f),
                    PathNode.LineTo(86.0f, 158.0f),
                    PathNode.LineTo(86.0f, 168.0f),
                    PathNode.CurveTo(86.0f, 173.52284f, 90.47715f, 178.0f, 96.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 168.0f),
                    PathNode.LineTo(170.0f, 158.0f),
                    PathNode.LineTo(150.0f, 158.0f),
                    PathNode.LineTo(150.0f, 178.0f),
                    PathNode.LineTo(160.0f, 178.0f),
                    PathNode.CurveTo(165.52284f, 178.0f, 170.0f, 173.52284f, 170.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subway!!
    }

private var _subway: ImageVector? = null
