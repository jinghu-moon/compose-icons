package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorThinIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.83f, 45.17f),
                    PathNode.LineTo(210.83f, 13.17f),
                    PathNode.CurveTo(209.26703f, 11.607034f, 206.73297f, 11.607035f, 205.17f, 13.17f),
                    PathNode.CurveTo(203.60704f, 14.732965f, 203.60704f, 17.267035f, 205.17f, 18.83f),
                    PathNode.LineTo(209.91f, 23.57f),
                    PathNode.LineTo(150.33f, 68.26f),
                    PathNode.LineTo(111.22f, 76.08f),
                    PathNode.CurveTo(110.461784f, 76.24184f, 109.766945f, 76.62052f, 109.22f, 77.17f),
                    PathNode.LineTo(25.86f, 160.49f),
                    PathNode.CurveTo(18.05236f, 168.3f, 18.05236f, 180.96f, 25.86f, 188.77f),
                    PathNode.LineTo(67.23f, 230.14f),
                    PathNode.CurveTo(75.03999f, 237.94763f, 87.700005f, 237.94763f, 95.51f, 230.14f),
                    PathNode.LineTo(178.83f, 146.83f),
                    PathNode.CurveTo(179.38802f, 146.26945f, 179.76733f, 145.55608f, 179.92f, 144.78f),
                    PathNode.LineTo(187.74f, 105.67f),
                    PathNode.LineTo(232.43f, 46.09f),
                    PathNode.LineTo(237.17f, 50.83f),
                    PathNode.CurveTo(238.73297f, 52.392967f, 241.26703f, 52.392967f, 242.83f, 50.83f),
                    PathNode.CurveTo(244.39296f, 49.267033f, 244.39296f, 46.732967f, 242.83f, 45.17f),
                    PathNode.Close,
                    PathNode.MoveTo(89.83f, 224.48f),
                    PathNode.CurveTo(87.57838f, 226.73946f, 84.51982f, 228.00946f, 81.33f, 228.00946f),
                    PathNode.CurveTo(78.14018f, 228.00946f, 75.08162f, 226.73946f, 72.83f, 224.48f),
                    PathNode.LineTo(31.51f, 183.11f),
                    PathNode.CurveTo(29.250546f, 180.85838f, 27.980537f, 177.79982f, 27.980537f, 174.61f),
                    PathNode.CurveTo(27.980537f, 171.42018f, 29.250546f, 168.36162f, 31.51f, 166.11f),
                    PathNode.LineTo(40.0f, 157.66f),
                    PathNode.LineTo(98.34f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 210.34f),
                    PathNode.LineTo(45.66f, 152.0f),
                    PathNode.LineTo(96.0f, 101.66f),
                    PathNode.LineTo(154.34f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.8f, 101.6f),
                    PathNode.CurveTo(180.4385f, 102.077385f, 180.19211f, 102.63178f, 180.08f, 103.22f),
                    PathNode.LineTo(172.32f, 142.0f),
                    PathNode.LineTo(160.0f, 154.34f),
                    PathNode.LineTo(101.66f, 96.0f),
                    PathNode.LineTo(114.0f, 83.68f),
                    PathNode.LineTo(152.81f, 75.92f),
                    PathNode.CurveTo(153.39822f, 75.807884f, 153.95262f, 75.561485f, 154.43f, 75.2f),
                    PathNode.LineTo(215.65f, 29.28f),
                    PathNode.LineTo(226.75f, 40.38f),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
