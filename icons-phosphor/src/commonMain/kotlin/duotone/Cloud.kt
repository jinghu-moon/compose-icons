package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = phosphorDuotoneIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 172.18279f, 204.18279f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(50.325085f, 207.97327f, 30.61199f, 195.44093f, 21.390259f, 175.82558f),
                    PathNode.CurveTo(12.168529f, 156.21022f, 15.094369f, 133.0347f, 28.901815f, 116.32671f),
                    PathNode.CurveTo(42.709263f, 99.61871f, 64.918526f, 92.378975f, 85.92f, 97.74f),
                    PathNode.LineTo(85.92f, 97.84f),
                    PathNode.CurveTo(100.35724f, 62.427902f, 137.83798f, 42.185604f, 175.36777f, 49.531776f),
                    PathNode.CurveTo(212.89755f, 56.87795f, 239.98f, 89.758f, 240.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 40.0f),
                    PathNode.CurveTo(126.66838f, 40.025585f, 96.205795f, 58.862f, 81.29f, 88.67f),
                    PathNode.CurveTo(57.574913f, 85.21132f, 33.914806f, 95.2921f, 19.981407f, 114.79154f),
                    PathNode.CurveTo(6.048011f, 134.29099f, 4.176589f, 159.94095f, 15.132137f, 181.2563f),
                    PathNode.CurveTo(26.087687f, 202.57166f, 48.034035f, 215.97987f, 72.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(208.60106f, 216.0f, 248.0f, 176.60106f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 79.39894f, 208.60106f, 40.0f, 160.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(45.490334f, 200.0f, 24.0f, 178.50967f, 24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 125.49033f, 45.490334f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(73.1f, 104.0f, 74.2f, 104.0f, 75.29f, 104.11f),
                    PathNode.CurveTo(73.10223f, 111.88463f, 71.99516f, 119.92342f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 132.41827f, 75.58172f, 136.0f, 80.0f, 136.0f),
                    PathNode.CurveTo(84.41828f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 88.2355f, 120.2355f, 56.0f, 160.0f, 56.0f),
                    PathNode.CurveTo(199.7645f, 56.0f, 232.0f, 88.2355f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 167.7645f, 199.7645f, 200.0f, 160.0f, 200.0f),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
