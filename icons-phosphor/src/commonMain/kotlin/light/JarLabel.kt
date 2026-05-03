package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.JarLabel: ImageVector
    get() {
        if (_jarLabel != null) return _jarLabel!!
        _jarLabel = phosphorLightIcon(
            name = "JarLabel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 50.48f),
                    PathNode.LineTo(182.0f, 32.0f),
                    PathNode.CurveTo(182.0f, 24.268015f, 175.73198f, 18.0f, 168.0f, 18.0f),
                    PathNode.LineTo(88.0f, 18.0f),
                    PathNode.CurveTo(80.26801f, 18.0f, 74.0f, 24.268015f, 74.0f, 32.0f),
                    PathNode.LineTo(74.0f, 50.48f),
                    PathNode.CurveTo(55.575714f, 53.44722f, 42.022533f, 69.338326f, 42.0f, 88.0f),
                    PathNode.LineTo(42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 220.98682f, 59.01318f, 238.0f, 80.0f, 238.0f),
                    PathNode.LineTo(176.0f, 238.0f),
                    PathNode.CurveTo(196.98682f, 238.0f, 214.0f, 220.98682f, 214.0f, 200.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(213.97746f, 69.338326f, 200.42429f, 53.44722f, 182.0f, 50.48f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 110.0f),
                    PathNode.LineTo(202.0f, 110.0f),
                    PathNode.LineTo(202.0f, 178.0f),
                    PathNode.LineTo(54.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 32.0f),
                    PathNode.LineTo(170.0f, 50.0f),
                    PathNode.LineTo(150.0f, 50.0f),
                    PathNode.LineTo(150.0f, 30.0f),
                    PathNode.LineTo(168.0f, 30.0f),
                    PathNode.CurveTo(169.10457f, 30.0f, 170.0f, 30.89543f, 170.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 50.0f),
                    PathNode.LineTo(118.0f, 30.0f),
                    PathNode.LineTo(138.0f, 30.0f),
                    PathNode.LineTo(138.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 30.0f),
                    PathNode.LineTo(106.0f, 30.0f),
                    PathNode.LineTo(106.0f, 50.0f),
                    PathNode.LineTo(86.0f, 50.0f),
                    PathNode.LineTo(86.0f, 32.0f),
                    PathNode.CurveTo(86.0f, 30.89543f, 86.89543f, 30.0f, 88.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 62.0f),
                    PathNode.LineTo(176.0f, 62.0f),
                    PathNode.CurveTo(190.3594f, 62.0f, 202.0f, 73.640594f, 202.0f, 88.0f),
                    PathNode.LineTo(202.0f, 98.0f),
                    PathNode.LineTo(54.0f, 98.0f),
                    PathNode.LineTo(54.0f, 88.0f),
                    PathNode.CurveTo(54.0f, 73.640594f, 65.640594f, 62.0f, 80.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 226.0f),
                    PathNode.LineTo(80.0f, 226.0f),
                    PathNode.CurveTo(65.640594f, 226.0f, 54.0f, 214.3594f, 54.0f, 200.0f),
                    PathNode.LineTo(54.0f, 190.0f),
                    PathNode.LineTo(202.0f, 190.0f),
                    PathNode.LineTo(202.0f, 200.0f),
                    PathNode.CurveTo(202.0f, 214.3594f, 190.3594f, 226.0f, 176.0f, 226.0f),
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
        return _jarLabel!!
    }

private var _jarLabel: ImageVector? = null
