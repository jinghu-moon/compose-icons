package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorRegularIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 140.0f),
                    PathNode.CurveTo(96.0f, 146.62741f, 90.62742f, 152.0f, 84.0f, 152.0f),
                    PathNode.CurveTo(77.37258f, 152.0f, 72.0f, 146.62741f, 72.0f, 140.0f),
                    PathNode.CurveTo(72.0f, 133.37259f, 77.37258f, 128.0f, 84.0f, 128.0f),
                    PathNode.CurveTo(90.62742f, 128.0f, 96.0f, 133.37259f, 96.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(165.37259f, 128.0f, 160.0f, 133.37259f, 160.0f, 140.0f),
                    PathNode.CurveTo(160.0f, 146.62741f, 165.37259f, 152.0f, 172.0f, 152.0f),
                    PathNode.CurveTo(178.62741f, 152.0f, 184.0f, 146.62741f, 184.0f, 140.0f),
                    PathNode.CurveTo(184.0f, 133.37259f, 178.62741f, 128.0f, 172.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(232.0f, 188.93f, 185.35f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.65f, 232.0f, 24.0f, 188.93f, 24.0f, 136.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.002998f, 41.530907f, 27.901237f, 35.700134f, 33.878067f, 33.224926f),
                    PathNode.CurveTo(39.854897f, 30.749718f, 46.73416f, 32.11716f, 51.31f, 36.69f),
                    PathNode.CurveTo(51.45f, 36.83f, 51.57f, 36.96f, 51.69f, 37.1f),
                    PathNode.LineTo(69.0f, 57.0f),
                    PathNode.CurveTo(105.11524f, 34.37279f, 150.98476f, 34.37279f, 187.1f, 57.0f),
                    PathNode.LineTo(204.31f, 37.1f),
                    PathNode.CurveTo(204.43f, 36.96f, 204.55f, 36.83f, 204.69f, 36.69f),
                    PathNode.CurveTo(209.26584f, 32.11716f, 216.14508f, 30.749718f, 222.12193f, 33.224926f),
                    PathNode.CurveTo(228.09877f, 35.700134f, 231.99701f, 41.530907f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(194.44f, 72.8f),
                    PathNode.CurveTo(191.70454f, 75.96464f, 186.9929f, 76.48767f, 183.63f, 74.0f),
                    PathNode.CurveTo(178.7496f, 70.39093f, 173.51225f, 67.29141f, 168.0f, 64.75f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(168.0f, 92.41828f, 164.41827f, 96.0f, 160.0f, 96.0f),
                    PathNode.CurveTo(155.58173f, 96.0f, 152.0f, 92.41828f, 152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 59.05f),
                    PathNode.CurveTo(146.75159f, 57.699936f, 141.39969f, 56.79011f, 136.0f, 56.33f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 92.41828f, 132.41827f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(123.58172f, 96.0f, 120.0f, 92.41828f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 56.33f),
                    PathNode.CurveTo(114.6003f, 56.79011f, 109.248405f, 57.699936f, 104.0f, 59.05f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 92.41828f, 100.41828f, 96.0f, 96.0f, 96.0f),
                    PathNode.CurveTo(91.58172f, 96.0f, 88.0f, 92.41828f, 88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 64.75f),
                    PathNode.CurveTo(82.48775f, 67.29141f, 77.2504f, 70.39093f, 72.37f, 74.0f),
                    PathNode.CurveTo(69.0146f, 76.49493f, 64.30388f, 75.98507f, 61.56f, 72.83f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 177.66f, 75.21f, 212.0f, 120.0f, 215.67f),
                    PathNode.LineTo(120.0f, 195.31f),
                    PathNode.LineTo(106.34f, 181.65f),
                    PathNode.CurveTo(103.21683f, 178.52406f, 103.21907f, 173.45818f, 106.345f, 170.335f),
                    PathNode.CurveTo(109.47094f, 167.21182f, 114.53683f, 167.21407f, 117.66f, 170.34f),
                    PathNode.LineTo(128.0f, 180.68f),
                    PathNode.LineTo(138.34f, 170.34f),
                    PathNode.CurveTo(141.46317f, 167.21407f, 146.52907f, 167.21182f, 149.655f, 170.335f),
                    PathNode.CurveTo(152.78093f, 173.45818f, 152.78317f, 178.52406f, 149.66f, 181.65f),
                    PathNode.LineTo(136.0f, 195.31f),
                    PathNode.LineTo(136.0f, 215.67f),
                    PathNode.CurveTo(180.79f, 211.98f, 216.0f, 177.67f, 216.0f, 136.0f),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
