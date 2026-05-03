package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorRegularIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(58.745167f, 24.0f, 48.0f, 34.745167f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 224.83656f, 55.163445f, 232.0f, 64.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(184.83656f, 232.0f, 192.0f, 224.83656f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 43.581722f, 195.58173f, 40.0f, 200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 43.581722f, 208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 156.41827f, 211.58173f, 160.0f, 216.0f, 160.0f),
                    PathNode.CurveTo(220.41827f, 160.0f, 224.0f, 156.41827f, 224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 34.745167f, 213.25484f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.LineTo(177.37f, 40.0f),
                    PathNode.CurveTo(176.45941f, 42.568756f, 175.99603f, 45.274628f, 176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 43.581722f, 67.58172f, 40.0f, 72.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 216.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.LineTo(176.0f, 216.0f),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
