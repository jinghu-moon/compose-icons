package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorDuotoneIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 88.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 142.92795f, 158.92795f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(97.07206f, 168.0f, 72.0f, 142.92795f, 72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(72.0f, 57.072056f, 97.07206f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(158.92795f, 32.0f, 184.0f, 57.072056f, 184.0f, 88.0f),
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
                    PathNode.MoveTo(184.0f, 24.0f),
                    PathNode.CurveTo(179.58173f, 24.0f, 176.0f, 27.581722f, 176.0f, 32.0f),
                    PathNode.LineTo(176.0f, 45.74f),
                    PathNode.CurveTo(158.40306f, 25.786901f, 130.2974f, 18.800766f, 105.406235f, 28.192732f),
                    PathNode.CurveTo(80.51508f, 37.584698f, 64.02992f, 61.39591f, 64.0f, 88.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.CurveTo(64.02992f, 138.6041f, 80.51508f, 162.4153f, 105.406235f, 171.80727f),
                    PathNode.CurveTo(130.2974f, 181.19923f, 158.40306f, 174.2131f, 176.0f, 154.26f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(175.97244f, 194.49825f, 154.49825f, 215.97244f, 128.0f, 216.0f),
                    PathNode.CurveTo(111.55f, 216.0f, 95.28f, 207.92f, 86.56f, 195.42f),
                    PathNode.CurveTo(84.03053f, 191.79701f, 79.04299f, 190.91054f, 75.42f, 193.44f),
                    PathNode.CurveTo(71.79701f, 195.96947f, 70.91054f, 200.957f, 73.44f, 204.58f),
                    PathNode.CurveTo(85.06f, 221.24f, 106.48f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(163.33023f, 231.96143f, 191.96143f, 203.33023f, 192.0f, 168.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(192.0f, 27.581722f, 188.41827f, 24.0f, 184.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(101.501755f, 159.97244f, 80.02756f, 138.49825f, 80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(80.0f, 61.490334f, 101.49033f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(154.50967f, 40.0f, 176.0f, 61.490334f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.CurveTo(175.97244f, 138.49825f, 154.49825f, 159.97244f, 128.0f, 160.0f),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
