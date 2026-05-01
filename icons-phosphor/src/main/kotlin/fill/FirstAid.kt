package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorFillIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 108.0f),
                    PathNode.LineTo(232.0f, 148.0f),
                    PathNode.CurveTo(232.0f, 156.83656f, 224.83656f, 164.0f, 216.0f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 224.83656f, 156.83656f, 232.0f, 148.0f, 232.0f),
                    PathNode.LineTo(108.0f, 232.0f),
                    PathNode.CurveTo(99.163445f, 232.0f, 92.0f, 224.83656f, 92.0f, 216.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(31.163445f, 164.0f, 24.0f, 156.83656f, 24.0f, 148.0f),
                    PathNode.LineTo(24.0f, 108.0f),
                    PathNode.CurveTo(24.0f, 99.163445f, 31.163445f, 92.0f, 40.0f, 92.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 31.163445f, 99.163445f, 24.0f, 108.0f, 24.0f),
                    PathNode.LineTo(148.0f, 24.0f),
                    PathNode.CurveTo(156.83656f, 24.0f, 164.0f, 31.163445f, 164.0f, 40.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.LineTo(216.0f, 92.0f),
                    PathNode.CurveTo(224.83656f, 92.0f, 232.0f, 99.163445f, 232.0f, 108.0f),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
