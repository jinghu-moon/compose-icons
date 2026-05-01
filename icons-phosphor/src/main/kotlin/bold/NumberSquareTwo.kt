package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorBoldIcon(
            name = "NumberSquareTwo",
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
                    PathNode.MoveTo(137.57f, 111.24f),
                    PathNode.CurveTo(139.49121f, 108.69876f, 140.32307f, 105.49787f, 139.88226f, 102.34278f),
                    PathNode.CurveTo(139.44144f, 99.18768f, 137.76413f, 96.337364f, 135.22f, 94.42f),
                    PathNode.CurveTo(129.92851f, 90.4348f, 122.4087f, 91.49116f, 118.42f, 96.78f),
                    PathNode.CurveTo(117.67467f, 97.75541f, 117.08749f, 98.84203f, 116.68f, 100.0f),
                    PathNode.CurveTo(114.47086f, 106.2491f, 107.614105f, 109.52414f, 101.365f, 107.315f),
                    PathNode.CurveTo(95.1159f, 105.10586f, 91.84086f, 98.2491f, 94.05f, 92.0f),
                    PathNode.CurveTo(95.28514f, 88.5326f, 97.03836f, 85.272285f, 99.25f, 82.33f),
                    PathNode.CurveTo(111.21801f, 66.45181f, 133.79181f, 63.281994f, 149.67f, 75.25f),
                    PathNode.CurveTo(165.54819f, 87.21801f, 168.71802f, 109.79182f, 156.75f, 125.67f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(158.62741f, 164.0f, 164.0f, 169.37259f, 164.0f, 176.0f),
                    PathNode.CurveTo(164.0f, 182.62741f, 158.62741f, 188.0f, 152.0f, 188.0f),
                    PathNode.LineTo(104.0f, 188.0f),
                    PathNode.CurveTo(99.454735f, 188.0f, 95.299576f, 185.43199f, 93.26688f, 181.36656f),
                    PathNode.CurveTo(91.23417f, 177.30115f, 91.67284f, 172.43622f, 94.4f, 168.8f),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
