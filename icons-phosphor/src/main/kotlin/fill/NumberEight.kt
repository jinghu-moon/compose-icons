package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorFillIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 92.0f),
                    PathNode.CurveTo(108.0f, 80.95431f, 116.95431f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(139.0457f, 72.0f, 148.0f, 80.95431f, 148.0f, 92.0f),
                    PathNode.CurveTo(148.0f, 103.04569f, 139.0457f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(116.95431f, 112.0f, 108.0f, 103.04569f, 108.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(112.536026f, 128.0f, 100.0f, 140.53603f, 100.0f, 156.0f),
                    PathNode.CurveTo(100.0f, 171.46397f, 112.536026f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(143.46397f, 184.0f, 156.0f, 171.46397f, 156.0f, 156.0f),
                    PathNode.CurveTo(156.0f, 140.53603f, 143.46397f, 128.0f, 128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 156.0f),
                    PathNode.CurveTo(171.99086f, 141.02808f, 164.36916f, 127.08824f, 151.77f, 119.0f),
                    PathNode.CurveTo(163.0221f, 109.10747f, 166.97098f, 93.28016f, 161.68474f, 79.26134f),
                    PathNode.CurveTo(156.3985f, 65.24251f, 142.98239f, 55.963226f, 128.0f, 55.963226f),
                    PathNode.CurveTo(113.01762f, 55.963226f, 99.601494f, 65.24251f, 94.315254f, 79.26134f),
                    PathNode.CurveTo(89.029015f, 93.28016f, 92.977905f, 109.10747f, 104.23f, 119.0f),
                    PathNode.CurveTo(86.47745f, 130.39655f, 79.31169f, 152.78923f, 87.14978f, 172.37491f),
                    PathNode.CurveTo(94.987885f, 191.96059f, 115.62392f, 203.22713f, 136.33755f, 199.22968f),
                    PathNode.CurveTo(157.0512f, 195.23224f, 172.01286f, 177.09584f, 172.0f, 156.0f),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
