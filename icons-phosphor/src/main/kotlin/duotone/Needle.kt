package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorDuotoneIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.63f, 94.63f),
                    PathNode.LineTo(182.63f, 118.63f),
                    PathNode.CurveTo(128.0f, 128.0f, 40.0f, 216.0f, 40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 216.0f, 128.0f, 128.0f, 137.37f, 73.37f),
                    PathNode.LineTo(161.37f, 49.37f),
                    PathNode.CurveTo(173.86821f, 36.871796f, 194.13179f, 36.871796f, 206.63f, 49.37f),
                    PathNode.CurveTo(219.1282f, 61.868202f, 219.1282f, 82.1318f, 206.63f, 94.63f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.66f, 66.34f),
                    PathNode.CurveTo(191.16223f, 67.840546f, 192.00629f, 69.876724f, 192.00629f, 72.0f),
                    PathNode.CurveTo(192.00629f, 74.123276f, 191.16223f, 76.159454f, 189.66f, 77.66f),
                    PathNode.LineTo(173.66f, 93.66f),
                    PathNode.CurveTo(170.53407f, 96.785934f, 165.46593f, 96.785934f, 162.34f, 93.66f),
                    PathNode.CurveTo(159.21407f, 90.534065f, 159.21407f, 85.465935f, 162.34f, 82.34f),
                    PathNode.LineTo(178.34f, 66.34f),
                    PathNode.CurveTo(179.84055f, 64.83778f, 181.87672f, 63.993706f, 184.0f, 63.993706f),
                    PathNode.CurveTo(186.12328f, 63.993706f, 188.15945f, 64.83778f, 189.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.02986f, 82.61417f, 219.80919f, 92.79851f, 212.28f, 100.28f),
                    PathNode.LineTo(188.28f, 124.28f),
                    PathNode.CurveTo(187.11156f, 125.44983f, 185.60934f, 126.22888f, 183.98f, 126.51f),
                    PathNode.CurveTo(132.49f, 135.35f, 46.52f, 220.79f, 45.66f, 221.66f),
                    PathNode.LineTo(45.66f, 221.66f),
                    PathNode.CurveTo(42.53407f, 224.78317f, 37.46817f, 224.78093f, 34.345f, 221.655f),
                    PathNode.CurveTo(31.22183f, 218.52907f, 31.224068f, 213.46317f, 34.35f, 210.34f),
                    PathNode.LineTo(34.35f, 210.34f),
                    PathNode.CurveTo(36.0f, 208.73f, 120.69f, 123.28f, 129.49f, 72.0f),
                    PathNode.CurveTo(129.77112f, 70.37066f, 130.55017f, 68.86845f, 131.72f, 67.7f),
                    PathNode.LineTo(155.72f, 43.7f),
                    PathNode.CurveTo(167.16234f, 32.26111f, 184.36888f, 28.841822f, 199.31541f, 35.03671f),
                    PathNode.CurveTo(214.26195f, 41.231598f, 224.00464f, 55.820522f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 72.0f),
                    PathNode.CurveTo(208.02391f, 62.274593f, 202.17622f, 53.496178f, 193.19243f, 49.77119f),
                    PathNode.CurveTo(184.20863f, 46.046204f, 173.86494f, 48.11112f, 167.0f, 55.0f),
                    PathNode.LineTo(144.77f, 77.29f),
                    PathNode.CurveTo(140.36f, 98.44f, 125.87f, 123.48f, 109.28f, 146.72f),
                    PathNode.CurveTo(132.52f, 130.13f, 157.56f, 115.64f, 178.71f, 111.23f),
                    PathNode.LineTo(201.0f, 89.0f),
                    PathNode.CurveTo(205.51141f, 84.4965f, 208.03226f, 78.37443f, 208.0f, 72.0f),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
