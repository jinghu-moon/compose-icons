package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorFillIcon(
            name = "Compass",
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
                    PathNode.MoveTo(179.58f, 81.79f),
                    PathNode.LineTo(147.58f, 145.79f),
                    PathNode.CurveTo(147.1882f, 146.56136f, 146.56136f, 147.1882f, 145.79f, 147.58f),
                    PathNode.LineTo(81.79f, 179.58f),
                    PathNode.CurveTo(80.24899f, 180.35422f, 78.38528f, 180.05362f, 77.165825f, 178.83417f),
                    PathNode.CurveTo(75.94638f, 177.61473f, 75.64578f, 175.751f, 76.42f, 174.21f),
                    PathNode.LineTo(108.42f, 110.21f),
                    PathNode.CurveTo(108.81179f, 109.438644f, 109.438644f, 108.81179f, 110.21f, 108.42f),
                    PathNode.LineTo(174.21f, 76.42f),
                    PathNode.CurveTo(175.751f, 75.64578f, 177.61473f, 75.94638f, 178.83417f, 77.165825f),
                    PathNode.CurveTo(180.05362f, 78.38528f, 180.35422f, 80.24899f, 179.58f, 81.79f),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
