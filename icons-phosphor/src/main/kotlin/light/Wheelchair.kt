package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorLightIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.69f, 190.1f),
                    PathNode.CurveTo(252.64014f, 186.95795f, 249.24245f, 185.26135f, 246.1f, 186.31f),
                    PathNode.LineTo(227.0f, 192.66f),
                    PathNode.LineTo(197.32f, 133.32f),
                    PathNode.CurveTo(196.3121f, 131.30095f, 194.25656f, 130.01817f, 192.0f, 130.0f),
                    PathNode.LineTo(110.0f, 130.0f),
                    PathNode.LineTo(110.0f, 102.05f),
                    PathNode.CurveTo(110.66f, 102.05f, 111.33f, 102.05f, 112.0f, 102.05f),
                    PathNode.LineTo(168.0f, 102.05f),
                    PathNode.CurveTo(171.3137f, 102.05f, 174.0f, 99.36371f, 174.0f, 96.05f),
                    PathNode.CurveTo(174.0f, 92.73629f, 171.3137f, 90.05f, 168.0f, 90.05f),
                    PathNode.LineTo(112.0f, 90.05f),
                    PathNode.CurveTo(111.33f, 90.05f, 110.67f, 90.05f, 110.0f, 90.05f),
                    PathNode.LineTo(110.0f, 77.4f),
                    PathNode.CurveTo(125.08978f, 74.31981f, 135.39601f, 60.31381f, 133.84808f, 44.990852f),
                    PathNode.CurveTo(132.30016f, 29.6679f, 119.40093f, 18.006123f, 104.0f, 18.006123f),
                    PathNode.CurveTo(88.59907f, 18.006123f, 75.699844f, 29.6679f, 74.15192f, 44.990852f),
                    PathNode.CurveTo(72.60398f, 60.31381f, 82.91022f, 74.31981f, 98.0f, 77.4f),
                    PathNode.LineTo(98.0f, 91.4f),
                    PathNode.CurveTo(62.7565f, 98.55641f, 38.669834f, 131.25429f, 42.284046f, 167.03494f),
                    PathNode.CurveTo(45.898254f, 202.81561f, 76.037285f, 230.03615f, 112.0f, 230.0f),
                    PathNode.CurveTo(144.62f, 230.0f, 174.0f, 207.92f, 181.81f, 177.5f),
                    PathNode.CurveTo(182.63843f, 174.29123f, 180.70877f, 171.01843f, 177.5f, 170.19f),
                    PathNode.CurveTo(174.29123f, 169.36157f, 171.01843f, 171.29123f, 170.19f, 174.5f),
                    PathNode.CurveTo(163.7f, 199.71f, 139.19f, 218.0f, 112.0f, 218.0f),
                    PathNode.CurveTo(82.70259f, 217.98988f, 58.012894f, 196.13264f, 54.450417f, 167.05263f),
                    PathNode.CurveTo(50.887936f, 137.97263f, 69.57141f, 110.8019f, 98.0f, 103.72f),
                    PathNode.LineTo(98.0f, 136.0f),
                    PathNode.CurveTo(98.0f, 139.3137f, 100.686295f, 142.0f, 104.0f, 142.0f),
                    PathNode.LineTo(188.29f, 142.0f),
                    PathNode.LineTo(218.63f, 202.68f),
                    PathNode.CurveTo(219.96873f, 205.35023f, 223.06775f, 206.62906f, 225.9f, 205.68f),
                    PathNode.LineTo(249.9f, 197.68f),
                    PathNode.CurveTo(253.03682f, 196.63005f, 254.73213f, 193.23943f, 253.69f, 190.1f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 48.0f),
                    PathNode.CurveTo(86.0f, 38.058876f, 94.05888f, 30.0f, 104.0f, 30.0f),
                    PathNode.CurveTo(113.94112f, 30.0f, 122.0f, 38.058876f, 122.0f, 48.0f),
                    PathNode.CurveTo(122.0f, 57.941124f, 113.94112f, 66.0f, 104.0f, 66.0f),
                    PathNode.CurveTo(94.05888f, 66.0f, 86.0f, 57.941124f, 86.0f, 48.0f),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
