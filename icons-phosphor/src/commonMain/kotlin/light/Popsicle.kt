package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorLightIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 10.0f),
                    PathNode.CurveTo(89.358345f, 10.044086f, 58.044086f, 41.358345f, 58.0f, 80.0f),
                    PathNode.LineTo(58.0f, 176.0f),
                    PathNode.CurveTo(58.0f, 183.73198f, 64.26801f, 190.0f, 72.0f, 190.0f),
                    PathNode.LineTo(106.0f, 190.0f),
                    PathNode.LineTo(106.0f, 232.0f),
                    PathNode.CurveTo(106.0f, 244.15027f, 115.84974f, 254.0f, 128.0f, 254.0f),
                    PathNode.CurveTo(140.15027f, 254.0f, 150.0f, 244.15027f, 150.0f, 232.0f),
                    PathNode.LineTo(150.0f, 190.0f),
                    PathNode.LineTo(184.0f, 190.0f),
                    PathNode.CurveTo(191.73198f, 190.0f, 198.0f, 183.73198f, 198.0f, 176.0f),
                    PathNode.LineTo(198.0f, 80.0f),
                    PathNode.CurveTo(197.95592f, 41.358345f, 166.64166f, 10.044086f, 128.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 232.0f),
                    PathNode.CurveTo(138.0f, 237.52284f, 133.52284f, 242.0f, 128.0f, 242.0f),
                    PathNode.CurveTo(122.47715f, 242.0f, 118.0f, 237.52284f, 118.0f, 232.0f),
                    PathNode.LineTo(118.0f, 190.0f),
                    PathNode.LineTo(138.0f, 190.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 176.0f),
                    PathNode.CurveTo(186.0f, 177.10457f, 185.10457f, 178.0f, 184.0f, 178.0f),
                    PathNode.LineTo(72.0f, 178.0f),
                    PathNode.CurveTo(70.89543f, 178.0f, 70.0f, 177.10457f, 70.0f, 176.0f),
                    PathNode.LineTo(70.0f, 80.0f),
                    PathNode.CurveTo(70.0f, 47.967484f, 95.96748f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(160.03252f, 22.0f, 186.0f, 47.967484f, 186.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 72.0f),
                    PathNode.LineTo(118.0f, 152.0f),
                    PathNode.CurveTo(118.0f, 155.3137f, 115.313705f, 158.0f, 112.0f, 158.0f),
                    PathNode.CurveTo(108.686295f, 158.0f, 106.0f, 155.3137f, 106.0f, 152.0f),
                    PathNode.LineTo(106.0f, 72.0f),
                    PathNode.CurveTo(106.0f, 68.686295f, 108.686295f, 66.0f, 112.0f, 66.0f),
                    PathNode.CurveTo(115.313705f, 66.0f, 118.0f, 68.686295f, 118.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 72.0f),
                    PathNode.LineTo(150.0f, 152.0f),
                    PathNode.CurveTo(150.0f, 155.3137f, 147.3137f, 158.0f, 144.0f, 158.0f),
                    PathNode.CurveTo(140.6863f, 158.0f, 138.0f, 155.3137f, 138.0f, 152.0f),
                    PathNode.LineTo(138.0f, 72.0f),
                    PathNode.CurveTo(138.0f, 68.686295f, 140.6863f, 66.0f, 144.0f, 66.0f),
                    PathNode.CurveTo(147.3137f, 66.0f, 150.0f, 68.686295f, 150.0f, 72.0f),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
