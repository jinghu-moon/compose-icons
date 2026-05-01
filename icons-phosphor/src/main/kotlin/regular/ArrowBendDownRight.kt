package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorRegularIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 157.66f),
                    PathNode.LineTo(181.66f, 205.66f),
                    PathNode.CurveTo(178.53407f, 208.78593f, 173.46593f, 208.78593f, 170.34f, 205.66f),
                    PathNode.CurveTo(167.21407f, 202.53407f, 167.21407f, 197.46593f, 170.34f, 194.34f),
                    PathNode.LineTo(204.69f, 160.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.CurveTo(70.58752f, 159.93938f, 24.060629f, 113.41248f, 24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 51.581722f, 27.581722f, 48.0f, 32.0f, 48.0f),
                    PathNode.CurveTo(36.418278f, 48.0f, 40.0f, 51.581722f, 40.0f, 56.0f),
                    PathNode.CurveTo(40.055107f, 104.57822f, 79.42178f, 143.94489f, 128.0f, 144.0f),
                    PathNode.LineTo(204.69f, 144.0f),
                    PathNode.LineTo(170.34f, 109.66f),
                    PathNode.CurveTo(167.21407f, 106.534065f, 167.21407f, 101.465935f, 170.34f, 98.34f),
                    PathNode.CurveTo(173.46593f, 95.214066f, 178.53407f, 95.214066f, 181.66f, 98.34f),
                    PathNode.LineTo(229.66f, 146.34f),
                    PathNode.CurveTo(231.16223f, 147.84055f, 232.00629f, 149.87672f, 232.00629f, 152.0f),
                    PathNode.CurveTo(232.00629f, 154.12328f, 231.16223f, 156.15945f, 229.66f, 157.66f),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
