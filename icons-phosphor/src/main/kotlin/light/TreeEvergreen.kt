package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorLightIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.74f, 188.32f),
                    PathNode.LineTo(180.27f, 126.0f),
                    PathNode.LineTo(208.0f, 126.0f),
                    PathNode.CurveTo(210.28722f, 126.00213f, 212.3767f, 124.703705f, 213.38766f, 122.65204f),
                    PathNode.CurveTo(214.39864f, 120.60037f, 214.15521f, 118.1524f, 212.76f, 116.34f),
                    PathNode.LineTo(132.76f, 12.34f),
                    PathNode.CurveTo(131.62445f, 10.86022f, 129.86526f, 9.992725f, 128.0f, 9.992725f),
                    PathNode.CurveTo(126.13473f, 9.992725f, 124.37555f, 10.86022f, 123.24f, 12.34f),
                    PathNode.LineTo(43.24f, 116.34f),
                    PathNode.CurveTo(41.844795f, 118.1524f, 41.601368f, 120.60037f, 42.612335f, 122.65204f),
                    PathNode.CurveTo(43.6233f, 124.703705f, 45.71278f, 126.00213f, 48.0f, 126.0f),
                    PathNode.LineTo(75.73f, 126.0f),
                    PathNode.LineTo(27.26f, 188.32f),
                    PathNode.CurveTo(25.854877f, 190.12946f, 25.60279f, 192.58113f, 26.6103f, 194.63866f),
                    PathNode.CurveTo(27.617807f, 196.69618f, 29.70904f, 198.0004f, 32.0f, 198.0f),
                    PathNode.LineTo(122.0f, 198.0f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 198.0f),
                    PathNode.LineTo(224.0f, 198.0f),
                    PathNode.CurveTo(226.29095f, 198.0004f, 228.38219f, 196.69618f, 229.3897f, 194.63866f),
                    PathNode.CurveTo(230.39722f, 192.58113f, 230.14513f, 190.12946f, 228.74f, 188.32f),
                    PathNode.Close,
                    PathNode.MoveTo(44.27f, 186.0f),
                    PathNode.LineTo(92.74f, 123.68f),
                    PathNode.CurveTo(94.14512f, 121.870544f, 94.39721f, 119.41888f, 93.3897f, 117.36134f),
                    PathNode.CurveTo(92.382195f, 115.30382f, 90.29096f, 113.999596f, 88.0f, 114.0f),
                    PathNode.LineTo(60.19f, 114.0f),
                    PathNode.LineTo(128.0f, 25.84f),
                    PathNode.LineTo(195.81f, 114.0f),
                    PathNode.LineTo(168.0f, 114.0f),
                    PathNode.CurveTo(165.70905f, 113.999596f, 163.61781f, 115.30382f, 162.6103f, 117.36134f),
                    PathNode.CurveTo(161.60278f, 119.41888f, 161.85487f, 121.870544f, 163.26f, 123.68f),
                    PathNode.LineTo(211.73f, 186.0f),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
