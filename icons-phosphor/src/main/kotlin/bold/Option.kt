package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorBoldIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 198.62741f, 230.62741f, 204.0f, 224.0f, 204.0f),
                    PathNode.LineTo(160.94f, 204.0f),
                    PathNode.CurveTo(153.35933f, 204.02188f, 146.42535f, 199.73274f, 143.06f, 192.94f),
                    PathNode.LineTo(92.58f, 92.0f),
                    PathNode.LineTo(32.0f, 92.0f),
                    PathNode.CurveTo(25.372583f, 92.0f, 20.0f, 86.62742f, 20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 73.37258f, 25.372583f, 68.0f, 32.0f, 68.0f),
                    PathNode.LineTo(95.06f, 68.0f),
                    PathNode.CurveTo(102.64067f, 67.97812f, 109.574646f, 72.26726f, 112.94f, 79.06f),
                    PathNode.LineTo(163.42f, 180.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(230.62741f, 180.0f, 236.0f, 185.37259f, 236.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 92.0f),
                    PathNode.LineTo(224.0f, 92.0f),
                    PathNode.CurveTo(230.62741f, 92.0f, 236.0f, 86.62742f, 236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 73.37258f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(145.37259f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 145.37259f, 92.0f, 152.0f, 92.0f),
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
        return _option!!
    }

private var _option: ImageVector? = null
