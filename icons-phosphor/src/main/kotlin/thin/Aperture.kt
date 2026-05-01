package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorThinIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.71f, 57.29f),
                    PathNode.CurveTo(173.48494f, 31.843018f, 136.57294f, 21.836878f, 101.949455f, 31.06006f),
                    PathNode.CurveTo(67.32597f, 40.28324f, 40.28324f, 67.32597f, 31.06006f, 101.949455f),
                    PathNode.CurveTo(21.836878f, 136.57294f, 31.843018f, 173.48494f, 57.29f, 198.71f),
                    PathNode.CurveTo(82.51506f, 224.15698f, 119.42706f, 234.16312f, 154.05057f, 224.93994f),
                    PathNode.CurveTo(188.67403f, 215.71675f, 215.71675f, 188.67403f, 224.93994f, 154.05057f),
                    PathNode.CurveTo(234.16312f, 119.42706f, 224.15698f, 82.51506f, 198.71f, 57.29f),
                    PathNode.Close,
                    PathNode.MoveTo(209.08f, 171.56f),
                    PathNode.LineTo(148.08f, 160.42f),
                    PathNode.LineTo(210.4f, 87.0f),
                    PathNode.CurveTo(223.65149f, 113.729614f, 223.15973f, 145.21724f, 209.08f, 171.52f),
                    PathNode.Close,
                    PathNode.MoveTo(95.87f, 122.13f),
                    PathNode.LineTo(117.0f, 97.24f),
                    PathNode.LineTo(149.14f, 103.1f),
                    PathNode.LineTo(160.14f, 133.87f),
                    PathNode.LineTo(139.0f, 158.76f),
                    PathNode.LineTo(106.86f, 152.9f),
                    PathNode.Close,
                    PathNode.MoveTo(206.24f, 79.58f),
                    PathNode.LineTo(166.11f, 126.83f),
                    PathNode.LineTo(133.75f, 36.2f),
                    PathNode.CurveTo(163.51173f, 38.07031f, 190.52551f, 54.23609f, 206.24f, 79.58f),
                    PathNode.Close,
                    PathNode.MoveTo(63.0f, 63.0f),
                    PathNode.CurveTo(79.53324f, 46.379856f, 101.825554f, 36.75542f, 125.26f, 36.12f),
                    PathNode.LineTo(146.0f, 94.41f),
                    PathNode.LineTo(51.32f, 77.11f),
                    PathNode.CurveTo(54.739227f, 72.03355f, 58.651554f, 67.30727f, 63.0f, 63.0f),
                    PathNode.Close,
                    PathNode.MoveTo(47.0f, 84.49f),
                    PathNode.LineTo(108.0f, 95.63f),
                    PathNode.LineTo(45.6f, 169.0f),
                    PathNode.CurveTo(32.348503f, 142.27039f, 32.840263f, 110.78277f, 46.92f, 84.48f),
                    PathNode.Close,
                    PathNode.MoveTo(49.84f, 176.49f),
                    PathNode.LineTo(89.97f, 129.24f),
                    PathNode.LineTo(122.33f, 219.87f),
                    PathNode.CurveTo(92.56826f, 217.9997f, 65.55449f, 201.83391f, 49.84f, 176.49f),
                    PathNode.Close,
                    PathNode.MoveTo(193.13f, 193.12f),
                    PathNode.CurveTo(176.59676f, 209.74014f, 154.30444f, 219.36458f, 130.87f, 220.0f),
                    PathNode.LineTo(110.0f, 161.59f),
                    PathNode.LineTo(204.72f, 178.89f),
                    PathNode.CurveTo(201.3066f, 183.98338f, 197.39755f, 188.7265f, 193.05f, 193.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _aperture!!
    }

private var _aperture: ImageVector? = null
