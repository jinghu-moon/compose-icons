package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorRegularIcon(
            name = "NumberCircleSix",
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
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(127.39f, 112.0f, 126.78f, 112.0f, 126.18f, 112.0f),
                    PathNode.LineTo(142.87f, 84.1f),
                    PathNode.CurveTo(145.13437f, 80.3058f, 143.8942f, 75.39437f, 140.1f, 73.13f),
                    PathNode.CurveTo(136.3058f, 70.86563f, 131.39436f, 72.105804f, 129.13f, 75.9f),
                    PathNode.LineTo(96.9f, 129.9f),
                    PathNode.CurveTo(88.70155f, 143.99544f, 91.00122f, 161.84132f, 102.50525f, 173.39784f),
                    PathNode.CurveTo(114.00928f, 184.95435f, 131.84451f, 187.33524f, 145.97713f, 179.20103f),
                    PathNode.CurveTo(160.10973f, 171.06683f, 167.01006f, 154.44908f, 162.7961f, 138.69667f),
                    PathNode.CurveTo(158.58212f, 122.944275f, 144.3063f, 111.99141f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(116.95431f, 168.0f, 108.0f, 159.0457f, 108.0f, 148.0f),
                    PathNode.CurveTo(108.0f, 136.9543f, 116.95431f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(139.0457f, 128.0f, 148.0f, 136.9543f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 159.0457f, 139.0457f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
