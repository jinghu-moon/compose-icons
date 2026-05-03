package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorLightIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 182.0f),
                    PathNode.CurveTo(179.07822f, 182.0f, 214.0f, 147.07822f, 214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 60.92179f, 179.07822f, 26.0f, 136.0f, 26.0f),
                    PathNode.CurveTo(92.92179f, 26.0f, 58.0f, 60.92179f, 58.0f, 104.0f),
                    PathNode.CurveTo(58.049595f, 147.05765f, 92.94235f, 181.95041f, 136.0f, 182.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 38.0f),
                    PathNode.CurveTo(172.45079f, 38.0f, 202.0f, 67.54921f, 202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 140.45079f, 172.45079f, 170.0f, 136.0f, 170.0f),
                    PathNode.CurveTo(99.54921f, 170.0f, 70.0f, 140.45079f, 70.0f, 104.0f),
                    PathNode.CurveTo(70.04408f, 67.56748f, 99.56748f, 38.04408f, 136.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.33f, 174.89f),
                    PathNode.CurveTo(214.62334f, 177.27917f, 214.54724f, 181.07465f, 212.16f, 183.37f),
                    PathNode.CurveTo(193.2097f, 201.64873f, 168.29382f, 212.46597f, 142.0f, 213.83f),
                    PathNode.LineTo(142.0f, 234.0f),
                    PathNode.LineTo(168.0f, 234.0f),
                    PathNode.CurveTo(171.3137f, 234.0f, 174.0f, 236.6863f, 174.0f, 240.0f),
                    PathNode.CurveTo(174.0f, 243.3137f, 171.3137f, 246.0f, 168.0f, 246.0f),
                    PathNode.LineTo(104.0f, 246.0f),
                    PathNode.CurveTo(100.686295f, 246.0f, 98.0f, 243.3137f, 98.0f, 240.0f),
                    PathNode.CurveTo(98.0f, 236.6863f, 100.686295f, 234.0f, 104.0f, 234.0f),
                    PathNode.LineTo(130.0f, 234.0f),
                    PathNode.LineTo(130.0f, 213.83f),
                    PathNode.CurveTo(87.07135f, 211.48988f, 49.440357f, 184.35446f, 33.66263f, 144.36185f),
                    PathNode.CurveTo(17.884901f, 104.36925f, 26.852434f, 58.84995f, 56.62f, 27.83f),
                    PathNode.CurveTo(58.917503f, 25.438606f, 62.71861f, 25.362495f, 65.11f, 27.66f),
                    PathNode.CurveTo(67.5014f, 29.957504f, 67.57751f, 33.758602f, 65.28f, 36.15f),
                    PathNode.CurveTo(28.314413f, 74.62767f, 28.924353f, 135.60735f, 66.6522f, 173.3379f),
                    PathNode.CurveTo(104.380035f, 211.06847f, 165.35966f, 211.6828f, 203.84f, 174.72f),
                    PathNode.CurveTo(204.98782f, 173.61557f, 206.5277f, 173.0129f, 208.12024f, 173.04478f),
                    PathNode.CurveTo(209.7128f, 173.07668f, 211.22731f, 173.74051f, 212.33f, 174.89f),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
