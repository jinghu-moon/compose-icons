package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) return _suitcaseSimple!!
        _suitcaseSimple = phosphorFillIcon(
            name = "SuitcaseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 34.745167f, 165.25484f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(90.74516f, 24.0f, 80.0f, 34.745167f, 80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(31.163445f, 56.0f, 24.0f, 63.163445f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 63.163445f, 224.83656f, 56.0f, 216.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 43.581722f, 99.58172f, 40.0f, 104.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(156.41827f, 40.0f, 160.0f, 43.581722f, 160.0f, 48.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 72.0f),
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
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null
