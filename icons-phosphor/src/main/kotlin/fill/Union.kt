package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorFillIcon(
            name = "Union",
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
                    PathNode.MoveTo(184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 166.92795f, 158.92795f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(97.07206f, 192.0f, 72.0f, 166.92795f, 72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 75.58172f, 75.58172f, 72.0f, 80.0f, 72.0f),
                    PathNode.CurveTo(84.41828f, 72.0f, 88.0f, 75.58172f, 88.0f, 80.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 158.09138f, 105.90861f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(150.09138f, 176.0f, 168.0f, 158.09138f, 168.0f, 136.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 75.58172f, 171.58173f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(180.41827f, 72.0f, 184.0f, 75.58172f, 184.0f, 80.0f),
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
        return _union!!
    }

private var _union: ImageVector? = null
