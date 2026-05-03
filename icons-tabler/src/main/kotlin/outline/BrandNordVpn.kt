package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNordVpn: ImageVector
    get() {
        if (_brandNordVpn != null) return _brandNordVpn!!
        _brandNordVpn = tablerOutlineIcon(
            name = "BrandNordVpn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.992 15.000 L 7.985 12.000 L 3.970 20.000 C 1.758 16.939 1.345 12.902 3.055 9.537 C 4.771 6.168 8.219 4.034 12.000 4.000 C 15.781 4.034 19.229 6.168 20.945 9.537 C 22.655 12.902 22.242 16.939 20.030 20.000 L 15.513 12.000 L 14.008 13.500"),
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
                pathData = parseSvgPathData("M 14.500 15.000 L 11.500 9.000 L 9.000 13.500"),
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
        return _brandNordVpn!!
    }

private var _brandNordVpn: ImageVector? = null
