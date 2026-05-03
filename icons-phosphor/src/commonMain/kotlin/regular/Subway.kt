package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorRegularIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 212.41827f, 220.41827f, 216.0f, 216.0f, 216.0f),
                    PathNode.CurveTo(211.58173f, 216.0f, 208.0f, 212.41827f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.CurveTo(207.96693f, 65.08576f, 182.91423f, 40.03307f, 152.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(73.08576f, 40.03307f, 48.03307f, 65.08576f, 48.0f, 96.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 212.41827f, 44.418278f, 216.0f, 40.0f, 216.0f),
                    PathNode.CurveTo(35.581722f, 216.0f, 32.0f, 212.41827f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.CurveTo(32.04409f, 56.253773f, 64.25378f, 24.044088f, 104.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(191.74623f, 24.044088f, 223.95592f, 56.253773f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(183.99843f, 179.43788f, 175.92545f, 189.28532f, 164.71f, 191.53f),
                    PathNode.LineTo(167.16f, 196.42f),
                    PathNode.CurveTo(169.13718f, 200.37436f, 167.53436f, 205.18282f, 163.58f, 207.16f),
                    PathNode.CurveTo(159.62564f, 209.13718f, 154.81718f, 207.53436f, 152.84f, 203.58f),
                    PathNode.LineTo(147.06f, 192.0f),
                    PathNode.LineTo(108.94f, 192.0f),
                    PathNode.LineTo(103.16f, 203.58f),
                    PathNode.CurveTo(101.18282f, 207.53436f, 96.37436f, 209.13718f, 92.42f, 207.16f),
                    PathNode.CurveTo(88.465645f, 205.18282f, 86.86282f, 200.37436f, 88.84f, 196.42f),
                    PathNode.LineTo(91.29f, 191.53f),
                    PathNode.CurveTo(80.07455f, 189.28532f, 72.00157f, 179.43788f, 72.0f, 168.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 82.74516f, 82.74516f, 72.0f, 96.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(173.25484f, 72.0f, 184.0f, 82.74516f, 184.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 96.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(168.0f, 91.58172f, 164.41827f, 88.0f, 160.0f, 88.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.CurveTo(91.58172f, 88.0f, 88.0f, 91.58172f, 88.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 176.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 172.41827f, 91.58172f, 176.0f, 96.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.CurveTo(164.41827f, 176.0f, 168.0f, 172.41827f, 168.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subway!!
    }

private var _subway: ImageVector? = null
