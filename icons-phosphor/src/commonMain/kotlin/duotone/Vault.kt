package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorDuotoneIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 168.0f),
                    PathNode.CurveTo(129.90862f, 168.0f, 112.0f, 150.09138f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 105.90861f, 129.90862f, 88.0f, 152.0f, 88.0f),
                    PathNode.CurveTo(174.09138f, 88.0f, 192.0f, 105.90861f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 150.09138f, 174.09138f, 168.0f, 152.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 228.41827f, 59.581722f, 232.0f, 64.0f, 232.0f),
                    PathNode.CurveTo(68.41828f, 232.0f, 72.0f, 228.41827f, 72.0f, 224.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 228.41827f, 187.58173f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(196.41827f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.LineTo(199.32f, 120.0f),
                    PathNode.CurveTo(195.16109f, 95.39551f, 172.8434f, 78.08137f, 147.9773f, 80.16814f),
                    PathNode.CurveTo(123.1112f, 82.254906f, 103.99136f, 103.046486f, 103.99136f, 128.0f),
                    PathNode.CurveTo(103.99136f, 152.9535f, 123.1112f, 173.7451f, 147.9773f, 175.83186f),
                    PathNode.CurveTo(172.8434f, 177.91864f, 195.16109f, 160.60449f, 199.32f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.84f, 120.0f),
                    PathNode.CurveTo(162.21916f, 113.7285f, 154.83742f, 110.6709f, 147.84248f, 112.54519f),
                    PathNode.CurveTo(140.84755f, 114.41947f, 135.9836f, 120.75831f, 135.9836f, 128.0f),
                    PathNode.CurveTo(135.9836f, 135.24168f, 140.84755f, 141.58052f, 147.84248f, 143.45482f),
                    PathNode.CurveTo(154.83742f, 145.3291f, 162.21916f, 142.27148f, 165.84f, 136.0f),
                    PathNode.LineTo(183.0f, 136.0f),
                    PathNode.CurveTo(178.97147f, 151.60245f, 163.96971f, 161.7754f, 147.984f, 159.74495f),
                    PathNode.CurveTo(131.99829f, 157.7145f, 120.016136f, 144.11415f, 120.016136f, 128.0f),
                    PathNode.CurveTo(120.016136f, 111.88586f, 131.99829f, 98.2855f, 147.984f, 96.25505f),
                    PathNode.CurveTo(163.96971f, 94.2246f, 178.97147f, 104.397545f, 183.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _vault!!
    }

private var _vault: ImageVector? = null
