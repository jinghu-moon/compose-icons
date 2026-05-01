package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) return _arrowCircleDown!!
        _arrowCircleDown = phosphorFillIcon(
            name = "ArrowCircleDown",
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
                    PathNode.MoveTo(165.66f, 141.66f),
                    PathNode.LineTo(133.66f, 173.66f),
                    PathNode.CurveTo(132.15945f, 175.16223f, 130.12328f, 176.00629f, 128.0f, 176.00629f),
                    PathNode.CurveTo(125.876724f, 176.00629f, 123.840546f, 175.16223f, 122.34f, 173.66f),
                    PathNode.LineTo(90.34f, 141.66f),
                    PathNode.CurveTo(87.214066f, 138.53407f, 87.214066f, 133.46593f, 90.34f, 130.34f),
                    PathNode.CurveTo(93.465935f, 127.214066f, 98.534065f, 127.214066f, 101.66f, 130.34f),
                    PathNode.LineTo(120.0f, 148.69f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 148.69f),
                    PathNode.LineTo(154.34f, 130.34f),
                    PathNode.CurveTo(157.46593f, 127.214066f, 162.53407f, 127.214066f, 165.66f, 130.34f),
                    PathNode.CurveTo(168.78593f, 133.46593f, 168.78593f, 138.53407f, 165.66f, 141.66f),
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
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
