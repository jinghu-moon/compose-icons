package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorLightIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 192.0f),
                    PathNode.CurveTo(238.0f, 195.3137f, 235.3137f, 198.0f, 232.0f, 198.0f),
                    PathNode.LineTo(198.0f, 198.0f),
                    PathNode.LineTo(198.0f, 232.0f),
                    PathNode.CurveTo(198.0f, 235.3137f, 195.3137f, 238.0f, 192.0f, 238.0f),
                    PathNode.CurveTo(188.6863f, 238.0f, 186.0f, 235.3137f, 186.0f, 232.0f),
                    PathNode.LineTo(186.0f, 198.0f),
                    PathNode.LineTo(64.0f, 198.0f),
                    PathNode.CurveTo(60.68629f, 198.0f, 58.0f, 195.3137f, 58.0f, 192.0f),
                    PathNode.LineTo(58.0f, 70.0f),
                    PathNode.LineTo(24.0f, 70.0f),
                    PathNode.CurveTo(20.68629f, 70.0f, 18.0f, 67.313705f, 18.0f, 64.0f),
                    PathNode.CurveTo(18.0f, 60.68629f, 20.68629f, 58.0f, 24.0f, 58.0f),
                    PathNode.LineTo(58.0f, 58.0f),
                    PathNode.LineTo(58.0f, 24.0f),
                    PathNode.CurveTo(58.0f, 20.68629f, 60.68629f, 18.0f, 64.0f, 18.0f),
                    PathNode.CurveTo(67.313705f, 18.0f, 70.0f, 20.68629f, 70.0f, 24.0f),
                    PathNode.LineTo(70.0f, 186.0f),
                    PathNode.LineTo(232.0f, 186.0f),
                    PathNode.CurveTo(235.3137f, 186.0f, 238.0f, 188.6863f, 238.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 70.0f),
                    PathNode.LineTo(186.0f, 70.0f),
                    PathNode.LineTo(186.0f, 160.0f),
                    PathNode.CurveTo(186.0f, 163.3137f, 188.6863f, 166.0f, 192.0f, 166.0f),
                    PathNode.CurveTo(195.3137f, 166.0f, 198.0f, 163.3137f, 198.0f, 160.0f),
                    PathNode.LineTo(198.0f, 64.0f),
                    PathNode.CurveTo(198.0f, 60.68629f, 195.3137f, 58.0f, 192.0f, 58.0f),
                    PathNode.LineTo(96.0f, 58.0f),
                    PathNode.CurveTo(92.686295f, 58.0f, 90.0f, 60.68629f, 90.0f, 64.0f),
                    PathNode.CurveTo(90.0f, 67.313705f, 92.686295f, 70.0f, 96.0f, 70.0f),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
