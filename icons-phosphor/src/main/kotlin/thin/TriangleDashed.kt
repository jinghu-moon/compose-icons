package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorThinIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 216.0f),
                    PathNode.CurveTo(156.0f, 218.20914f, 154.20914f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(104.0f, 220.0f),
                    PathNode.CurveTo(101.79086f, 220.0f, 100.0f, 218.20914f, 100.0f, 216.0f),
                    PathNode.CurveTo(100.0f, 213.79086f, 101.79086f, 212.0f, 104.0f, 212.0f),
                    PathNode.LineTo(152.0f, 212.0f),
                    PathNode.CurveTo(154.20914f, 212.0f, 156.0f, 213.79086f, 156.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(233.34f, 190.09f),
                    PathNode.LineTo(228.68f, 182.0f),
                    PathNode.CurveTo(227.57542f, 180.08633f, 225.12866f, 179.43044f, 223.215f, 180.535f),
                    PathNode.CurveTo(221.30133f, 181.63957f, 220.64543f, 184.08633f, 221.75f, 186.0f),
                    PathNode.LineTo(226.4f, 194.08f),
                    PathNode.CurveTo(228.55092f, 197.69061f, 228.55092f, 202.18939f, 226.4f, 205.8f),
                    PathNode.CurveTo(224.13855f, 209.68861f, 219.95802f, 212.05785f, 215.46f, 212.0f),
                    PathNode.LineTo(192.0f, 212.0f),
                    PathNode.CurveTo(189.79086f, 212.0f, 188.0f, 213.79086f, 188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 218.20914f, 189.79086f, 220.0f, 192.0f, 220.0f),
                    PathNode.LineTo(215.46f, 220.0f),
                    PathNode.CurveTo(222.8193f, 220.07791f, 229.64778f, 216.17812f, 233.32f, 209.8f),
                    PathNode.CurveTo(236.8867f, 203.716f, 236.89435f, 196.18121f, 233.34f, 190.09f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 212.0f),
                    PathNode.LineTo(40.54f, 212.0f),
                    PathNode.CurveTo(36.04198f, 212.05785f, 31.86145f, 209.68861f, 29.6f, 205.8f),
                    PathNode.CurveTo(27.449085f, 202.18939f, 27.449085f, 197.69061f, 29.6f, 194.08f),
                    PathNode.LineTo(34.25f, 186.0f),
                    PathNode.CurveTo(35.35457f, 184.08633f, 34.698666f, 181.63957f, 32.785f, 180.535f),
                    PathNode.CurveTo(30.871334f, 179.43044f, 28.42457f, 180.08633f, 27.32f, 182.0f),
                    PathNode.LineTo(22.66f, 190.09f),
                    PathNode.CurveTo(19.099482f, 196.17761f, 19.099482f, 203.71239f, 22.66f, 209.8f),
                    PathNode.CurveTo(26.335732f, 216.1844f, 33.173573f, 220.08517f, 40.54f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(66.20914f, 220.0f, 68.0f, 218.20914f, 68.0f, 216.0f),
                    PathNode.CurveTo(68.0f, 213.79086f, 66.20914f, 212.0f, 64.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.18f, 148.0f),
                    PathNode.CurveTo(203.61012f, 148.0021f, 204.93256f, 147.24055f, 205.64853f, 146.00256f),
                    PathNode.CurveTo(206.3645f, 144.76457f, 206.36507f, 143.23851f, 205.65f, 142.0f),
                    PathNode.LineTo(182.65f, 102.0f),
                    PathNode.CurveTo(181.54543f, 100.086334f, 179.09866f, 99.43043f, 177.185f, 100.535f),
                    PathNode.CurveTo(175.27133f, 101.63958f, 174.61543f, 104.086334f, 175.72f, 106.0f),
                    PathNode.LineTo(198.72f, 146.0f),
                    PathNode.CurveTo(199.43379f, 147.23634f, 200.7524f, 147.99854f, 202.18f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.88f, 38.22f),
                    PathNode.CurveTo(142.15059f, 31.88708f, 135.34944f, 27.999392f, 128.0f, 27.999392f),
                    PathNode.CurveTo(120.65055f, 27.999392f, 113.84941f, 31.88708f, 110.12f, 38.22f),
                    PathNode.LineTo(96.42f, 62.0f),
                    PathNode.CurveTo(95.31543f, 63.916428f, 95.97357f, 66.36543f, 97.89f, 67.47f),
                    PathNode.CurveTo(99.80643f, 68.57457f, 102.25543f, 67.91643f, 103.36f, 66.0f),
                    PathNode.LineTo(117.05f, 42.21f),
                    PathNode.CurveTo(119.354095f, 38.358677f, 123.51207f, 36.00096f, 128.0f, 36.00096f),
                    PathNode.CurveTo(132.48793f, 36.00096f, 136.6459f, 38.358677f, 138.95f, 42.21f),
                    PathNode.LineTo(152.64f, 66.0f),
                    PathNode.CurveTo(153.74455f, 67.91643f, 156.19357f, 68.57457f, 158.11f, 67.47f),
                    PathNode.CurveTo(160.02643f, 66.36543f, 160.68457f, 63.916428f, 159.58f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.88f, 100.53f),
                    PathNode.CurveTo(77.95823f, 99.9918f, 76.85959f, 99.84434f, 75.82853f, 100.120415f),
                    PathNode.CurveTo(74.79746f, 100.3965f, 73.9195f, 101.07321f, 73.39f, 102.0f),
                    PathNode.LineTo(50.39f, 142.0f),
                    PathNode.CurveTo(49.28543f, 143.91643f, 49.943573f, 146.36543f, 51.86f, 147.47f),
                    PathNode.CurveTo(53.77643f, 148.57457f, 56.22543f, 147.91643f, 57.33f, 146.0f),
                    PathNode.LineTo(80.33f, 106.0f),
                    PathNode.CurveTo(80.86099f, 105.07881f, 81.003365f, 103.9841f, 80.72566f, 102.957726f),
                    PathNode.CurveTo(80.44796f, 101.93136f, 79.77304f, 101.057785f, 78.85f, 100.53f),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
