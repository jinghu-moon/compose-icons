package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorThinIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.21f, 76.42f),
                    PathNode.LineTo(110.21f, 108.42f),
                    PathNode.CurveTo(109.438644f, 108.81179f, 108.81179f, 109.438644f, 108.42f, 110.21f),
                    PathNode.LineTo(76.42f, 174.21f),
                    PathNode.CurveTo(75.79929f, 175.45041f, 75.8655f, 176.92384f, 76.59494f, 178.10358f),
                    PathNode.CurveTo(77.324394f, 179.28334f, 78.61295f, 180.00099f, 80.0f, 180.0f),
                    PathNode.CurveTo(80.62097f, 179.99908f, 81.23342f, 179.85538f, 81.79f, 179.58f),
                    PathNode.LineTo(145.79f, 147.58f),
                    PathNode.CurveTo(146.56136f, 147.1882f, 147.1882f, 146.56136f, 147.58f, 145.79f),
                    PathNode.LineTo(179.58f, 81.79f),
                    PathNode.CurveTo(180.35422f, 80.24899f, 180.05362f, 78.38528f, 178.83417f, 77.165825f),
                    PathNode.CurveTo(177.61473f, 75.94638f, 175.751f, 75.64578f, 174.21f, 76.42f),
                    PathNode.Close,
                    PathNode.MoveTo(141.0f, 141.0f),
                    PathNode.LineTo(88.92f, 167.0f),
                    PathNode.LineTo(115.0f, 115.0f),
                    PathNode.LineTo(167.08f, 89.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _compass!!
    }

private var _compass: ImageVector? = null
