package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnifyingGlassPlus: ImageVector
    get() {
        if (_magnifyingGlassPlus != null) return _magnifyingGlassPlus!!
        _magnifyingGlassPlus = phosphorLightIcon(
            name = "MagnifyingGlassPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(150.0f, 112.0f),
                    PathNode.CurveTo(150.0f, 115.313705f, 147.3137f, 118.0f, 144.0f, 118.0f),
                    PathNode.LineTo(118.0f, 118.0f),
                    PathNode.LineTo(118.0f, 144.0f),
                    PathNode.CurveTo(118.0f, 147.3137f, 115.313705f, 150.0f, 112.0f, 150.0f),
                    PathNode.CurveTo(108.686295f, 150.0f, 106.0f, 147.3137f, 106.0f, 144.0f),
                    PathNode.LineTo(106.0f, 118.0f),
                    PathNode.LineTo(80.0f, 118.0f),
                    PathNode.CurveTo(76.686295f, 118.0f, 74.0f, 115.313705f, 74.0f, 112.0f),
                    PathNode.CurveTo(74.0f, 108.686295f, 76.686295f, 106.0f, 80.0f, 106.0f),
                    PathNode.LineTo(106.0f, 106.0f),
                    PathNode.LineTo(106.0f, 80.0f),
                    PathNode.CurveTo(106.0f, 76.686295f, 108.686295f, 74.0f, 112.0f, 74.0f),
                    PathNode.CurveTo(115.313705f, 74.0f, 118.0f, 76.686295f, 118.0f, 80.0f),
                    PathNode.LineTo(118.0f, 106.0f),
                    PathNode.LineTo(144.0f, 106.0f),
                    PathNode.CurveTo(147.3137f, 106.0f, 150.0f, 108.686295f, 150.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.24f, 228.24f),
                    PathNode.CurveTo(225.89746f, 230.57962f, 222.10254f, 230.57962f, 219.76f, 228.24f),
                    PathNode.LineTo(168.38f, 176.86f),
                    PathNode.CurveTo(133.35733f, 207.31422f, 80.504234f, 204.55045f, 48.848896f, 170.60953f),
                    PathNode.CurveTo(17.193562f, 136.66856f, 18.115194f, 83.75128f, 50.93324f, 50.93324f),
                    PathNode.CurveTo(83.75128f, 18.115194f, 136.66856f, 17.193562f, 170.60953f, 48.848896f),
                    PathNode.CurveTo(204.55045f, 80.504234f, 207.31422f, 133.35733f, 176.86f, 168.38f),
                    PathNode.LineTo(228.24f, 219.76f),
                    PathNode.CurveTo(230.57962f, 222.10254f, 230.57962f, 225.89746f, 228.24f, 228.24f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 186.0f),
                    PathNode.CurveTo(152.86908f, 186.0f, 186.0f, 152.86908f, 186.0f, 112.0f),
                    PathNode.CurveTo(186.0f, 71.13093f, 152.86908f, 38.0f, 112.0f, 38.0f),
                    PathNode.CurveTo(71.13093f, 38.0f, 38.0f, 71.13093f, 38.0f, 112.0f),
                    PathNode.CurveTo(38.04959f, 152.84851f, 71.15149f, 185.95041f, 112.0f, 186.0f),
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
        return _magnifyingGlassPlus!!
    }

private var _magnifyingGlassPlus: ImageVector? = null
