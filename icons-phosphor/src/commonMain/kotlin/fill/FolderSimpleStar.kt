package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorFillIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(128.0f, 212.41827f, 124.41828f, 216.0f, 120.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 55.163445f, 31.163445f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(93.33f, 48.0f),
                    PathNode.CurveTo(96.79053f, 48.008583f, 100.15643f, 49.13055f, 102.93f, 51.2f),
                    PathNode.LineTo(130.67f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(224.83656f, 72.0f, 232.0f, 79.163445f, 232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.CurveTo(232.0f, 124.41828f, 228.41827f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(219.58173f, 128.0f, 216.0f, 124.41828f, 216.0f, 120.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.CurveTo(126.269035f, 88.0f, 124.58477f, 87.438576f, 123.2f, 86.4f),
                    PathNode.LineTo(93.33f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.CurveTo(124.41828f, 200.0f, 128.0f, 203.58173f, 128.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(239.63f, 159.2f),
                    PathNode.CurveTo(238.6464f, 156.09427f, 235.87776f, 153.89519f, 232.63f, 153.64f),
                    PathNode.LineTo(202.79f, 151.33f),
                    PathNode.LineTo(191.36f, 124.83f),
                    PathNode.CurveTo(190.09758f, 121.89247f, 187.20732f, 119.98872f, 184.01f, 119.98872f),
                    PathNode.CurveTo(180.81268f, 119.98872f, 177.92244f, 121.89247f, 176.66f, 124.83f),
                    PathNode.LineTo(165.23f, 151.33f),
                    PathNode.LineTo(135.39f, 153.64f),
                    PathNode.CurveTo(132.1415f, 153.89606f, 129.37291f, 156.09685f, 128.3907f, 159.20389f),
                    PathNode.CurveTo(127.40849f, 162.31093f, 128.40895f, 165.7032f, 130.92f, 167.78f),
                    PathNode.LineTo(153.43f, 186.37f),
                    PathNode.LineTo(146.58f, 214.08f),
                    PathNode.CurveTo(145.81119f, 217.2036f, 146.98807f, 220.48387f, 149.56728f, 222.40628f),
                    PathNode.CurveTo(152.1465f, 224.32869f, 155.62628f, 224.51926f, 158.4f, 222.89f),
                    PathNode.LineTo(184.0f, 207.82f),
                    PathNode.LineTo(209.61f, 222.89f),
                    PathNode.CurveTo(212.38371f, 224.51926f, 215.86351f, 224.32869f, 218.44272f, 222.40628f),
                    PathNode.CurveTo(221.02193f, 220.48387f, 222.19882f, 217.2036f, 221.43f, 214.08f),
                    PathNode.LineTo(214.58f, 186.37f),
                    PathNode.LineTo(237.09f, 167.78f),
                    PathNode.CurveTo(239.60652f, 165.70517f, 240.61151f, 162.31038f, 239.63f, 159.2f),
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
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
