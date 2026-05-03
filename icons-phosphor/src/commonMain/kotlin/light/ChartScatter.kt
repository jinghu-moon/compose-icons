package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorLightIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(28.68629f, 214.0f, 26.0f, 211.3137f, 26.0f, 208.0f),
                    PathNode.LineTo(26.0f, 48.0f),
                    PathNode.CurveTo(26.0f, 44.68629f, 28.68629f, 42.0f, 32.0f, 42.0f),
                    PathNode.CurveTo(35.31371f, 42.0f, 38.0f, 44.68629f, 38.0f, 48.0f),
                    PathNode.LineTo(38.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 158.0f),
                    PathNode.CurveTo(137.52284f, 158.0f, 142.0f, 153.52284f, 142.0f, 148.0f),
                    PathNode.CurveTo(142.0f, 142.47716f, 137.52284f, 138.0f, 132.0f, 138.0f),
                    PathNode.CurveTo(126.47715f, 138.0f, 122.0f, 142.47716f, 122.0f, 148.0f),
                    PathNode.CurveTo(122.0f, 153.52284f, 126.47715f, 158.0f, 132.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 102.0f),
                    PathNode.CurveTo(113.52285f, 102.0f, 118.0f, 97.52285f, 118.0f, 92.0f),
                    PathNode.CurveTo(118.0f, 86.47715f, 113.52285f, 82.0f, 108.0f, 82.0f),
                    PathNode.CurveTo(102.47715f, 82.0f, 98.0f, 86.47715f, 98.0f, 92.0f),
                    PathNode.CurveTo(98.0f, 97.52285f, 102.47715f, 102.0f, 108.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 174.0f),
                    PathNode.CurveTo(81.52285f, 174.0f, 86.0f, 169.52284f, 86.0f, 164.0f),
                    PathNode.CurveTo(86.0f, 158.47716f, 81.52285f, 154.0f, 76.0f, 154.0f),
                    PathNode.CurveTo(70.47715f, 154.0f, 66.0f, 158.47716f, 66.0f, 164.0f),
                    PathNode.CurveTo(66.0f, 169.52284f, 70.47715f, 174.0f, 76.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 126.0f),
                    PathNode.CurveTo(177.52284f, 126.0f, 182.0f, 121.52285f, 182.0f, 116.0f),
                    PathNode.CurveTo(182.0f, 110.47715f, 177.52284f, 106.0f, 172.0f, 106.0f),
                    PathNode.CurveTo(166.47716f, 106.0f, 162.0f, 110.47715f, 162.0f, 116.0f),
                    PathNode.CurveTo(162.0f, 121.52285f, 166.47716f, 126.0f, 172.0f, 126.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 86.0f),
                    PathNode.CurveTo(201.52284f, 86.0f, 206.0f, 81.52285f, 206.0f, 76.0f),
                    PathNode.CurveTo(206.0f, 70.47715f, 201.52284f, 66.0f, 196.0f, 66.0f),
                    PathNode.CurveTo(190.47716f, 66.0f, 186.0f, 70.47715f, 186.0f, 76.0f),
                    PathNode.CurveTo(186.0f, 81.52285f, 190.47716f, 86.0f, 196.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 154.0f),
                    PathNode.CurveTo(182.47716f, 154.0f, 178.0f, 158.47716f, 178.0f, 164.0f),
                    PathNode.CurveTo(178.0f, 169.52284f, 182.47716f, 174.0f, 188.0f, 174.0f),
                    PathNode.CurveTo(193.52284f, 174.0f, 198.0f, 169.52284f, 198.0f, 164.0f),
                    PathNode.CurveTo(198.0f, 158.47716f, 193.52284f, 154.0f, 188.0f, 154.0f),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
