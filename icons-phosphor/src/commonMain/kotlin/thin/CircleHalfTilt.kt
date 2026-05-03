package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorThinIcon(
            name = "CircleHalfTilt",
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
                    PathNode.MoveTo(188.0f, 197.72f),
                    PathNode.CurveTo(180.82784f, 203.93643f, 172.73067f, 208.99716f, 164.0f, 212.72f),
                    PathNode.LineTo(164.0f, 97.72f),
                    PathNode.LineTo(188.0f, 73.72f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 161.66f),
                    PathNode.LineTo(124.0f, 137.66f),
                    PathNode.LineTo(124.0f, 219.9f),
                    PathNode.CurveTo(115.847244f, 219.5583f, 107.77631f, 218.13245f, 100.0f, 215.66f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 212.66f),
                    PathNode.CurveTo(82.38433f, 208.5617f, 73.54022f, 202.84938f, 65.85f, 195.77f),
                    PathNode.LineTo(92.0f, 169.66f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 129.66f),
                    PathNode.LineTo(156.0f, 105.66f),
                    PathNode.LineTo(156.0f, 215.66f),
                    PathNode.CurveTo(148.22412f, 218.13419f, 140.15294f, 219.56009f, 132.0f, 219.9f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.005665f, 91.52007f, 57.56513f, 58.489372f, 90.95738f, 43.8012f),
                    PathNode.CurveTo(124.34964f, 29.113026f, 163.26625f, 35.542255f, 190.16f, 60.19f),
                    PathNode.LineTo(60.16f, 190.19f),
                    PathNode.CurveTo(44.552948f, 173.24806f, 35.923405f, 151.03484f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 190.0f),
                    PathNode.LineTo(196.0f, 66.0f),
                    PathNode.CurveTo(228.03923f, 101.124596f, 228.03923f, 154.87541f, 196.0f, 190.0f),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
