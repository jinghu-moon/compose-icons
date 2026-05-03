package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorDuotoneIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 112.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 76.0f),
                    PathNode.CurveTo(72.0f, 69.37258f, 77.37258f, 64.0f, 84.0f, 64.0f),
                    PathNode.CurveTo(90.62742f, 64.0f, 96.0f, 69.37258f, 96.0f, 76.0f),
                    PathNode.CurveTo(96.0f, 82.62742f, 90.62742f, 88.0f, 84.0f, 88.0f),
                    PathNode.CurveTo(77.37258f, 88.0f, 72.0f, 82.62742f, 72.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 76.0f),
                    PathNode.CurveTo(116.0f, 69.37258f, 121.37258f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(134.62741f, 64.0f, 140.0f, 69.37258f, 140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 82.62742f, 134.62741f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(121.37258f, 88.0f, 116.0f, 82.62742f, 116.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 76.0f),
                    PathNode.CurveTo(160.0f, 69.37258f, 165.37259f, 64.0f, 172.0f, 64.0f),
                    PathNode.CurveTo(178.62741f, 64.0f, 184.0f, 69.37258f, 184.0f, 76.0f),
                    PathNode.CurveTo(184.0f, 82.62742f, 178.62741f, 88.0f, 172.0f, 88.0f),
                    PathNode.CurveTo(165.37259f, 88.0f, 160.0f, 82.62742f, 160.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 104.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(67.58172f, 104.0f, 64.0f, 107.58172f, 64.0f, 112.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(64.0f, 188.41827f, 67.58172f, 192.0f, 72.0f, 192.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.CurveTo(188.41827f, 192.0f, 192.0f, 188.41827f, 192.0f, 184.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 107.58172f, 188.41827f, 104.0f, 184.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
