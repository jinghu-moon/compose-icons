package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorBoldIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 104c0 6.627-5.373 12-12 12h-20v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20h-20c-6.627 0-12-5.373-12-12C84 97.373 89.373 92 96 92h20v-20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v20h20c6.627 0 12 5.373 12 12ZM220 104c0 32.38-14.85 66.57-42.94 98.87-12.57 14.524-26.717 27.604-42.18 39-4.131 2.891-9.629 2.891-13.76 0C117.64 239.4 36 181.36 36 104 36 53.19 77.19 12 128 12c50.81 0 92 41.19 92 92ZM196 104C196 66.445 165.555 36 128 36 90.445 36 60 66.445 60 104c0 33.31 20 63.37 36.7 82.71 9.535 10.952 20.008 21.051 31.3 30.18 11.292-9.129 21.765-19.228 31.3-30.18C176 167.37 196 137.31 196 104Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
