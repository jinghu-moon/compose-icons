package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorFillIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.65f, 129.11f),
                    PathNode.LineTo(200.59f, 119.76f),
                    PathNode.CurveTo(199.73839f, 119.463554f, 198.8116f, 119.463554f, 197.96f, 119.76f),
                    PathNode.LineTo(154.73f, 135.48f),
                    PathNode.CurveTo(153.85654f, 135.80855f, 152.93307f, 135.98444f, 152.0f, 136.0f),
                    PathNode.CurveTo(148.39967f, 135.9982f, 145.24408f, 133.59161f, 144.29f, 130.12f),
                    PathNode.CurveTo(143.24335f, 126.013725f, 145.50996f, 121.788795f, 149.51f, 120.39f),
                    PathNode.LineTo(168.0f, 113.67f),
                    PathNode.CurveTo(169.01839f, 113.30306f, 169.6923f, 112.331024f, 169.67879f, 111.24864f),
                    PathNode.CurveTo(169.66525f, 110.16626f, 168.96724f, 109.21137f, 167.94f, 108.87f),
                    PathNode.CurveTo(164.662f, 107.77593f, 161.65985f, 105.98488f, 159.14f, 103.62f),
                    PathNode.CurveTo(158.04149f, 102.53846f, 156.41922f, 102.18444f, 154.97f, 102.71f),
                    PathNode.LineTo(130.75f, 111.51f),
                    PathNode.CurveTo(128.65295f, 112.27095f, 126.33342f, 112.12171f, 124.351166f, 111.09831f),
                    PathNode.CurveTo(122.36891f, 110.074905f, 120.90402f, 108.2703f, 120.31f, 106.12f),
                    PathNode.CurveTo(119.26334f, 102.013725f, 121.52995f, 97.788795f, 125.53f, 96.39f),
                    PathNode.LineTo(146.0f, 88.93f),
                    PathNode.CurveTo(147.03499f, 88.554344f, 147.86935f, 87.76868f, 148.3065f, 86.758125f),
                    PathNode.CurveTo(148.74365f, 85.747574f, 148.74492f, 84.60152f, 148.31f, 83.59f),
                    PathNode.LineTo(145.25f, 76.43f),
                    PathNode.CurveTo(144.4164f, 74.4737f, 142.19785f, 73.5116f, 140.2f, 74.24f),
                    PathNode.LineTo(114.7f, 83.51f),
                    PathNode.CurveTo(112.60295f, 84.27095f, 110.28342f, 84.12171f, 108.30116f, 83.09831f),
                    PathNode.CurveTo(106.31892f, 82.074905f, 104.85402f, 80.2703f, 104.26f, 78.12f),
                    PathNode.CurveTo(103.21335f, 74.013725f, 105.47996f, 69.788795f, 109.48f, 68.39f),
                    PathNode.LineTo(133.48f, 59.66f),
                    PathNode.CurveTo(134.51244f, 59.28412f, 135.34479f, 58.500103f, 135.78171f, 57.491978f),
                    PathNode.CurveTo(136.21863f, 56.483856f, 136.22162f, 55.3404f, 135.79f, 54.33f),
                    PathNode.LineTo(130.39f, 41.6f),
                    PathNode.CurveTo(130.39f, 41.6f, 130.39f, 41.53f, 130.39f, 41.5f),
                    PathNode.CurveTo(126.96033f, 33.807365f, 118.15415f, 30.090755f, 110.25f, 33.0f),
                    PathNode.LineTo(34.53f, 60.49f),
                    PathNode.CurveTo(28.216034f, 62.802593f, 24.01295f, 68.805855f, 24.0f, 75.53f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(248.83656f, 208.0f, 256.0f, 200.83656f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 167.06f),
                    PathNode.CurveTo(256.00128f, 149.84204f, 244.98427f, 134.55516f, 228.65f, 129.11f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
