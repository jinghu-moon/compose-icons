package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ProhibitInset: ImageVector
    get() {
        if (_prohibitInset != null) return _prohibitInset!!
        _prohibitInset = phosphorBoldIcon(
            name = "ProhibitInset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.49f, 151.51f),
                    PathNode.CurveTo(173.18442f, 156.20442f, 173.18442f, 163.81558f, 168.49f, 168.51f),
                    PathNode.CurveTo(163.79558f, 173.20442f, 156.18442f, 173.20442f, 151.49f, 168.51f),
                    PathNode.LineTo(87.49f, 104.51f),
                    PathNode.CurveTo(82.79558f, 99.81558f, 82.79558f, 92.20442f, 87.49f, 87.51f),
                    PathNode.CurveTo(92.18442f, 82.81558f, 99.79558f, 82.81558f, 104.49f, 87.51f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 81.60808f, 174.39192f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(81.60808f, 44.0f, 44.0f, 81.60808f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 174.39192f, 81.60808f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(174.37135f, 211.9504f, 211.9504f, 174.37135f, 212.0f, 128.0f),
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
        return _prohibitInset!!
    }

private var _prohibitInset: ImageVector? = null
