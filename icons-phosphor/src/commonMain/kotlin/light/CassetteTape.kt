package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorLightIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 194.0f),
                    PathNode.LineTo(91.0f, 174.0f),
                    PathNode.LineTo(165.0f, 174.0f),
                    PathNode.LineTo(180.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
                    PathNode.LineTo(195.0f, 194.0f),
                    PathNode.LineTo(172.8f, 164.4f),
                    PathNode.CurveTo(171.66687f, 162.88918f, 169.88855f, 162.0f, 168.0f, 162.0f),
                    PathNode.LineTo(88.0f, 162.0f),
                    PathNode.CurveTo(86.11146f, 162.0f, 84.33313f, 162.88918f, 83.2f, 164.4f),
                    PathNode.LineTo(61.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 82.0f),
                    PathNode.LineTo(80.0f, 82.0f),
                    PathNode.CurveTo(63.431458f, 82.0f, 50.0f, 95.43146f, 50.0f, 112.0f),
                    PathNode.CurveTo(50.0f, 128.56854f, 63.431458f, 142.0f, 80.0f, 142.0f),
                    PathNode.LineTo(176.0f, 142.0f),
                    PathNode.CurveTo(192.56854f, 142.0f, 206.0f, 128.56854f, 206.0f, 112.0f),
                    PathNode.CurveTo(206.0f, 95.43146f, 192.56854f, 82.0f, 176.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 94.0f),
                    PathNode.CurveTo(143.97324f, 104.65773f, 143.97324f, 119.34227f, 152.0f, 130.0f),
                    PathNode.LineTo(104.0f, 130.0f),
                    PathNode.CurveTo(112.02676f, 119.34227f, 112.02676f, 104.65773f, 104.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 112.0f),
                    PathNode.CurveTo(62.0f, 102.05888f, 70.05888f, 94.0f, 80.0f, 94.0f),
                    PathNode.CurveTo(89.94112f, 94.0f, 98.0f, 102.05888f, 98.0f, 112.0f),
                    PathNode.CurveTo(98.0f, 121.94112f, 89.94112f, 130.0f, 80.0f, 130.0f),
                    PathNode.CurveTo(70.05888f, 130.0f, 62.0f, 121.94112f, 62.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 130.0f),
                    PathNode.CurveTo(166.05887f, 130.0f, 158.0f, 121.94112f, 158.0f, 112.0f),
                    PathNode.CurveTo(158.0f, 102.05888f, 166.05887f, 94.0f, 176.0f, 94.0f),
                    PathNode.CurveTo(185.94113f, 94.0f, 194.0f, 102.05888f, 194.0f, 112.0f),
                    PathNode.CurveTo(194.0f, 121.94112f, 185.94113f, 130.0f, 176.0f, 130.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
