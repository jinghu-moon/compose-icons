package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorLightIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.68f, 129.34f),
                    PathNode.CurveTo(206.51f, 146.96f, 192.62f, 156.26f, 178.22f, 157.78f),
                    PathNode.CurveTo(176.81808f, 157.92627f, 175.40953f, 157.9997f, 174.0f, 158.0f),
                    PathNode.CurveTo(155.36f, 158.0f, 139.56f, 145.13f, 124.24f, 132.65f),
                    PathNode.CurveTo(108.92f, 120.17f, 94.57f, 108.51f, 79.0f, 110.16f),
                    PathNode.CurveTo(67.94f, 111.32f, 56.7f, 119.16f, 44.64f, 134.16f),
                    PathNode.CurveTo(42.563408f, 136.74469f, 38.78469f, 137.15659f, 36.2f, 135.08f),
                    PathNode.CurveTo(33.615307f, 133.0034f, 33.20341f, 129.22469f, 35.28f, 126.64f),
                    PathNode.CurveTo(49.45f, 109.03f, 63.34f, 99.72f, 77.74f, 98.21f),
                    PathNode.CurveTo(98.26f, 96.03f, 115.28f, 109.91f, 131.74f, 123.33f),
                    PathNode.CurveTo(147.0f, 135.76f, 161.42f, 147.48f, 177.0f, 145.84f),
                    PathNode.CurveTo(188.06f, 144.68f, 199.3f, 136.84f, 211.36f, 121.84f),
                    PathNode.CurveTo(213.43658f, 119.25531f, 217.2153f, 118.84341f, 219.8f, 120.92f),
                    PathNode.CurveTo(222.38469f, 122.99659f, 222.79659f, 126.77531f, 220.72f, 129.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tilde!!
    }

private var _tilde: ImageVector? = null
