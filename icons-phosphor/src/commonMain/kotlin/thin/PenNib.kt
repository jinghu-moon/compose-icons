package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorThinIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 92.68f),
                    PathNode.CurveTo(244.00758f, 89.498375f, 242.74396f, 86.44553f, 240.49f, 84.2f),
                    PathNode.LineTo(171.8f, 15.51f),
                    PathNode.CurveTo(169.54837f, 13.250546f, 166.48982f, 11.980537f, 163.3f, 11.980537f),
                    PathNode.CurveTo(160.11017f, 11.980537f, 157.05162f, 13.250546f, 154.8f, 15.51f),
                    PathNode.LineTo(125.78f, 44.56f),
                    PathNode.LineTo(66.92f, 66.63f),
                    PathNode.CurveTo(62.912716f, 68.1427f, 60.008457f, 71.6674f, 59.29f, 75.89f),
                    PathNode.LineTo(36.05f, 215.34f),
                    PathNode.CurveTo(35.85578f, 216.50095f, 36.182762f, 217.6885f, 36.943867f, 218.58641f),
                    PathNode.CurveTo(37.704967f, 219.48431f, 38.82292f, 220.00142f, 40.0f, 220.0f),
                    PathNode.CurveTo(40.22088f, 219.99826f, 40.441383f, 219.98155f, 40.66f, 219.95f),
                    PathNode.LineTo(180.1f, 196.7f),
                    PathNode.CurveTo(184.32932f, 195.99826f, 187.86302f, 193.09355f, 189.37f, 189.08f),
                    PathNode.LineTo(211.44f, 130.22f),
                    PathNode.LineTo(240.44f, 101.22f),
                    PathNode.CurveTo(242.72812f, 98.96878f, 244.0116f, 95.889885f, 244.0f, 92.68f),
                    PathNode.Close,
                    PathNode.MoveTo(181.88f, 186.27f),
                    PathNode.CurveTo(181.37767f, 187.60785f, 180.19978f, 188.5761f, 178.79f, 188.81f),
                    PathNode.LineTo(51.66f, 210.0f),
                    PathNode.LineTo(110.11f, 151.55f),
                    PathNode.CurveTo(120.27973f, 158.77739f, 134.29099f, 157.00746f, 142.34396f, 147.47813f),
                    PathNode.CurveTo(150.39694f, 137.9488f, 149.80559f, 123.83859f, 140.98349f, 115.0165f),
                    PathNode.CurveTo(132.1614f, 106.19441f, 118.05119f, 105.60305f, 108.521866f, 113.65604f),
                    PathNode.CurveTo(98.99254f, 121.709015f, 97.2226f, 135.72028f, 104.45f, 145.89f),
                    PathNode.LineTo(46.0f, 204.35f),
                    PathNode.LineTo(67.19f, 77.21f),
                    PathNode.CurveTo(67.42391f, 75.800224f, 68.39215f, 74.62233f, 69.73f, 74.12f),
                    PathNode.LineTo(127.0f, 52.64f),
                    PathNode.LineTo(203.35f, 129.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 132.0f),
                    PathNode.CurveTo(108.0f, 123.163445f, 115.163445f, 116.0f, 124.0f, 116.0f),
                    PathNode.CurveTo(132.83656f, 116.0f, 140.0f, 123.163445f, 140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 140.83656f, 132.83656f, 148.0f, 124.0f, 148.0f),
                    PathNode.CurveTo(115.163445f, 148.0f, 108.0f, 140.83656f, 108.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 95.51f),
                    PathNode.LineTo(208.0f, 122.34f),
                    PathNode.LineTo(133.66f, 48.0f),
                    PathNode.LineTo(160.48f, 21.18f),
                    PathNode.CurveTo(161.23027f, 20.428892f, 162.24837f, 20.006853f, 163.31f, 20.006853f),
                    PathNode.CurveTo(164.37164f, 20.006853f, 165.38972f, 20.428892f, 166.14f, 21.18f),
                    PathNode.LineTo(234.83f, 89.87f),
                    PathNode.CurveTo(236.38753f, 91.43131f, 236.38753f, 93.95869f, 234.83f, 95.52f),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
