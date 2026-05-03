package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorFillIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 134.62741f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(121.37258f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 169.37259f, 134.62741f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(121.37258f, 164.0f, 116.0f, 169.37259f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 182.62741f, 121.37258f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(134.62741f, 188.0f, 140.0f, 182.62741f, 140.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 84.0f),
                    PathNode.CurveTo(171.97244f, 59.71089f, 152.28911f, 40.027554f, 128.0f, 40.0f),
                    PathNode.CurveTo(88.82346f, 40.024246f, 54.38067f, 65.94377f, 43.510044f, 103.58194f),
                    PathNode.CurveTo(32.639423f, 141.22011f, 47.9591f, 181.51198f, 81.09f, 202.42f),
                    PathNode.CurveTo(73.39165f, 186.30962f, 74.49729f, 167.37613f, 84.01849f, 152.2713f),
                    PathNode.CurveTo(93.53969f, 137.16646f, 110.144775f, 128.00291f, 128.0f, 128.0f),
                    PathNode.CurveTo(152.28911f, 127.97244f, 171.97244f, 108.28911f, 172.0f, 84.0f),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
