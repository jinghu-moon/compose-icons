package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorRegularIcon(
            name = "Briefcase",
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
                    PathNode.LineTo(216.0f, 113.61f),
                    PathNode.CurveTo(188.99779f, 128.30777f, 158.7432f, 136.0055f, 128.0f, 136.0f),
                    PathNode.CurveTo(97.25803f, 136.00558f, 67.00423f, 128.3115f, 40.0f, 113.62f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 131.64f),
                    PathNode.CurveTo(67.399254f, 145.04198f, 97.49866f, 152.00587f, 128.0f, 152.0f),
                    PathNode.CurveTo(158.50189f, 152.00066f, 188.60086f, 145.03342f, 216.0f, 131.63f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 112.0f),
                    PathNode.CurveTo(104.0f, 107.58172f, 107.58172f, 104.0f, 112.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(148.41827f, 104.0f, 152.0f, 107.58172f, 152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 116.41828f, 148.41827f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.CurveTo(107.58172f, 120.0f, 104.0f, 116.41828f, 104.0f, 112.0f),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
