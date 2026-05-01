package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) return _briefcaseMetal!!
        _briefcaseMetal = phosphorFillIcon(
            name = "BriefcaseMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 112.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(230.20914f, 112.0f, 232.0f, 113.79086f, 232.0f, 116.0f),
                    PathNode.LineTo(232.0f, 156.0f),
                    PathNode.CurveTo(232.0f, 158.20914f, 230.20914f, 160.0f, 228.0f, 160.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.CurveTo(25.790861f, 160.0f, 24.0f, 158.20914f, 24.0f, 156.0f),
                    PathNode.LineTo(24.0f, 116.0f),
                    PathNode.CurveTo(24.0f, 113.79086f, 25.790861f, 112.0f, 28.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(232.0f, 177.79086f, 230.20914f, 176.0f, 228.0f, 176.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(25.790861f, 176.0f, 24.0f, 177.79086f, 24.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 72.0f),
                    PathNode.LineTo(232.0f, 92.0f),
                    PathNode.CurveTo(232.0f, 94.20914f, 230.20914f, 96.0f, 228.0f, 96.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(25.790861f, 96.0f, 24.0f, 94.20914f, 24.0f, 92.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 63.163445f, 31.163445f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 34.745167f, 90.74516f, 24.0f, 104.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(165.25484f, 24.0f, 176.0f, 34.745167f, 176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(224.83656f, 56.0f, 232.0f, 63.163445f, 232.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 43.581722f, 156.41827f, 40.0f, 152.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(99.58172f, 40.0f, 96.0f, 43.581722f, 96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
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
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
