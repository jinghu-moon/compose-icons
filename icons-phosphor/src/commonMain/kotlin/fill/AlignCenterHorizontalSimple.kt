package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorFillIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 168.83656f, 216.83656f, 176.0f, 208.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 212.41827f, 132.41827f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(123.58172f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(39.163445f, 176.0f, 32.0f, 168.83656f, 32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 87.163445f, 39.163445f, 80.0f, 48.0f, 80.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 43.581722f, 123.58172f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(132.41827f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(216.83656f, 80.0f, 224.0f, 87.163445f, 224.0f, 96.0f),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
