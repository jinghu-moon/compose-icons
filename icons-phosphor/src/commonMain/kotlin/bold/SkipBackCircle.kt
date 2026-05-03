package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorBoldIcon(
            name = "SkipBackCircle",
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
                    PathNode.MoveTo(165.82f, 77.5f),
                    PathNode.CurveTo(162.0038f, 75.38428f, 157.33986f, 75.506805f, 153.64f, 77.82f),
                    PathNode.LineTo(108.0f, 106.35f),
                    PathNode.LineTo(108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 81.37258f, 102.62742f, 76.0f, 96.0f, 76.0f),
                    PathNode.CurveTo(89.37258f, 76.0f, 84.0f, 81.37258f, 84.0f, 88.0f),
                    PathNode.LineTo(84.0f, 168.0f),
                    PathNode.CurveTo(84.0f, 174.62741f, 89.37258f, 180.0f, 96.0f, 180.0f),
                    PathNode.CurveTo(102.62742f, 180.0f, 108.0f, 174.62741f, 108.0f, 168.0f),
                    PathNode.LineTo(108.0f, 149.65f),
                    PathNode.LineTo(153.64f, 178.18f),
                    PathNode.CurveTo(157.33984f, 180.4924f, 162.00325f, 180.61447f, 165.81898f, 178.49876f),
                    PathNode.CurveTo(169.63472f, 176.38307f, 172.00146f, 172.36302f, 172.0f, 168.0f),
                    PathNode.LineTo(172.0f, 88.0f),
                    PathNode.CurveTo(172.00212f, 83.63675f, 169.63573f, 79.61618f, 165.82f, 77.5f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 146.35f),
                    PathNode.LineTo(118.64f, 128.0f),
                    PathNode.LineTo(148.0f, 109.65f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
