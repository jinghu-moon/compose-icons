package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorLightIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 82.0f),
                    PathNode.CurveTo(204.6863f, 82.0f, 202.0f, 84.686295f, 202.0f, 88.0f),
                    PathNode.LineTo(202.0f, 106.0f),
                    PathNode.LineTo(187.0f, 106.0f),
                    PathNode.LineTo(182.0f, 55.4f),
                    PathNode.CurveTo(181.84413f, 53.901432f, 181.13017f, 52.51635f, 180.0f, 51.52f),
                    PathNode.LineTo(137.11f, 13.37f),
                    PathNode.LineTo(136.96f, 13.25f),
                    PathNode.CurveTo(131.76906f, 8.926332f, 124.230934f, 8.926332f, 119.04f, 13.25f),
                    PathNode.LineTo(118.89f, 13.37f),
                    PathNode.LineTo(76.0f, 51.52f),
                    PathNode.CurveTo(74.86983f, 52.51635f, 74.15587f, 53.901432f, 74.0f, 55.4f),
                    PathNode.LineTo(69.0f, 106.0f),
                    PathNode.LineTo(54.0f, 106.0f),
                    PathNode.LineTo(54.0f, 88.0f),
                    PathNode.CurveTo(54.0f, 84.686295f, 51.31371f, 82.0f, 48.0f, 82.0f),
                    PathNode.CurveTo(44.68629f, 82.0f, 42.0f, 84.686295f, 42.0f, 88.0f),
                    PathNode.LineTo(42.0f, 112.0f),
                    PathNode.CurveTo(42.0f, 115.313705f, 44.68629f, 118.0f, 48.0f, 118.0f),
                    PathNode.LineTo(67.75f, 118.0f),
                    PathNode.LineTo(58.06f, 214.67f),
                    PathNode.CurveTo(57.68523f, 218.5971f, 58.984703f, 222.50008f, 61.638744f, 225.41876f),
                    PathNode.CurveTo(64.292786f, 228.33746f, 68.055046f, 230.00093f, 72.0f, 230.0f),
                    PathNode.LineTo(184.0f, 230.0f),
                    PathNode.CurveTo(187.94896f, 229.99893f, 191.71382f, 228.33015f, 194.36667f, 225.40498f),
                    PathNode.CurveTo(197.01952f, 222.4798f, 198.31361f, 218.57028f, 197.93f, 214.64f),
                    PathNode.LineTo(188.25f, 118.0f),
                    PathNode.LineTo(208.0f, 118.0f),
                    PathNode.CurveTo(211.3137f, 118.0f, 214.0f, 115.313705f, 214.0f, 112.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(214.0f, 84.686295f, 211.3137f, 82.0f, 208.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(126.77f, 22.42f),
                    PathNode.CurveTo(127.49304f, 21.856071f, 128.50696f, 21.856071f, 129.23f, 22.42f),
                    PathNode.LineTo(160.23f, 50.0f),
                    PathNode.LineTo(95.77f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.43f, 62.0f),
                    PathNode.LineTo(170.57f, 62.0f),
                    PathNode.LineTo(175.0f, 106.0f),
                    PathNode.LineTo(134.0f, 106.0f),
                    PathNode.LineTo(134.0f, 88.0f),
                    PathNode.CurveTo(134.0f, 84.686295f, 131.3137f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(124.686295f, 82.0f, 122.0f, 84.686295f, 122.0f, 88.0f),
                    PathNode.LineTo(122.0f, 106.0f),
                    PathNode.LineTo(81.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(185.43f, 217.35f),
                    PathNode.CurveTo(185.06192f, 217.75262f, 184.54536f, 217.98743f, 184.0f, 218.0f),
                    PathNode.LineTo(72.0f, 218.0f),
                    PathNode.CurveTo(71.44064f, 218.0018f, 70.9061f, 217.76926f, 70.52607f, 217.35883f),
                    PathNode.CurveTo(70.146034f, 216.9484f, 69.955246f, 216.39757f, 70.0f, 215.84f),
                    PathNode.LineTo(74.2f, 174.0f),
                    PathNode.LineTo(181.8f, 174.0f),
                    PathNode.LineTo(186.0f, 215.81f),
                    PathNode.CurveTo(186.05249f, 216.3738f, 185.86353f, 216.93343f, 185.48f, 217.35f),
                    PathNode.Close,
                    PathNode.MoveTo(180.6f, 162.0f),
                    PathNode.LineTo(75.4f, 162.0f),
                    PathNode.LineTo(79.81f, 118.0f),
                    PathNode.LineTo(176.19f, 118.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
