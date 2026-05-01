package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorFillIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(158.32f, 45.36f),
                    PathNode.LineTo(167.73f, 10.06f),
                    PathNode.CurveTo(168.44629f, 7.369646f, 167.71237f, 4.500379f, 165.79227f, 2.484373f),
                    PathNode.CurveTo(163.87216f, 0.468367f, 161.04205f, -0.404414f, 158.32f, 0.18f),
                    PathNode.CurveTo(137.5303f, 5.282214f, 117.717606f, 13.757928f, 99.67f, 25.27f),
                    PathNode.CurveTo(60.63f, 50.37f, 40.0f, 85.89f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.020317f, 164.90858f, 63.042416f, 197.89313f, 97.68f, 210.64f),
                    PathNode.LineTo(88.27f, 245.94f),
                    PathNode.CurveTo(87.55371f, 248.63036f, 88.287636f, 251.49962f, 90.20773f, 253.51562f),
                    PathNode.CurveTo(92.12783f, 255.53163f, 94.957954f, 256.40442f, 97.68f, 255.82f),
                    PathNode.CurveTo(118.469696f, 250.71779f, 138.2824f, 242.24207f, 156.33f, 230.73f),
                    PathNode.CurveTo(195.37f, 205.63f, 216.0f, 170.11f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.9826f, 91.09048f, 192.95946f, 58.104465f, 158.32f, 45.36f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
