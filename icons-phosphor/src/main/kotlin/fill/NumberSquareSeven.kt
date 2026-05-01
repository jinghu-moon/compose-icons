package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorFillIcon(
            name = "NumberSquareSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.52f, 90.73f),
                    PathNode.LineTo(127.52f, 178.73f),
                    PathNode.CurveTo(126.37147f, 181.89363f, 123.36567f, 184.00009f, 120.0f, 184.0f),
                    PathNode.CurveTo(119.068825f, 184.00215f, 118.1446f, 183.83965f, 117.27f, 183.52f),
                    PathNode.CurveTo(115.275536f, 182.796f, 113.65038f, 181.30934f, 112.752075f, 179.38708f),
                    PathNode.CurveTo(111.853775f, 177.46481f, 111.755905f, 175.26442f, 112.48f, 173.27f),
                    PathNode.LineTo(140.58f, 96.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(99.58172f, 96.0f, 96.0f, 92.41828f, 96.0f, 88.0f),
                    PathNode.CurveTo(96.0f, 83.58172f, 99.58172f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(154.609f, 79.99993f, 157.05412f, 81.27208f, 158.5515f, 83.408615f),
                    PathNode.CurveTo(160.04886f, 85.54514f, 160.41032f, 88.27761f, 159.52f, 90.73f),
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
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
