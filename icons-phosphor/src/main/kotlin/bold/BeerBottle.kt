package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorBoldIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.49f, 39.51f),
                    PathNode.LineTo(216.49f, 7.51f),
                    PathNode.CurveTo(212.1448f, 3.201402f, 205.25359f, 2.85244f, 200.49536f, 6.700054f),
                    PathNode.CurveTo(195.73715f, 10.547668f, 194.63618f, 17.359316f, 197.94f, 22.51f),
                    PathNode.LineTo(147.0f, 60.77f),
                    PathNode.LineTo(109.67f, 68.23f),
                    PathNode.CurveTo(107.34603f, 68.69773f, 105.21084f, 69.83836f, 103.53f, 71.51f),
                    PathNode.LineTo(20.2f, 154.83f),
                    PathNode.CurveTo(14.948363f, 160.0811f, 11.99798f, 167.20345f, 11.99798f, 174.63f),
                    PathNode.CurveTo(11.99798f, 182.05656f, 14.948363f, 189.1789f, 20.2f, 194.43f),
                    PathNode.LineTo(61.57f, 235.8f),
                    PathNode.CurveTo(66.8211f, 241.05164f, 73.94344f, 244.00201f, 81.37f, 244.00201f),
                    PathNode.CurveTo(88.796555f, 244.00201f, 95.9189f, 241.05164f, 101.17f, 235.8f),
                    PathNode.LineTo(184.49f, 152.49f),
                    PathNode.CurveTo(186.16165f, 150.80916f, 187.30226f, 148.67397f, 187.77f, 146.35f),
                    PathNode.LineTo(195.23f, 109.0f),
                    PathNode.LineTo(233.46f, 58.0f),
                    PathNode.CurveTo(238.61069f, 61.303818f, 245.42233f, 60.20285f, 249.26994f, 55.444633f),
                    PathNode.CurveTo(253.11755f, 50.686417f, 252.7686f, 43.795197f, 248.46f, 39.45f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 191.0f),
                    PathNode.LineTo(65.0f, 144.0f),
                    PathNode.LineTo(96.0f, 113.0f),
                    PathNode.LineTo(143.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(81.37f, 220.0f),
                    PathNode.CurveTo(80.308815f, 220.00084f, 79.29079f, 219.57996f, 78.54f, 218.83f),
                    PathNode.LineTo(37.17f, 177.46f),
                    PathNode.CurveTo(36.41889f, 176.70973f, 35.996853f, 175.69164f, 35.996853f, 174.63f),
                    PathNode.CurveTo(35.996853f, 173.56836f, 36.41889f, 172.55028f, 37.17f, 171.8f),
                    PathNode.LineTo(48.0f, 161.0f),
                    PathNode.LineTo(95.0f, 208.0f),
                    PathNode.LineTo(84.2f, 218.83f),
                    PathNode.CurveTo(83.44921f, 219.57996f, 82.43118f, 220.00084f, 81.37f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.37f, 96.8f),
                    PathNode.CurveTo(173.29335f, 98.23421f, 172.55183f, 99.891495f, 172.2f, 101.65f),
                    PathNode.LineTo(165.0f, 138.08f),
                    PathNode.LineTo(160.0f, 143.0f),
                    PathNode.LineTo(113.0f, 96.0f),
                    PathNode.LineTo(118.0f, 91.0f),
                    PathNode.LineTo(154.43f, 83.72f),
                    PathNode.CurveTo(156.1885f, 83.36817f, 157.8458f, 82.626656f, 159.28f, 81.55f),
                    PathNode.LineTo(214.95f, 39.79f),
                    PathNode.LineTo(216.24f, 41.08f),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
