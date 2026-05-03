package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorFillIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 72.0f),
                    PathNode.CurveTo(144.0f, 54.32689f, 158.32689f, 40.0f, 176.0f, 40.0f),
                    PathNode.CurveTo(193.67311f, 40.0f, 208.0f, 54.32689f, 208.0f, 72.0f),
                    PathNode.CurveTo(208.0f, 89.67311f, 193.67311f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(158.32689f, 104.0f, 144.0f, 89.67311f, 144.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.89f, 184.19f),
                    PathNode.CurveTo(179.06f, 210.58f, 157.17f, 198.7f, 131.82f, 184.93f),
                    PathNode.CurveTo(105.21f, 170.49f, 75.06f, 154.12f, 34.89f, 187.42f),
                    PathNode.CurveTo(32.66534f, 189.2379f, 31.586288f, 192.1091f, 32.06301f, 194.94223f),
                    PathNode.CurveTo(32.539734f, 197.77536f, 34.499012f, 200.13531f, 37.196102f, 201.12506f),
                    PathNode.CurveTo(39.893196f, 202.11478f, 42.9139f, 201.5823f, 45.11f, 199.73f),
                    PathNode.CurveTo(76.94f, 173.34f, 98.83f, 185.23f, 124.18f, 198.99f),
                    PathNode.CurveTo(139.29f, 207.19f, 155.53f, 215.99f, 174.11f, 215.99f),
                    PathNode.CurveTo(188.25f, 215.99f, 203.75f, 210.88f, 221.11f, 196.49f),
                    PathNode.CurveTo(224.51207f, 193.66783f, 224.98218f, 188.62207f, 222.16f, 185.22f),
                    PathNode.CurveTo(219.33783f, 181.81793f, 214.29207f, 181.34782f, 210.89f, 184.17f),
                    PathNode.Close,
                    PathNode.MoveTo(34.89f, 147.43f),
                    PathNode.CurveTo(32.66534f, 149.2479f, 31.586288f, 152.11911f, 32.06301f, 154.95224f),
                    PathNode.CurveTo(32.539734f, 157.78537f, 34.499012f, 160.14532f, 37.196102f, 161.13506f),
                    PathNode.CurveTo(39.893196f, 162.12479f, 42.9139f, 161.5923f, 45.11f, 159.74f),
                    PathNode.CurveTo(76.94f, 133.36f, 98.83f, 145.24f, 124.18f, 159.0f),
                    PathNode.CurveTo(139.29f, 167.2f, 155.53f, 176.0f, 174.11f, 176.0f),
                    PathNode.CurveTo(188.25f, 176.0f, 203.75f, 170.89f, 221.11f, 156.5f),
                    PathNode.CurveTo(223.33466f, 154.6821f, 224.41371f, 151.8109f, 223.937f, 148.97775f),
                    PathNode.CurveTo(223.46027f, 146.14464f, 221.50099f, 143.78468f, 218.8039f, 142.79495f),
                    PathNode.CurveTo(216.1068f, 141.8052f, 213.0861f, 142.33769f, 210.89f, 144.19f),
                    PathNode.CurveTo(205.10646f, 149.15678f, 198.60663f, 153.22255f, 191.61f, 156.25f),
                    PathNode.LineTo(137.77f, 102.43f),
                    PathNode.CurveTo(118.30476f, 82.87791f, 91.82938f, 71.92121f, 64.24f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 75.58172f, 32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 84.41828f, 35.581722f, 88.0f, 40.0f, 88.0f),
                    PathNode.LineTo(64.24f, 88.0f),
                    PathNode.CurveTo(78.86225f, 87.97198f, 93.25923f, 91.60216f, 106.12f, 98.56f),
                    PathNode.LineTo(76.49f, 128.17f),
                    PathNode.CurveTo(63.82f, 129.36f, 50.07f, 134.84f, 34.89f, 147.42f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
