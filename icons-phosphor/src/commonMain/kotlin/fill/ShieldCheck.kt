package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorFillIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(39.163445f, 40.0f, 32.0f, 47.163445f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 164.72f, 57.52f, 196.67f, 78.93f, 214.19f),
                    PathNode.CurveTo(101.99f, 233.05f, 124.93f, 239.45f, 125.93f, 239.72f),
                    PathNode.CurveTo(127.305016f, 240.09406f, 128.75499f, 240.09406f, 130.13f, 239.72f),
                    PathNode.CurveTo(131.13f, 239.45f, 154.04f, 233.05f, 177.13f, 214.19f),
                    PathNode.CurveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 47.163445f, 216.83656f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.68f, 109.66f),
                    PathNode.LineTo(117.68f, 165.66f),
                    PathNode.CurveTo(116.17945f, 167.16223f, 114.14327f, 168.00629f, 112.02f, 168.00629f),
                    PathNode.CurveTo(109.89673f, 168.00629f, 107.86054f, 167.16223f, 106.36f, 165.66f),
                    PathNode.LineTo(82.36f, 141.66f),
                    PathNode.CurveTo(79.23407f, 138.53407f, 79.23407f, 133.46593f, 82.36f, 130.34f),
                    PathNode.CurveTo(85.48593f, 127.214066f, 90.55407f, 127.214066f, 93.68f, 130.34f),
                    PathNode.LineTo(112.0f, 148.69f),
                    PathNode.LineTo(162.34f, 98.34f),
                    PathNode.CurveTo(165.46593f, 95.214066f, 170.53407f, 95.214066f, 173.66f, 98.34f),
                    PathNode.CurveTo(176.78593f, 101.465935f, 176.78593f, 106.534065f, 173.66f, 109.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
