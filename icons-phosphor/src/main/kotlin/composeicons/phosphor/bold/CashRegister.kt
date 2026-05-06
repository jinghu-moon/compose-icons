package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = phosphorBoldIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.61 157 221.17 71C218.891 62.175 210.934 56.007 201.82 56h-61.82v-16C140 28.954 131.046 20 120 20h-40C68.954 20 60 28.954 60 40v16h-5.82c-9.114 .007-17.071 6.175-19.35 15L12.39 157c-.257 .979-.388 1.988-.39 3v32c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-32c-.002-1.012-.133-2.021-.39-3ZM84 44h32v12h-32ZM57.27 80h141.46l17.74 68h-176.94ZM36 188v-16h184v16ZM64 116c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12ZM112 116c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12ZM160 116c0-6.627 5.373-12 12-12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8c-6.627 0-12-5.373-12-12Z"),
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
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
