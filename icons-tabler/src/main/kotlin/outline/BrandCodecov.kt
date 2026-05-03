package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCodecov: ImageVector
    get() {
        if (_brandCodecov != null) return _brandCodecov!!
        _brandCodecov = tablerOutlineIcon(
            name = "BrandCodecov",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.695 12.985 C 8.717 12.341 7.571 11.998 6.400 12.000 C 5.143 12.000 3.964 12.339 3.000 13.000 C 3.000 8.029 7.029 4.000 12.000 4.000 C 16.971 4.000 21.000 8.029 21.000 13.000 C 20.034 12.336 18.860 12.000 17.600 12.000 C 15.625 12.000 13.776 12.971 12.656 14.598 C 11.537 16.225 11.289 18.299 11.995 20.144"),
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
        return _brandCodecov!!
    }

private var _brandCodecov: ImageVector? = null
