package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorThinIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.15f, 95.0f),
                    PathNode.CurveTo(28.055792f, 95.32519f, 28.005348f, 95.66148f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 112.0f),
                    PathNode.CurveTo(28.004425f, 124.018906f, 34.00653f, 135.24283f, 44.0f, 141.92f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 218.20914f, 45.79086f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(210.20914f, 220.0f, 212.0f, 218.20914f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 141.92f),
                    PathNode.CurveTo(221.99347f, 135.24283f, 227.99557f, 124.018906f, 228.0f, 112.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(227.99554f, 95.6337f, 227.9383f, 95.26996f, 227.83f, 94.92f),
                    PathNode.LineTo(213.5f, 44.7f),
                    PathNode.CurveTo(212.0308f, 39.563328f, 207.34264f, 36.01663f, 202.0f, 36.0f),
                    PathNode.LineTo(54.0f, 36.0f),
                    PathNode.CurveTo(48.65737f, 36.01663f, 43.969204f, 39.563328f, 42.5f, 44.7f),
                    PathNode.Close,
                    PathNode.MoveTo(50.15f, 46.92f),
                    PathNode.CurveTo(50.634014f, 45.193913f, 52.207336f, 44.000645f, 54.0f, 44.0f),
                    PathNode.LineTo(202.0f, 44.0f),
                    PathNode.CurveTo(203.78336f, 44.002575f, 205.34958f, 45.185406f, 205.84f, 46.9f),
                    PathNode.LineTo(218.7f, 92.0f),
                    PathNode.LineTo(37.3f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 100.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.LineTo(156.0f, 112.0f),
                    PathNode.CurveTo(156.0f, 127.463974f, 143.46397f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(112.536026f, 140.0f, 100.0f, 127.463974f, 100.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 112.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(92.0f, 100.0f),
                    PathNode.LineTo(92.0f, 112.0f),
                    PathNode.CurveTo(91.99588f, 121.87246f, 86.793f, 131.01315f, 78.30651f, 136.05746f),
                    PathNode.CurveTo(69.82002f, 141.10176f, 59.304256f, 141.30411f, 50.63f, 136.59f),
                    PathNode.CurveTo(50.245712f, 136.25555f, 49.80108f, 135.9976f, 49.32f, 135.83f),
                    PathNode.CurveTo(41.04607f, 130.73582f, 36.004578f, 121.7164f, 36.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 212.0f),
                    PathNode.LineTo(52.0f, 212.0f),
                    PathNode.LineTo(52.0f, 145.94f),
                    PathNode.CurveTo(68.97418f, 151.93361f, 87.76644f, 144.46796f, 96.0f, 128.46f),
                    PathNode.CurveTo(102.17425f, 140.43979f, 114.522736f, 147.96758f, 128.0f, 147.96758f),
                    PathNode.CurveTo(141.47726f, 147.96758f, 153.82576f, 140.43979f, 160.0f, 128.46f),
                    PathNode.CurveTo(168.23357f, 144.46796f, 187.02582f, 151.93361f, 204.0f, 145.94f),
                    PathNode.Close,
                    PathNode.MoveTo(206.68f, 135.83f),
                    PathNode.CurveTo(206.20183f, 135.99739f, 205.76044f, 136.25545f, 205.38f, 136.59f),
                    PathNode.CurveTo(196.70505f, 141.30907f, 186.18565f, 141.10934f, 177.69604f, 136.0644f),
                    PathNode.CurveTo(169.20644f, 131.01949f, 164.0022f, 121.87546f, 164.0f, 112.0f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.LineTo(220.0f, 100.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(219.99542f, 121.7164f, 214.95393f, 130.73582f, 206.68f, 135.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _storefront!!
    }

private var _storefront: ImageVector? = null
