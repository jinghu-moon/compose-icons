package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorLightIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 60.68629f, 36.68629f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(36.68629f, 70.0f, 34.0f, 67.313705f, 34.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 134.0f),
                    PathNode.LineTo(160.0f, 134.0f),
                    PathNode.CurveTo(163.3137f, 134.0f, 166.0f, 131.3137f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 124.686295f, 163.3137f, 122.0f, 160.0f, 122.0f),
                    PathNode.LineTo(40.0f, 122.0f),
                    PathNode.CurveTo(36.68629f, 122.0f, 34.0f, 124.686295f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 131.3137f, 36.68629f, 134.0f, 40.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(112.0f, 198.0f),
                    PathNode.CurveTo(115.313705f, 198.0f, 118.0f, 195.3137f, 118.0f, 192.0f),
                    PathNode.CurveTo(118.0f, 188.6863f, 115.313705f, 186.0f, 112.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(245.75f, 125.72f),
                    PathNode.CurveTo(244.78807f, 128.88933f, 241.43999f, 130.67975f, 238.27f, 129.72f),
                    PathNode.LineTo(206.0f, 120.06f),
                    PathNode.LineTo(206.0f, 192.0f),
                    PathNode.CurveTo(206.0f, 205.91333f, 196.43372f, 218.00084f, 182.8926f, 221.19745f),
                    PathNode.CurveTo(169.35146f, 224.39412f, 155.38942f, 217.86087f, 149.16719f, 205.41641f),
                    PathNode.CurveTo(142.94496f, 192.97195f, 146.0956f, 177.88237f, 156.77757f, 168.96745f),
                    PathNode.CurveTo(167.45956f, 160.05252f, 182.86934f, 159.65202f, 194.0f, 168.0f),
                    PathNode.LineTo(194.0f, 112.0f),
                    PathNode.CurveTo(193.99942f, 110.1038f, 194.89523f, 108.31892f, 196.41597f, 107.18624f),
                    PathNode.CurveTo(197.9367f, 106.053566f, 199.90338f, 105.70642f, 201.72f, 106.25f),
                    PathNode.LineTo(241.72f, 118.25f),
                    PathNode.CurveTo(243.24527f, 118.70577f, 244.52689f, 119.74899f, 245.28273f, 121.15002f),
                    PathNode.CurveTo(246.03856f, 122.55104f, 246.20665f, 124.195f, 245.75f, 125.72f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 192.0f),
                    PathNode.CurveTo(194.0f, 182.05887f, 185.94113f, 174.0f, 176.0f, 174.0f),
                    PathNode.CurveTo(166.05887f, 174.0f, 158.0f, 182.05887f, 158.0f, 192.0f),
                    PathNode.CurveTo(158.0f, 201.94113f, 166.05887f, 210.0f, 176.0f, 210.0f),
                    PathNode.CurveTo(185.94113f, 210.0f, 194.0f, 201.94113f, 194.0f, 192.0f),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
