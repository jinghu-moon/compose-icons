package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorLightIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.25f, 64.8f),
                    PathNode.LineTo(221.33f, 61.39f),
                    PathNode.CurveTo(222.22398f, 57.852272f, 222.22398f, 54.147728f, 221.33f, 50.61f),
                    PathNode.LineTo(227.25f, 47.2f),
                    PathNode.CurveTo(230.12189f, 45.543144f, 231.10686f, 41.87188f, 229.45f, 39.0f),
                    PathNode.CurveTo(227.79315f, 36.12812f, 224.12189f, 35.143147f, 221.25f, 36.8f),
                    PathNode.LineTo(215.32f, 40.23f),
                    PathNode.CurveTo(212.70769f, 37.68916f, 209.50513f, 35.837036f, 206.0f, 34.84f),
                    PathNode.LineTo(206.0f, 28.0f),
                    PathNode.CurveTo(206.0f, 24.68629f, 203.3137f, 22.0f, 200.0f, 22.0f),
                    PathNode.CurveTo(196.6863f, 22.0f, 194.0f, 24.68629f, 194.0f, 28.0f),
                    PathNode.LineTo(194.0f, 34.84f),
                    PathNode.CurveTo(190.49487f, 35.837036f, 187.29231f, 37.68916f, 184.68f, 40.23f),
                    PathNode.LineTo(178.75f, 36.8f),
                    PathNode.CurveTo(175.87811f, 35.143147f, 172.20685f, 36.12812f, 170.55f, 39.0f),
                    PathNode.CurveTo(168.89314f, 41.87188f, 169.87811f, 45.543144f, 172.75f, 47.2f),
                    PathNode.LineTo(178.67f, 50.61f),
                    PathNode.CurveTo(177.77602f, 54.147728f, 177.77602f, 57.852272f, 178.67f, 61.39f),
                    PathNode.LineTo(172.75f, 64.8f),
                    PathNode.CurveTo(169.87811f, 66.456856f, 168.89314f, 70.12812f, 170.55f, 73.0f),
                    PathNode.CurveTo(172.20685f, 75.87188f, 175.87811f, 76.85686f, 178.75f, 75.2f),
                    PathNode.LineTo(184.68f, 71.77f),
                    PathNode.CurveTo(187.29231f, 74.31084f, 190.49487f, 76.16296f, 194.0f, 77.16f),
                    PathNode.LineTo(194.0f, 84.0f),
                    PathNode.CurveTo(194.0f, 87.313705f, 196.6863f, 90.0f, 200.0f, 90.0f),
                    PathNode.CurveTo(203.3137f, 90.0f, 206.0f, 87.313705f, 206.0f, 84.0f),
                    PathNode.LineTo(206.0f, 77.16f),
                    PathNode.CurveTo(209.50513f, 76.16296f, 212.70769f, 74.31084f, 215.32f, 71.77f),
                    PathNode.LineTo(221.25f, 75.2f),
                    PathNode.CurveTo(224.12189f, 76.85686f, 227.79315f, 75.87188f, 229.45f, 73.0f),
                    PathNode.CurveTo(231.10686f, 70.12812f, 230.12189f, 66.456856f, 227.25f, 64.8f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 66.0f),
                    PathNode.CurveTo(194.47716f, 66.0f, 190.0f, 61.522846f, 190.0f, 56.0f),
                    PathNode.CurveTo(190.0f, 50.477154f, 194.47716f, 46.0f, 200.0f, 46.0f),
                    PathNode.CurveTo(205.52284f, 46.0f, 210.0f, 50.477154f, 210.0f, 56.0f),
                    PathNode.CurveTo(210.0f, 61.522846f, 205.52284f, 66.0f, 200.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.68f, 106.08f),
                    PathNode.CurveTo(218.41383f, 106.630486f, 216.21158f, 109.72349f, 216.76f, 112.99f),
                    PathNode.CurveTo(217.58394f, 117.950905f, 217.99867f, 122.97114f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.017f, 150.92195f, 209.25328f, 172.97972f, 193.51f, 189.64f),
                    PathNode.CurveTo(184.0827f, 174.98141f, 169.99138f, 163.92677f, 153.51f, 158.26f),
                    PathNode.CurveTo(170.38399f, 147.021f, 177.91011f, 126.059746f, 172.03905f, 106.65414f),
                    PathNode.CurveTo(166.168f, 87.24853f, 148.28429f, 73.97489f, 128.01f, 73.97489f),
                    PathNode.CurveTo(107.73571f, 73.97489f, 89.852005f, 87.24853f, 83.98094f, 106.65414f),
                    PathNode.CurveTo(78.109886f, 126.059746f, 85.63601f, 147.021f, 102.51f, 158.26f),
                    PathNode.CurveTo(86.028625f, 163.92677f, 71.9373f, 174.98141f, 62.51f, 189.64f),
                    PathNode.CurveTo(37.887955f, 163.51224f, 31.160402f, 125.24534f, 45.394646f, 92.2864f),
                    PathNode.CurveTo(59.62889f, 59.32747f, 92.09868f, 37.989044f, 128.0f, 38.0f),
                    PathNode.CurveTo(133.02554f, 38.001423f, 138.04245f, 38.416157f, 143.0f, 39.24f),
                    PathNode.CurveTo(145.13298f, 39.64207f, 147.31679f, 38.860813f, 148.7107f, 37.197002f),
                    PathNode.CurveTo(150.1046f, 35.53319f, 150.49124f, 33.24628f, 149.72174f, 31.216722f),
                    PathNode.CurveTo(148.95224f, 29.187164f, 147.1466f, 27.73144f, 145.0f, 27.41f),
                    PathNode.CurveTo(98.2379f, 19.48628f, 52.18427f, 44.840256f, 33.87027f, 88.59042f),
                    PathNode.CurveTo(15.556273f, 132.34059f, 29.814873f, 182.94151f, 68.27699f, 210.69301f),
                    PathNode.CurveTo(106.73911f, 238.44449f, 159.2548f, 236.02307f, 195.0f, 204.85f),
                    PathNode.CurveTo(195.65f, 206.21f, 196.68f, 204.85f, 197.34f, 202.74f),
                    PathNode.CurveTo(222.54718f, 179.3777f, 234.29431f, 144.89188f, 228.59f, 111.0f),
                    PathNode.CurveTo(228.03952f, 107.73383f, 224.9465f, 105.53158f, 221.68f, 106.08f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 101.22232f, 109.22232f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(146.77768f, 86.0f, 162.0f, 101.22232f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 138.77768f, 146.77768f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(109.22232f, 154.0f, 94.0f, 138.77768f, 94.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.44f, 198.0f),
                    PathNode.CurveTo(83.37561f, 178.15306f, 104.84055f, 166.0142f, 128.0f, 166.0142f),
                    PathNode.CurveTo(151.15944f, 166.0142f, 172.62439f, 178.15306f, 184.56f, 198.0f),
                    PathNode.CurveTo(151.59189f, 224.73387f, 104.40812f, 224.73387f, 71.44f, 198.0f),
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
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
