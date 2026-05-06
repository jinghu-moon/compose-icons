package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorThinIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M93.54 102.13c8.55 16.187 8.55 35.553 0 51.74-.694 1.312-2.056 2.132-3.54 2.13-.651-.002-1.292-.159-1.87-.46-.94-.495-1.644-1.344-1.957-2.359-.313-1.015-.21-2.113 .287-3.051 7.43-13.818 7.43-30.442 0-44.26-1.033-1.955-.285-4.377 1.67-5.41 1.955-1.033 4.377-.285 5.41 1.67ZM144.12 68.47c-1.949 1.039-2.688 3.46-1.65 5.41 18.1 33.81 18.1 74.43 0 108.24-.701 1.264-.666 2.808 .092 4.038 .758 1.231 2.121 1.957 3.565 1.899 1.444-.058 2.745-.89 3.402-2.177 19.355-36.16 19.355-79.6 0-115.76-1.039-1.949-3.46-2.688-5.41-1.65ZM116.12 84.47c-1.949 1.039-2.688 3.46-1.65 5.41 12.708 23.825 12.708 52.415 0 76.24-.701 1.264-.666 2.808 .092 4.038 .758 1.231 2.121 1.957 3.565 1.899 1.444-.058 2.745-.89 3.402-2.177 13.959-26.175 13.959-57.585 0-83.76-1.039-1.949-3.46-2.688-5.41-1.65ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c55.203 .061 99.939 44.797 100 100ZM220 128C220 77.19 178.81 36 128 36 77.19 36 36 77.19 36 128c0 50.81 41.19 92 92 92 50.787-.055 91.945-41.213 92-92Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
