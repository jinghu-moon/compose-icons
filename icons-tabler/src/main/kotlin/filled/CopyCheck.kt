package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyCheck: ImageVector
    get() {
        if (_copyCheck != null) return _copyCheck!!
        _copyCheck = tablerFilledIcon(
            name = "CopyCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 6.000 C 20.358 6.000 22.000 7.642 22.000 9.667 L 22.000 18.333 C 22.000 20.358 20.358 22.000 18.333 22.000 L 9.667 22.000 C 7.642 22.000 6.000 20.358 6.000 18.333 L 6.000 9.667 C 6.000 7.642 7.642 6.000 9.667 6.000 ZM 15.000 2.000 C 16.094 2.000 16.828 2.533 17.374 3.514 C 17.642 3.997 17.469 4.606 16.986 4.874 C 16.503 5.142 15.894 4.969 15.626 4.486 C 15.405 4.088 15.284 4.000 15.000 4.000 L 5.000 4.000 C 4.452 4.000 4.000 4.452 4.000 5.000 L 4.000 14.998 C 4.000 15.318 4.154 15.616 4.407 15.803 L 4.507 15.868 C 4.987 16.141 5.154 16.752 4.881 17.232 C 4.608 17.712 3.997 17.879 3.517 17.606 C 2.580 17.073 2.001 16.078 2.000 15.000 L 2.000 5.000 C 2.000 3.348 3.348 2.000 5.000 2.000 ZM 16.293 11.293 L 13.000 14.585 L 11.707 13.293 C 11.315 12.914 10.691 12.919 10.305 13.305 C 9.919 13.691 9.914 14.315 10.293 14.707 L 12.293 16.707 C 12.684 17.097 13.316 17.097 13.707 16.707 L 17.707 12.707 C 18.086 12.315 18.081 11.691 17.695 11.305 C 17.309 10.919 16.685 10.914 16.293 11.293"),
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
        return _copyCheck!!
    }

private var _copyCheck: ImageVector? = null
