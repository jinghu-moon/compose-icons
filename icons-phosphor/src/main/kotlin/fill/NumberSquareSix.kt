package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorFillIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 159.0457f, 139.0457f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(116.95431f, 168.0f, 108.0f, 159.0457f, 108.0f, 148.0f),
                    PathNode.CurveTo(108.0f, 136.9543f, 116.95431f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(139.0457f, 128.0f, 148.0f, 136.9543f, 148.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 148.0f),
                    PathNode.CurveTo(164.0f, 128.11775f, 147.88223f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(127.39f, 112.0f, 126.78f, 112.0f, 126.18f, 112.0f),
                    PathNode.LineTo(142.87f, 84.1f),
                    PathNode.CurveTo(145.13437f, 80.3058f, 143.8942f, 75.39437f, 140.1f, 73.13f),
                    PathNode.CurveTo(136.3058f, 70.86563f, 131.39436f, 72.105804f, 129.13f, 75.9f),
                    PathNode.CurveTo(129.13f, 75.9f, 96.73f, 130.18f, 96.66f, 130.32f),
                    PathNode.CurveTo(89.230545f, 143.464f, 90.79229f, 159.84749f, 100.57127f, 171.3511f),
                    PathNode.CurveTo(110.35026f, 182.85472f, 126.26853f, 187.03403f, 140.43724f, 181.81786f),
                    PathNode.CurveTo(154.606f, 176.60167f, 164.01447f, 163.09839f, 164.0f, 148.0f),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
