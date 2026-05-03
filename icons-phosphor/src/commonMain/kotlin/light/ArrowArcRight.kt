package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorLightIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 88.0f),
                    PathNode.LineTo(238.0f, 152.0f),
                    PathNode.CurveTo(238.0f, 155.3137f, 235.3137f, 158.0f, 232.0f, 158.0f),
                    PathNode.LineTo(168.0f, 158.0f),
                    PathNode.CurveTo(164.6863f, 158.0f, 162.0f, 155.3137f, 162.0f, 152.0f),
                    PathNode.CurveTo(162.0f, 148.6863f, 164.6863f, 146.0f, 168.0f, 146.0f),
                    PathNode.LineTo(217.45f, 146.0f),
                    PathNode.LineTo(191.65f, 120.37f),
                    PathNode.CurveTo(165.9124f, 94.623985f, 127.199295f, 86.91863f, 93.56492f, 100.8474f),
                    PathNode.CurveTo(59.930546f, 114.77617f, 37.999683f, 147.59558f, 38.0f, 184.0f),
                    PathNode.CurveTo(38.0f, 187.3137f, 35.31371f, 190.0f, 32.0f, 190.0f),
                    PathNode.CurveTo(28.68629f, 190.0f, 26.0f, 187.3137f, 26.0f, 184.0f),
                    PathNode.CurveTo(26.003956f, 142.7479f, 50.85541f, 105.55949f, 88.96761f, 89.77352f),
                    PathNode.CurveTo(127.07981f, 73.98756f, 170.94838f, 82.71233f, 200.12f, 111.88f),
                    PathNode.LineTo(226.0f, 137.58f),
                    PathNode.LineTo(226.0f, 88.0f),
                    PathNode.CurveTo(226.0f, 84.686295f, 228.6863f, 82.0f, 232.0f, 82.0f),
                    PathNode.CurveTo(235.3137f, 82.0f, 238.0f, 84.686295f, 238.0f, 88.0f),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
