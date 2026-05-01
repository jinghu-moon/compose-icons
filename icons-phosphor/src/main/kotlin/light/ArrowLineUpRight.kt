package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorLightIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 219.3137f, 219.3137f, 222.0f, 216.0f, 222.0f),
                    PathNode.LineTo(40.0f, 222.0f),
                    PathNode.CurveTo(36.68629f, 222.0f, 34.0f, 219.3137f, 34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 212.6863f, 36.68629f, 210.0f, 40.0f, 210.0f),
                    PathNode.LineTo(216.0f, 210.0f),
                    PathNode.CurveTo(219.3137f, 210.0f, 222.0f, 212.6863f, 222.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 174.0f),
                    PathNode.CurveTo(81.59076f, 173.9986f, 83.11585f, 173.36554f, 84.24f, 172.24f),
                    PathNode.LineTo(186.0f, 70.49f),
                    PathNode.LineTo(186.0f, 152.0f),
                    PathNode.CurveTo(186.0f, 155.3137f, 188.6863f, 158.0f, 192.0f, 158.0f),
                    PathNode.CurveTo(195.3137f, 158.0f, 198.0f, 155.3137f, 198.0f, 152.0f),
                    PathNode.LineTo(198.0f, 56.0f),
                    PathNode.CurveTo(198.0f, 52.68629f, 195.3137f, 50.0f, 192.0f, 50.0f),
                    PathNode.LineTo(96.0f, 50.0f),
                    PathNode.CurveTo(92.686295f, 50.0f, 90.0f, 52.68629f, 90.0f, 56.0f),
                    PathNode.CurveTo(90.0f, 59.31371f, 92.686295f, 62.0f, 96.0f, 62.0f),
                    PathNode.LineTo(177.51f, 62.0f),
                    PathNode.LineTo(75.76f, 163.76f),
                    PathNode.CurveTo(74.046234f, 165.47589f, 73.533936f, 168.05473f, 74.4617f, 170.2954f),
                    PathNode.CurveTo(75.38947f, 172.53604f, 77.57487f, 173.99785f, 80.0f, 174.0f),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
