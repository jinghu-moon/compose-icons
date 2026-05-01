package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorBoldIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 168.0f),
                    PathNode.LineTo(252.0f, 200.0f),
                    PathNode.CurveTo(252.0f, 206.62741f, 246.62741f, 212.0f, 240.0f, 212.0f),
                    PathNode.CurveTo(233.37259f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 196.91f),
                    PathNode.CurveTo(215.56f, 208.41f, 180.25f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(63.4f, 236.0f, 24.7f, 193.82f, 23.08f, 192.0f),
                    PathNode.CurveTo(19.935444f, 188.8591f, 18.78443f, 184.2374f, 20.088604f, 179.98856f),
                    PathNode.CurveTo(21.392778f, 175.73972f, 24.93852f, 172.55968f, 29.303719f, 171.72388f),
                    PathNode.CurveTo(33.668915f, 170.88808f, 38.13857f, 172.53345f, 40.92f, 176.0f),
                    PathNode.CurveTo(41.22f, 176.33f, 74.4f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(170.65f, 212.0f, 200.34f, 189.42f, 210.87f, 180.0f),
                    PathNode.LineTo(208.0f, 180.0f),
                    PathNode.CurveTo(201.37259f, 180.0f, 196.0f, 174.62741f, 196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 161.37259f, 201.37259f, 156.0f, 208.0f, 156.0f),
                    PathNode.LineTo(240.0f, 156.0f),
                    PathNode.CurveTo(246.62741f, 156.0f, 252.0f, 161.37259f, 252.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 86.08f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.CurveTo(156.00446f, 69.82803f, 146.68675f, 57.34117f, 133.09988f, 53.31107f),
                    PathNode.CurveTo(119.513016f, 49.28097f, 104.8937f, 54.66769f, 97.17f, 66.55f),
                    PathNode.CurveTo(93.552536f, 72.103226f, 86.118225f, 73.67246f, 80.565f, 70.055f),
                    PathNode.CurveTo(75.01178f, 66.43754f, 73.442535f, 59.003223f, 77.06f, 53.45f),
                    PathNode.CurveTo(90.58198f, 32.666092f, 116.16183f, 23.248846f, 139.93256f, 30.303404f),
                    PathNode.CurveTo(163.7033f, 37.35796f, 180.00482f, 59.204544f, 180.0f, 84.0f),
                    PathNode.LineTo(180.0f, 176.0f),
                    PathNode.CurveTo(179.9585f, 182.24437f, 175.13495f, 187.41328f, 168.90834f, 187.88582f),
                    PathNode.CurveTo(162.68173f, 188.35837f, 157.13339f, 183.9766f, 156.15f, 177.81f),
                    PathNode.CurveTo(132.90326f, 194.15231f, 101.10185f, 190.49295f, 82.17454f, 169.2977f),
                    PathNode.CurveTo(63.247215f, 148.10245f, 63.194866f, 116.09123f, 82.05277f, 94.83419f),
                    PathNode.CurveTo(100.91067f, 73.57715f, 132.69994f, 69.8138f, 156.0f, 86.08f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 132.0f),
                    PathNode.CurveTo(156.0f, 114.32689f, 141.67311f, 100.0f, 124.0f, 100.0f),
                    PathNode.CurveTo(106.32689f, 100.0f, 92.0f, 114.32689f, 92.0f, 132.0f),
                    PathNode.CurveTo(92.0f, 149.67311f, 106.32689f, 164.0f, 124.0f, 164.0f),
                    PathNode.CurveTo(141.67311f, 164.0f, 156.0f, 149.67311f, 156.0f, 132.0f),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
