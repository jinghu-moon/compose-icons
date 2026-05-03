package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorBoldIcon(
            name = "Compass",
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
                    PathNode.MoveTo(163.27f, 77.0f),
                    PathNode.LineTo(107.27f, 101.0f),
                    PathNode.CurveTo(104.43934f, 102.213715f, 102.18371f, 104.46934f, 100.97f, 107.3f),
                    PathNode.LineTo(76.97f, 163.3f),
                    PathNode.CurveTo(75.07194f, 167.80486f, 76.09622f, 173.01079f, 79.55942f, 176.4608f),
                    PathNode.CurveTo(83.02261f, 179.91081f, 88.232414f, 180.91524f, 92.73f, 179.0f),
                    PathNode.LineTo(148.73f, 155.0f),
                    PathNode.CurveTo(151.56065f, 153.78629f, 153.81628f, 151.53065f, 155.03f, 148.7f),
                    PathNode.LineTo(179.03f, 92.7f),
                    PathNode.CurveTo(180.92805f, 88.195145f, 179.90378f, 82.98922f, 176.44058f, 79.5392f),
                    PathNode.CurveTo(172.97739f, 76.08919f, 167.76758f, 75.08477f, 163.27f, 77.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.86f, 134.89f),
                    PathNode.LineTo(110.86f, 145.18f),
                    PathNode.LineTo(121.15f, 121.18f),
                    PathNode.LineTo(145.15f, 110.89f),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
