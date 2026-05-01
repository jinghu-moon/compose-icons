package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorFillIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 224.0f),
                    PathNode.CurveTo(224.0f, 228.41827f, 220.41827f, 232.0f, 216.0f, 232.0f),
                    PathNode.LineTo(40.0f, 232.0f),
                    PathNode.CurveTo(35.581722f, 232.0f, 32.0f, 228.41827f, 32.0f, 224.0f),
                    PathNode.CurveTo(32.0f, 219.58173f, 35.581722f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(220.41827f, 216.0f, 224.0f, 219.58173f, 224.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.LineTo(151.57f, 128.0f),
                    PathNode.LineTo(167.28f, 54.71f),
                    PathNode.CurveTo(169.30624f, 45.26167f, 166.95445f, 35.40369f, 160.88106f, 27.887674f),
                    PathNode.CurveTo(154.80766f, 20.371658f, 145.66316f, 16.002594f, 136.0f, 16.0f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(110.336845f, 16.002594f, 101.19234f, 20.371658f, 95.11894f, 27.887674f),
                    PathNode.CurveTo(89.045555f, 35.40369f, 86.69376f, 45.26167f, 88.72f, 54.71f),
                    PathNode.LineTo(104.43f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(39.163445f, 128.0f, 32.0f, 135.16344f, 32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 192.83656f, 39.163445f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(216.83656f, 200.0f, 224.0f, 192.83656f, 224.0f, 184.0f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 135.16344f, 216.83656f, 128.0f, 208.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _stamp!!
    }

private var _stamp: ImageVector? = null
