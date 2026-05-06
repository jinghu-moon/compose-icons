package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorBoldIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 140c-6.627 0-12-5.373-12-12v-83l-7.51 7.51c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l28-28c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l28 28c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L132 45v83c0 6.627-5.373 12-12 12ZM196 121.52v-25.52C196 84.954 187.046 76 176 76h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v68.3c-12.54-7.231-28.373-5.143-38.61 5.092-10.237 10.235-12.328 26.067-5.1 38.608 .11 .2 .23 .39 .35 .58l22.26 34c3.631 5.55 11.075 7.106 16.625 3.475 5.55-3.631 7.106-11.075 3.475-16.625L149 199.77c-2.146-3.866-.751-8.739 3.115-10.885 3.866-2.146 8.739-.751 10.885 3.115 .11 .2 .23 .39 .36 .58L174 208.88c2.919 4.401 8.373 6.377 13.434 4.865 5.061-1.511 8.538-6.154 8.566-11.435v-48.31c10.31 12.585 15.961 28.341 16 44.61v41.39c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-41.35c-.092-30.662-14.99-59.391-40-77.13ZM76 76h-12C52.954 76 44 84.954 44 96v104c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-100h8c6.627 0 12-5.373 12-12C88 81.373 82.627 76 76 76Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
