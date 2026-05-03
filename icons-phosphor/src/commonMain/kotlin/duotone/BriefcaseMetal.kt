package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) return _briefcaseMetal!!
        _briefcaseMetal = phosphorDuotoneIcon(
            name = "BriefcaseMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 67.58172f, 35.581722f, 64.0f, 40.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(220.41827f, 64.0f, 224.0f, 67.58172f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 204.41827f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 43.581722f, 99.58172f, 40.0f, 104.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(156.41827f, 40.0f, 160.0f, 43.581722f, 160.0f, 48.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
