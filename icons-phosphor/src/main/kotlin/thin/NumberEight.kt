package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorThinIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(147.08f, 119.64f),
                    PathNode.CurveTo(165.5799f, 110.73718f, 175.46391f, 90.223595f, 170.89818f, 70.20709f),
                    PathNode.CurveTo(166.33243f, 50.1906f, 148.53061f, 35.99213f, 128.0f, 35.99213f),
                    PathNode.CurveTo(107.46938f, 35.99213f, 89.66758f, 50.1906f, 85.10183f, 70.20709f),
                    PathNode.CurveTo(80.53609f, 90.223595f, 90.42011f, 110.73718f, 108.92f, 119.64f),
                    PathNode.CurveTo(85.68774f, 128.8036f, 72.25093f, 153.18906f, 76.91478f, 177.72389f),
                    PathNode.CurveTo(81.57863f, 202.25874f, 103.02582f, 220.01306f, 128.0f, 220.01306f),
                    PathNode.CurveTo(152.97418f, 220.01306f, 174.42137f, 202.25874f, 179.08522f, 177.72389f),
                    PathNode.CurveTo(183.74907f, 153.18906f, 170.31227f, 128.8036f, 147.08f, 119.64f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 80.0f),
                    PathNode.CurveTo(92.0f, 60.11775f, 108.11775f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(147.88223f, 44.0f, 164.0f, 60.11775f, 164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 99.88225f, 147.88223f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(108.11775f, 116.0f, 92.0f, 99.88225f, 92.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(103.69947f, 212.0f, 84.0f, 192.30052f, 84.0f, 168.0f),
                    PathNode.CurveTo(84.0f, 143.69948f, 103.69947f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(152.30052f, 124.0f, 172.0f, 143.69948f, 172.0f, 168.0f),
                    PathNode.CurveTo(171.97244f, 192.28911f, 152.28911f, 211.97244f, 128.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
