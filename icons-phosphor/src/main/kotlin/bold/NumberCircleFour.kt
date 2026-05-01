package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorBoldIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 140.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.LineTo(156.0f, 80.0f),
                    PathNode.CurveTo(155.99994f, 74.874245f, 152.74416f, 70.31443f, 147.89607f, 68.65024f),
                    PathNode.CurveTo(143.048f, 66.98604f, 137.67813f, 68.58492f, 134.53f, 72.63f),
                    PathNode.LineTo(78.53f, 144.63f),
                    PathNode.CurveTo(75.71478f, 148.24742f, 75.20626f, 153.15262f, 77.21955f, 157.27061f),
                    PathNode.CurveTo(79.23284f, 161.38863f, 83.4162f, 163.99995f, 88.0f, 164.0f),
                    PathNode.LineTo(132.0f, 164.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 182.62741f, 137.37259f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(150.62741f, 188.0f, 156.0f, 182.62741f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(166.62741f, 164.0f, 172.0f, 158.62741f, 172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 145.37259f, 166.62741f, 140.0f, 160.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 140.0f),
                    PathNode.LineTo(112.54f, 140.0f),
                    PathNode.LineTo(132.0f, 115.0f),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
