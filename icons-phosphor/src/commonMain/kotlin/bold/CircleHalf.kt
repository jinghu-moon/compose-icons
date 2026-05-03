package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorBoldIcon(
            name = "CircleHalf",
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
                    PathNode.MoveTo(140.0f, 44.87f),
                    PathNode.CurveTo(148.31918f, 46.065487f, 156.4103f, 48.509678f, 164.0f, 52.12f),
                    PathNode.LineTo(164.0f, 203.88f),
                    PathNode.CurveTo(156.4103f, 207.49033f, 148.31918f, 209.93451f, 140.0f, 211.13f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.055717f, 86.26607f, 74.70148f, 50.882988f, 116.0f, 44.87f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(74.70148f, 205.117f, 44.055717f, 169.73393f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 186.71f),
                    PathNode.LineTo(188.0f, 69.29f),
                    PathNode.CurveTo(219.99982f, 101.88945f, 219.99982f, 154.11055f, 188.0f, 186.71f),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
