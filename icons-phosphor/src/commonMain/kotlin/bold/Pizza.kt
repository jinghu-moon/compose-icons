package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorBoldIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.43f, 62.05f),
                    PathNode.CurveTo(242.18285f, 56.87976f, 238.9209f, 52.42248f, 234.37f, 49.67f),
                    PathNode.CurveTo(168.97386f, 10.110294f, 87.02614f, 10.110294f, 21.63f, 49.67f),
                    PathNode.CurveTo(17.097345f, 52.425507f, 13.845006f, 56.868797f, 12.588503f, 62.022335f),
                    PathNode.CurveTo(11.331999f, 67.17587f, 12.174265f, 72.617485f, 14.93f, 77.15f),
                    PathNode.LineTo(14.93f, 77.15f),
                    PathNode.LineTo(110.93f, 234.41f),
                    PathNode.CurveTo(114.55566f, 240.38718f, 121.03914f, 244.03745f, 128.03f, 244.03745f),
                    PathNode.CurveTo(135.02086f, 244.03745f, 141.50435f, 240.38718f, 145.13f, 234.41f),
                    PathNode.LineTo(241.13f, 77.15f),
                    PathNode.CurveTo(243.88322f, 72.626076f, 244.71146f, 67.18848f, 243.43f, 62.05f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(159.74568f, 43.972218f, 190.93988f, 52.29757f, 218.45f, 68.14f),
                    PathNode.LineTo(210.0f, 82.0f),
                    PathNode.CurveTo(159.24995f, 52.735126f, 96.75005f, 52.735126f, 46.0f, 82.0f),
                    PathNode.LineTo(37.55f, 68.14f),
                    PathNode.CurveTo(65.06011f, 52.29757f, 96.254326f, 43.972218f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.88f, 144.06f),
                    PathNode.LineTo(63.14f, 110.06f),
                    PathNode.CurveTo(69.340805f, 106.99599f, 76.68459f, 107.353264f, 82.558685f, 111.00472f),
                    PathNode.CurveTo(88.43278f, 114.65619f, 92.00331f, 121.08349f, 92.0f, 128.0f),
                    PathNode.CurveTo(91.9717f, 134.33293f, 88.96336f, 140.28293f, 83.88f, 144.06f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.36f),
                    PathNode.LineTo(96.44f, 164.65f),
                    PathNode.CurveTo(109.48049f, 155.96066f, 116.91548f, 140.99155f, 115.95967f, 125.3504f),
                    PathNode.CurveTo(115.00385f, 109.70927f, 105.80149f, 95.75683f, 91.8f, 88.72f),
                    PathNode.CurveTo(127.47313f, 79.23044f, 165.44809f, 84.16636f, 197.51f, 102.46f),
                    PathNode.LineTo(188.56f, 117.12f),
                    PathNode.CurveTo(167.98978f, 106.15247f, 142.43556f, 113.13166f, 130.29594f, 133.03268f),
                    PathNode.CurveTo(118.15633f, 152.9337f, 123.644905f, 178.84897f, 142.81f, 192.12f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 156.0f),
                    PathNode.CurveTo(148.00348f, 149.25548f, 151.40604f, 142.96695f, 157.04985f, 139.27428f),
                    PathNode.CurveTo(162.69368f, 135.5816f, 169.81854f, 134.9822f, 176.0f, 137.68f),
                    PathNode.LineTo(155.36f, 171.51f),
                    PathNode.CurveTo(150.69966f, 167.70941f, 147.99681f, 162.01358f, 148.0f, 156.0f),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
