package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorDuotoneIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.CurveTo(150.09138f, 168.0f, 168.0f, 150.09138f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 105.90861f, 150.09138f, 88.0f, 128.0f, 88.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 27.581722f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 92.41828f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(142.4827f, 96.00325f, 155.15779f, 105.73314f, 158.90384f, 119.723f),
                    PathNode.CurveTo(162.64989f, 133.71286f, 156.53291f, 148.47466f, 143.9897f, 155.71461f),
                    PathNode.CurveTo(131.44649f, 162.95456f, 115.60438f, 160.86754f, 105.36413f, 150.62614f),
                    PathNode.CurveTo(95.12388f, 140.38475f, 93.03864f, 124.5424f, 100.28f, 112.0f),
                    PathNode.CurveTo(101.341286f, 110.16215f, 101.628815f, 107.977905f, 101.07929f, 105.92801f),
                    PathNode.CurveTo(100.529785f, 103.87811f, 99.18826f, 102.13057f, 97.35f, 101.07f),
                    PathNode.LineTo(48.85f, 73.07f),
                    PathNode.CurveTo(47.012142f, 72.00871f, 44.827904f, 71.72118f, 42.77801f, 72.2707f),
                    PathNode.CurveTo(40.728115f, 72.82021f, 38.98057f, 74.161736f, 37.92f, 76.0f),
                    PathNode.CurveTo(14.385126f, 116.763596f, 21.162907f, 168.25233f, 54.445175f, 201.53674f),
                    PathNode.CurveTo(87.72745f, 234.82115f, 139.21574f, 241.60223f, 179.98087f, 218.06998f),
                    PathNode.CurveTo(220.74597f, 194.5377f, 240.62367f, 146.55956f, 228.44553f, 101.0925f),
                    PathNode.CurveTo(216.26735f, 55.625435f, 175.06975f, 24.006046f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.09f, 91.1f),
                    PathNode.LineTo(83.0f, 111.26f),
                    PathNode.CurveTo(81.01344f, 116.61746f, 79.99756f, 122.28609f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 129.53f, 80.08f, 131.0f, 80.22f, 132.52f),
                    PathNode.LineTo(41.28f, 143.0f),
                    PathNode.CurveTo(38.243282f, 125.409515f, 40.61798f, 107.31159f, 48.09f, 91.1f),
                    PathNode.Close,
                    PathNode.MoveTo(45.42f, 158.41f),
                    PathNode.LineTo(84.42f, 147.97f),
                    PathNode.CurveTo(91.039734f, 162.39972f, 104.353226f, 172.63367f, 120.0f, 175.32f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(86.20043f, 212.4971f, 57.19801f, 190.24559f, 45.42f, 158.41f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 175.32f),
                    PathNode.CurveTo(159.08505f, 171.40714f, 175.9785f, 151.40932f, 175.9785f, 127.995f),
                    PathNode.CurveTo(175.9785f, 104.58069f, 159.08505f, 84.58287f, 136.0f, 80.67f),
                    PathNode.LineTo(136.0f, 40.36f),
                    PathNode.CurveTo(181.30995f, 44.49969f, 215.99333f, 82.49634f, 215.99333f, 127.995f),
                    PathNode.CurveTo(215.99333f, 173.49367f, 181.30995f, 211.49031f, 136.0f, 215.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
