package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorBoldIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 142.64f),
                    PathNode.CurveTo(112.5972f, 145.28526f, 117.67664f, 146.98521f, 122.94f, 147.64f),
                    PathNode.LineTo(109.7f, 169.85f),
                    PathNode.CurveTo(107.374435f, 173.53531f, 107.22952f, 178.19171f, 109.32142f, 182.0145f),
                    PathNode.CurveTo(111.41332f, 185.8373f, 115.413216f, 188.22559f, 119.77085f, 188.25372f),
                    PathNode.CurveTo(124.12849f, 188.28188f, 128.15889f, 185.94545f, 130.3f, 182.15f),
                    PathNode.LineTo(162.64f, 128.0f),
                    PathNode.CurveTo(170.72981f, 113.98916f, 169.58302f, 96.48471f, 159.73439f, 83.64909f),
                    PathNode.CurveTo(149.88576f, 70.81348f, 133.27484f, 65.17449f, 117.64741f, 69.36163f),
                    PathNode.CurveTo(102.01998f, 73.548775f, 90.45366f, 86.73745f, 88.341896f, 102.77768f),
                    PathNode.CurveTo(86.230125f, 118.81792f, 93.9888f, 134.55081f, 108.0f, 142.64f),
                    PathNode.Close,
                    PathNode.MoveTo(114.14f, 100.0f),
                    PathNode.CurveTo(118.55828f, 92.34534f, 128.34534f, 89.721725f, 136.0f, 94.14f),
                    PathNode.CurveTo(143.65466f, 98.55828f, 146.27827f, 108.34534f, 141.86f, 116.0f),
                    PathNode.LineTo(141.86f, 116.0f),
                    PathNode.CurveTo(137.32603f, 123.392876f, 127.727646f, 125.82771f, 120.21795f, 121.48998f),
                    PathNode.CurveTo(112.70826f, 117.15225f, 110.021515f, 107.62131f, 114.16f, 100.0f),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
