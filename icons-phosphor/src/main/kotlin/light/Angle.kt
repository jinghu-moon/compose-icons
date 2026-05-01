package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorLightIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(98.0f, 72.0f),
                    PathNode.CurveTo(98.0f, 68.686295f, 100.686295f, 66.0f, 104.0f, 66.0f),
                    PathNode.CurveTo(160.30563f, 66.066124f, 205.93387f, 111.69437f, 206.0f, 168.0f),
                    PathNode.CurveTo(206.0f, 171.3137f, 203.3137f, 174.0f, 200.0f, 174.0f),
                    PathNode.CurveTo(196.6863f, 174.0f, 194.0f, 171.3137f, 194.0f, 168.0f),
                    PathNode.CurveTo(193.94489f, 118.317215f, 153.68279f, 78.055115f, 104.0f, 78.0f),
                    PathNode.CurveTo(100.686295f, 78.0f, 98.0f, 75.313705f, 98.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 194.0f),
                    PathNode.LineTo(78.0f, 194.0f),
                    PathNode.LineTo(78.0f, 32.0f),
                    PathNode.CurveTo(78.0f, 28.68629f, 75.313705f, 26.0f, 72.0f, 26.0f),
                    PathNode.CurveTo(68.686295f, 26.0f, 66.0f, 28.68629f, 66.0f, 32.0f),
                    PathNode.LineTo(66.0f, 66.0f),
                    PathNode.LineTo(32.0f, 66.0f),
                    PathNode.CurveTo(28.68629f, 66.0f, 26.0f, 68.686295f, 26.0f, 72.0f),
                    PathNode.CurveTo(26.0f, 75.313705f, 28.68629f, 78.0f, 32.0f, 78.0f),
                    PathNode.LineTo(66.0f, 78.0f),
                    PathNode.LineTo(66.0f, 200.0f),
                    PathNode.CurveTo(66.0f, 203.3137f, 68.686295f, 206.0f, 72.0f, 206.0f),
                    PathNode.LineTo(240.0f, 206.0f),
                    PathNode.CurveTo(243.3137f, 206.0f, 246.0f, 203.3137f, 246.0f, 200.0f),
                    PathNode.CurveTo(246.0f, 196.6863f, 243.3137f, 194.0f, 240.0f, 194.0f),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
