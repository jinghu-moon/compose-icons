package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorRegularIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 133.66f),
                    PathNode.LineTo(133.66f, 213.66f),
                    PathNode.CurveTo(130.53407f, 216.78593f, 125.465935f, 216.78593f, 122.34f, 213.66f),
                    PathNode.CurveTo(119.214066f, 210.53407f, 119.214066f, 205.46593f, 122.34f, 202.34f),
                    PathNode.LineTo(202.34f, 122.34f),
                    PathNode.CurveTo(205.46593f, 119.214066f, 210.53407f, 119.214066f, 213.66f, 122.34f),
                    PathNode.CurveTo(216.78593f, 125.465935f, 216.78593f, 130.53407f, 213.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(197.66f, 34.34f),
                    PathNode.CurveTo(196.15945f, 32.837784f, 194.12328f, 31.993708f, 192.0f, 31.993708f),
                    PathNode.CurveTo(189.87672f, 31.993708f, 187.84055f, 32.837784f, 186.34f, 34.34f),
                    PathNode.LineTo(34.34f, 186.34f),
                    PathNode.CurveTo(31.214067f, 189.46593f, 31.21407f, 194.53407f, 34.34f, 197.66f),
                    PathNode.CurveTo(37.46593f, 200.78593f, 42.53407f, 200.78593f, 45.66f, 197.66f),
                    PathNode.LineTo(197.66f, 45.66f),
                    PathNode.CurveTo(199.16223f, 44.159454f, 200.00629f, 42.123276f, 200.00629f, 40.0f),
                    PathNode.CurveTo(200.00629f, 37.876724f, 199.16223f, 35.840546f, 197.66f, 34.34f),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
