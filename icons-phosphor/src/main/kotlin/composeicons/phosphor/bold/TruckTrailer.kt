package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorBoldIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 93.65C222.697 61.452 196.224 36.017 164 36c-11.046 0-20 8.954-20 20v116h-16v-100c0-6.627-5.373-12-12-12h-96C8.954 60 0 68.954 0 80v104c.013 14.191 8.361 27.05 21.318 32.837 12.957 5.787 28.105 3.423 38.682-6.037 8.944 8.004 21.288 11.025 32.918 8.054 11.629-2.971 21.013-11.541 25.022-22.854h68.12c5.846 16.529 22.748 26.443 40.028 23.478C243.367 216.514 255.998 201.532 256 184v-48C255.981 116.323 242.923 99.042 224 93.65ZM168 60.22c18.209 2.063 31.974 17.455 32 35.78v8c0 6.627 5.373 12 12 12 11.046 0 20 8.954 20 20v14.06c-18.745-6.627-39.312 3.196-45.94 21.94h-18.06ZM104 84v70.08c-13.653-9.148-31.774-7.863-44 3.12C50.212 148.408 36.402 145.669 24 150.06v-66.06ZM36 196c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM84 196c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM220 196c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
