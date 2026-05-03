package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorFillIcon(
            name = "PlayCircle",
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
                    PathNode.MoveTo(168.55f, 134.58f),
                    PathNode.LineTo(116.55f, 170.58f),
                    PathNode.CurveTo(114.10325f, 172.27188f, 110.919785f, 172.46645f, 108.2852f, 171.08513f),
                    PathNode.CurveTo(105.65062f, 169.70381f, 104.00003f, 166.97473f, 104.0f, 164.0f),
                    PathNode.LineTo(104.0f, 92.0f),
                    PathNode.CurveTo(104.00003f, 89.02526f, 105.65062f, 86.29619f, 108.2852f, 84.91487f),
                    PathNode.CurveTo(110.919785f, 83.53355f, 114.10325f, 83.72812f, 116.55f, 85.42f),
                    PathNode.LineTo(168.55f, 121.42f),
                    PathNode.CurveTo(170.71045f, 122.91397f, 171.99988f, 125.373314f, 171.99988f, 128.0f),
                    PathNode.CurveTo(171.99988f, 130.6267f, 170.71045f, 133.08603f, 168.55f, 134.58f),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
