package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StackFill: ImageVector
    get() {
        if (_stackFill != null) return _stackFill!!
        _stackFill = remixIcon(
            name = "StackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.083 10.500 L 21.285 11.221 C 21.522 11.363 21.599 11.670 21.457 11.907 C 21.415 11.978 21.356 12.036 21.285 12.079 L 12.000 17.650 L 2.715 12.079 C 2.478 11.937 2.401 11.630 2.543 11.393 C 2.585 11.322 2.644 11.263 2.715 11.221 L 3.917 10.500 L 12.000 15.350 L 20.083 10.500 ZM 20.083 15.200 L 21.285 15.921 C 21.522 16.063 21.599 16.370 21.457 16.607 C 21.415 16.678 21.356 16.736 21.285 16.779 L 12.514 22.041 C 12.198 22.231 11.802 22.231 11.485 22.041 L 2.715 16.779 C 2.478 16.637 2.401 16.330 2.543 16.093 C 2.585 16.022 2.644 15.963 2.715 15.921 L 3.917 15.200 L 12.000 20.050 L 20.083 15.200 ZM 12.514 1.309 L 21.285 6.571 C 21.522 6.713 21.599 7.020 21.457 7.257 C 21.415 7.328 21.356 7.386 21.285 7.429 L 12.000 13.000 L 2.715 7.429 C 2.478 7.287 2.401 6.979 2.543 6.743 C 2.585 6.672 2.644 6.613 2.715 6.571 L 11.485 1.309 C 11.802 1.119 12.198 1.119 12.514 1.309 Z"),
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
        return _stackFill!!
    }

private var _stackFill: ImageVector? = null
