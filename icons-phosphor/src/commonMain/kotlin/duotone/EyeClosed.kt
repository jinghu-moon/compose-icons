package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorDuotoneIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.CurveTo(207.19f, 124.81f, 176.37f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(79.63f, 152.0f, 48.81f, 124.81f, 32.0f, 104.0f),
                    PathNode.CurveTo(48.81f, 83.19f, 79.63f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(176.37f, 56.0f, 207.19f, 83.19f, 224.0f, 104.0f),
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
                    PathNode.MoveTo(228.0f, 175.0f),
                    PathNode.CurveTo(226.15456f, 176.05234f, 223.96634f, 176.32745f, 221.91783f, 175.76468f),
                    PathNode.CurveTo(219.86934f, 175.2019f, 218.12878f, 173.84746f, 217.08f, 172.0f),
                    PathNode.LineTo(198.08f, 138.8f),
                    PathNode.CurveTo(187.03389f, 146.26878f, 174.84882f, 151.89526f, 162.0f, 155.46f),
                    PathNode.LineTo(167.87f, 190.68f),
                    PathNode.CurveTo(168.2198f, 192.77402f, 167.72289f, 194.9212f, 166.48872f, 196.64867f),
                    PathNode.CurveTo(165.25456f, 198.37613f, 163.38435f, 199.54218f, 161.29f, 199.89f),
                    PathNode.CurveTo(160.86348f, 199.9598f, 160.43219f, 199.99658f, 160.0f, 200.0f),
                    PathNode.CurveTo(156.09184f, 199.99413f, 152.75996f, 197.1654f, 152.12f, 193.31f),
                    PathNode.LineTo(146.35f, 158.73f),
                    PathNode.CurveTo(134.18196f, 160.42331f, 121.838036f, 160.42331f, 109.67f, 158.73f),
                    PathNode.LineTo(103.9f, 193.31f),
                    PathNode.CurveTo(103.258804f, 197.17287f, 99.915726f, 200.0039f, 96.0f, 200.0f),
                    PathNode.CurveTo(95.55779f, 199.99814f, 95.11642f, 199.96135f, 94.68f, 199.89f),
                    PathNode.CurveTo(92.58565f, 199.54218f, 90.71545f, 198.37613f, 89.48128f, 196.64867f),
                    PathNode.CurveTo(88.24711f, 194.9212f, 87.750206f, 192.77402f, 88.1f, 190.68f),
                    PathNode.LineTo(94.0f, 155.46f),
                    PathNode.CurveTo(81.156296f, 151.88396f, 68.97802f, 146.24738f, 57.94f, 138.77f),
                    PathNode.LineTo(39.0f, 172.0f),
                    PathNode.CurveTo(36.79086f, 175.84943f, 31.879425f, 177.17914f, 28.03f, 174.97f),
                    PathNode.CurveTo(24.180574f, 172.76086f, 22.85086f, 167.84943f, 25.06f, 164.0f),
                    PathNode.LineTo(45.06f, 129.0f),
                    PathNode.CurveTo(38.034992f, 122.9308f, 31.575176f, 116.23669f, 25.76f, 109.0f),
                    PathNode.CurveTo(23.784216f, 106.79399f, 23.188726f, 103.67698f, 24.212156f, 100.89799f),
                    PathNode.CurveTo(25.235586f, 98.118996f, 27.710484f, 96.13272f, 30.645119f, 95.7351f),
                    PathNode.CurveTo(33.579754f, 95.33747f, 36.493973f, 96.593544f, 38.22f, 99.0f),
                    PathNode.CurveTo(54.82f, 119.54f, 83.86f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(172.14f, 144.0f, 201.18f, 119.51f, 217.78f, 99.0f),
                    PathNode.CurveTo(219.48706f, 96.54324f, 222.42221f, 95.24421f, 225.38849f, 95.63265f),
                    PathNode.CurveTo(228.35478f, 96.0211f, 230.85648f, 98.032104f, 231.87337f, 100.84558f),
                    PathNode.CurveTo(232.89027f, 103.65905f, 232.25246f, 106.80481f, 230.22f, 109.0f),
                    PathNode.CurveTo(224.40483f, 116.23669f, 217.945f, 122.9308f, 210.92f, 129.0f),
                    PathNode.LineTo(230.92f, 164.0f),
                    PathNode.CurveTo(232.00446f, 165.84286f, 232.30602f, 168.04317f, 231.7574f, 170.10986f),
                    PathNode.CurveTo(231.2088f, 172.17654f, 229.85567f, 173.9376f, 228.0f, 175.0f),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
