package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorFillIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.57f, 39.43f),
                    PathNode.CurveTo(190.41203f, 13.235638f, 149.69908f, 8.408906f, 118.14138f, 27.760777f),
                    PathNode.CurveTo(86.58368f, 47.112648f, 72.424576f, 85.58812f, 83.91f, 120.78f),
                    PathNode.LineTo(28.69f, 176.0f),
                    PathNode.CurveTo(25.675812f, 178.99025f, 23.986435f, 183.06421f, 24.0f, 187.31f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 224.83656f, 31.163445f, 232.0f, 40.0f, 232.0f),
                    PathNode.LineTo(72.0f, 232.0f),
                    PathNode.CurveTo(76.41828f, 232.0f, 80.0f, 228.41827f, 80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(100.41828f, 208.0f, 104.0f, 204.41827f, 104.0f, 200.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(122.12237f, 184.00166f, 124.158424f, 183.15993f, 125.66f, 181.66f),
                    PathNode.LineTo(135.22f, 172.09f),
                    PathNode.CurveTo(143.22192f, 174.6928f, 151.58542f, 176.01245f, 160.0f, 176.0f),
                    PathNode.LineTo(160.1f, 176.0f),
                    PathNode.CurveTo(192.43968f, 175.96078f, 221.57495f, 156.45457f, 233.9323f, 126.56892f),
                    PathNode.CurveTo(246.28964f, 96.68325f, 239.43823f, 62.297016f, 216.57f, 39.43f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 92.0f),
                    PathNode.CurveTo(171.16344f, 92.0f, 164.0f, 84.836555f, 164.0f, 76.0f),
                    PathNode.CurveTo(164.0f, 67.163445f, 171.16344f, 60.0f, 180.0f, 60.0f),
                    PathNode.CurveTo(188.83656f, 60.0f, 196.0f, 67.163445f, 196.0f, 76.0f),
                    PathNode.CurveTo(196.0f, 84.836555f, 188.83656f, 92.0f, 180.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _key!!
    }

private var _key: ImageVector? = null
