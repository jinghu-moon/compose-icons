package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorLightIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 120.0f),
                    PathNode.CurveTo(245.97244f, 94.60632f, 225.39368f, 74.02756f, 200.0f, 74.0f),
                    PathNode.LineTo(160.15f, 74.0f),
                    PathNode.CurveTo(157.57f, 73.85f, 106.05f, 70.43f, 57.0f, 29.29f),
                    PathNode.CurveTo(52.83413f, 25.793772f, 47.02043f, 25.02652f, 42.09017f, 27.322306f),
                    PathNode.CurveTo(37.159912f, 29.618092f, 34.00536f, 34.561428f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(33.9632f, 205.44565f, 37.12107f, 210.40746f, 42.07f, 212.68f),
                    PathNode.CurveTo(43.927887f, 213.54384f, 45.951115f, 213.9942f, 48.0f, 214.0f),
                    PathNode.CurveTo(51.296394f, 214.00198f, 54.48621f, 212.83238f, 57.0f, 210.7f),
                    PathNode.CurveTo(97.0f, 177.18f, 138.57f, 168.7f, 154.0f, 166.63f),
                    PathNode.LineTo(154.0f, 200.63f),
                    PathNode.CurveTo(153.99863f, 205.31061f, 156.33644f, 209.68227f, 160.23f, 212.28f),
                    PathNode.LineTo(171.23f, 219.61f),
                    PathNode.CurveTo(175.00517f, 222.12408f, 179.76437f, 222.65349f, 183.99974f, 221.03046f),
                    PathNode.CurveTo(188.2351f, 219.40744f, 191.42174f, 215.83313f, 192.55f, 211.44f),
                    PathNode.LineTo(204.68f, 165.73f),
                    PathNode.CurveTo(228.12303f, 163.30003f, 245.95166f, 143.56857f, 246.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(49.29f, 201.52f),
                    PathNode.CurveTo(48.69639f, 202.02104f, 47.866344f, 202.13304f, 47.161167f, 201.80725f),
                    PathNode.CurveTo(46.45599f, 201.48145f, 46.003242f, 200.7768f, 46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 40.0f),
                    PathNode.CurveTo(45.977863f, 39.22092f, 46.433765f, 38.50734f, 47.15f, 38.2f),
                    PathNode.CurveTo(47.41599f, 38.07394f, 47.705708f, 38.00577f, 48.0f, 38.0f),
                    PathNode.CurveTo(48.464382f, 38.001503f, 48.91232f, 38.172146f, 49.26f, 38.48f),
                    PathNode.CurveTo(93.26f, 75.4f, 138.26f, 83.67f, 153.97f, 85.48f),
                    PathNode.LineTo(153.97f, 154.48f),
                    PathNode.CurveTo(138.29f, 156.33f, 93.3f, 164.61f, 49.29f, 201.52f),
                    PathNode.Close,
                    PathNode.MoveTo(180.93f, 208.52f),
                    PathNode.CurveTo(180.77254f, 209.15125f, 180.31787f, 209.66646f, 179.7111f, 209.90121f),
                    PathNode.CurveTo(179.10434f, 210.13596f, 178.42131f, 210.0609f, 177.88f, 209.7f),
                    PathNode.LineTo(166.88f, 202.37f),
                    PathNode.CurveTo(166.32208f, 201.99777f, 165.98788f, 201.37068f, 165.99f, 200.7f),
                    PathNode.LineTo(165.99f, 166.0f),
                    PathNode.LineTo(192.19f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 154.0f),
                    PathNode.LineTo(166.0f, 154.0f),
                    PathNode.LineTo(166.0f, 86.0f),
                    PathNode.LineTo(200.0f, 86.0f),
                    PathNode.CurveTo(218.77768f, 86.0f, 234.0f, 101.22232f, 234.0f, 120.0f),
                    PathNode.CurveTo(234.0f, 138.77768f, 218.77768f, 154.0f, 200.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
