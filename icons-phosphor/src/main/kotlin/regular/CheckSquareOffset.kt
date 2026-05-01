package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorRegularIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(131.58173f, 224.0f, 128.0f, 220.41827f, 128.0f, 216.0f),
                    PathNode.CurveTo(128.0f, 211.58173f, 131.58173f, 208.0f, 136.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 148.41827f, 44.418278f, 152.0f, 40.0f, 152.0f),
                    PathNode.CurveTo(35.581722f, 152.0f, 32.0f, 148.41827f, 32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.66f, 154.34f),
                    PathNode.CurveTo(124.159454f, 152.83777f, 122.123276f, 151.99371f, 120.0f, 151.99371f),
                    PathNode.CurveTo(117.876724f, 151.99371f, 115.840546f, 152.83777f, 114.34f, 154.34f),
                    PathNode.LineTo(64.0f, 204.69f),
                    PathNode.LineTo(45.66f, 186.34f),
                    PathNode.CurveTo(42.53407f, 183.21407f, 37.46593f, 183.21407f, 34.34f, 186.34f),
                    PathNode.CurveTo(31.21407f, 189.46593f, 31.214067f, 194.53407f, 34.34f, 197.66f),
                    PathNode.LineTo(58.34f, 221.66f),
                    PathNode.CurveTo(59.840546f, 223.16223f, 61.876724f, 224.00629f, 64.0f, 224.00629f),
                    PathNode.CurveTo(66.123276f, 224.00629f, 68.159454f, 223.16223f, 69.66f, 221.66f),
                    PathNode.LineTo(125.66f, 165.66f),
                    PathNode.CurveTo(127.16222f, 164.15945f, 128.00629f, 162.12328f, 128.00629f, 160.0f),
                    PathNode.CurveTo(128.00629f, 157.87672f, 127.16222f, 155.84055f, 125.66f, 154.34f),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
