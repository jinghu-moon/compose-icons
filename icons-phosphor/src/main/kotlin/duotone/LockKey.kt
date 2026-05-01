package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorDuotoneIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(43.581722f, 88.0f, 40.0f, 91.58172f, 40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 91.58172f, 212.41827f, 88.0f, 208.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(116.95431f, 160.0f, 108.0f, 151.0457f, 108.0f, 140.0f),
                    PathNode.CurveTo(108.0f, 128.9543f, 116.95431f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(139.0457f, 120.0f, 148.0f, 128.9543f, 148.0f, 140.0f),
                    PathNode.CurveTo(148.0f, 151.0457f, 139.0457f, 160.0f, 128.0f, 160.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 29.490332f, 154.50967f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(101.49033f, 8.0f, 80.0f, 29.490332f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(39.163445f, 80.0f, 32.0f, 87.163445f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 87.163445f, 216.83656f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 38.32689f, 110.32689f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(145.67311f, 24.0f, 160.0f, 38.32689f, 160.0f, 56.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(114.10111f, 112.004684f, 102.30947f, 122.204185f, 100.302795f, 135.95744f),
                    PathNode.CurveTo(98.29612f, 149.71071f, 106.681885f, 162.8542f, 120.0f, 166.83f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 188.41827f, 123.58172f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(132.41827f, 192.0f, 136.0f, 188.41827f, 136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 166.83f),
                    PathNode.CurveTo(149.31812f, 162.8542f, 157.70389f, 149.71071f, 155.6972f, 135.95744f),
                    PathNode.CurveTo(153.69052f, 122.204185f, 141.89888f, 112.004684f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(121.37258f, 152.0f, 116.0f, 146.62741f, 116.0f, 140.0f),
                    PathNode.CurveTo(116.0f, 133.37259f, 121.37258f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(134.62741f, 128.0f, 140.0f, 133.37259f, 140.0f, 140.0f),
                    PathNode.CurveTo(140.0f, 146.62741f, 134.62741f, 152.0f, 128.0f, 152.0f),
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
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
