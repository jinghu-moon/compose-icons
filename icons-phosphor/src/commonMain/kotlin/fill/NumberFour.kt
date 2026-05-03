package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorFillIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.65f, 144.0f),
                    PathNode.LineTo(144.0f, 94.81f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 147.58173f, 180.41827f, 144.0f, 176.0f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(160.00266f, 68.60045f, 157.85652f, 65.570496f, 154.6487f, 64.44495f),
                    PathNode.CurveTo(151.44089f, 63.319393f, 147.87206f, 64.3441f, 145.75f, 67.0f),
                    PathNode.LineTo(81.75f, 147.0f),
                    PathNode.CurveTo(79.82706f, 149.40175f, 79.45186f, 152.69347f, 80.78498f, 155.46635f),
                    PathNode.CurveTo(82.118095f, 158.23924f, 84.923294f, 160.00192f, 88.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 188.41827f, 147.58173f, 192.0f, 152.0f, 192.0f),
                    PathNode.CurveTo(156.41827f, 192.0f, 160.0f, 188.41827f, 160.0f, 184.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 156.41827f, 184.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
