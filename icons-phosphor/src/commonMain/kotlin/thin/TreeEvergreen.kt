package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorThinIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.16f, 189.54f),
                    PathNode.LineTo(176.16f, 124.0f),
                    PathNode.LineTo(208.0f, 124.0f),
                    PathNode.CurveTo(209.5242f, 124.00015f, 210.91603f, 123.13405f, 211.58917f, 121.76653f),
                    PathNode.CurveTo(212.26231f, 120.39901f, 212.09976f, 118.767784f, 211.17f, 117.56f),
                    PathNode.LineTo(131.17f, 13.56f),
                    PathNode.CurveTo(130.4128f, 12.576039f, 129.2416f, 11.999488f, 128.0f, 11.999488f),
                    PathNode.CurveTo(126.75841f, 11.999488f, 125.58721f, 12.576039f, 124.83f, 13.56f),
                    PathNode.LineTo(44.83f, 117.56f),
                    PathNode.CurveTo(43.90023f, 118.767784f, 43.73768f, 120.39901f, 44.41082f, 121.76653f),
                    PathNode.CurveTo(45.08396f, 123.13405f, 46.47579f, 124.00015f, 48.0f, 124.0f),
                    PathNode.LineTo(79.82f, 124.0f),
                    PathNode.LineTo(28.82f, 189.54f),
                    PathNode.CurveTo(27.876923f, 190.7491f, 27.708067f, 192.39093f, 28.385292f, 193.76668f),
                    PathNode.CurveTo(29.06252f, 195.14244f, 30.466627f, 196.00995f, 32.0f, 196.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(225.52977f, 196.00226f, 226.92685f, 195.1318f, 227.59904f, 193.75764f),
                    PathNode.CurveTo(228.27126f, 192.38347f, 228.10081f, 190.74626f, 227.16f, 189.54f),
                    PathNode.Close,
                    PathNode.MoveTo(40.18f, 188.0f),
                    PathNode.LineTo(91.18f, 122.46f),
                    PathNode.CurveTo(92.12308f, 121.25089f, 92.29194f, 119.60907f, 91.6147f, 118.233315f),
                    PathNode.CurveTo(90.93748f, 116.85757f, 89.53337f, 115.99005f, 88.0f, 116.0f),
                    PathNode.LineTo(56.12f, 116.0f),
                    PathNode.LineTo(128.0f, 22.56f),
                    PathNode.LineTo(199.88f, 116.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(166.47023f, 115.99775f, 165.07315f, 116.86819f, 164.40096f, 118.242355f),
                    PathNode.CurveTo(163.72874f, 119.61652f, 163.89919f, 121.25374f, 164.84f, 122.46f),
                    PathNode.LineTo(215.84f, 188.0f),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
