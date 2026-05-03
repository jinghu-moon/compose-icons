package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) return _checkCircle!!
        _checkCircle = phosphorFillIcon(
            name = "CheckCircle",
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
                    PathNode.MoveTo(173.66f, 109.66f),
                    PathNode.LineTo(117.66f, 165.66f),
                    PathNode.CurveTo(116.159454f, 167.16223f, 114.123276f, 168.00629f, 112.0f, 168.00629f),
                    PathNode.CurveTo(109.876724f, 168.00629f, 107.840546f, 167.16223f, 106.34f, 165.66f),
                    PathNode.LineTo(82.34f, 141.66f),
                    PathNode.CurveTo(79.214066f, 138.53407f, 79.214066f, 133.46593f, 82.34f, 130.34f),
                    PathNode.CurveTo(85.465935f, 127.214066f, 90.534065f, 127.214066f, 93.66f, 130.34f),
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
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
