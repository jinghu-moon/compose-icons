package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorLightIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(221.9449f, 175.47365f, 183.47365f, 213.9449f, 136.0f, 214.0f),
                    PathNode.LineTo(64.0f, 214.0f),
                    PathNode.CurveTo(60.68629f, 214.0f, 58.0f, 211.3137f, 58.0f, 208.0f),
                    PathNode.CurveTo(58.0f, 204.6863f, 60.68629f, 202.0f, 64.0f, 202.0f),
                    PathNode.LineTo(136.0f, 202.0f),
                    PathNode.CurveTo(176.86908f, 202.0f, 210.0f, 168.86908f, 210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 87.13093f, 176.86908f, 54.0f, 136.0f, 54.0f),
                    PathNode.LineTo(64.0f, 54.0f),
                    PathNode.CurveTo(60.68629f, 54.0f, 58.0f, 51.31371f, 58.0f, 48.0f),
                    PathNode.CurveTo(58.0f, 44.68629f, 60.68629f, 42.0f, 64.0f, 42.0f),
                    PathNode.LineTo(136.0f, 42.0f),
                    PathNode.CurveTo(183.47365f, 42.055107f, 221.9449f, 80.52636f, 222.0f, 128.0f),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
