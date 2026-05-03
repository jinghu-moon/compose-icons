package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorBoldIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 78.0f),
                    PathNode.CurveTo(169.08406f, 37.210495f, 131.56235f, 9.161108f, 89.91714f, 12.153585f),
                    PathNode.CurveTo(48.27194f, 15.146063f, 15.146063f, 48.27194f, 12.153585f, 89.91714f),
                    PathNode.CurveTo(9.161108f, 131.56235f, 37.210495f, 169.08406f, 78.0f, 178.0f),
                    PathNode.CurveTo(86.91595f, 218.7895f, 124.43766f, 246.8389f, 166.08286f, 243.84642f),
                    PathNode.CurveTo(207.72806f, 240.85394f, 240.85394f, 207.72806f, 243.84642f, 166.08286f),
                    PathNode.CurveTo(246.8389f, 124.43766f, 218.7895f, 86.91595f, 178.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.81f, 100.19f),
                    PathNode.CurveTo(155.10509f, 110.511765f, 151.72412f, 120.471985f, 146.0f, 129.09f),
                    PathNode.LineTo(126.94f, 110.0f),
                    PathNode.CurveTo(135.55502f, 104.26527f, 145.51546f, 100.87389f, 155.84f, 100.16f),
                    PathNode.Close,
                    PathNode.MoveTo(76.31f, 152.7f),
                    PathNode.CurveTo(49.811993f, 143.52425f, 33.203537f, 117.21841f, 36.313103f, 89.34962f),
                    PathNode.CurveTo(39.422672f, 61.48083f, 61.42083f, 39.48267f, 89.28962f, 36.373104f),
                    PathNode.CurveTo(117.15841f, 33.26354f, 143.46425f, 49.871998f, 152.64f, 76.37f),
                    PathNode.CurveTo(112.09399f, 79.988686f, 79.95869f, 112.123985f, 76.34f, 152.67f),
                    PathNode.Close,
                    PathNode.MoveTo(100.13f, 155.87f),
                    PathNode.CurveTo(100.834915f, 145.54823f, 104.21588f, 135.58801f, 109.94f, 126.97f),
                    PathNode.LineTo(129.06f, 146.0f),
                    PathNode.CurveTo(120.44498f, 151.73474f, 110.48454f, 155.12611f, 100.16f, 155.84f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 220.0f),
                    PathNode.CurveTo(134.45592f, 219.9653f, 111.725655f, 203.78497f, 103.33f, 179.66f),
                    PathNode.CurveTo(143.89798f, 176.0528f, 176.0528f, 143.89798f, 179.66f, 103.33f),
                    PathNode.CurveTo(207.30605f, 112.94568f, 223.97903f, 141.1064f, 219.11523f, 169.97003f),
                    PathNode.CurveTo(214.25145f, 198.83365f, 189.27054f, 219.97531f, 160.0f, 220.0f),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
