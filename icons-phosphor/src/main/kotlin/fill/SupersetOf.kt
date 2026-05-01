package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorFillIcon(
            name = "SupersetOf",
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
                    PathNode.MoveTo(176.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(75.58172f, 184.0f, 72.0f, 180.41827f, 72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 171.58173f, 75.58172f, 168.0f, 80.0f, 168.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(180.41827f, 168.0f, 184.0f, 171.58173f, 184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 180.41827f, 180.41827f, 184.0f, 176.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(75.58172f, 152.0f, 72.0f, 148.41827f, 72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 139.58173f, 75.58172f, 136.0f, 80.0f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(157.25484f, 136.0f, 168.0f, 125.25484f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 98.74516f, 157.25484f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(75.58172f, 88.0f, 72.0f, 84.41828f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 75.58172f, 75.58172f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.CurveTo(166.09138f, 72.0f, 184.0f, 89.90861f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 134.09138f, 166.09138f, 152.0f, 144.0f, 152.0f),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
