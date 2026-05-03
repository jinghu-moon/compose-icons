package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorRegularIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 88.23f),
                    PathNode.CurveTo(239.59863f, 102.15653f, 233.87218f, 115.39895f, 224.0f, 125.23f),
                    PathNode.LineTo(189.25f, 160.0f),
                    PathNode.CurveTo(179.02716f, 170.2788f, 165.11682f, 176.04025f, 150.62f, 176.0f),
                    PathNode.LineTo(150.57f, 176.0f),
                    PathNode.CurveTo(135.8226f, 175.9896f, 121.705864f, 170.01727f, 111.42868f, 159.44064f),
                    PathNode.CurveTo(101.15149f, 148.86401f, 95.586975f, 134.58162f, 96.0f, 119.84f),
                    PathNode.CurveTo(96.12427f, 115.42172f, 99.806725f, 111.940735f, 104.225f, 112.065f),
                    PathNode.CurveTo(108.64328f, 112.18926f, 112.12427f, 115.87172f, 112.0f, 120.29f),
                    PathNode.CurveTo(111.705696f, 130.71326f, 115.63877f, 140.81258f, 122.90488f, 148.2915f),
                    PathNode.CurveTo(130.17099f, 155.77045f, 140.1526f, 159.99335f, 150.58f, 160.0f),
                    PathNode.LineTo(150.58f, 160.0f),
                    PathNode.CurveTo(160.82802f, 160.02626f, 170.66115f, 155.95403f, 177.89f, 148.69f),
                    PathNode.LineTo(212.64f, 113.94f),
                    PathNode.CurveTo(227.56494f, 98.827065f, 227.48882f, 74.49966f, 212.46959f, 59.48042f),
                    PathNode.CurveTo(197.45035f, 44.46118f, 173.12294f, 44.385056f, 158.01f, 59.31f),
                    PathNode.LineTo(147.01f, 70.31f),
                    PathNode.CurveTo(143.86469f, 73.29823f, 138.91075f, 73.2348f, 135.84297f, 70.16703f),
                    PathNode.CurveTo(132.77519f, 67.09925f, 132.71176f, 62.145313f, 135.7f, 59.0f),
                    PathNode.LineTo(146.7f, 48.0f),
                    PathNode.CurveTo(156.9494f, 37.74709f, 170.85268f, 31.98677f, 185.35f, 31.98677f),
                    PathNode.CurveTo(199.84732f, 31.98677f, 213.7506f, 37.74709f, 224.0f, 48.0f),
                    PathNode.CurveTo(234.62308f, 58.649418f, 240.40749f, 73.19358f, 240.0f, 88.23f),
                    PathNode.Close,
                    PathNode.MoveTo(109.0f, 185.66f),
                    PathNode.LineTo(98.0f, 196.66f),
                    PathNode.CurveTo(90.75287f, 203.95538f, 80.88309f, 208.04018f, 70.6f, 208.0f),
                    PathNode.LineTo(70.6f, 208.0f),
                    PathNode.CurveTo(54.9827f, 207.98744f, 40.909286f, 198.57262f, 34.937145f, 184.14233f),
                    PathNode.CurveTo(28.965002f, 169.71204f, 32.26913f, 153.10533f, 43.31f, 142.06f),
                    PathNode.LineTo(78.0f, 107.31f),
                    PathNode.CurveTo(89.1807f, 96.070305f, 106.093636f, 92.80292f, 120.65631f, 99.06928f),
                    PathNode.CurveTo(135.21898f, 105.33564f, 144.4746f, 119.86344f, 144.0f, 135.71f),
                    PathNode.CurveTo(143.87573f, 140.12828f, 147.35672f, 143.81073f, 151.775f, 143.935f),
                    PathNode.CurveTo(156.19328f, 144.05927f, 159.87573f, 140.57828f, 160.0f, 136.16f),
                    PathNode.CurveTo(160.38815f, 121.14767f, 154.60522f, 106.6325f, 144.0f, 96.0f),
                    PathNode.CurveTo(122.65977f, 74.66903f, 88.07024f, 74.66903f, 66.73f, 96.0f),
                    PathNode.LineTo(32.0f, 130.75f),
                    PathNode.CurveTo(16.381174f, 146.36247f, 11.700599f, 169.84409f, 20.139507f, 190.25197f),
                    PathNode.CurveTo(28.578415f, 210.65985f, 48.476147f, 223.97804f, 70.56f, 224.0f),
                    PathNode.LineTo(70.56f, 224.0f),
                    PathNode.CurveTo(85.060074f, 224.04181f, 98.9741f, 218.28032f, 109.2f, 208.0f),
                    PathNode.LineTo(120.2f, 197.0f),
                    PathNode.CurveTo(122.883705f, 193.83888f, 122.70715f, 189.15114f, 119.79328f, 186.20084f),
                    PathNode.CurveTo(116.87941f, 183.25053f, 112.19421f, 183.01576f, 109.0f, 185.66f),
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
        return _link!!
    }

private var _link: ImageVector? = null
