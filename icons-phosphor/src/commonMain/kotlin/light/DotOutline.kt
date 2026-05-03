package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotOutline: ImageVector
    get() {
        if (_dotOutline != null) return _dotOutline!!
        _dotOutline = phosphorLightIcon(
            name = "DotOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 98.0f),
                    PathNode.CurveTo(111.43146f, 98.0f, 98.0f, 111.43146f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 144.56854f, 111.43146f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(144.56854f, 158.0f, 158.0f, 144.56854f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 111.43146f, 144.56854f, 98.0f, 128.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 146.0f),
                    PathNode.CurveTo(118.05888f, 146.0f, 110.0f, 137.94113f, 110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 118.05888f, 118.05888f, 110.0f, 128.0f, 110.0f),
                    PathNode.CurveTo(137.94113f, 110.0f, 146.0f, 118.05888f, 146.0f, 128.0f),
                    PathNode.CurveTo(146.0f, 137.94113f, 137.94113f, 146.0f, 128.0f, 146.0f),
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
        return _dotOutline!!
    }

private var _dotOutline: ImageVector? = null
