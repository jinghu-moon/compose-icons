package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorFillIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 74.78f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(176.0f, 63.163445f, 168.83656f, 56.0f, 160.0f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(87.163445f, 56.0f, 80.0f, 63.163445f, 80.0f, 72.0f),
                    PathNode.LineTo(80.0f, 74.78f),
                    PathNode.CurveTo(40.85939f, 93.272736f, 15.923309f, 132.71071f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 180.41827f, 19.581722f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(88.0f, 206.09138f, 105.90861f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(150.09138f, 224.0f, 168.0f, 206.09138f, 168.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(236.41827f, 184.0f, 240.0f, 180.41827f, 240.0f, 176.0f),
                    PathNode.CurveTo(240.07669f, 132.71071f, 215.14061f, 93.272736f, 176.0f, 74.78f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(114.74516f, 208.0f, 104.0f, 197.25484f, 104.0f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 197.25484f, 141.25484f, 208.0f, 128.0f, 208.0f),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
