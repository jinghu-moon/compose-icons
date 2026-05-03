package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorDuotoneIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.75f, 104.75f),
                    PathNode.LineTo(204.0f, 128.0f),
                    PathNode.LineTo(121.94f, 209.94f),
                    PathNode.CurveTo(103.15153f, 228.42491f, 72.972595f, 228.30203f, 54.33528f, 209.66472f),
                    PathNode.CurveTo(35.697968f, 191.0274f, 35.57508f, 160.84846f, 54.06f, 142.06f),
                    PathNode.LineTo(153.37f, 41.37f),
                    PathNode.CurveTo(165.86821f, 28.871796f, 186.13179f, 28.871796f, 198.63f, 41.37f),
                    PathNode.CurveTo(211.1282f, 53.868202f, 211.1282f, 74.1318f, 198.63f, 86.63f),
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
                    PathNode.MoveTo(209.66f, 122.34f),
                    PathNode.CurveTo(211.16223f, 123.840546f, 212.00629f, 125.876724f, 212.00629f, 128.0f),
                    PathNode.CurveTo(212.00629f, 130.12328f, 211.16223f, 132.15945f, 209.66f, 133.66f),
                    PathNode.LineTo(127.61f, 215.66f),
                    PathNode.CurveTo(105.73676f, 237.53046f, 70.275475f, 237.52824f, 48.405003f, 215.655f),
                    PathNode.CurveTo(26.534525f, 193.78177f, 26.536764f, 158.32048f, 48.41f, 136.45f),
                    PathNode.LineTo(147.67f, 35.73f),
                    PathNode.CurveTo(163.28586f, 20.09758f, 188.61758f, 20.084148f, 204.25f, 35.7f),
                    PathNode.CurveTo(219.88242f, 51.31585f, 219.89586f, 76.64758f, 204.28f, 92.28f),
                    PathNode.LineTo(105.0f, 193.0f),
                    PathNode.CurveTo(95.61116f, 202.38882f, 80.38884f, 202.38882f, 71.0f, 193.0f),
                    PathNode.CurveTo(61.61116f, 183.61118f, 61.61116f, 168.38882f, 71.0f, 159.0f),
                    PathNode.LineTo(154.3f, 74.38f),
                    PathNode.CurveTo(156.28644f, 72.260925f, 159.26538f, 71.384995f, 162.08267f, 72.09157f),
                    PathNode.CurveTo(164.89996f, 72.79814f, 167.11298f, 74.9762f, 167.86429f, 77.7819f),
                    PathNode.CurveTo(168.6156f, 80.58759f, 167.78719f, 83.58009f, 165.7f, 85.6f),
                    PathNode.LineTo(82.39f, 170.31f),
                    PathNode.CurveTo(79.25302f, 173.42212f, 79.23287f, 178.48802f, 82.345f, 181.62498f),
                    PathNode.CurveTo(85.45712f, 184.76198f, 90.523026f, 184.7821f, 93.66f, 181.67f),
                    PathNode.LineTo(192.93f, 81.0f),
                    PathNode.CurveTo(202.31885f, 71.630486f, 202.33452f, 56.42384f, 192.965f, 47.035f),
                    PathNode.CurveTo(183.59549f, 37.64616f, 168.38882f, 37.63049f, 159.0f, 47.0f),
                    PathNode.LineTo(59.76f, 147.68f),
                    PathNode.CurveTo(44.124817f, 163.29033f, 44.10467f, 188.61981f, 59.715f, 204.255f),
                    PathNode.CurveTo(75.325325f, 219.89018f, 100.654816f, 219.91032f, 116.29f, 204.3f),
                    PathNode.LineTo(198.35f, 122.3f),
                    PathNode.CurveTo(201.4848f, 119.1893f, 206.54729f, 119.2072f, 209.66f, 122.34f),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
