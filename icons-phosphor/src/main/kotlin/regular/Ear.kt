package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorRegularIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 108.41828f, 212.41827f, 112.0f, 208.0f, 112.0f),
                    PathNode.CurveTo(203.58173f, 112.0f, 200.0f, 108.41828f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 64.2355f, 167.7645f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(88.2355f, 32.0f, 56.0f, 64.2355f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 130.7f, 64.53f, 138.92f, 73.57f, 147.64f),
                    PathNode.CurveTo(82.21f, 156.0f, 92.0f, 165.41f, 92.0f, 188.0f),
                    PathNode.CurveTo(92.0f, 207.88223f, 108.11775f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(138.24f, 224.0f, 146.45f, 219.84f, 153.83f, 210.91f),
                    PathNode.CurveTo(155.62917f, 208.64287f, 158.51256f, 207.5243f, 161.36993f, 207.985f),
                    PathNode.CurveTo(164.22731f, 208.44572f, 166.61302f, 210.41383f, 167.60846f, 213.13155f),
                    PathNode.CurveTo(168.6039f, 215.84926f, 168.0538f, 218.8927f, 166.17f, 221.09f),
                    PathNode.CurveTo(155.81f, 233.64f, 143.0f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(99.2949f, 239.96693f, 76.033066f, 216.7051f, 76.0f, 188.0f),
                    PathNode.CurveTo(76.0f, 172.21f, 70.32f, 166.73f, 62.46f, 159.16f),
                    PathNode.CurveTo(52.46f, 149.5f, 40.0f, 137.5f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 55.39894f, 79.39894f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(176.60106f, 16.0f, 216.0f, 55.39894f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.87f, 161.08f),
                    PathNode.CurveTo(176.03246f, 160.01471f, 173.84671f, 159.72388f, 171.79454f, 160.27162f),
                    PathNode.CurveTo(169.74239f, 160.81937f, 167.99228f, 162.16072f, 166.93f, 164.0f),
                    PathNode.CurveTo(165.12036f, 167.13763f, 161.42838f, 168.66794f, 157.92969f, 167.73059f),
                    PathNode.CurveTo(154.43098f, 166.79323f, 151.9986f, 163.62209f, 152.0f, 160.0f),
                    PathNode.CurveTo(152.0f, 150.67f, 156.82f, 144.24f, 162.4f, 136.8f),
                    PathNode.CurveTo(168.77f, 128.3f, 176.0f, 118.67f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 77.49033f, 154.50967f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(101.49033f, 56.0f, 80.0f, 77.49033f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 108.41828f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.CurveTo(92.41828f, 112.0f, 96.0f, 108.41828f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 113.33f, 155.18f, 119.76f, 149.6f, 127.2f),
                    PathNode.CurveTo(143.23f, 135.7f, 136.0f, 145.33f, 136.0f, 160.0f),
                    PathNode.CurveTo(136.00362f, 170.85934f, 143.2985f, 180.3632f, 153.78775f, 183.17409f),
                    PathNode.CurveTo(164.277f, 185.98495f, 175.34673f, 181.40237f, 180.78f, 172.0f),
                    PathNode.CurveTo(182.98662f, 168.18025f, 181.68481f, 163.29514f, 177.87f, 161.08f),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
