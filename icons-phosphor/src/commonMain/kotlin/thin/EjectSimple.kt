package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorThinIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 202.20914f, 226.20914f, 204.0f, 224.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 202.20914f, 28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 197.79086f, 29.790861f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(226.20914f, 196.0f, 228.0f, 197.79086f, 228.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(29.2f, 149.12f),
                    PathNode.CurveTo(27.16196f, 144.91418f, 27.751184f, 139.90773f, 30.71f, 136.29f),
                    PathNode.LineTo(112.37f, 35.46f),
                    PathNode.CurveTo(116.18613f, 30.740332f, 121.930565f, 27.997765f, 128.0f, 27.997765f),
                    PathNode.CurveTo(134.06944f, 27.997765f, 139.81387f, 30.740332f, 143.63f, 35.46f),
                    PathNode.LineTo(225.29f, 136.29f),
                    PathNode.CurveTo(228.21858f, 139.9102f, 228.80994f, 144.88972f, 226.8107f, 149.09515f),
                    PathNode.CurveTo(224.81148f, 153.30057f, 220.57642f, 155.98566f, 215.92f, 156.0f),
                    PathNode.LineTo(40.08f, 156.0f),
                    PathNode.CurveTo(35.426037f, 156.0105f, 31.185684f, 153.3291f, 29.2f, 149.12f),
                    PathNode.Close,
                    PathNode.MoveTo(36.42f, 145.68f),
                    PathNode.CurveTo(37.07917f, 147.10443f, 38.51049f, 148.01172f, 40.08f, 148.0f),
                    PathNode.LineTo(215.92f, 148.0f),
                    PathNode.CurveTo(217.4895f, 148.01172f, 218.92084f, 147.10443f, 219.58f, 145.68f),
                    PathNode.CurveTo(220.29388f, 144.25487f, 220.0935f, 142.54192f, 219.07f, 141.32f),
                    PathNode.LineTo(137.41f, 40.5f),
                    PathNode.CurveTo(135.11484f, 37.654774f, 131.65556f, 36.000786f, 128.0f, 36.000786f),
                    PathNode.CurveTo(124.344444f, 36.000786f, 120.88516f, 37.654774f, 118.59f, 40.5f),
                    PathNode.LineTo(36.93f, 141.32f),
                    PathNode.CurveTo(35.906487f, 142.54192f, 35.70612f, 144.25487f, 36.42f, 145.68f),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
