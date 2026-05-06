package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorBoldIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M137.94 121.27c2.233 3.3 2.682 7.492 1.2 11.19l-16 40c-1.823 4.554-6.235 7.54-11.14 7.54-1.528 .003-3.043-.289-4.46-.86-6.152-2.463-9.143-9.448-6.68-15.6L110.28 140h-14.28c-3.982-0-7.705-1.976-9.938-5.274-2.232-3.298-2.683-7.489-1.202-11.186l16-40c2.497-6.099 9.447-9.043 15.565-6.593 6.119 2.45 9.116 9.376 6.715 15.513L113.72 116h14.28c3.983-.002 7.706 1.973 9.94 5.27ZM256 86.63v79.37c0 16.569-13.431 30-30 30-16.569 0-30-13.431-30-30v-38c0-2.209-1.791-4-4-4h-12v80h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-148C44 40.536 56.536 28 72 28h80c15.464 0 28 12.536 28 28v44h12c15.464 0 28 12.536 28 28v38c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-79.37c.001-1.061-.42-2.079-1.17-2.83L211.51 64.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l19.29 19.34c5.269 5.24 8.222 12.37 8.2 19.8ZM156 204v-148c0-2.209-1.791-4-4-4h-80c-2.209 0-4 1.791-4 4v148Z"),
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
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
