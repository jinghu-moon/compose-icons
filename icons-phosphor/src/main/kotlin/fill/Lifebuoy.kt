package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorFillIcon(
            name = "Lifebuoy",
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
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 110.32689f, 110.32689f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(145.67311f, 96.0f, 160.0f, 110.32689f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.28f, 60.4f),
                    PathNode.LineTo(155.79f, 88.9f),
                    PathNode.CurveTo(139.16322f, 77.034325f, 116.83678f, 77.034325f, 100.21f, 88.9f),
                    PathNode.LineTo(71.72f, 60.4f),
                    PathNode.CurveTo(104.30988f, 33.19867f, 151.69012f, 33.19867f, 184.28f, 60.4f),
                    PathNode.Close,
                    PathNode.MoveTo(71.72f, 195.6f),
                    PathNode.LineTo(100.21f, 167.1f),
                    PathNode.CurveTo(116.83678f, 178.96568f, 139.16322f, 178.96568f, 155.79f, 167.1f),
                    PathNode.LineTo(184.28f, 195.6f),
                    PathNode.CurveTo(151.69012f, 222.80133f, 104.30988f, 222.80133f, 71.72f, 195.6f),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
