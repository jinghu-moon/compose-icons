package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWhatsapp: ImageVector
    get() {
        if (_brandWhatsapp != null) return _brandWhatsapp!!
        _brandWhatsapp = tablerOutlineIcon(
            name = "BrandWhatsapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 21.000 L 4.650 17.200 C 2.038 13.492 2.593 8.421 5.945 5.366 C 9.296 2.310 14.398 2.226 17.848 5.169 C 21.299 8.112 22.020 13.163 19.532 16.955 C 17.044 20.746 12.123 22.094 8.050 20.100 L 3.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 10.000 C 9.000 10.276 9.224 10.500 9.500 10.500 C 9.776 10.500 10.000 10.276 10.000 10.000 L 10.000 9.000 C 10.000 8.724 9.776 8.500 9.500 8.500 C 9.224 8.500 9.000 8.724 9.000 9.000 L 9.000 10.000 C 9.000 12.761 11.239 15.000 14.000 15.000 L 15.000 15.000 C 15.276 15.000 15.500 14.776 15.500 14.500 C 15.500 14.224 15.276 14.000 15.000 14.000 L 14.000 14.000 C 13.724 14.000 13.500 14.224 13.500 14.500 C 13.500 14.776 13.724 15.000 14.000 15.000"),
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
        return _brandWhatsapp!!
    }

private var _brandWhatsapp: ImageVector? = null
