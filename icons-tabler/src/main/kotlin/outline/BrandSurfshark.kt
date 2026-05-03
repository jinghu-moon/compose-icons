package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSurfshark: ImageVector
    get() {
        if (_brandSurfshark != null) return _brandSurfshark!!
        _brandSurfshark = tablerOutlineIcon(
            name = "BrandSurfshark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.954 9.447 C 19.717 3.230 19.954 3.230 13.954 3.022 C 8.180 2.814 7.130 4.022 6.044 8.404 C 3.160 20.220 2.199 23.120 10.836 19.602 C 20.228 15.771 20.133 14.220 19.950 9.447 L 19.954 9.447"),
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
                pathData = parseSvgPathData("M 8.000 16.000 L 8.452 16.000 C 10.395 16.007 11.978 14.539 11.995 12.714 L 11.995 10.286 C 12.013 8.458 13.602 6.988 15.548 7.000 L 16.000 7.000"),
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
        return _brandSurfshark!!
    }

private var _brandSurfshark: ImageVector? = null
