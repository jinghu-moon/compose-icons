package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorRegularIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 36.418278f, 204.41827f, 40.0f, 200.0f, 40.0f),
                    PathNode.CurveTo(151.42178f, 40.055107f, 112.05511f, 79.42178f, 112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 204.69f),
                    PathNode.LineTo(146.34f, 170.34f),
                    PathNode.CurveTo(149.46593f, 167.21407f, 154.53407f, 167.21407f, 157.66f, 170.34f),
                    PathNode.CurveTo(160.78593f, 173.46593f, 160.78593f, 178.53407f, 157.66f, 181.66f),
                    PathNode.LineTo(109.66f, 229.66f),
                    PathNode.CurveTo(108.159454f, 231.16223f, 106.123276f, 232.00629f, 104.0f, 232.00629f),
                    PathNode.CurveTo(101.876724f, 232.00629f, 99.840546f, 231.16223f, 98.34f, 229.66f),
                    PathNode.LineTo(50.34f, 181.66f),
                    PathNode.CurveTo(47.21407f, 178.53407f, 47.21407f, 173.46593f, 50.34f, 170.34f),
                    PathNode.CurveTo(53.46593f, 167.21407f, 58.53407f, 167.21407f, 61.66f, 170.34f),
                    PathNode.LineTo(96.0f, 204.69f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.06063f, 70.58752f, 142.58752f, 24.060629f, 200.0f, 24.0f),
                    PathNode.CurveTo(204.41827f, 24.0f, 208.0f, 27.581722f, 208.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
