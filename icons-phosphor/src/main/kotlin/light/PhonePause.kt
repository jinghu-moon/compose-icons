package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorLightIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.59f, 168.3f),
                    PathNode.LineTo(166.35f, 147.13f),
                    PathNode.CurveTo(162.00153f, 145.26678f, 157.00621f, 145.7257f, 153.07f, 148.35f),
                    PathNode.CurveTo(152.87338f, 148.47621f, 152.68622f, 148.6166f, 152.51f, 148.77f),
                    PathNode.LineTo(127.82f, 169.77f),
                    PathNode.CurveTo(127.30063f, 170.0532f, 126.67825f, 170.07542f, 126.14f, 169.83f),
                    PathNode.CurveTo(110.27f, 162.17f, 93.83f, 145.83f, 86.14f, 130.18f),
                    PathNode.CurveTo(85.88073f, 129.65352f, 85.88073f, 129.03648f, 86.14f, 128.51f),
                    PathNode.LineTo(107.21f, 103.45f),
                    PathNode.CurveTo(107.36f, 103.27f, 107.5f, 103.07f, 107.63f, 102.88f),
                    PathNode.CurveTo(110.22147f, 98.92632f, 110.6427f, 93.931854f, 108.75f, 89.6f),
                    PathNode.LineTo(87.73f, 42.49f),
                    PathNode.CurveTo(85.27801f, 36.77161f, 79.34627f, 33.357594f, 73.17f, 34.11f),
                    PathNode.CurveTo(46.138824f, 37.668137f, 25.94775f, 60.7357f, 26.0f, 88.0f),
                    PathNode.CurveTo(26.0f, 166.3f, 89.7f, 230.0f, 168.0f, 230.0f),
                    PathNode.CurveTo(195.2643f, 230.05225f, 218.33186f, 209.86118f, 221.89f, 182.83f),
                    PathNode.CurveTo(222.64066f, 176.68417f, 219.26523f, 170.77515f, 213.59f, 168.3f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 218.0f),
                    PathNode.CurveTo(96.32f, 218.0f, 38.0f, 159.68f, 38.0f, 88.0f),
                    PathNode.CurveTo(37.935265f, 66.77536f, 53.630592f, 48.798714f, 74.67f, 46.0f),
                    PathNode.LineTo(74.9f, 46.0f),
                    PathNode.CurveTo(75.72481f, 46.0154f, 76.455536f, 46.535645f, 76.74f, 47.31f),
                    PathNode.LineTo(97.84f, 94.42f),
                    PathNode.CurveTo(98.08353f, 94.950035f, 98.08353f, 95.55997f, 97.84f, 96.09f),
                    PathNode.LineTo(76.73f, 121.15f),
                    PathNode.CurveTo(76.57251f, 121.328896f, 76.428764f, 121.51944f, 76.3f, 121.72f),
                    PathNode.CurveTo(73.61329f, 125.82154f, 73.2681f, 131.02975f, 75.39f, 135.45f),
                    PathNode.CurveTo(84.26f, 153.61f, 102.56f, 171.77f, 120.92f, 180.64f),
                    PathNode.CurveTo(125.36665f, 182.75044f, 130.59492f, 182.37076f, 134.69f, 179.64f),
                    PathNode.CurveTo(134.88f, 179.51f, 135.07f, 179.37f, 135.25f, 179.22f),
                    PathNode.LineTo(159.93f, 158.22f),
                    PathNode.CurveTo(160.42323f, 157.95496f, 161.0076f, 157.91843f, 161.53f, 158.12f),
                    PathNode.LineTo(208.78f, 179.29f),
                    PathNode.CurveTo(209.57149f, 179.62706f, 210.05878f, 180.43248f, 209.99f, 181.29f),
                    PathNode.CurveTo(207.21011f, 202.3415f, 189.23418f, 218.05707f, 168.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 104.0f),
                    PathNode.LineTo(194.0f, 48.0f),
                    PathNode.CurveTo(194.0f, 44.68629f, 196.6863f, 42.0f, 200.0f, 42.0f),
                    PathNode.CurveTo(203.3137f, 42.0f, 206.0f, 44.68629f, 206.0f, 48.0f),
                    PathNode.LineTo(206.0f, 104.0f),
                    PathNode.CurveTo(206.0f, 107.313705f, 203.3137f, 110.0f, 200.0f, 110.0f),
                    PathNode.CurveTo(196.6863f, 110.0f, 194.0f, 107.313705f, 194.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 104.0f),
                    PathNode.LineTo(154.0f, 48.0f),
                    PathNode.CurveTo(154.0f, 44.68629f, 156.6863f, 42.0f, 160.0f, 42.0f),
                    PathNode.CurveTo(163.3137f, 42.0f, 166.0f, 44.68629f, 166.0f, 48.0f),
                    PathNode.LineTo(166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 107.313705f, 163.3137f, 110.0f, 160.0f, 110.0f),
                    PathNode.CurveTo(156.6863f, 110.0f, 154.0f, 107.313705f, 154.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
