package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorLightIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(68.686295f, 34.0f, 66.0f, 36.68629f, 66.0f, 40.0f),
                    PathNode.LineTo(66.0f, 168.0f),
                    PathNode.CurveTo(66.0496f, 211.05765f, 100.94235f, 245.95041f, 144.0f, 246.0f),
                    PathNode.CurveTo(147.3137f, 246.0f, 150.0f, 243.3137f, 150.0f, 240.0f),
                    PathNode.LineTo(150.0f, 174.0f),
                    PathNode.LineTo(152.0f, 174.0f),
                    PathNode.CurveTo(190.65993f, 174.0f, 222.0f, 142.65993f, 222.0f, 104.0f),
                    PathNode.CurveTo(222.0f, 65.340065f, 190.65993f, 34.0f, 152.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 62.91f),
                    PathNode.LineTo(133.74f, 162.0f),
                    PathNode.LineTo(78.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 145.1f),
                    PathNode.LineTo(82.26f, 46.0f),
                    PathNode.LineTo(138.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.28f, 174.0f),
                    PathNode.LineTo(138.0f, 174.0f),
                    PathNode.LineTo(138.0f, 233.73f),
                    PathNode.CurveTo(106.30971f, 230.79341f, 81.21128f, 205.6908f, 78.28f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 162.0f),
                    PathNode.LineTo(150.0f, 162.0f),
                    PathNode.LineTo(150.0f, 46.0f),
                    PathNode.LineTo(152.0f, 46.0f),
                    PathNode.CurveTo(184.03252f, 46.0f, 210.0f, 71.96748f, 210.0f, 104.0f),
                    PathNode.CurveTo(210.0f, 136.03252f, 184.03252f, 162.0f, 152.0f, 162.0f),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
