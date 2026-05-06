package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorRegularIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 120h-8v-32c0-8.837-7.163-16-16-16h-16v-8c0-8.837-7.163-16-16-16h-24c-8.837 0-16 7.163-16 16v56h-48v-56C104 55.163 96.837 48 88 48h-24C55.163 48 48 55.163 48 64v8h-16C23.163 72 16 79.163 16 88v32h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v32c0 8.837 7.163 16 16 16h16v8c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-56h48v56c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-8h16c8.837 0 16-7.163 16-16v-32h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM32 168v-80h16v80ZM88 192h-24v-128h24v128ZM192 192h-24v-128h24v111.82c0 .06 0 .12 0 .18 0 .06 0 .12 0 .18v15.82ZM224 168h-16v-80h16Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
