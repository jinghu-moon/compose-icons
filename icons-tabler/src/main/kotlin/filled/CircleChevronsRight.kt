package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsRight: ImageVector
    get() {
        if (_circleChevronsRight != null) return _circleChevronsRight!!
        _circleChevronsRight = tablerFilledIcon(
            name = "CircleChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.073 1.868 C 17.567 1.908 21.999 6.373 21.999 11.868 C 21.999 17.362 17.567 21.827 12.073 21.868 C 6.579 21.908 2.081 17.508 2.000 12.015 L 2.000 11.720 C 2.081 6.227 6.579 1.827 12.073 1.868M 9.707 8.293 C 9.316 7.903 8.684 7.903 8.293 8.293 L 8.210 8.387 C 7.901 8.785 7.937 9.351 8.293 9.707 L 10.585 12.000 L 8.293 14.293 C 7.914 14.685 7.919 15.309 8.305 15.695 C 8.691 16.081 9.315 16.086 9.707 15.707 L 12.707 12.707 C 13.097 12.316 13.097 11.684 12.707 11.293 ZM 13.707 8.293 C 13.316 7.903 12.684 7.903 12.293 8.293 L 12.210 8.387 C 11.901 8.785 11.937 9.351 12.293 9.707 L 14.585 12.000 L 12.293 14.293 C 11.914 14.685 11.919 15.309 12.305 15.695 C 12.691 16.081 13.315 16.086 13.707 15.707 L 16.707 12.707 C 17.097 12.316 17.097 11.684 16.707 11.293 Z"),
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
        return _circleChevronsRight!!
    }

private var _circleChevronsRight: ImageVector? = null
