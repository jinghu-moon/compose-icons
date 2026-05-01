package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorThinIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.13f, 53.06f),
                    PathNode.CurveTo(188.455f, 37.048416f, 166.99706f, 28.016903f, 144.59f, 28.0f),
                    PathNode.LineTo(144.27f, 28.0f),
                    PathNode.CurveTo(121.969536f, 27.93856f, 100.57199f, 36.804386f, 84.85f, 52.62f),
                    PathNode.LineTo(23.46f, 114.8f),
                    PathNode.CurveTo(18.807318f, 119.480446f, 18.807318f, 127.03955f, 23.46f, 131.72f),
                    PathNode.LineTo(52.13f, 160.38f),
                    PathNode.CurveTo(54.373f, 162.63774f, 57.427498f, 163.90205f, 60.61f, 163.89f),
                    PathNode.LineTo(60.68f, 163.89f),
                    PathNode.CurveTo(63.888405f, 163.87405f, 66.9568f, 162.57396f, 69.2f, 160.28f),
                    PathNode.LineTo(130.09f, 97.86f),
                    PathNode.CurveTo(137.81522f, 90.21438f, 150.2188f, 90.09477f, 158.09f, 97.59f),
                    PathNode.CurveTo(161.90138f, 101.25295f, 164.06606f, 106.303856f, 164.09f, 111.59f),
                    PathNode.CurveTo(164.14725f, 117.14443f, 161.98785f, 122.49252f, 158.09f, 126.45f),
                    PathNode.LineTo(95.76f, 186.75f),
                    PathNode.CurveTo(93.456894f, 188.98901f, 92.14757f, 192.05789f, 92.125015f, 195.2699f),
                    PathNode.CurveTo(92.10246f, 198.4819f, 93.36856f, 201.56886f, 95.64f, 203.84f),
                    PathNode.LineTo(124.3f, 232.5f),
                    PathNode.CurveTo(128.95496f, 237.15506f, 136.49117f, 237.19075f, 141.19f, 232.58f),
                    PathNode.LineTo(203.0f, 172.12f),
                    PathNode.CurveTo(235.88f, 139.21f, 236.4f, 85.8f, 204.13f, 53.06f),
                    PathNode.Close,
                    PathNode.MoveTo(63.51f, 154.69f),
                    PathNode.CurveTo(62.76871f, 155.45763f, 61.74713f, 155.89082f, 60.68f, 155.89f),
                    PathNode.LineTo(60.68f, 155.89f),
                    PathNode.CurveTo(59.618816f, 155.89084f, 58.60079f, 155.46996f, 57.85f, 154.72f),
                    PathNode.LineTo(29.16f, 126.06f),
                    PathNode.CurveTo(27.609106f, 124.49985f, 27.609106f, 121.98015f, 29.16f, 120.42f),
                    PathNode.LineTo(55.79f, 93.42f),
                    PathNode.LineTo(89.94f, 127.6f),
                    PathNode.Close,
                    PathNode.MoveTo(135.59f, 226.87f),
                    PathNode.CurveTo(134.03102f, 228.41428f, 131.51898f, 228.41428f, 129.96f, 226.87f),
                    PathNode.LineTo(101.29f, 198.21f),
                    PathNode.CurveTo(100.52966f, 197.45854f, 100.10175f, 196.43402f, 100.10175f, 195.365f),
                    PathNode.CurveTo(100.10175f, 194.29599f, 100.52966f, 193.27145f, 101.29f, 192.52f),
                    PathNode.LineTo(128.49f, 166.22f),
                    PathNode.LineTo(162.65f, 200.37f),
                    PathNode.Close,
                    PathNode.MoveTo(197.35f, 166.43f),
                    PathNode.LineTo(168.41f, 194.75f),
                    PathNode.LineTo(134.29f, 160.63f),
                    PathNode.LineTo(163.7f, 132.19f),
                    PathNode.CurveTo(169.13707f, 126.70326f, 172.16055f, 119.27414f, 172.1f, 111.55f),
                    PathNode.CurveTo(172.07867f, 104.10986f, 169.04466f, 96.99563f, 163.69f, 91.83f),
                    PathNode.CurveTo(152.65524f, 81.31299f, 135.25266f, 81.49478f, 124.44f, 92.24f),
                    PathNode.LineTo(95.53f, 121.87f),
                    PathNode.LineTo(61.4f, 87.75f),
                    PathNode.LineTo(90.52f, 58.26f),
                    PathNode.CurveTo(104.74441f, 43.958797f, 124.09936f, 35.94315f, 144.27f, 36.0f),
                    PathNode.LineTo(144.56f, 36.0f),
                    PathNode.CurveTo(164.83127f, 36.02148f, 184.24307f, 44.190502f, 198.43f, 58.67f),
                    PathNode.CurveTo(227.63f, 88.3f, 227.13f, 136.65f, 197.35f, 166.43f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
