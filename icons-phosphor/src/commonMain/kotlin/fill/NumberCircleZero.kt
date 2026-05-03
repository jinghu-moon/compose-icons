package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorFillIcon(
            name = "NumberCircleZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 142.86f, 150.1f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(105.9f, 168.0f, 100.0f, 142.86f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 113.14f, 105.9f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.1f, 88.0f, 156.0f, 113.14f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 113.75f, 168.44f, 100.47f, 162.0f, 90.61f),
                    PathNode.CurveTo(154.0f, 78.44f, 142.23f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(113.77f, 72.0f, 102.0f, 78.44f, 94.0f, 90.61f),
                    PathNode.CurveTo(87.53f, 100.47f, 84.0f, 113.75f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 142.25f, 87.56f, 155.53f, 94.0f, 165.39f),
                    PathNode.CurveTo(102.0f, 177.57f, 113.74f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(142.26f, 184.0f, 154.0f, 177.57f, 162.0f, 165.39f),
                    PathNode.CurveTo(168.44f, 155.53f, 172.0f, 142.25f, 172.0f, 128.0f),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
