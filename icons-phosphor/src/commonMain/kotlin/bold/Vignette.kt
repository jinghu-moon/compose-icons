package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorBoldIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(81.43f, 166.05f),
                    PathNode.CurveTo(94.0f, 175.05f, 110.56f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(145.44f, 180.0f, 162.0f, 175.05f, 174.57f, 166.05f),
                    PathNode.CurveTo(188.19f, 156.32f, 196.0f, 142.45f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 113.55f, 188.19f, 99.68f, 174.57f, 90.0f),
                    PathNode.CurveTo(162.0f, 81.0f, 145.44f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(110.56f, 76.0f, 94.0f, 81.0f, 81.43f, 90.0f),
                    PathNode.CurveTo(67.81f, 99.68f, 60.0f, 113.55f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 142.45f, 67.81f, 156.32f, 81.43f, 166.05f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(151.85f, 100.0f, 172.0f, 112.82f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 143.18f, 151.85f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(104.15f, 156.0f, 84.0f, 143.18f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 112.82f, 104.15f, 100.0f, 128.0f, 100.0f),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
