package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorFillIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.34f, 115.83f),
                    PathNode.LineTo(140.94f, 132.21f),
                    PathNode.LineTo(172.09f, 175.08f),
                    PathNode.CurveTo(173.86543f, 177.38687f, 174.24768f, 180.47604f, 173.08809f, 183.14607f),
                    PathNode.CurveTo(171.9285f, 185.81613f, 169.41011f, 187.64557f, 166.51237f, 187.92288f),
                    PathNode.CurveTo(163.61464f, 188.20021f, 160.79495f, 186.88164f, 159.15f, 184.48f),
                    PathNode.LineTo(128.0f, 141.61f),
                    PathNode.LineTo(96.85f, 184.48f),
                    PathNode.CurveTo(94.207886f, 187.91296f, 89.31326f, 188.61922f, 85.808426f, 186.07321f),
                    PathNode.CurveTo(82.3036f, 183.52719f, 81.46204f, 178.654f, 83.91f, 175.08f),
                    PathNode.LineTo(115.06f, 132.21f),
                    PathNode.LineTo(64.66f, 115.83f),
                    PathNode.CurveTo(60.45711f, 114.46586f, 58.155857f, 109.95289f, 59.52f, 105.75f),
                    PathNode.CurveTo(60.884144f, 101.54711f, 65.39711f, 99.24586f, 69.6f, 100.61f),
                    PathNode.LineTo(120.0f, 117.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 59.581722f, 123.58172f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 117.0f),
                    PathNode.LineTo(186.4f, 100.62f),
                    PathNode.CurveTo(190.60289f, 99.25586f, 195.11586f, 101.55711f, 196.48f, 105.76f),
                    PathNode.CurveTo(197.84415f, 109.96289f, 195.5429f, 114.47585f, 191.34f, 115.84f),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
