package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorThinIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.83 77.17l-32-32c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L230.34 76h-22.34c-46.67 0-57.84 26.81-67.69 50.46-9.46 22.69-18.4 44.16-56.55 45.48C81.637 152.954 65.054 138.933 45.98 139.996c-19.074 1.063-33.997 16.84-33.997 35.944 0 19.104 14.922 34.881 33.997 35.944 19.074 1.063 35.658-12.958 37.78-31.944 43.49-1.42 54.33-27.39 63.91-50.39C157.45 106.12 166.67 84 208 84h22.34l-25.17 25.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l32-32c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM48 204C32.536 204 20 191.464 20 176c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
