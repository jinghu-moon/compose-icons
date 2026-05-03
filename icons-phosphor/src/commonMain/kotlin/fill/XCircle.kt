package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorFillIcon(
            name = "XCircle",
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
                    PathNode.MoveTo(165.66f, 154.34f),
                    PathNode.CurveTo(168.78593f, 157.46593f, 168.78593f, 162.53407f, 165.66f, 165.66f),
                    PathNode.CurveTo(162.53407f, 168.78593f, 157.46593f, 168.78593f, 154.34f, 165.66f),
                    PathNode.LineTo(128.0f, 139.31f),
                    PathNode.LineTo(101.66f, 165.66f),
                    PathNode.CurveTo(98.534065f, 168.78593f, 93.465935f, 168.78593f, 90.34f, 165.66f),
                    PathNode.CurveTo(87.214066f, 162.53407f, 87.214066f, 157.46593f, 90.34f, 154.34f),
                    PathNode.LineTo(116.69f, 128.0f),
                    PathNode.LineTo(90.34f, 101.66f),
                    PathNode.CurveTo(87.214066f, 98.534065f, 87.214066f, 93.465935f, 90.34f, 90.34f),
                    PathNode.CurveTo(93.465935f, 87.214066f, 98.534065f, 87.214066f, 101.66f, 90.34f),
                    PathNode.LineTo(128.0f, 116.69f),
                    PathNode.LineTo(154.34f, 90.34f),
                    PathNode.CurveTo(157.46593f, 87.214066f, 162.53407f, 87.214066f, 165.66f, 90.34f),
                    PathNode.CurveTo(168.78593f, 93.465935f, 168.78593f, 98.534065f, 165.66f, 101.66f),
                    PathNode.LineTo(139.31f, 128.0f),
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
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null
