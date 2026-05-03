package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorFillIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 136.0f),
                    PathNode.CurveTo(256.0f, 140.41827f, 252.41827f, 144.0f, 248.0f, 144.0f),
                    PathNode.LineTo(232.0f, 144.0f),
                    PathNode.LineTo(232.0f, 160.0f),
                    PathNode.CurveTo(232.0f, 164.41827f, 228.41827f, 168.0f, 224.0f, 168.0f),
                    PathNode.CurveTo(219.58173f, 168.0f, 216.0f, 164.41827f, 216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.CurveTo(195.58173f, 144.0f, 192.0f, 140.41827f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 131.58173f, 195.58173f, 128.0f, 200.0f, 128.0f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 107.58172f, 219.58173f, 104.0f, 224.0f, 104.0f),
                    PathNode.CurveTo(228.41827f, 104.0f, 232.0f, 107.58172f, 232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 128.0f),
                    PathNode.LineTo(248.0f, 128.0f),
                    PathNode.CurveTo(252.41827f, 128.0f, 256.0f, 131.58173f, 256.0f, 136.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
