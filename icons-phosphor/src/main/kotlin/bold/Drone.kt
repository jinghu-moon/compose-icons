package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = phosphorBoldIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.06f, 109.94f),
                    PathNode.CurveTo(29.769264f, 97.84784f, 24.908298f, 80.09262f, 29.325602f, 63.426186f),
                    PathNode.CurveTo(33.742905f, 46.75975f, 46.75975f, 33.742905f, 63.426186f, 29.325602f),
                    PathNode.CurveTo(80.09262f, 24.908298f, 97.84784f, 29.769264f, 109.94f, 42.06f),
                    PathNode.CurveTo(114.15125f, 46.809784f, 113.93486f, 54.017666f, 109.446266f, 58.506264f),
                    PathNode.CurveTo(104.957664f, 62.994865f, 97.74978f, 63.211254f, 93.0f, 59.0f),
                    PathNode.CurveTo(83.61116f, 49.61116f, 68.38884f, 49.61116f, 59.0f, 59.0f),
                    PathNode.CurveTo(49.61116f, 68.38884f, 49.61116f, 83.61116f, 59.0f, 93.0f),
                    PathNode.CurveTo(63.69442f, 97.69441f, 63.69442f, 105.30559f, 59.0f, 110.0f),
                    PathNode.CurveTo(54.30558f, 114.69441f, 46.69442f, 114.69441f, 42.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.0f, 59.0f),
                    PathNode.CurveTo(172.38882f, 49.61116f, 187.61118f, 49.61116f, 197.0f, 59.0f),
                    PathNode.CurveTo(206.38882f, 68.38884f, 206.38882f, 83.61116f, 197.0f, 93.0f),
                    PathNode.CurveTo(192.30557f, 97.69441f, 192.30557f, 105.30559f, 197.0f, 110.0f),
                    PathNode.CurveTo(201.69443f, 114.69441f, 209.30557f, 114.69441f, 214.0f, 110.0f),
                    PathNode.CurveTo(226.29074f, 97.90784f, 231.1517f, 80.15262f, 226.7344f, 63.486187f),
                    PathNode.CurveTo(222.3171f, 46.81975f, 209.30025f, 33.802902f, 192.63382f, 29.385603f),
                    PathNode.CurveTo(175.96738f, 24.9683f, 158.21216f, 29.829264f, 146.12f, 42.12f),
                    PathNode.CurveTo(141.42558f, 46.81442f, 141.42558f, 54.42558f, 146.12f, 59.12f),
                    PathNode.CurveTo(150.81442f, 63.81442f, 158.42558f, 63.81442f, 163.12f, 59.12f),
                    PathNode.Close,
                    PathNode.MoveTo(196.94f, 146.0f),
                    PathNode.CurveTo(194.68054f, 148.25162f, 193.41054f, 151.31018f, 193.41054f, 154.5f),
                    PathNode.CurveTo(193.41054f, 157.68982f, 194.68054f, 160.74838f, 196.94f, 163.0f),
                    PathNode.CurveTo(206.32884f, 172.37227f, 206.34227f, 187.58116f, 196.97f, 196.97f),
                    PathNode.CurveTo(187.59773f, 206.35884f, 172.38882f, 206.37227f, 163.0f, 197.0f),
                    PathNode.CurveTo(158.30557f, 192.30557f, 150.69443f, 192.30557f, 146.0f, 197.0f),
                    PathNode.CurveTo(141.30557f, 201.69443f, 141.30557f, 209.30557f, 146.0f, 214.0f),
                    PathNode.CurveTo(158.09216f, 226.29074f, 175.84738f, 231.1517f, 192.51381f, 226.7344f),
                    PathNode.CurveTo(209.18025f, 222.3171f, 222.1971f, 209.30025f, 226.6144f, 192.63382f),
                    PathNode.CurveTo(231.03171f, 175.96738f, 226.17073f, 158.21216f, 213.88f, 146.12f),
                    PathNode.CurveTo(209.22072f, 141.4771f, 201.69217f, 141.45035f, 197.0f, 146.06f),
                    PathNode.Close,
                    PathNode.MoveTo(93.0f, 197.0f),
                    PathNode.CurveTo(83.61116f, 206.38882f, 68.38884f, 206.38882f, 59.0f, 197.0f),
                    PathNode.CurveTo(49.61116f, 187.61118f, 49.61116f, 172.38882f, 59.0f, 163.0f),
                    PathNode.CurveTo(63.69442f, 158.30557f, 63.69442f, 150.69443f, 59.0f, 146.0f),
                    PathNode.CurveTo(54.30558f, 141.30557f, 46.69442f, 141.30557f, 42.0f, 146.0f),
                    PathNode.CurveTo(29.709263f, 158.09216f, 24.8483f, 175.84738f, 29.265602f, 192.51381f),
                    PathNode.CurveTo(33.682903f, 209.18025f, 46.699753f, 222.1971f, 63.366188f, 226.6144f),
                    PathNode.CurveTo(80.03262f, 231.03171f, 97.787834f, 226.17073f, 109.88f, 213.88f),
                    PathNode.CurveTo(114.57442f, 209.18558f, 114.57442f, 201.57442f, 109.88f, 196.88f),
                    PathNode.CurveTo(105.18558f, 192.18558f, 97.57442f, 192.18558f, 92.88f, 196.88f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 109.0f),
                    PathNode.LineTo(164.0f, 147.0f),
                    PathNode.LineTo(188.49f, 171.48f),
                    PathNode.CurveTo(193.18442f, 176.17442f, 193.18442f, 183.78558f, 188.49f, 188.48f),
                    PathNode.CurveTo(183.79558f, 193.17442f, 176.18442f, 193.17442f, 171.49f, 188.48f),
                    PathNode.LineTo(147.0f, 164.0f),
                    PathNode.LineTo(109.0f, 164.0f),
                    PathNode.LineTo(84.49f, 188.49f),
                    PathNode.CurveTo(79.79558f, 193.18442f, 72.18442f, 193.18442f, 67.49f, 188.49f),
                    PathNode.CurveTo(62.79558f, 183.79558f, 62.79558f, 176.18442f, 67.49f, 171.49f),
                    PathNode.LineTo(92.0f, 147.0f),
                    PathNode.LineTo(92.0f, 109.0f),
                    PathNode.LineTo(67.51f, 84.49f),
                    PathNode.CurveTo(62.81558f, 79.79558f, 62.81558f, 72.18442f, 67.51f, 67.49f),
                    PathNode.CurveTo(72.20442f, 62.79558f, 79.81558f, 62.79558f, 84.51f, 67.49f),
                    PathNode.LineTo(109.0f, 92.0f),
                    PathNode.LineTo(147.0f, 92.0f),
                    PathNode.LineTo(171.48f, 67.51f),
                    PathNode.CurveTo(176.17442f, 62.81558f, 183.78558f, 62.81558f, 188.48f, 67.51f),
                    PathNode.CurveTo(193.17442f, 72.20442f, 193.17442f, 79.81558f, 188.48f, 84.51f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 140.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _drone!!
    }

private var _drone: ImageVector? = null
