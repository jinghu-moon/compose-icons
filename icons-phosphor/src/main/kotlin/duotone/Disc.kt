package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorDuotoneIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.00215f, 173.79926f, 191.65161f, 213.22214f, 146.73276f, 222.15907f),
                    PathNode.CurveTo(101.81391f, 231.09602f, 56.837345f, 207.05795f, 39.309036f, 164.74567f),
                    PathNode.CurveTo(21.780725f, 122.433365f, 36.582577f, 73.63147f, 74.66234f, 48.18537f),
                    PathNode.CurveTo(112.742096f, 22.739273f, 163.49396f, 27.736109f, 195.88f, 60.12f),
                    PathNode.LineTo(150.63f, 105.37f),
                    PathNode.LineTo(150.63f, 105.37f),
                    PathNode.CurveTo(139.83638f, 94.573906f, 122.919586f, 92.9057f, 110.225105f, 101.38557f),
                    PathNode.CurveTo(97.530624f, 109.86543f, 92.59398f, 126.13166f, 98.434166f, 140.23663f),
                    PathNode.CurveTo(104.27436f, 154.3416f, 119.264854f, 162.35695f, 134.23819f, 159.38089f),
                    PathNode.CurveTo(149.21153f, 156.40485f, 159.99754f, 143.26624f, 160.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.2f, 120.0f),
                    PathNode.CurveTo(166.1696f, 115.00186f, 164.18687f, 110.24876f, 161.36f, 106.0f),
                    PathNode.LineTo(195.59f, 71.76f),
                    PathNode.CurveTo(207.01682f, 85.44166f, 213.99448f, 102.28573f, 215.59f, 120.04f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(89.14869f, 216.02666f, 54.877262f, 190.57251f, 43.67623f, 153.37086f),
                    PathNode.CurveTo(32.4752f, 116.16923f, 46.99545f, 76.02441f, 79.40285f, 54.595795f),
                    PathNode.CurveTo(111.81025f, 33.16718f, 154.43512f, 35.52616f, 184.28f, 60.4f),
                    PathNode.LineTo(150.0f, 94.64f),
                    PathNode.CurveTo(135.318f, 84.97039f, 116.04343f, 86.02046f, 102.49879f, 97.227844f),
                    PathNode.CurveTo(88.95415f, 108.43524f, 84.31474f, 127.17257f, 91.0652f, 143.40508f),
                    PathNode.CurveTo(97.81567f, 159.63757f, 114.37346f, 169.55981f, 131.87108f, 167.85796f),
                    PathNode.CurveTo(149.36868f, 166.15608f, 163.7041f, 153.2291f, 167.2f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(211.44395f, 181.28595f, 173.47897f, 215.9453f, 128.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _disc!!
    }

private var _disc: ImageVector? = null
