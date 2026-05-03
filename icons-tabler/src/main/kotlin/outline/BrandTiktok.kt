package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) return _brandTiktok!!
        _brandTiktok = tablerOutlineIcon(
            name = "BrandTiktok",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 7.917 L 21.000 11.951 C 19.186 11.771 17.456 11.096 16.000 10.000 L 16.000 14.500 C 15.999 17.894 13.387 20.716 10.003 20.979 C 6.619 21.242 3.603 18.857 3.078 15.503 C 2.554 12.150 4.697 8.957 8.000 8.174 L 8.000 12.500 C 7.059 13.205 6.738 14.471 7.227 15.540 C 7.716 16.609 8.883 17.193 10.032 16.943 C 11.181 16.692 12.000 15.676 12.000 14.500 L 12.000 3.000 L 16.083 3.000 C 16.510 5.518 18.482 7.490 21.000 7.917"),
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
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
