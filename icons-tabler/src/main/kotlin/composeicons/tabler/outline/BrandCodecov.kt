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
                pathData = parseSvgPathData("M9.695 12.985C8.717 12.341 7.571 11.998 6.4 12 5.143 12 3.964 12.339 3 13 3 8.029 7.029 4 12 4c4.971 0 9 4.029 9 9-.966-.664-2.14-1-3.4-1-1.975-0-3.824 .971-4.944 2.598-1.12 1.627-1.367 3.701-.661 5.546"),
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
