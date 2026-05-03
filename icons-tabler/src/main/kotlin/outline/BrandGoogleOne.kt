package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleOne: ImageVector
    get() {
        if (_brandGoogleOne != null) return _brandGoogleOne!!
        _brandGoogleOne = tablerOutlineIcon(
            name = "BrandGoogleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 5.000 L 11.000 18.982 C 11.000 20.087 11.895 20.982 13.000 20.982 C 14.105 20.982 15.000 20.087 15.000 18.982 L 15.000 5.000 C 15.000 3.895 14.105 3.000 13.000 3.000 C 11.895 3.000 11.000 3.895 11.000 5.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.630 8.407 C 5.819 9.209 5.786 10.509 6.556 11.351 C 7.326 12.185 8.607 12.220 9.418 11.428 L 14.368 6.594 C 15.180 5.802 15.214 4.484 14.444 3.649 C 14.081 3.249 13.570 3.015 13.030 3.001 C 12.490 2.986 11.967 3.193 11.583 3.572 L 6.630 8.407"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandGoogleOne!!
    }

private var _brandGoogleOne: ImageVector? = null
