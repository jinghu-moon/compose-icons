package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorLightIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 86.0f),
                    PathNode.CurveTo(183.99443f, 85.931564f, 191.84096f, 88.15608f, 198.61f, 92.41f),
                    PathNode.CurveTo(201.6861f, 94.378426f, 205.5906f, 94.51344f, 208.79532f, 92.7622f),
                    PathNode.CurveTo(212.00003f, 91.010956f, 213.99524f, 87.651985f, 214.0f, 84.0f),
                    PathNode.LineTo(214.0f, 48.0f),
                    PathNode.CurveTo(214.0f, 40.268013f, 207.73198f, 34.0f, 200.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(48.268013f, 34.0f, 42.0f, 40.268013f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 215.73198f, 48.268013f, 222.0f, 56.0f, 222.0f),
                    PathNode.LineTo(200.0f, 222.0f),
                    PathNode.CurveTo(207.73198f, 222.0f, 214.0f, 215.73198f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 172.0f),
                    PathNode.CurveTo(213.99554f, 168.35423f, 212.00737f, 164.99977f, 208.81131f, 163.24568f),
                    PathNode.CurveTo(205.61523f, 161.4916f, 201.71783f, 161.61586f, 198.64f, 163.57f),
                    PathNode.CurveTo(191.01f, 168.46f, 184.53f, 170.33f, 176.24f, 169.99f),
                    PathNode.LineTo(176.0f, 169.99f),
                    PathNode.CurveTo(152.80405f, 169.99f, 134.0f, 151.18596f, 134.0f, 127.99f),
                    PathNode.CurveTo(134.0f, 104.79404f, 152.80405f, 85.99f, 176.0f, 85.99f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 128.0f),
                    PathNode.CurveTo(122.03287f, 157.76294f, 146.1172f, 181.90092f, 175.88f, 182.0f),
                    PathNode.CurveTo(185.0308f, 182.48524f, 194.12016f, 180.24771f, 202.0f, 175.57f),
                    PathNode.LineTo(202.0f, 208.0f),
                    PathNode.CurveTo(202.0f, 209.10457f, 201.10457f, 210.0f, 200.0f, 210.0f),
                    PathNode.LineTo(56.0f, 210.0f),
                    PathNode.CurveTo(54.89543f, 210.0f, 54.0f, 209.10457f, 54.0f, 208.0f),
                    PathNode.LineTo(54.0f, 48.0f),
                    PathNode.CurveTo(54.0f, 46.89543f, 54.89543f, 46.0f, 56.0f, 46.0f),
                    PathNode.LineTo(200.0f, 46.0f),
                    PathNode.CurveTo(201.10457f, 46.0f, 202.0f, 46.89543f, 202.0f, 48.0f),
                    PathNode.LineTo(202.0f, 80.48f),
                    PathNode.CurveTo(185.22218f, 71.45187f, 164.9393f, 71.88128f, 148.55861f, 81.611404f),
                    PathNode.CurveTo(132.17793f, 91.34153f, 122.098f, 108.94764f, 122.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
