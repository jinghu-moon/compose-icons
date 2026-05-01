package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorBoldIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 92.0f),
                    PathNode.CurveTo(171.88223f, 92.0f, 188.0f, 75.88225f, 188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 36.11775f, 171.88223f, 20.0f, 152.0f, 20.0f),
                    PathNode.CurveTo(132.11775f, 20.0f, 116.0f, 36.11775f, 116.0f, 56.0f),
                    PathNode.CurveTo(116.0f, 75.88225f, 132.11775f, 92.0f, 152.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 44.0f),
                    PathNode.CurveTo(158.62741f, 44.0f, 164.0f, 49.37258f, 164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 62.62742f, 158.62741f, 68.0f, 152.0f, 68.0f),
                    PathNode.CurveTo(145.37259f, 68.0f, 140.0f, 62.62742f, 140.0f, 56.0f),
                    PathNode.CurveTo(140.0f, 49.37258f, 145.37259f, 44.0f, 152.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 137.4f),
                    PathNode.CurveTo(228.0005f, 142.09251f, 225.26578f, 146.35478f, 221.0f, 148.31f),
                    PathNode.CurveTo(214.10234f, 150.7514f, 206.84673f, 152.02881f, 199.53f, 152.09f),
                    PathNode.CurveTo(185.53f, 152.09f, 165.28f, 148.27f, 139.76f, 133.09f),
                    PathNode.CurveTo(136.80316f, 140.30865f, 133.37234f, 147.32396f, 129.49f, 154.09f),
                    PathNode.CurveTo(153.12f, 162.83f, 188.0f, 183.8f, 188.0f, 232.0f),
                    PathNode.CurveTo(188.0f, 238.62741f, 182.62741f, 244.0f, 176.0f, 244.0f),
                    PathNode.CurveTo(169.37259f, 244.0f, 164.0f, 238.62741f, 164.0f, 232.0f),
                    PathNode.CurveTo(164.0f, 213.31f, 157.05f, 198.94f, 142.74f, 188.06f),
                    PathNode.CurveTo(133.58f, 181.06f, 123.19f, 177.06f, 115.31f, 174.72f),
                    PathNode.CurveTo(114.5f, 175.72f, 113.67f, 176.72f, 112.81f, 177.67f),
                    PathNode.CurveTo(92.81f, 200.54f, 67.99f, 212.43f, 40.56f, 212.43f),
                    PathNode.CurveTo(37.30385f, 212.42986f, 34.04976f, 212.26633f, 30.81f, 211.94f),
                    PathNode.CurveTo(26.519281f, 211.5436f, 22.770498f, 208.8771f, 20.98836f, 204.95392f),
                    PathNode.CurveTo(19.20622f, 201.03073f, 19.664356f, 196.45322f, 22.188652f, 192.96104f),
                    PathNode.CurveTo(24.71295f, 189.46886f, 28.915827f, 187.5982f, 33.2f, 188.06f),
                    PathNode.CurveTo(85.5f, 193.28f, 110.68f, 142.14f, 118.99f, 120.31f),
                    PathNode.CurveTo(84.8f, 102.46f, 63.74f, 118.78f, 63.51f, 119.0f),
                    PathNode.CurveTo(58.32785f, 122.89302f, 50.990776f, 121.96742f, 46.937843f, 116.909355f),
                    PathNode.CurveTo(42.884907f, 111.851295f, 43.580956f, 104.4889f, 48.51f, 100.28f),
                    PathNode.CurveTo(50.08f, 99.0f, 88.0f, 69.44f, 142.75f, 106.62f),
                    PathNode.CurveTo(185.85f, 135.93f, 210.85f, 126.54f, 211.25f, 126.38f),
                    PathNode.CurveTo(214.9551f, 124.78295f, 219.21474f, 125.15471f, 222.58716f, 127.36943f),
                    PathNode.CurveTo(225.95958f, 129.58415f, 227.99332f, 133.34537f, 228.0f, 137.38f),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
