package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorThinIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 66.20914f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 132.0f),
                    PathNode.LineTo(104.0f, 132.0f),
                    PathNode.CurveTo(106.20914f, 132.0f, 108.0f, 130.20914f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 125.79086f, 106.20914f, 124.0f, 104.0f, 124.0f),
                    PathNode.LineTo(40.0f, 124.0f),
                    PathNode.CurveTo(37.79086f, 124.0f, 36.0f, 125.79086f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 37.79086f, 132.0f, 40.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(120.0f, 196.0f),
                    PathNode.CurveTo(122.20914f, 196.0f, 124.0f, 194.20914f, 124.0f, 192.0f),
                    PathNode.CurveTo(124.0f, 189.79086f, 122.20914f, 188.0f, 120.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 144.0f),
                    PathNode.CurveTo(244.0f, 158.51f, 235.44f, 173.0f, 218.56f, 187.07f),
                    PathNode.CurveTo(210.89793f, 193.41704f, 202.59662f, 198.95013f, 193.79f, 203.58f),
                    PathNode.CurveTo(192.66327f, 204.14381f, 191.33673f, 204.14381f, 190.21f, 203.58f),
                    PathNode.CurveTo(181.40338f, 198.95013f, 173.10207f, 193.41704f, 165.44f, 187.07f),
                    PathNode.CurveTo(148.56f, 173.0f, 140.0f, 158.51f, 140.0f, 144.0f),
                    PathNode.CurveTo(140.00548f, 131.42032f, 148.39975f, 120.38851f, 160.52255f, 117.0291f),
                    PathNode.CurveTo(172.64539f, 113.66968f, 185.52048f, 118.80741f, 192.0f, 129.59f),
                    PathNode.CurveTo(198.47952f, 118.80741f, 211.35461f, 113.66968f, 223.47745f, 117.0291f),
                    PathNode.CurveTo(235.60025f, 120.38851f, 243.99452f, 131.42032f, 244.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 144.0f),
                    PathNode.CurveTo(236.0f, 132.9543f, 227.0457f, 124.0f, 216.0f, 124.0f),
                    PathNode.CurveTo(204.9543f, 124.0f, 196.0f, 132.9543f, 196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 146.20914f, 194.20914f, 148.0f, 192.0f, 148.0f),
                    PathNode.CurveTo(189.79086f, 148.0f, 188.0f, 146.20914f, 188.0f, 144.0f),
                    PathNode.CurveTo(188.0f, 132.9543f, 179.0457f, 124.0f, 168.0f, 124.0f),
                    PathNode.CurveTo(156.9543f, 124.0f, 148.0f, 132.9543f, 148.0f, 144.0f),
                    PathNode.CurveTo(148.0f, 169.8f, 183.54f, 190.83f, 192.0f, 195.47f),
                    PathNode.CurveTo(200.46f, 190.83f, 236.0f, 169.8f, 236.0f, 144.0f),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
