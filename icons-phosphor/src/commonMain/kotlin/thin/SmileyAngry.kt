package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorThinIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 140.0f),
                    PathNode.CurveTo(100.0f, 144.41827f, 96.41828f, 148.0f, 92.0f, 148.0f),
                    PathNode.CurveTo(87.58172f, 148.0f, 84.0f, 144.41827f, 84.0f, 140.0f),
                    PathNode.CurveTo(84.0f, 135.58173f, 87.58172f, 132.0f, 92.0f, 132.0f),
                    PathNode.CurveTo(96.41828f, 132.0f, 100.0f, 135.58173f, 100.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 132.0f),
                    PathNode.CurveTo(159.58173f, 132.0f, 156.0f, 135.58173f, 156.0f, 140.0f),
                    PathNode.CurveTo(156.0f, 144.41827f, 159.58173f, 148.0f, 164.0f, 148.0f),
                    PathNode.CurveTo(168.41827f, 148.0f, 172.0f, 144.41827f, 172.0f, 140.0f),
                    PathNode.CurveTo(172.0f, 135.58173f, 168.41827f, 132.0f, 164.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 183.22847f, 183.22847f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 72.77152f, 72.77152f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(183.20334f, 28.060623f, 227.93938f, 72.79665f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 77.18981f, 178.8102f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(77.18981f, 36.0f, 36.0f, 77.18981f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 178.8102f, 77.18981f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(178.78735f, 219.94489f, 219.94489f, 178.78735f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.78f, 84.67f),
                    PathNode.LineTo(128.0f, 115.19f),
                    PathNode.LineTo(82.22f, 84.67f),
                    PathNode.CurveTo(80.38089f, 83.44393f, 77.89607f, 83.940895f, 76.67f, 85.78f),
                    PathNode.CurveTo(75.44393f, 87.61911f, 75.940895f, 90.10393f, 77.78f, 91.33f),
                    PathNode.LineTo(125.78f, 123.33f),
                    PathNode.CurveTo(127.124146f, 124.2268f, 128.87585f, 124.2268f, 130.22f, 123.33f),
                    PathNode.LineTo(178.22f, 91.33f),
                    PathNode.CurveTo(180.05911f, 90.10393f, 180.55608f, 87.61911f, 179.33f, 85.78f),
                    PathNode.CurveTo(178.10393f, 83.940895f, 175.61911f, 83.44393f, 173.78f, 84.67f),
                    PathNode.Close,
                    PathNode.MoveTo(154.21f, 180.67f),
                    PathNode.CurveTo(146.39f, 175.47f, 138.94f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(117.06f, 172.0f, 109.61f, 175.47f, 101.79f, 180.67f),
                    PathNode.CurveTo(100.5343f, 181.43097f, 99.79645f, 182.81874f, 99.86782f, 184.28528f),
                    PathNode.CurveTo(99.939186f, 185.75183f, 100.8083f, 187.0614f, 102.13195f, 187.69685f),
                    PathNode.CurveTo(103.455605f, 188.3323f, 105.021f, 188.19148f, 106.21f, 187.33f),
                    PathNode.CurveTo(113.2f, 182.69f, 119.0f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(137.0f, 180.0f, 142.8f, 182.69f, 149.79f, 187.33f),
                    PathNode.CurveTo(150.97899f, 188.19148f, 152.5444f, 188.3323f, 153.86806f, 187.69685f),
                    PathNode.CurveTo(155.1917f, 187.0614f, 156.06082f, 185.75183f, 156.13219f, 184.28528f),
                    PathNode.CurveTo(156.20355f, 182.81874f, 155.4657f, 181.43097f, 154.21f, 180.67f),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
