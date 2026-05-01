package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorBoldIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 76.0f),
                    PathNode.CurveTo(196.0f, 84.836555f, 188.83656f, 92.0f, 180.0f, 92.0f),
                    PathNode.CurveTo(171.16344f, 92.0f, 164.0f, 84.836555f, 164.0f, 76.0f),
                    PathNode.CurveTo(164.0f, 67.163445f, 171.16344f, 60.0f, 180.0f, 60.0f),
                    PathNode.CurveTo(188.83656f, 60.0f, 196.0f, 67.163445f, 196.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 98.74f),
                    PathNode.CurveTo(242.36908f, 143.94778f, 205.34679f, 179.80939f, 160.11f, 180.0f),
                    PathNode.LineTo(160.0f, 180.0f),
                    PathNode.CurveTo(151.99542f, 180.01247f, 144.03062f, 178.87416f, 136.35f, 176.62f),
                    PathNode.LineTo(128.49f, 184.49f),
                    PathNode.CurveTo(126.23763f, 186.73987f, 123.183556f, 188.0025f, 120.0f, 188.0f),
                    PathNode.LineTo(108.0f, 188.0f),
                    PathNode.LineTo(108.0f, 200.0f),
                    PathNode.CurveTo(108.0f, 206.62741f, 102.62742f, 212.0f, 96.0f, 212.0f),
                    PathNode.LineTo(84.0f, 212.0f),
                    PathNode.LineTo(84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 230.62741f, 78.62742f, 236.0f, 72.0f, 236.0f),
                    PathNode.LineTo(40.0f, 236.0f),
                    PathNode.CurveTo(28.954306f, 236.0f, 20.0f, 227.0457f, 20.0f, 216.0f),
                    PathNode.LineTo(20.0f, 187.31f),
                    PathNode.CurveTo(19.98563f, 182.00302f, 22.095879f, 176.91106f, 25.86f, 173.17f),
                    PathNode.LineTo(79.38f, 119.65f),
                    PathNode.CurveTo(70.11835f, 87.80198f, 80.464f, 53.48604f, 105.78555f, 32.064243f),
                    PathNode.CurveTo(131.10712f, 10.642446f, 166.66298f, 6.126147f, 196.53601f, 20.537138f),
                    PathNode.CurveTo(226.40904f, 34.948128f, 245.00534f, 65.58787f, 244.0f, 98.74f),
                    PathNode.Close,
                    PathNode.MoveTo(202.43f, 53.57f),
                    PathNode.CurveTo(190.72649f, 41.76117f, 174.6147f, 35.389713f, 158.0f, 36.0f),
                    PathNode.CurveTo(126.0f, 37.0f, 100.0f, 63.89f, 100.0f, 95.89f),
                    PathNode.CurveTo(99.97522f, 103.48654f, 101.40073f, 111.01798f, 104.2f, 118.08f),
                    PathNode.CurveTo(106.13045f, 122.590576f, 105.12059f, 127.822014f, 101.65f, 131.29f),
                    PathNode.LineTo(44.0f, 189.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 193.37259f, 65.37258f, 188.0f, 72.0f, 188.0f),
                    PathNode.LineTo(84.0f, 188.0f),
                    PathNode.LineTo(84.0f, 176.0f),
                    PathNode.CurveTo(84.0f, 169.37259f, 89.37258f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(115.0f, 164.0f),
                    PathNode.LineTo(124.65f, 154.35f),
                    PathNode.CurveTo(128.11981f, 150.87512f, 133.35667f, 149.86499f, 137.87f, 151.8f),
                    PathNode.CurveTo(144.9125f, 154.59438f, 152.42339f, 156.01984f, 160.0f, 156.0f),
                    PathNode.LineTo(160.08f, 156.0f),
                    PathNode.CurveTo(192.08f, 156.0f, 218.95f, 129.93f, 219.97f, 98.0f),
                    PathNode.CurveTo(220.57953f, 81.39126f, 214.22054f, 65.28347f, 202.43f, 53.57f),
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
        return _key!!
    }

private var _key: ImageVector? = null
