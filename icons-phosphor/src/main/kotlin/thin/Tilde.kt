package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorThinIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.12f, 128.09f),
                    PathNode.CurveTo(205.3f, 145.27f, 191.86f, 154.33f, 178.01f, 155.79f),
                    PathNode.CurveTo(176.68115f, 155.92865f, 175.34605f, 155.99873f, 174.01f, 156.0f),
                    PathNode.CurveTo(156.01f, 156.0f, 140.53f, 143.36f, 125.48f, 131.1f),
                    PathNode.CurveTo(109.91f, 118.42f, 95.19f, 106.44f, 78.84f, 108.17f),
                    PathNode.CurveTo(67.22f, 109.39f, 55.54f, 117.49f, 43.13f, 132.93f),
                    PathNode.CurveTo(41.727036f, 134.57301f, 39.2729f, 134.80502f, 37.58688f, 133.45406f),
                    PathNode.CurveTo(35.90086f, 132.10307f, 35.592327f, 129.65738f, 36.89f, 127.93f),
                    PathNode.CurveTo(50.7f, 110.73f, 64.14f, 101.67f, 78.0f, 100.21f),
                    PathNode.CurveTo(97.67f, 98.13f, 114.38f, 111.74f, 130.54f, 124.9f),
                    PathNode.CurveTo(146.11f, 137.58f, 160.83f, 149.56f, 177.18f, 147.83f),
                    PathNode.CurveTo(188.8f, 146.61f, 200.48f, 138.51f, 212.89f, 123.07f),
                    PathNode.CurveTo(213.76624f, 121.90361f, 215.208f, 121.306755f, 216.65227f, 121.51251f),
                    PathNode.CurveTo(218.09654f, 121.71828f, 219.31425f, 122.69401f, 219.8299f, 124.0587f),
                    PathNode.CurveTo(220.34555f, 125.423386f, 220.07733f, 126.96058f, 219.13f, 128.07f),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
