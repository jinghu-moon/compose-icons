package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorFillIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 176.0f),
                    PathNode.CurveTo(164.41827f, 176.0f, 168.0f, 179.58173f, 168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 188.41827f, 164.41827f, 192.0f, 160.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(92.79917f, 191.99982f, 89.906555f, 190.09175f, 88.64647f, 187.14938f),
                    PathNode.CurveTo(87.38639f, 184.207f, 88.00143f, 180.7968f, 90.21f, 178.48f),
                    PathNode.LineTo(145.9f, 120.0f),
                    PathNode.CurveTo(154.13127f, 110.07021f, 153.04247f, 95.41024f, 143.4346f, 86.80538f),
                    PathNode.CurveTo(133.82674f, 78.20052f, 119.13586f, 78.72811f, 110.17f, 88.0f),
                    PathNode.CurveTo(108.94715f, 89.33221f, 107.88335f, 90.80208f, 107.0f, 92.38f),
                    PathNode.CurveTo(104.85437f, 96.245995f, 99.980995f, 97.640625f, 96.115f, 95.495f),
                    PathNode.CurveTo(92.24901f, 93.34937f, 90.85437f, 88.47599f, 93.0f, 84.61f),
                    PathNode.CurveTo(94.47597f, 81.9587f, 96.24724f, 79.48295f, 98.28f, 77.23f),
                    PathNode.CurveTo(113.06466f, 60.813335f, 138.35834f, 59.490337f, 154.775f, 74.275f),
                    PathNode.CurveTo(171.19167f, 89.05966f, 172.51465f, 114.35333f, 157.73f, 130.77f),
                    PathNode.LineTo(157.57f, 130.93f),
                    PathNode.LineTo(114.66f, 176.0f),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
