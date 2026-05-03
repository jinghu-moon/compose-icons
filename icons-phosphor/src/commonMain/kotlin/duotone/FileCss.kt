package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCss: ImageVector
    get() {
        if (_fileCss != null) return _fileCss!!
        _fileCss = phosphorDuotoneIcon(
            name = "FileCss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 32.0f),
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
                    PathNode.MoveTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 191.0f, 55.18f, 200.0f, 64.0f, 200.0f),
                    PathNode.CurveTo(67.90234f, 199.9173f, 71.59857f, 198.23192f, 74.22f, 195.34f),
                    PathNode.CurveTo(76.16984f, 193.16565f, 79.14961f, 192.22664f, 81.99377f, 192.89026f),
                    PathNode.CurveTo(84.83793f, 193.55388f, 87.094444f, 195.71466f, 87.88065f, 198.5274f),
                    PathNode.CurveTo(88.66687f, 201.34013f, 87.857834f, 204.3578f, 85.77f, 206.4f),
                    PathNode.CurveTo(80.1467f, 212.46382f, 72.26967f, 215.93738f, 64.0f, 216.0f),
                    PathNode.CurveTo(46.35f, 216.0f, 32.0f, 199.85f, 32.0f, 180.0f),
                    PathNode.CurveTo(32.0f, 160.15f, 46.35f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(72.26967f, 144.06262f, 80.1467f, 147.53618f, 85.77f, 153.6f),
                    PathNode.CurveTo(87.857834f, 155.6422f, 88.66687f, 158.65987f, 87.88065f, 161.4726f),
                    PathNode.CurveTo(87.094444f, 164.28534f, 84.83793f, 166.44612f, 81.99377f, 167.10974f),
                    PathNode.CurveTo(79.14961f, 167.77336f, 76.16984f, 166.83435f, 74.22f, 164.66f),
                    PathNode.CurveTo(71.59573f, 161.77197f, 67.901276f, 160.0874f, 64.0f, 160.0f),
                    PathNode.CurveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(127.6f, 171.31f),
                    PathNode.CurveTo(123.6f, 170.15f, 119.46f, 168.96f, 117.15f, 167.47f),
                    PathNode.CurveTo(115.89f, 166.66f, 115.92f, 166.47f, 116.03f, 165.57f),
                    PathNode.CurveTo(116.06044f, 164.09428f, 116.80638f, 162.72548f, 118.03f, 161.9f),
                    PathNode.CurveTo(122.63f, 158.78f, 133.38f, 160.17f, 137.86f, 161.34f),
                    PathNode.CurveTo(142.13469f, 162.4639f, 146.5111f, 159.90968f, 147.635f, 155.635f),
                    PathNode.CurveTo(148.7589f, 151.36032f, 146.20468f, 146.9839f, 141.93f, 145.86f),
                    PathNode.CurveTo(139.81f, 145.31f, 120.93f, 140.64f, 109.1f, 148.62f),
                    PathNode.CurveTo(104.02811f, 152.01895f, 100.730194f, 157.49713f, 100.1f, 163.57f),
                    PathNode.CurveTo(98.1f, 179.45f, 113.74f, 183.98f, 123.1f, 186.68f),
                    PathNode.CurveTo(135.17f, 190.17f, 136.23f, 191.6f, 135.88f, 194.27f),
                    PathNode.CurveTo(135.57f, 196.68f, 134.62f, 197.61f, 133.74f, 198.2f),
                    PathNode.CurveTo(129.14f, 201.26f, 118.57f, 199.76f, 114.19f, 198.56f),
                    PathNode.CurveTo(109.95804f, 197.43727f, 105.60973f, 199.92508f, 104.43295f, 204.14233f),
                    PathNode.CurveTo(103.25618f, 208.35959f, 105.68815f, 212.73936f, 109.89f, 213.97f),
                    PathNode.CurveTo(114.84639f, 215.26918f, 119.94625f, 215.9411f, 125.07f, 215.97f),
                    PathNode.CurveTo(130.9f, 215.97f, 137.37f, 214.97f, 142.56f, 211.51f),
                    PathNode.CurveTo(147.74696f, 208.0633f, 151.11865f, 202.47563f, 151.75f, 196.28f),
                    PathNode.CurveTo(154.0f, 179.0f, 137.48f, 174.17f, 127.6f, 171.31f),
                    PathNode.Close,
                    PathNode.MoveTo(191.6f, 171.31f),
                    PathNode.CurveTo(187.6f, 170.15f, 183.46f, 168.96f, 181.15f, 167.47f),
                    PathNode.CurveTo(179.9f, 166.66f, 179.92f, 166.47f, 180.03f, 165.57f),
                    PathNode.CurveTo(180.06046f, 164.09428f, 180.80638f, 162.72548f, 182.03f, 161.9f),
                    PathNode.CurveTo(186.63f, 158.78f, 197.37f, 160.17f, 201.85f, 161.34f),
                    PathNode.CurveTo(206.12468f, 162.4639f, 210.5011f, 159.90968f, 211.62498f, 155.635f),
                    PathNode.CurveTo(212.7489f, 151.36032f, 210.19469f, 146.9839f, 205.92f, 145.86f),
                    PathNode.CurveTo(203.81f, 145.31f, 184.92f, 140.64f, 173.09f, 148.62f),
                    PathNode.CurveTo(168.04018f, 152.03226f, 164.7625f, 157.50726f, 164.14f, 163.57f),
                    PathNode.CurveTo(162.14f, 179.45f, 177.79f, 183.98f, 187.14f, 186.68f),
                    PathNode.CurveTo(199.2f, 190.17f, 200.26f, 191.6f, 199.92f, 194.27f),
                    PathNode.CurveTo(199.61f, 196.68f, 198.66f, 197.61f, 197.77f, 198.2f),
                    PathNode.CurveTo(193.17f, 201.26f, 182.61f, 199.76f, 178.23f, 198.56f),
                    PathNode.CurveTo(173.96635f, 197.37259f, 169.54741f, 199.86636f, 168.36f, 204.13f),
                    PathNode.CurveTo(167.17259f, 208.39363f, 169.66637f, 212.81259f, 173.93f, 214.0f),
                    PathNode.CurveTo(178.88985f, 215.29887f, 183.99298f, 215.97078f, 189.12f, 216.0f),
                    PathNode.CurveTo(194.94f, 216.0f, 201.42f, 215.0f, 206.61f, 211.54f),
                    PathNode.CurveTo(211.79422f, 208.0922f, 215.16237f, 202.50432f, 215.79f, 196.31f),
                    PathNode.CurveTo(218.0f, 179.0f, 201.48f, 174.17f, 191.59f, 171.31f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 116.41828f, 212.41827f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(203.58173f, 120.0f, 200.0f, 116.41828f, 200.0f, 112.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 116.41828f, 52.418278f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 116.41828f, 40.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(188.68f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
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
        return _fileCss!!
    }

private var _fileCss: ImageVector? = null
