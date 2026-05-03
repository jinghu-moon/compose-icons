package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mountain: ImageVector
    get() {
        if (_mountain != null) return _mountain!!
        _mountain = tablerFilledIcon(
            name = "Mountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.180 10.950 L 8.720 14.125 L 8.804 14.218 C 9.196 14.598 9.821 14.594 10.207 14.208 L 11.844 12.570 L 13.168 14.555 C 13.323 14.788 13.570 14.946 13.847 14.989 C 14.124 15.031 14.406 14.956 14.625 14.781 L 18.257 11.875 L 21.904 19.572 C 22.051 19.882 22.029 20.245 21.845 20.535 C 21.662 20.825 21.343 21.000 21.000 21.000 L 3.000 21.000 C 2.657 21.000 2.338 20.825 2.155 20.535 C 1.971 20.245 1.949 19.882 2.096 19.572 ZM 12.000 3.072 C 13.276 3.072 14.437 3.807 14.983 4.960 L 17.377 10.017 L 14.227 12.537 L 12.832 10.445 L 12.757 10.346 C 12.575 10.136 12.314 10.011 12.037 10.000 C 11.759 9.990 11.489 10.096 11.293 10.293 L 9.582 12.002 L 8.281 10.375 L 7.130 8.940 L 9.018 4.960 C 9.564 3.807 10.725 3.072 12.000 3.072"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _mountain!!
    }

private var _mountain: ImageVector? = null
