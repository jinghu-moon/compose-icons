package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorFillIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 191.0f, 55.18f, 200.0f, 64.0f, 200.0f),
                    PathNode.CurveTo(67.83071f, 199.93044f, 71.46739f, 198.3017f, 74.07f, 195.49f),
                    PathNode.CurveTo(76.93881f, 192.46417f, 81.622986f, 192.0767f, 84.95f, 194.59f),
                    PathNode.CurveTo(86.72002f, 195.98552f, 87.81921f, 198.06297f, 87.97723f, 200.31142f),
                    PathNode.CurveTo(88.13524f, 202.55984f, 87.337425f, 204.77063f, 85.78f, 206.4f),
                    PathNode.CurveTo(80.1501f, 212.4604f, 72.27162f, 215.93301f, 64.0f, 216.0f),
                    PathNode.CurveTo(46.35f, 216.0f, 32.0f, 199.85f, 32.0f, 180.0f),
                    PathNode.CurveTo(32.0f, 160.15f, 46.35f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(72.07638f, 144.05914f, 79.78775f, 147.37225f, 85.39f, 153.19f),
                    PathNode.CurveTo(88.455765f, 156.14577f, 88.771866f, 160.94786f, 86.12f, 164.28f),
                    PathNode.CurveTo(84.65736f, 166.01776f, 82.52498f, 167.05186f, 80.25476f, 167.12436f),
                    PathNode.CurveTo(77.98454f, 167.19685f, 75.79053f, 166.3009f, 74.22f, 164.66f),
                    PathNode.CurveTo(71.59573f, 161.77197f, 67.901276f, 160.0874f, 64.0f, 160.0f),
                    PathNode.CurveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(113.79086f, 232.0f, 112.0f, 230.20914f, 112.0f, 228.0f),
                    PathNode.LineTo(112.0f, 124.0f),
                    PathNode.CurveTo(112.0f, 121.79086f, 110.20914f, 120.0f, 108.0f, 120.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.CurveTo(41.79086f, 120.0f, 40.0f, 118.20914f, 40.0f, 116.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 88.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.LineTo(152.0f, 88.0f),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
