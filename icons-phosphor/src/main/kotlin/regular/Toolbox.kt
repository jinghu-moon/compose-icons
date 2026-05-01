package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorRegularIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 42.745167f, 165.25484f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(90.74516f, 32.0f, 80.0f, 42.745167f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(23.163445f, 64.0f, 16.0f, 71.163445f, 16.0f, 80.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 71.163445f, 232.83656f, 64.0f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 51.581722f, 99.58172f, 48.0f, 104.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(156.41827f, 48.0f, 160.0f, 51.581722f, 160.0f, 56.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 99.58172f, 188.41827f, 96.0f, 184.0f, 96.0f),
                    PathNode.CurveTo(179.58173f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 99.58172f, 76.41828f, 96.0f, 72.0f, 96.0f),
                    PathNode.CurveTo(67.58172f, 96.0f, 64.0f, 99.58172f, 64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 140.41827f, 67.58172f, 144.0f, 72.0f, 144.0f),
                    PathNode.CurveTo(76.41828f, 144.0f, 80.0f, 140.41827f, 80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 140.41827f, 179.58173f, 144.0f, 184.0f, 144.0f),
                    PathNode.CurveTo(188.41827f, 144.0f, 192.0f, 140.41827f, 192.0f, 136.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.LineTo(224.0f, 192.0f),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
