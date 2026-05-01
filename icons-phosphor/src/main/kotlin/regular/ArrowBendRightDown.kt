package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorRegularIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 181.66f),
                    PathNode.LineTo(157.66f, 229.66f),
                    PathNode.CurveTo(156.15945f, 231.16223f, 154.12328f, 232.00629f, 152.0f, 232.00629f),
                    PathNode.CurveTo(149.87672f, 232.00629f, 147.84055f, 231.16223f, 146.34f, 229.66f),
                    PathNode.LineTo(98.34f, 181.66f),
                    PathNode.CurveTo(95.214066f, 178.53407f, 95.214066f, 173.46593f, 98.34f, 170.34f),
                    PathNode.CurveTo(101.465935f, 167.21407f, 106.534065f, 167.21407f, 109.66f, 170.34f),
                    PathNode.LineTo(144.0f, 204.69f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(143.94489f, 79.42178f, 104.57822f, 40.055107f, 56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 36.418278f, 48.0f, 32.0f),
                    PathNode.CurveTo(48.0f, 27.581722f, 51.581722f, 24.0f, 56.0f, 24.0f),
                    PathNode.CurveTo(113.41248f, 24.060629f, 159.93938f, 70.58752f, 160.0f, 128.0f),
                    PathNode.LineTo(160.0f, 204.69f),
                    PathNode.LineTo(194.34f, 170.34f),
                    PathNode.CurveTo(197.46593f, 167.21407f, 202.53407f, 167.21407f, 205.66f, 170.34f),
                    PathNode.CurveTo(208.78593f, 173.46593f, 208.78593f, 178.53407f, 205.66f, 181.66f),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
