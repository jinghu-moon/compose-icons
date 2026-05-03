package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorThinIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 210.20914f, 170.20914f, 212.0f, 168.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(86.48491f, 212.0f, 85.09986f, 211.144f, 84.422295f, 209.78885f),
                    PathNode.CurveTo(83.74472f, 208.43372f, 83.890945f, 206.81207f, 84.8f, 205.6f),
                    PathNode.LineTo(156.74f, 109.68f),
                    PathNode.CurveTo(164.64082f, 99.42009f, 166.4225f, 85.70735f, 161.4059f, 73.76908f),
                    PathNode.CurveTo(156.3893f, 61.830814f, 145.34744f, 53.506687f, 132.48949f, 51.969864f),
                    PathNode.CurveTo(119.631546f, 50.433037f, 106.9389f, 55.920338f, 99.25f, 66.34f),
                    PathNode.CurveTo(97.55849f, 68.59184f, 96.13239f, 71.031296f, 95.0f, 73.61f),
                    PathNode.CurveTo(94.11359f, 75.634125f, 91.75412f, 76.55642f, 89.73f, 75.67f),
                    PathNode.CurveTo(87.70588f, 74.783585f, 86.783585f, 72.424126f, 87.67f, 70.4f),
                    PathNode.CurveTo(89.054146f, 67.252014f, 90.79916f, 64.27541f, 92.87f, 61.53f),
                    PathNode.CurveTo(107.50555f, 42.122715f, 135.1027f, 38.254456f, 154.51f, 52.89f),
                    PathNode.CurveTo(173.91728f, 67.52554f, 177.78555f, 95.12271f, 163.15f, 114.53f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.LineTo(168.0f, 204.0f),
                    PathNode.CurveTo(170.20914f, 204.0f, 172.0f, 205.79086f, 172.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
