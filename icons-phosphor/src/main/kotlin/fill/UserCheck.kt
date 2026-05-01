package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorFillIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 157.68f),
                    PathNode.CurveTo(169.76613f, 141.63197f, 181.77513f, 110.44987f, 173.4295f, 81.26455f),
                    PathNode.CurveTo(165.08388f, 52.079227f, 138.4051f, 31.960009f, 108.05f, 31.960009f),
                    PathNode.CurveTo(77.6949f, 31.960009f, 51.01612f, 52.079227f, 42.670498f, 81.26455f),
                    PathNode.CurveTo(34.324867f, 110.44987f, 46.333878f, 141.63197f, 72.1f, 157.68f),
                    PathNode.CurveTo(51.45f, 164.44f, 32.87f, 177.07f, 17.93f, 194.85f),
                    PathNode.CurveTo(15.933311f, 197.22336f, 15.488366f, 200.53696f, 16.788233f, 203.35298f),
                    PathNode.CurveTo(18.088099f, 206.169f, 20.898514f, 207.97993f, 24.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(195.11234f, 208.00316f, 197.944f, 206.20096f, 199.25899f, 203.38007f),
                    PathNode.CurveTo(200.57397f, 200.55917f, 200.13358f, 197.23167f, 198.13f, 194.85f),
                    PathNode.CurveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
