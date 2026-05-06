package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZalando: ImageVector
    get() {
        if (_brandZalando != null) return _brandZalando!!
        _brandZalando = tablerOutlineIcon(
            name = "BrandZalando",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.531 21c-.65 0-1-.15-1.196-.27-.266-.157-.753-.563-1.197-1.747C4.359 16.738 3.974 14.376 4.001 12 4.016 9.255 4.437 6.93 5.138 5.025 5.582 3.825 6.068 3.42 6.335 3.262 6.527 3.159 6.88 3 7.53 3c.244 0 .532 .022 .871 .075 2.274 .429 4.451 1.267 6.425 2.475h.007c2.017 1.175 3.808 2.702 5.287 4.508 .783 .99 .879 1.627 .879 1.942 0 .315-.096 .953-.879 1.943-1.48 1.803-3.271 3.327-5.287 4.5h-.007c-1.974 1.208-4.151 2.047-6.425 2.474-.287 .053-.579 .081-.871 .083"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandZalando!!
    }

private var _brandZalando: ImageVector? = null
