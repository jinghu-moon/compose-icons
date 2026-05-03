package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorFillIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 232.0f),
                    PathNode.CurveTo(208.0f, 236.41827f, 204.41827f, 240.0f, 200.0f, 240.0f),
                    PathNode.LineTo(56.0f, 240.0f),
                    PathNode.CurveTo(51.581722f, 240.0f, 48.0f, 236.41827f, 48.0f, 232.0f),
                    PathNode.CurveTo(48.0f, 227.58173f, 51.581722f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 227.58173f, 208.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(168.83656f, 208.0f, 176.0f, 200.83656f, 176.0f, 192.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 31.163445f, 168.83656f, 24.0f, 160.0f, 24.0f),
                    PathNode.LineTo(96.0f, 24.0f),
                    PathNode.CurveTo(87.163445f, 24.0f, 80.0f, 31.163445f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.CurveTo(80.0f, 200.83656f, 87.163445f, 208.0f, 96.0f, 208.0f),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
