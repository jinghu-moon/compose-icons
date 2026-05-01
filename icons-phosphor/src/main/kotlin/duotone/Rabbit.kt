package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = phosphorDuotoneIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 188.0f),
                    PathNode.CurveTo(208.00078f, 207.19017f, 195.56435f, 224.16743f, 177.26735f, 229.95386f),
                    PathNode.CurveTo(158.97035f, 235.7403f, 139.03357f, 229.00105f, 128.0f, 213.3f),
                    PathNode.CurveTo(118.12004f, 227.3527f, 100.96523f, 234.3706f, 84.06877f, 231.27191f),
                    PathNode.CurveTo(67.17231f, 228.17322f, 53.6242f, 215.52463f, 49.373817f, 198.88051f),
                    PathNode.CurveTo(45.123436f, 182.2364f, 50.94809f, 164.64061f, 64.29f, 153.82f),
                    PathNode.CurveTo(67.42688f, 120.98067f, 95.011185f, 95.90571f, 128.0f, 95.90571f),
                    PathNode.CurveTo(160.98882f, 95.90571f, 188.57312f, 120.98067f, 191.71f, 153.82f),
                    PathNode.CurveTo(202.02678f, 162.16576f, 208.01492f, 174.73021f, 208.0f, 188.0f),
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
                    PathNode.MoveTo(112.0f, 164.0f),
                    PathNode.CurveTo(112.0f, 170.62741f, 106.62742f, 176.0f, 100.0f, 176.0f),
                    PathNode.CurveTo(93.37258f, 176.0f, 88.0f, 170.62741f, 88.0f, 164.0f),
                    PathNode.CurveTo(88.0f, 157.37259f, 93.37258f, 152.0f, 100.0f, 152.0f),
                    PathNode.CurveTo(106.62742f, 152.0f, 112.0f, 157.37259f, 112.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 152.0f),
                    PathNode.CurveTo(149.37259f, 152.0f, 144.0f, 157.37259f, 144.0f, 164.0f),
                    PathNode.CurveTo(144.0f, 170.62741f, 149.37259f, 176.0f, 156.0f, 176.0f),
                    PathNode.CurveTo(162.62741f, 176.0f, 168.0f, 170.62741f, 168.0f, 164.0f),
                    PathNode.CurveTo(168.0f, 157.37259f, 162.62741f, 152.0f, 156.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 188.0f),
                    PathNode.CurveTo(215.99867f, 208.83553f, 203.5607f, 227.65862f, 184.39455f, 235.83037f),
                    PathNode.CurveTo(165.2284f, 244.00212f, 143.03497f, 239.9446f, 128.0f, 225.52f),
                    PathNode.CurveTo(114.52096f, 238.52574f, 95.08891f, 243.27742f, 77.12919f, 237.95934f),
                    PathNode.CurveTo(59.169464f, 232.64125f, 45.457596f, 218.07527f, 41.23313f, 199.82733f),
                    PathNode.CurveTo(37.00867f, 181.57938f, 42.92447f, 162.46954f, 56.72f, 149.8f),
                    PathNode.CurveTo(57.742737f, 142.58751f, 59.860462f, 135.57338f, 63.0f, 129.0f),
                    PathNode.CurveTo(44.0f, 91.1f, 32.53f, 40.76f, 45.64f, 19.08f),
                    PathNode.CurveTo(49.614197f, 12.127362f, 57.052513f, 7.883463f, 65.06f, 8.0f),
                    PathNode.CurveTo(79.18f, 8.0f, 91.06f, 19.89f, 101.5f, 44.36f),
                    PathNode.CurveTo(107.72f, 58.98f, 112.35f, 75.68f, 115.5f, 89.1f),
                    PathNode.CurveTo(123.76921f, 87.63805f, 132.23079f, 87.63805f, 140.5f, 89.1f),
                    PathNode.CurveTo(143.63f, 75.68f, 148.26f, 58.98f, 154.5f, 44.36f),
                    PathNode.CurveTo(164.9f, 19.89f, 176.82f, 8.0f, 190.94f, 8.0f),
                    PathNode.CurveTo(198.94748f, 7.883463f, 206.3858f, 12.127362f, 210.36f, 19.08f),
                    PathNode.CurveTo(223.47f, 40.76f, 212.0f, 91.1f, 193.0f, 129.0f),
                    PathNode.CurveTo(196.12875f, 135.56197f, 198.23964f, 142.56227f, 199.26f, 149.76f),
                    PathNode.CurveTo(209.95944f, 159.59242f, 216.03403f, 173.46889f, 216.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.89f, 93.63f),
                    PathNode.CurveTo(166.2664f, 97.97777f, 175.47444f, 104.705666f, 182.77f, 113.27f),
                    PathNode.CurveTo(189.41292f, 98.47169f, 194.3869f, 82.979515f, 197.6f, 67.08f),
                    PathNode.CurveTo(201.09f, 48.95f, 200.75f, 34.08f, 196.67f, 27.36f),
                    PathNode.CurveTo(195.61073f, 25.188461f, 193.3523f, 23.864145f, 190.94f, 24.0f),
                    PathNode.CurveTo(184.33f, 24.0f, 176.42f, 33.7f, 169.22f, 50.62f),
                    PathNode.CurveTo(163.29f, 64.56f, 158.87f, 80.74f, 155.89f, 93.63f),
                    PathNode.Close,
                    PathNode.MoveTo(73.23f, 113.27f),
                    PathNode.CurveTo(80.52555f, 104.705666f, 89.73359f, 97.97777f, 100.11f, 93.63f),
                    PathNode.CurveTo(97.11f, 80.74f, 92.71f, 64.56f, 86.78f, 50.63f),
                    PathNode.CurveTo(79.58f, 33.7f, 71.67f, 24.0f, 65.06f, 24.0f),
                    PathNode.CurveTo(62.647705f, 23.864145f, 60.38927f, 25.188461f, 59.33f, 27.36f),
                    PathNode.CurveTo(55.25f, 34.1f, 54.91f, 49.0f, 58.4f, 67.08f),
                    PathNode.CurveTo(61.61309f, 82.979515f, 66.58709f, 98.47169f, 73.23f, 113.27f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 188.0f),
                    PathNode.CurveTo(200.02678f, 177.12724f, 195.12048f, 166.82918f, 186.66f, 160.0f),
                    PathNode.CurveTo(184.9956f, 158.64807f, 183.9436f, 156.68459f, 183.74f, 154.55f),
                    PathNode.CurveTo(180.96411f, 125.84372f, 156.84018f, 103.940025f, 128.0f, 103.940025f),
                    PathNode.CurveTo(99.15982f, 103.940025f, 75.03588f, 125.84372f, 72.26f, 154.55f),
                    PathNode.CurveTo(72.05639f, 156.68459f, 71.004395f, 158.64807f, 69.34f, 160.0f),
                    PathNode.CurveTo(58.994095f, 168.25665f, 54.013737f, 181.52489f, 56.371353f, 194.54993f),
                    PathNode.CurveTo(58.728973f, 207.57497f, 68.044235f, 218.2556f, 80.62791f, 222.36185f),
                    PathNode.CurveTo(93.21158f, 226.46811f, 107.033646f, 223.33754f, 116.62f, 214.21f),
                    PathNode.LineTo(106.88f, 206.12f),
                    PathNode.CurveTo(103.483444f, 203.2923f, 103.0223f, 198.24655f, 105.85f, 194.85f),
                    PathNode.CurveTo(108.6777f, 191.45345f, 113.72345f, 190.99231f, 117.12f, 193.82f),
                    PathNode.LineTo(128.0f, 202.9f),
                    PathNode.LineTo(138.88f, 193.85f),
                    PathNode.CurveTo(142.27655f, 191.02231f, 147.32231f, 191.48344f, 150.15f, 194.88f),
                    PathNode.CurveTo(152.97769f, 198.27655f, 152.51656f, 203.32231f, 149.12f, 206.15f),
                    PathNode.LineTo(139.38f, 214.24f),
                    PathNode.CurveTo(149.84561f, 224.05011f, 165.13649f, 226.71088f, 178.30072f, 221.0126f),
                    PathNode.CurveTo(191.46495f, 215.31433f, 199.99f, 202.34459f, 200.0f, 188.0f),
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
