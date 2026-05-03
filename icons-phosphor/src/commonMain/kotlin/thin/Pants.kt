package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorThinIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.91f, 214.51f),
                    PathNode.LineTo(197.91f, 38.51f),
                    PathNode.CurveTo(197.1585f, 32.504475f, 192.05237f, 27.998556f, 186.0f, 28.0f),
                    PathNode.LineTo(70.0f, 28.0f),
                    PathNode.CurveTo(63.94764f, 27.998556f, 58.841503f, 32.504475f, 58.09f, 38.51f),
                    PathNode.LineTo(36.09f, 214.51f),
                    PathNode.CurveTo(35.662525f, 217.9261f, 36.722862f, 221.36127f, 39.00142f, 223.94211f),
                    PathNode.CurveTo(41.279976f, 226.52293f, 44.55725f, 228.00081f, 48.0f, 228.0f),
                    PathNode.LineTo(88.69f, 228.0f),
                    PathNode.CurveTo(94.18718f, 228.00262f, 98.98319f, 224.26964f, 100.33f, 218.94f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.LineTo(155.67f, 218.94f),
                    PathNode.CurveTo(157.01682f, 224.26964f, 161.81282f, 228.00262f, 167.31f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(211.44275f, 228.00081f, 214.72003f, 226.52293f, 216.99858f, 223.94211f),
                    PathNode.CurveTo(219.27715f, 221.36127f, 220.33748f, 217.9261f, 219.91f, 214.51f),
                    PathNode.Close,
                    PathNode.MoveTo(197.52f, 99.9f),
                    PathNode.CurveTo(180.17647f, 98.69971f, 166.16849f, 85.27661f, 164.23f, 68.0f),
                    PathNode.LineTo(193.53f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 36.0f),
                    PathNode.LineTo(186.0f, 36.0f),
                    PathNode.CurveTo(188.02776f, 35.984104f, 189.74658f, 37.488083f, 190.0f, 39.5f),
                    PathNode.LineTo(192.53f, 60.0f),
                    PathNode.LineTo(63.47f, 60.0f),
                    PathNode.LineTo(66.0f, 39.5f),
                    PathNode.CurveTo(66.25342f, 37.488083f, 67.972244f, 35.984104f, 70.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.47f, 68.0f),
                    PathNode.LineTo(91.77f, 68.0f),
                    PathNode.CurveTo(89.83153f, 85.27661f, 75.82354f, 98.69971f, 58.48f, 99.9f),
                    PathNode.Close,
                    PathNode.MoveTo(92.57f, 217.0f),
                    PathNode.CurveTo(92.11335f, 218.7686f, 90.5166f, 220.0032f, 88.69f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(46.846535f, 220.00905f, 45.745316f, 219.51971f, 44.978973f, 218.65758f),
                    PathNode.CurveTo(44.21263f, 217.79544f, 43.855778f, 216.64445f, 44.0f, 215.5f),
                    PathNode.LineTo(57.47f, 108.0f),
                    PathNode.CurveTo(79.6426f, 107.2315f, 97.78351f, 90.09317f, 99.81f, 68.0f),
                    PathNode.LineTo(124.0f, 68.0f),
                    PathNode.LineTo(124.0f, 95.49f),
                    PathNode.Close,
                    PathNode.MoveTo(211.0f, 218.65f),
                    PathNode.CurveTo(210.2399f, 219.50943f, 209.14734f, 220.00108f, 208.0f, 220.0f),
                    PathNode.LineTo(167.31f, 220.0f),
                    PathNode.CurveTo(165.46219f, 220.00093f, 163.85423f, 218.73605f, 163.42f, 216.94f),
                    PathNode.LineTo(132.0f, 95.49f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(156.19f, 68.0f),
                    PathNode.CurveTo(158.21648f, 90.09317f, 176.3574f, 107.2315f, 198.53f, 108.0f),
                    PathNode.LineTo(212.0f, 215.5f),
                    PathNode.CurveTo(212.13629f, 216.64505f, 211.7718f, 217.79323f, 211.0f, 218.65f),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
