package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorBoldIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 76.0f),
                    PathNode.CurveTo(153.37259f, 76.0f, 148.0f, 81.37258f, 148.0f, 88.0f),
                    PathNode.LineTo(148.0f, 106.35f),
                    PathNode.LineTo(102.36f, 77.82f),
                    PathNode.CurveTo(98.66016f, 75.5076f, 93.99676f, 75.38554f, 90.18102f, 77.50123f),
                    PathNode.CurveTo(86.36529f, 79.61693f, 83.998535f, 83.63697f, 84.0f, 88.0f),
                    PathNode.LineTo(84.0f, 168.0f),
                    PathNode.CurveTo(83.998535f, 172.36302f, 86.36529f, 176.38307f, 90.18102f, 178.49876f),
                    PathNode.CurveTo(93.99676f, 180.61447f, 98.66016f, 180.4924f, 102.36f, 178.18f),
                    PathNode.LineTo(148.0f, 149.65f),
                    PathNode.LineTo(148.0f, 168.0f),
                    PathNode.CurveTo(148.0f, 174.62741f, 153.37259f, 180.0f, 160.0f, 180.0f),
                    PathNode.CurveTo(166.62741f, 180.0f, 172.0f, 174.62741f, 172.0f, 168.0f),
                    PathNode.LineTo(172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 81.37258f, 166.62741f, 76.0f, 160.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 146.35f),
                    PathNode.LineTo(108.0f, 109.65f),
                    PathNode.LineTo(137.36f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
