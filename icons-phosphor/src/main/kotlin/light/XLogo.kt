package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorLightIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.06f, 212.78f),
                    PathNode.LineTo(149.64f, 113.12f),
                    PathNode.LineTo(212.44f, 44.0f),
                    PathNode.CurveTo(214.10504f, 42.454533f, 214.75446f, 40.101227f, 214.11766f, 37.92055f),
                    PathNode.CurveTo(213.48088f, 35.739876f, 211.66711f, 34.105858f, 209.43204f, 33.699272f),
                    PathNode.CurveTo(207.19698f, 33.292686f, 204.92395f, 34.18328f, 203.56f, 36.0f),
                    PathNode.LineTo(143.0f, 102.62f),
                    PathNode.LineTo(101.1f, 36.78f),
                    PathNode.CurveTo(99.99172f, 35.037384f, 98.06515f, 33.98721f, 96.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(45.810875f, 34.00101f, 43.796047f, 35.19419f, 42.74282f, 37.113308f),
                    PathNode.CurveTo(41.6896f, 39.03242f, 41.765167f, 41.37283f, 42.94f, 43.22f),
                    PathNode.LineTo(106.36f, 142.88f),
                    PathNode.LineTo(43.56f, 212.0f),
                    PathNode.CurveTo(41.69497f, 214.48413f, 42.03432f, 217.98099f, 44.342197f, 220.06017f),
                    PathNode.CurveTo(46.65007f, 222.13933f, 50.163273f, 222.11322f, 52.44f, 220.0f),
                    PathNode.LineTo(113.0f, 153.38f),
                    PathNode.LineTo(154.9f, 219.22f),
                    PathNode.CurveTo(156.00827f, 220.9626f, 157.93486f, 222.01279f, 160.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(210.18913f, 221.999f, 212.20395f, 220.8058f, 213.25717f, 218.88669f),
                    PathNode.CurveTo(214.3104f, 216.96758f, 214.23483f, 214.62717f, 213.06f, 212.78f),
                    PathNode.Close,
                    PathNode.MoveTo(163.29f, 210.0f),
                    PathNode.LineTo(58.93f, 46.0f),
                    PathNode.LineTo(92.71f, 46.0f),
                    PathNode.LineTo(197.07f, 210.0f),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
