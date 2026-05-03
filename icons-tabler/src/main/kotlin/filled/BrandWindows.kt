package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) return _brandWindows!!
        _brandWindows = tablerFilledIcon(
            name = "BrandWindows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 13.000 L 21.000 18.000 C 21.000 19.570 19.752 20.832 18.285 20.923 L 18.172 20.926 L 18.130 20.944 C 18.022 20.982 17.908 21.001 17.794 21.000 L 17.676 20.992 L 13.000 20.407 L 13.000 13.000 ZM 11.000 13.000 L 11.000 20.157 L 5.700 19.495 C 4.186 19.344 3.000 18.112 3.000 16.600 L 3.000 13.000 ZM 11.000 3.842 L 11.000 11.000 L 3.000 11.000 L 3.000 7.400 C 3.000 5.946 4.096 4.752 5.505 4.530 ZM 21.000 5.900 L 21.000 11.000 L 13.000 11.000 L 13.000 3.591 L 17.717 3.002 C 19.476 2.857 21.000 4.191 21.000 5.900"),
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
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
