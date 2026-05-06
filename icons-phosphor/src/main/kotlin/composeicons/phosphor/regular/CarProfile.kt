package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorRegularIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 112h-28.69L168 68.69C165.01 65.676 160.936 63.986 156.69 64h-112.41C38.943 64.01 33.962 66.68 31 71.12L1.34 115.56C.469 116.877 .003 118.421 0 120v48C0 176.837 7.163 184 16 184h17c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h66c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h17c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16ZM44.28 80h112.41l32 32h-165.69ZM64 192c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM192 192c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM240 168h-17c-3.625-14.159-16.384-24.063-31-24.063-14.616 0-27.375 9.903-31 24.063h-66C91.375 153.841 78.616 143.937 64 143.937c-14.616 0-27.375 9.903-31 24.063h-17v-40h224Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
