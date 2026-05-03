package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorThinIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.17f, 51.49f),
                    PathNode.LineTo(202.83f, 34.83f),
                    PathNode.CurveTo(204.39296f, 33.267033f, 204.39296f, 30.732965f, 202.83f, 29.17f),
                    PathNode.CurveTo(201.26703f, 27.607035f, 198.73297f, 27.607035f, 197.17f, 29.17f),
                    PathNode.LineTo(180.17f, 46.17f),
                    PathNode.CurveTo(149.65762f, 21.889404f, 106.42239f, 21.889404f, 75.91f, 46.17f),
                    PathNode.LineTo(58.91f, 29.17f),
                    PathNode.CurveTo(57.347034f, 27.607035f, 54.812965f, 27.607035f, 53.25f, 29.17f),
                    PathNode.CurveTo(51.687035f, 30.732965f, 51.687035f, 33.267033f, 53.25f, 34.83f),
                    PathNode.LineTo(69.83f, 51.49f),
                    PathNode.CurveTo(53.32619f, 67.291985f, 43.995213f, 89.15096f, 44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 198.39192f, 81.60808f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(174.39192f, 236.0f, 212.0f, 198.39192f, 212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 112.0f),
                    PathNode.CurveTo(212.00479f, 89.15096f, 202.67381f, 67.291985f, 186.17f, 51.49f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(169.95538f, 36.044098f, 203.9559f, 70.04464f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 124.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.044098f, 70.04464f, 86.04464f, 36.044098f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(86.04464f, 227.9559f, 52.044098f, 193.95538f, 52.0f, 152.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(204.0f, 132.0f),
                    PathNode.LineTo(204.0f, 152.0f),
                    PathNode.CurveTo(203.9559f, 193.95538f, 169.95538f, 227.9559f, 128.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 92.0f),
                    PathNode.CurveTo(148.0f, 87.58172f, 151.58173f, 84.0f, 156.0f, 84.0f),
                    PathNode.CurveTo(160.41827f, 84.0f, 164.0f, 87.58172f, 164.0f, 92.0f),
                    PathNode.CurveTo(164.0f, 96.41828f, 160.41827f, 100.0f, 156.0f, 100.0f),
                    PathNode.CurveTo(151.58173f, 100.0f, 148.0f, 96.41828f, 148.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 92.0f),
                    PathNode.CurveTo(92.0f, 87.58172f, 95.58172f, 84.0f, 100.0f, 84.0f),
                    PathNode.CurveTo(104.41828f, 84.0f, 108.0f, 87.58172f, 108.0f, 92.0f),
                    PathNode.CurveTo(108.0f, 96.41828f, 104.41828f, 100.0f, 100.0f, 100.0f),
                    PathNode.CurveTo(95.58172f, 100.0f, 92.0f, 96.41828f, 92.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
