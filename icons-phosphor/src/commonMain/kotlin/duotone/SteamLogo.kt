package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorDuotoneIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(74.98067f, 32.0f, 32.0f, 74.98067f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 181.01933f, 74.98067f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(181.01933f, 224.0f, 224.0f, 181.01933f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 74.98067f, 181.01933f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.81f, 129.61f),
                    PathNode.LineTo(112.72f, 179.43f),
                    PathNode.CurveTo(104.768875f, 185.9646f, 93.15663f, 185.39818f, 85.87923f, 178.12077f),
                    PathNode.CurveTo(78.60182f, 170.84337f, 78.03541f, 159.23112f, 84.57f, 151.28f),
                    PathNode.LineTo(134.39f, 90.19f),
                    PathNode.CurveTo(141.16646f, 81.98866f, 152.00533f, 78.33615f, 162.36345f, 80.76344f),
                    PathNode.CurveTo(172.72156f, 83.19073f, 180.80927f, 91.27844f, 183.23656f, 101.63655f),
                    PathNode.CurveTo(185.66385f, 111.99467f, 182.01134f, 122.83355f, 173.81f, 129.61f),
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
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.39f, 185.92f),
                    PathNode.LineTo(179.39f, 135.37f),
                    PathNode.CurveTo(189.8425f, 126.55885f, 194.40233f, 112.58761f, 191.16003f, 99.30685f),
                    PathNode.CurveTo(187.91774f, 86.02609f, 177.43286f, 75.72778f, 164.09604f, 72.72444f),
                    PathNode.CurveTo(150.75922f, 69.72109f, 136.87209f, 74.531006f, 128.25f, 85.14f),
                    PathNode.LineTo(85.25f, 137.87f),
                    PathNode.LineTo(45.28f, 98.0f),
                    PathNode.CurveTo(60.850616f, 55.10002f, 106.63399f, 31.222815f, 150.72435f, 43.008045f),
                    PathNode.CurveTo(194.81471f, 54.79327f, 222.57867f, 98.329475f, 214.66792f, 143.27692f),
                    PathNode.CurveTo(206.75717f, 188.22435f, 165.79726f, 219.66516f, 120.33256f, 215.68869f),
                    PathNode.CurveTo(74.86784f, 211.71223f, 39.987885f, 173.63828f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.00284f, 124.02664f, 40.2701f, 120.05787f, 40.8f, 116.12f),
                    PathNode.LineTo(75.37f, 150.69f),
                    PathNode.CurveTo(69.10341f, 162.3753f, 71.89234f, 176.85399f, 82.05122f, 185.37535f),
                    PathNode.CurveTo(92.210106f, 193.89671f, 106.95319f, 194.12407f, 117.37f, 185.92f),
                    PathNode.Close,
                    PathNode.MoveTo(121.58f, 118.55f),
                    PathNode.CurveTo(125.10965f, 129.95847f, 134.04153f, 138.89035f, 145.45f, 142.42f),
                    PathNode.LineTo(127.19f, 157.31f),
                    PathNode.CurveTo(124.67933f, 147.20815f, 116.791855f, 139.32068f, 106.69f, 136.81f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(144.9543f, 128.0f, 136.0f, 119.04569f, 136.0f, 108.0f),
                    PathNode.CurveTo(136.0f, 96.95431f, 144.9543f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(167.0457f, 88.0f, 176.0f, 96.95431f, 176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 119.04569f, 167.0457f, 128.0f, 156.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 152.0f),
                    PathNode.CurveTo(106.62742f, 152.0f, 112.0f, 157.37259f, 112.0f, 164.0f),
                    PathNode.CurveTo(112.0f, 170.62741f, 106.62742f, 176.0f, 100.0f, 176.0f),
                    PathNode.CurveTo(93.37258f, 176.0f, 88.0f, 170.62741f, 88.0f, 164.0f),
                    PathNode.CurveTo(88.0f, 157.37259f, 93.37258f, 152.0f, 100.0f, 152.0f),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
