package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorThinIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.14f, 101.64f),
                    PathNode.CurveTo(199.64723f, 95.817406f, 182.44649f, 92.23868f, 165.0f, 91.0f),
                    PathNode.CurveTo(163.74486f, 73.56519f, 160.15273f, 56.378082f, 154.32f, 39.9f),
                    PathNode.CurveTo(183.97617f, 48.811134f, 207.19048f, 71.99539f, 216.14f, 101.64f),
                    PathNode.Close,
                    PathNode.MoveTo(145.0f, 37.58f),
                    PathNode.CurveTo(150.66962f, 52.27184f, 154.46616f, 67.61929f, 156.3f, 83.26f),
                    PathNode.CurveTo(136.87918f, 66.02196f, 114.23225f, 52.807f, 89.67f, 44.38f),
                    PathNode.CurveTo(101.6888f, 38.84312f, 114.76715f, 35.98383f, 128.0f, 36.0f),
                    PathNode.CurveTo(133.70328f, 36.000942f, 139.39423f, 36.529865f, 145.0f, 37.58f),
                    PathNode.Close,
                    PathNode.MoveTo(79.86f, 49.63f),
                    PathNode.CurveTo(106.753204f, 57.660484f, 131.50822f, 71.608025f, 152.31f, 90.45f),
                    PathNode.CurveTo(110.59885f, 90.08567f, 69.85719f, 103.0252f, 36.0f, 127.39f),
                    PathNode.CurveTo(36.22132f, 95.63787f, 52.800575f, 66.24428f, 79.86f, 49.63f),
                    PathNode.Close,
                    PathNode.MoveTo(36.44f, 137.0f),
                    PathNode.CurveTo(71.09697f, 110.5419f, 113.86659f, 96.94045f, 157.44f, 98.52f),
                    PathNode.CurveTo(159.01955f, 142.0934f, 145.4181f, 184.86304f, 118.96f, 219.52f),
                    PathNode.CurveTo(75.32478f, 215.14717f, 40.812836f, 180.63522f, 36.44f, 137.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.61f, 220.0f),
                    PathNode.CurveTo(152.97278f, 186.14557f, 165.9122f, 145.40775f, 165.55f, 103.7f),
                    PathNode.CurveTo(184.39197f, 124.50177f, 198.33952f, 149.25679f, 206.37f, 176.15f),
                    PathNode.CurveTo(189.7533f, 203.2056f, 160.36015f, 219.78082f, 128.61f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.61f, 166.34f),
                    PathNode.CurveTo(203.18718f, 141.77501f, 189.9756f, 119.12464f, 172.74f, 99.7f),
                    PathNode.CurveTo(188.3807f, 101.53384f, 203.72816f, 105.33038f, 218.42f, 111.0f),
                    PathNode.CurveTo(219.47014f, 116.60577f, 219.99905f, 122.296715f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.01617f, 141.23285f, 217.15688f, 154.3112f, 211.62f, 166.33f),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
