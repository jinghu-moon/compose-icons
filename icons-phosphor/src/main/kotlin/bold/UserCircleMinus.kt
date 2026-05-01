package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorBoldIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 49.37258f, 169.37259f, 44.0f, 176.0f, 44.0f),
                    PathNode.LineTo(224.0f, 44.0f),
                    PathNode.CurveTo(230.62741f, 44.0f, 236.0f, 49.37258f, 236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 62.62742f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(169.37259f, 68.0f, 164.0f, 62.62742f, 164.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.85f, 92.0f),
                    PathNode.CurveTo(245.53053f, 136.35126f, 230.69972f, 185.75075f, 193.18353f, 214.13116f),
                    PathNode.CurveTo(155.66733f, 242.51158f, 104.09632f, 243.34407f, 65.68366f, 216.18932f),
                    PathNode.CurveTo(27.271f, 189.03456f, 10.853478f, 140.13948f, 25.09435f, 95.30524f),
                    PathNode.CurveTo(39.33522f, 50.470978f, 80.95839f, 20.011597f, 128.0f, 20.0f),
                    PathNode.CurveTo(134.03085f, 19.99872f, 140.05144f, 20.497091f, 146.0f, 21.49f),
                    PathNode.CurveTo(152.53629f, 22.59457f, 156.93958f, 28.78871f, 155.835f, 35.325f),
                    PathNode.CurveTo(154.73042f, 41.861286f, 148.53629f, 46.26457f, 142.0f, 45.16f),
                    PathNode.CurveTo(137.37334f, 44.387703f, 132.69067f, 43.999714f, 128.0f, 44.0f),
                    PathNode.CurveTo(95.82351f, 43.97825f, 66.46612f, 62.35178f, 52.421524f, 91.30133f),
                    PathNode.CurveTo(38.376923f, 120.25088f, 42.116974f, 154.6813f, 62.05f, 179.94f),
                    PathNode.CurveTo(69.82789f, 170.04733f, 79.74168f, 162.04109f, 91.05f, 156.52f),
                    PathNode.CurveTo(70.930595f, 136.146f, 71.06809f, 103.34045f, 91.35759f, 83.13582f),
                    PathNode.CurveTo(111.64708f, 62.93119f, 144.45293f, 62.93119f, 164.74242f, 83.13582f),
                    PathNode.CurveTo(185.0319f, 103.34045f, 185.1694f, 136.146f, 165.05f, 156.52f),
                    PathNode.CurveTo(176.36057f, 162.03757f, 186.27509f, 170.04439f, 194.05f, 179.94f),
                    PathNode.CurveTo(211.86005f, 157.31578f, 216.83116f, 127.14183f, 207.22f, 100.0f),
                    PathNode.CurveTo(205.01086f, 93.7509f, 208.2859f, 86.89414f, 214.535f, 84.685f),
                    PathNode.CurveTo(220.7841f, 82.47586f, 227.64085f, 85.7509f, 229.85f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(143.46397f, 148.0f, 156.0f, 135.46397f, 156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 104.536026f, 143.46397f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(112.536026f, 92.0f, 100.0f, 104.536026f, 100.0f, 120.0f),
                    PathNode.CurveTo(100.0f, 135.46397f, 112.536026f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(145.35426f, 212.01247f, 162.2815f, 206.61938f, 176.43f, 196.57f),
                    PathNode.CurveTo(165.13129f, 181.12094f, 147.13986f, 171.98941f, 128.0f, 171.98941f),
                    PathNode.CurveTo(108.86013f, 171.98941f, 90.86871f, 181.12094f, 79.57f, 196.57f),
                    PathNode.CurveTo(93.7185f, 206.61938f, 110.64575f, 212.01247f, 128.0f, 212.0f),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
