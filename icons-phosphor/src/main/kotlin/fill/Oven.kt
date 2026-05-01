package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorFillIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 56.0f),
                    PathNode.CurveTo(178.62741f, 56.0f, 184.0f, 61.37258f, 184.0f, 68.0f),
                    PathNode.CurveTo(184.0f, 74.62742f, 178.62741f, 80.0f, 172.0f, 80.0f),
                    PathNode.CurveTo(165.37259f, 80.0f, 160.0f, 74.62742f, 160.0f, 68.0f),
                    PathNode.CurveTo(160.0f, 61.37258f, 165.37259f, 56.0f, 172.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(134.62741f, 56.0f, 140.0f, 61.37258f, 140.0f, 68.0f),
                    PathNode.CurveTo(140.0f, 74.62742f, 134.62741f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(121.37258f, 80.0f, 116.0f, 74.62742f, 116.0f, 68.0f),
                    PathNode.CurveTo(116.0f, 61.37258f, 121.37258f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 56.0f),
                    PathNode.CurveTo(90.62742f, 56.0f, 96.0f, 61.37258f, 96.0f, 68.0f),
                    PathNode.CurveTo(96.0f, 74.62742f, 90.62742f, 80.0f, 84.0f, 80.0f),
                    PathNode.CurveTo(77.37258f, 80.0f, 72.0f, 74.62742f, 72.0f, 68.0f),
                    PathNode.CurveTo(72.0f, 61.37258f, 77.37258f, 56.0f, 84.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
