package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) return _brandTinder!!
        _brandTinder = tablerFilledIcon(
            name = "BrandTinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.595 2.130 C 11.547 1.760 11.708 1.394 12.014 1.180 C 12.320 0.967 12.719 0.941 13.050 1.114 C 16.160 2.739 18.460 4.911 19.820 7.741 L 19.807 7.717 L 19.817 7.736 L 19.932 7.968 C 22.683 13.668 20.020 20.555 14.019 21.728 L 13.752 21.777 C 5.033 23.687 -0.703 13.037 5.782 6.859 C 6.248 6.399 7.062 5.663 7.418 5.409 C 7.723 5.191 8.124 5.161 8.457 5.333 C 8.790 5.504 9.000 5.847 9.000 6.222 C 9.000 6.533 9.086 7.339 9.205 7.916 Q 9.251 8.131 9.298 8.299 L 9.315 8.357 L 9.415 8.337 C 10.977 7.941 11.937 5.316 11.625 2.382 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
