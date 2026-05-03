package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorThinIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(168.0f, 28.0f),
                    PathNode.CurveTo(165.79086f, 28.0f, 164.0f, 29.790861f, 164.0f, 32.0f),
                    PathNode.CurveTo(164.0f, 34.20914f, 165.79086f, 36.0f, 168.0f, 36.0f),
                    PathNode.LineTo(198.34f, 36.0f),
                    PathNode.LineTo(163.55f, 70.79f),
                    PathNode.CurveTo(145.09465f, 51.240803f, 115.88818f, 46.354214f, 92.07446f, 58.831295f),
                    PathNode.CurveTo(68.26074f, 71.30837f, 55.65351f, 98.10305f, 61.22142f, 124.40456f),
                    PathNode.CurveTo(66.78933f, 150.70607f, 89.17306f, 170.0933f, 116.0f, 171.85f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.LineTo(88.0f, 196.0f),
                    PathNode.CurveTo(85.79086f, 196.0f, 84.0f, 197.79086f, 84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 202.20914f, 85.79086f, 204.0f, 88.0f, 204.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 234.20914f, 117.79086f, 236.0f, 120.0f, 236.0f),
                    PathNode.CurveTo(122.20914f, 236.0f, 124.0f, 234.20914f, 124.0f, 232.0f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(152.0f, 204.0f),
                    PathNode.CurveTo(154.20914f, 204.0f, 156.0f, 202.20914f, 156.0f, 200.0f),
                    PathNode.CurveTo(156.0f, 197.79086f, 154.20914f, 196.0f, 152.0f, 196.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(124.0f, 171.85f),
                    PathNode.CurveTo(145.7403f, 170.41383f, 164.98923f, 157.29388f, 174.27396f, 137.58356f),
                    PathNode.CurveTo(183.55869f, 117.87324f, 181.41687f, 94.67696f, 168.68f, 77.0f),
                    PathNode.LineTo(204.0f, 41.66f),
                    PathNode.LineTo(204.0f, 72.0f),
                    PathNode.CurveTo(204.0f, 74.20914f, 205.79086f, 76.0f, 208.0f, 76.0f),
                    PathNode.CurveTo(210.20914f, 76.0f, 212.0f, 74.20914f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 32.0f),
                    PathNode.CurveTo(212.0f, 29.790861f, 210.20914f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 164.0f),
                    PathNode.CurveTo(91.2812f, 164.0f, 68.0f, 140.71881f, 68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 83.2812f, 91.2812f, 60.0f, 120.0f, 60.0f),
                    PathNode.CurveTo(148.71881f, 60.0f, 172.0f, 83.2812f, 172.0f, 112.0f),
                    PathNode.CurveTo(171.96693f, 140.7051f, 148.7051f, 163.96693f, 120.0f, 164.0f),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
