package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorBoldIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 136.0f),
                    PathNode.CurveTo(196.0f, 144.83656f, 188.83656f, 152.0f, 180.0f, 152.0f),
                    PathNode.CurveTo(171.16344f, 152.0f, 164.0f, 144.83656f, 164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 127.163445f, 171.16344f, 120.0f, 180.0f, 120.0f),
                    PathNode.CurveTo(188.83656f, 120.0f, 196.0f, 127.163445f, 196.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 100.0f),
                    PathNode.LineTo(236.0f, 180.0f),
                    PathNode.CurveTo(236.0f, 197.67311f, 221.67311f, 212.0f, 204.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.CurveTo(42.32689f, 212.0f, 28.0f, 197.67311f, 28.0f, 180.0f),
                    PathNode.LineTo(28.0f, 60.92f),
                    PathNode.CurveTo(27.751347f, 52.274815f, 31.012674f, 43.89712f, 37.041f, 37.69548f),
                    PathNode.CurveTo(43.069324f, 31.49384f, 51.351246f, 27.996426f, 60.0f, 28.0f),
                    PathNode.LineTo(192.0f, 28.0f),
                    PathNode.CurveTo(198.62741f, 28.0f, 204.0f, 33.37258f, 204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 46.62742f, 198.62741f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.CurveTo(57.832443f, 51.998856f, 55.757195f, 52.877308f, 54.2492f, 54.43431f),
                    PathNode.CurveTo(52.741207f, 55.99131f, 51.92955f, 58.093582f, 52.0f, 60.26f),
                    PathNode.LineTo(52.0f, 60.34f),
                    PathNode.CurveTo(52.34885f, 64.737724f, 56.069565f, 68.098656f, 60.48f, 68.0f),
                    PathNode.LineTo(204.0f, 68.0f),
                    PathNode.CurveTo(221.67311f, 68.0f, 236.0f, 82.32689f, 236.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 100.0f),
                    PathNode.CurveTo(212.0f, 95.58172f, 208.41827f, 92.0f, 204.0f, 92.0f),
                    PathNode.LineTo(60.48f, 92.0f),
                    PathNode.CurveTo(57.61896f, 92.001205f, 54.7694f, 91.63829f, 52.0f, 90.92f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.CurveTo(52.0f, 184.41827f, 55.581722f, 188.0f, 60.0f, 188.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.CurveTo(208.41827f, 188.0f, 212.0f, 184.41827f, 212.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
