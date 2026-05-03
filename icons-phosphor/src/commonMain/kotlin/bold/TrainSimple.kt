package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) return _trainSimple!!
        _trainSimple = phosphorBoldIcon(
            name = "TrainSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(52.11775f, 20.0f, 36.0f, 36.11775f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 184.0f),
                    PathNode.CurveTo(36.0f, 203.88223f, 52.11775f, 220.0f, 72.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.LineTo(62.4f, 232.8f),
                    PathNode.CurveTo(58.42355f, 238.10193f, 59.498062f, 245.62355f, 64.8f, 249.6f),
                    PathNode.CurveTo(70.10194f, 253.57645f, 77.62355f, 252.50194f, 81.6f, 247.2f),
                    PathNode.LineTo(102.0f, 220.0f),
                    PathNode.LineTo(154.0f, 220.0f),
                    PathNode.LineTo(174.4f, 247.2f),
                    PathNode.CurveTo(178.37645f, 252.50194f, 185.89807f, 253.57645f, 191.2f, 249.6f),
                    PathNode.CurveTo(196.50194f, 245.62355f, 197.57645f, 238.10193f, 193.6f, 232.8f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.CurveTo(203.88223f, 220.0f, 220.0f, 203.88223f, 220.0f, 184.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 36.11775f, 203.88223f, 20.0f, 184.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 44.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.CurveTo(190.62741f, 44.0f, 196.0f, 49.37258f, 196.0f, 56.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 49.37258f, 65.37258f, 44.0f, 72.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 196.0f),
                    PathNode.LineTo(72.0f, 196.0f),
                    PathNode.CurveTo(65.37258f, 196.0f, 60.0f, 190.62741f, 60.0f, 184.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(196.0f, 140.0f),
                    PathNode.LineTo(196.0f, 184.0f),
                    PathNode.CurveTo(196.0f, 190.62741f, 190.62741f, 196.0f, 184.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 176.83656f, 96.836555f, 184.0f, 88.0f, 184.0f),
                    PathNode.CurveTo(79.163445f, 184.0f, 72.0f, 176.83656f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 159.16344f, 79.163445f, 152.0f, 88.0f, 152.0f),
                    PathNode.CurveTo(96.836555f, 152.0f, 104.0f, 159.16344f, 104.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 176.83656f, 176.83656f, 184.0f, 168.0f, 184.0f),
                    PathNode.CurveTo(159.16344f, 184.0f, 152.0f, 176.83656f, 152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 159.16344f, 159.16344f, 152.0f, 168.0f, 152.0f),
                    PathNode.CurveTo(176.83656f, 152.0f, 184.0f, 159.16344f, 184.0f, 168.0f),
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
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
