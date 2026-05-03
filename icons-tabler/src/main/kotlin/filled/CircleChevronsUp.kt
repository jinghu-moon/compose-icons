package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsUp: ImageVector
    get() {
        if (_circleChevronsUp != null) return _circleChevronsUp!!
        _circleChevronsUp = tablerFilledIcon(
            name = "CircleChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.867 2.001 C 17.362 2.001 21.827 6.433 21.867 11.927 C 21.907 17.421 17.508 21.920 12.015 22.000 L 11.720 22.000 C 6.227 21.919 1.827 17.421 1.868 11.927 C 1.908 6.433 6.373 2.001 11.868 2.001M 12.708 11.293 C 12.318 10.903 11.684 10.903 11.294 11.293 L 8.294 14.293 C 7.904 14.684 7.904 15.316 8.294 15.707 L 8.388 15.790 C 8.786 16.099 9.352 16.063 9.708 15.707 L 12.000 13.415 L 14.293 15.707 C 14.685 16.086 15.309 16.081 15.695 15.695 C 16.081 15.309 16.086 14.685 15.707 14.293 ZM 12.708 7.293 C 12.318 6.903 11.684 6.903 11.294 7.293 L 8.294 10.293 C 7.904 10.684 7.904 11.316 8.294 11.707 L 8.388 11.790 C 8.786 12.099 9.352 12.063 9.708 11.707 L 12.000 9.415 L 14.293 11.707 C 14.685 12.086 15.309 12.081 15.695 11.695 C 16.081 11.309 16.086 10.685 15.707 10.293 Z"),
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
        return _circleChevronsUp!!
    }

private var _circleChevronsUp: ImageVector? = null
