package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsDown: ImageVector
    get() {
        if (_circleChevronsDown != null) return _circleChevronsDown!!
        _circleChevronsDown = tablerFilledIcon(
            name = "CircleChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 9.707 12.293 C 9.456 12.033 9.084 11.929 8.734 12.020 C 8.385 12.112 8.112 12.385 8.020 12.734 C 7.929 13.084 8.033 13.456 8.293 13.707 L 11.293 16.707 C 11.684 17.097 12.316 17.097 12.707 16.707 L 15.707 13.707 C 16.097 13.316 16.097 12.684 15.707 12.293 L 15.613 12.210 C 15.215 11.901 14.649 11.937 14.293 12.293 L 11.999 14.585 ZM 9.707 8.293 C 9.315 7.914 8.691 7.919 8.305 8.305 C 7.919 8.691 7.914 9.315 8.293 9.707 L 11.293 12.707 C 11.684 13.097 12.316 13.097 12.707 12.707 L 15.707 9.707 C 16.097 9.316 16.097 8.684 15.707 8.293 L 15.613 8.210 C 15.215 7.901 14.649 7.937 14.293 8.293 L 11.999 10.585 Z"),
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
        return _circleChevronsDown!!
    }

private var _circleChevronsDown: ImageVector? = null
