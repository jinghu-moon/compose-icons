package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorBoldIcon(
            name = "Lifebuoy",
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
                    PathNode.MoveTo(172.25f, 155.28f),
                    PathNode.CurveTo(182.58282f, 138.56099f, 182.58282f, 117.43901f, 172.25f, 100.72f),
                    PathNode.LineTo(195.25f, 77.72f),
                    PathNode.CurveTo(217.58334f, 107.52f, 217.58334f, 148.48001f, 195.25f, 178.28f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 112.536026f, 112.536026f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(143.46397f, 100.0f, 156.0f, 112.536026f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 143.46397f, 143.46397f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(112.536026f, 156.0f, 100.0f, 143.46397f, 100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.28f, 60.75f),
                    PathNode.LineTo(155.28f, 83.75f),
                    PathNode.CurveTo(138.56099f, 73.41718f, 117.43901f, 73.41718f, 100.72f, 83.75f),
                    PathNode.LineTo(77.72f, 60.75f),
                    PathNode.CurveTo(107.52f, 38.416656f, 148.48001f, 38.416656f, 178.28f, 60.75f),
                    PathNode.Close,
                    PathNode.MoveTo(60.75f, 77.75f),
                    PathNode.LineTo(83.75f, 100.75f),
                    PathNode.CurveTo(73.41718f, 117.46901f, 73.41718f, 138.59099f, 83.75f, 155.31f),
                    PathNode.LineTo(60.75f, 178.31f),
                    PathNode.CurveTo(38.416656f, 148.51001f, 38.416656f, 107.549995f, 60.75f, 77.75f),
                    PathNode.Close,
                    PathNode.MoveTo(77.75f, 195.28f),
                    PathNode.LineTo(100.75f, 172.28f),
                    PathNode.CurveTo(117.46901f, 182.61282f, 138.59099f, 182.61282f, 155.31f, 172.28f),
                    PathNode.LineTo(178.31f, 195.28f),
                    PathNode.CurveTo(148.51001f, 217.61334f, 107.549995f, 217.61334f, 77.75f, 195.28f),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
