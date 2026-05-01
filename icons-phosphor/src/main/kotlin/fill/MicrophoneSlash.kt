package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorFillIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.38f, 229.92f),
                    PathNode.CurveTo(210.11035f, 232.89098f, 205.05144f, 232.64922f, 202.08f, 229.38f),
                    PathNode.LineTo(171.16f, 195.38f),
                    PathNode.CurveTo(160.58261f, 202.19814f, 148.5266f, 206.38481f, 136.0f, 207.59f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 207.6f),
                    PathNode.CurveTo(79.14537f, 203.44272f, 48.05046f, 169.06557f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 51.581722f, 120.0f, 56.0f, 120.0f),
                    PathNode.CurveTo(60.418278f, 120.0f, 64.0f, 123.58172f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.03858f, 163.33023f, 92.66977f, 191.96143f, 128.0f, 192.0f),
                    PathNode.CurveTo(139.31894f, 192.03334f, 150.44048f, 189.0363f, 160.21f, 183.32f),
                    PathNode.LineTo(149.11f, 171.12f),
                    PathNode.CurveTo(134.23117f, 178.40604f, 116.64684f, 177.50436f, 102.59131f, 168.73465f),
                    PathNode.CurveTo(88.53577f, 159.96494f, 79.996124f, 144.56702f, 80.0f, 128.0f),
                    PathNode.LineTo(80.0f, 95.09f),
                    PathNode.LineTo(42.08f, 53.38f),
                    PathNode.CurveTo(39.172737f, 50.102833f, 39.442047f, 45.0969f, 42.68412f, 42.15056f),
                    PathNode.CurveTo(45.926197f, 39.204212f, 50.934998f, 39.413486f, 53.92f, 42.62f),
                    PathNode.LineTo(213.92f, 218.62f),
                    PathNode.CurveTo(216.89098f, 221.88965f, 216.64922f, 226.94856f, 213.38f, 229.92f),
                    PathNode.Close,
                    PathNode.MoveTo(189.19f, 166.79f),
                    PathNode.CurveTo(190.28093f, 167.33087f, 191.48236f, 167.61153f, 192.7f, 167.61f),
                    PathNode.CurveTo(195.75781f, 167.61043f, 198.54839f, 165.86777f, 199.89f, 163.12f),
                    PathNode.CurveTo(205.25804f, 152.19273f, 208.03331f, 140.17456f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 123.58172f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(195.58173f, 120.0f, 192.0f, 123.58172f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0285f, 137.73701f, 189.81105f, 147.34944f, 185.52f, 156.09f),
                    PathNode.CurveTo(183.57948f, 160.05821f, 185.22241f, 164.8482f, 189.19f, 166.79f),
                    PathNode.Close,
                    PathNode.MoveTo(161.86f, 137.57f),
                    PathNode.CurveTo(163.98358f, 139.9073f, 167.28342f, 140.77666f, 170.28296f, 139.78905f),
                    PathNode.CurveTo(173.2825f, 138.80145f, 175.4204f, 136.14172f, 175.74f, 133.0f),
                    PathNode.CurveTo(175.91096f, 131.33879f, 175.99774f, 129.66998f, 176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(175.9748f, 41.276688f, 160.01935f, 21.684483f, 137.77188f, 17.058462f),
                    PathNode.CurveTo(115.52442f, 12.432441f, 93.081406f, 24.04027f, 84.0f, 44.87f),
                    PathNode.CurveTo(82.74343f, 47.755337f, 83.29526f, 51.109337f, 85.41f, 53.44f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
