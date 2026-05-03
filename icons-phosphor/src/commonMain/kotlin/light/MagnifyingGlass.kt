package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorLightIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 219.76f),
                    PathNode.LineTo(176.86f, 168.38f),
                    PathNode.CurveTo(207.31422f, 133.35733f, 204.55045f, 80.504234f, 170.60953f, 48.848896f),
                    PathNode.CurveTo(136.66856f, 17.193562f, 83.75128f, 18.115194f, 50.93324f, 50.93324f),
                    PathNode.CurveTo(18.115194f, 83.75128f, 17.193562f, 136.66856f, 48.848896f, 170.60953f),
                    PathNode.CurveTo(80.504234f, 204.55045f, 133.35733f, 207.31422f, 168.38f, 176.86f),
                    PathNode.LineTo(219.76f, 228.24f),
                    PathNode.CurveTo(222.12408f, 230.44287f, 225.80807f, 230.37787f, 228.09297f, 228.09297f),
                    PathNode.CurveTo(230.37787f, 225.80807f, 230.44287f, 222.12408f, 228.24f, 219.76f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 112.0f),
                    PathNode.CurveTo(38.0f, 71.13093f, 71.13093f, 38.0f, 112.0f, 38.0f),
                    PathNode.CurveTo(152.86908f, 38.0f, 186.0f, 71.13093f, 186.0f, 112.0f),
                    PathNode.CurveTo(186.0f, 152.86908f, 152.86908f, 186.0f, 112.0f, 186.0f),
                    PathNode.CurveTo(71.15149f, 185.95041f, 38.04959f, 152.84851f, 38.0f, 112.0f),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
