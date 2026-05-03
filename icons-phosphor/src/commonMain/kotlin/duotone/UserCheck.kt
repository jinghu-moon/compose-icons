package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorDuotoneIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 100.0f),
                    PathNode.CurveTo(168.0f, 133.13708f, 141.13708f, 160.0f, 108.0f, 160.0f),
                    PathNode.CurveTo(74.862915f, 160.0f, 48.0f, 133.13708f, 48.0f, 100.0f),
                    PathNode.CurveTo(48.0f, 66.862915f, 74.862915f, 40.0f, 108.0f, 40.0f),
                    PathNode.CurveTo(141.13708f, 40.0f, 168.0f, 66.862915f, 168.0f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 157.68f),
                    PathNode.CurveTo(169.76613f, 141.63197f, 181.77513f, 110.44987f, 173.4295f, 81.26455f),
                    PathNode.CurveTo(165.08388f, 52.079227f, 138.4051f, 31.960009f, 108.05f, 31.960009f),
                    PathNode.CurveTo(77.6949f, 31.960009f, 51.01612f, 52.079227f, 42.670498f, 81.26455f),
                    PathNode.CurveTo(34.324867f, 110.44987f, 46.333878f, 141.63197f, 72.1f, 157.68f),
                    PathNode.CurveTo(51.45f, 164.44f, 32.87f, 177.07f, 17.93f, 194.85f),
                    PathNode.CurveTo(15.085733f, 198.23274f, 15.522256f, 203.28073f, 18.905f, 206.12498f),
                    PathNode.CurveTo(22.287745f, 208.96927f, 27.335733f, 208.53275f, 30.18f, 205.15f),
                    PathNode.CurveTo(50.25f, 181.19f, 77.91f, 168.0f, 108.0f, 168.0f),
                    PathNode.CurveTo(138.09f, 168.0f, 165.75f, 181.19f, 185.87f, 205.15f),
                    PathNode.CurveTo(188.71425f, 208.53275f, 193.76225f, 208.96927f, 197.145f, 206.12498f),
                    PathNode.CurveTo(200.52774f, 203.28073f, 200.96425f, 198.23274f, 198.12f, 194.85f),
                    PathNode.CurveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 100.0f),
                    PathNode.CurveTo(56.0f, 71.2812f, 79.2812f, 48.0f, 108.0f, 48.0f),
                    PathNode.CurveTo(136.71881f, 48.0f, 160.0f, 71.2812f, 160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 128.71881f, 136.71881f, 152.0f, 108.0f, 152.0f),
                    PathNode.CurveTo(79.2949f, 151.96693f, 56.033066f, 128.7051f, 56.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(253.66f, 133.66f),
                    PathNode.LineTo(221.66f, 165.66f),
                    PathNode.CurveTo(220.15945f, 167.16223f, 218.12328f, 168.00629f, 216.0f, 168.00629f),
                    PathNode.CurveTo(213.87672f, 168.00629f, 211.84055f, 167.16223f, 210.34f, 165.66f),
                    PathNode.LineTo(194.34f, 149.66f),
                    PathNode.CurveTo(191.21407f, 146.53407f, 191.21407f, 141.46593f, 194.34f, 138.34f),
                    PathNode.CurveTo(197.46593f, 135.21407f, 202.53407f, 135.21407f, 205.66f, 138.34f),
                    PathNode.LineTo(216.0f, 148.69f),
                    PathNode.LineTo(242.34f, 122.34f),
                    PathNode.CurveTo(245.46593f, 119.214066f, 250.53407f, 119.214066f, 253.66f, 122.34f),
                    PathNode.CurveTo(256.78592f, 125.465935f, 256.78592f, 130.53407f, 253.66f, 133.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
