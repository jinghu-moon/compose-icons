package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorRegularIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.5f, 171.47f),
                    PathNode.CurveTo(212.99086f, 154.25766f, 224.57486f, 128.68462f, 224.0f, 101.93f),
                    PathNode.CurveTo(223.0f, 56.22f, 186.39f, 18.53f, 140.76f, 16.13f),
                    PathNode.CurveTo(116.97324f, 14.835296f, 93.67784f, 23.239525f, 76.19644f, 39.42244f),
                    PathNode.CurveTo(58.71505f, 55.60536f, 48.54139f, 78.18419f, 48.0f, 102.0f),
                    PathNode.LineTo(25.55f, 145.18f),
                    PathNode.CurveTo(25.46f, 145.36f, 25.37f, 145.54f, 25.29f, 145.72f),
                    PathNode.CurveTo(21.94865f, 153.50816f, 25.259617f, 162.55083f, 32.84f, 166.34f),
                    PathNode.LineTo(33.09f, 166.45f),
                    PathNode.LineTo(56.0f, 176.94f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 216.83656f, 63.163445f, 224.0f, 72.0f, 224.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(124.41828f, 224.0f, 128.0f, 220.41827f, 128.0f, 216.0f),
                    PathNode.CurveTo(128.0f, 211.58173f, 124.41828f, 208.0f, 120.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(72.0f, 171.81f),
                    PathNode.CurveTo(72.00235f, 168.67847f, 70.177345f, 165.83351f, 67.33f, 164.53f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.LineTo(63.07f, 107.66f),
                    PathNode.CurveTo(63.67132f, 106.53312f, 63.990433f, 105.277245f, 64.0f, 104.0f),
                    PathNode.CurveTo(63.9952f, 70.39604f, 87.236275f, 41.257545f, 120.0f, 33.79f),
                    PathNode.LineTo(120.0f, 49.38f),
                    PathNode.CurveTo(108.97963f, 53.27629f, 102.369026f, 64.54533f, 104.345634f, 76.065865f),
                    PathNode.CurveTo(106.32224f, 87.5864f, 116.31113f, 96.007416f, 128.0f, 96.007416f),
                    PathNode.CurveTo(139.68887f, 96.007416f, 149.67775f, 87.5864f, 151.65436f, 76.065865f),
                    PathNode.CurveTo(153.63098f, 64.54533f, 147.02037f, 53.27629f, 136.0f, 49.38f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(137.3f, 32.0f, 138.6f, 32.0f, 139.9f, 32.1f),
                    PathNode.CurveTo(168.9045f, 33.76141f, 194.09364f, 52.63159f, 203.84f, 80.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.CurveTo(181.62404f, 79.99911f, 179.37062f, 81.054375f, 177.85f, 82.88f),
                    PathNode.LineTo(152.34f, 113.5f),
                    PathNode.CurveTo(141.35527f, 109.406906f, 129.01953f, 113.826164f, 123.1328f, 123.96343f),
                    PathNode.CurveTo(117.24606f, 134.10071f, 119.52198f, 147.00497f, 128.52148f, 154.51677f),
                    PathNode.CurveTo(137.52097f, 162.02856f, 150.62424f, 161.96115f, 159.54596f, 154.35716f),
                    PathNode.CurveTo(168.4677f, 146.75317f, 170.61072f, 133.82617f, 164.62f, 123.75f),
                    PathNode.LineTo(187.75f, 96.0f),
                    PathNode.LineTo(207.54f, 96.0f),
                    PathNode.QuadTo(207.9f, 99.12f, 207.98f, 102.3f),
                    PathNode.CurveTo(208.48593f, 125.54576f, 197.77516f, 147.61484f, 179.2f, 161.6f),
                    PathNode.CurveTo(176.90341f, 163.32167f, 175.70517f, 166.14174f, 176.06f, 168.99f),
                    PathNode.LineTo(184.06f, 232.99f),
                    PathNode.CurveTo(184.5636f, 236.98726f, 187.96114f, 239.98634f, 191.99f, 239.99f),
                    PathNode.CurveTo(192.32423f, 239.98993f, 192.65816f, 239.9699f, 192.99f, 239.93f),
                    PathNode.CurveTo(195.096f, 239.66783f, 197.01149f, 238.57956f, 198.31494f, 236.90477f),
                    PathNode.CurveTo(199.6184f, 235.22998f, 200.20297f, 233.10588f, 199.94f, 231.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(123.58172f, 80.0f, 120.0f, 76.41828f, 120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 67.58172f, 123.58172f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 67.58172f, 136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 76.41828f, 132.41827f, 80.0f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 144.0f),
                    PathNode.CurveTo(139.58173f, 144.0f, 136.0f, 140.41827f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 131.58173f, 139.58173f, 128.0f, 144.0f, 128.0f),
                    PathNode.CurveTo(148.41827f, 128.0f, 152.0f, 131.58173f, 152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 140.41827f, 148.41827f, 144.0f, 144.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
