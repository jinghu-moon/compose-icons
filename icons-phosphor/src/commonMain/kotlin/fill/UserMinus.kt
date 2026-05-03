package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorFillIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.13f, 194.85f),
                    PathNode.CurveTo(200.13358f, 197.23167f, 200.57397f, 200.55917f, 199.25899f, 203.38007f),
                    PathNode.CurveTo(197.944f, 206.20096f, 195.11234f, 208.00316f, 192.0f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(20.889471f, 207.99927f, 18.061363f, 206.1956f, 16.748903f, 203.37553f),
                    PathNode.CurveTo(15.436442f, 200.55545f, 15.877598f, 197.23029f, 17.88f, 194.85f),
                    PathNode.CurveTo(32.82f, 177.07f, 51.4f, 164.44f, 72.05f, 157.68f),
                    PathNode.CurveTo(46.28388f, 141.63197f, 34.274868f, 110.44987f, 42.620495f, 81.26455f),
                    PathNode.CurveTo(50.96612f, 52.079227f, 77.6449f, 31.960009f, 108.0f, 31.960009f),
                    PathNode.CurveTo(138.3551f, 31.960009f, 165.03387f, 52.079227f, 173.3795f, 81.26455f),
                    PathNode.CurveTo(181.72514f, 110.44987f, 169.71613f, 141.63197f, 143.95f, 157.68f),
                    PathNode.CurveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(195.58173f, 128.0f, 192.0f, 131.58173f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 140.41827f, 195.58173f, 144.0f, 200.0f, 144.0f),
                    PathNode.LineTo(248.0f, 144.0f),
                    PathNode.CurveTo(252.41827f, 144.0f, 256.0f, 140.41827f, 256.0f, 136.0f),
                    PathNode.CurveTo(256.0f, 131.58173f, 252.41827f, 128.0f, 248.0f, 128.0f),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
