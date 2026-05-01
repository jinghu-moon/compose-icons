package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorRegularIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(168.00266f, 44.60045f, 165.85652f, 41.57049f, 162.6487f, 40.444942f),
                    PathNode.CurveTo(159.44089f, 39.319393f, 155.87206f, 40.344097f, 153.75f, 43.0f),
                    PathNode.LineTo(57.75f, 163.0f),
                    PathNode.CurveTo(55.827057f, 165.40175f, 55.451855f, 168.69347f, 56.784977f, 171.46635f),
                    PathNode.CurveTo(58.1181f, 174.23924f, 60.92329f, 176.00192f, 64.0f, 176.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(152.0f, 212.41827f, 155.58173f, 216.0f, 160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 212.41827f, 168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(188.41827f, 176.0f, 192.0f, 172.41827f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 163.58173f, 188.41827f, 160.0f, 184.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 160.0f),
                    PathNode.LineTo(80.64f, 160.0f),
                    PathNode.LineTo(152.0f, 70.81f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
