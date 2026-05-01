package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorRegularIcon(
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
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.42f, 72.84f),
                    PathNode.LineTo(108.42f, 104.84f),
                    PathNode.CurveTo(106.872696f, 105.61725f, 105.61725f, 106.872696f, 104.84f, 108.42f),
                    PathNode.LineTo(72.84f, 172.42f),
                    PathNode.CurveTo(71.598595f, 174.90083f, 71.731f, 177.8477f, 73.189896f, 180.2072f),
                    PathNode.CurveTo(74.64879f, 182.56671f, 77.22591f, 184.00198f, 80.0f, 184.0f),
                    PathNode.CurveTo(81.24195f, 183.99815f, 82.46684f, 183.71075f, 83.58f, 183.16f),
                    PathNode.LineTo(147.58f, 151.16f),
                    PathNode.CurveTo(149.12732f, 150.38275f, 150.38275f, 149.12732f, 151.16f, 147.58f),
                    PathNode.LineTo(183.16f, 83.58f),
                    PathNode.CurveTo(184.70844f, 80.49799f, 184.10724f, 76.77055f, 181.66835f, 74.33166f),
                    PathNode.CurveTo(179.22945f, 71.89276f, 175.50201f, 71.291565f, 172.42f, 72.84f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 138.0f),
                    PathNode.LineTo(97.89f, 158.11f),
                    PathNode.LineTo(118.0f, 118.0f),
                    PathNode.LineTo(158.15f, 97.93f),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
