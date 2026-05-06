package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MaskOff: ImageVector
    get() {
        if (_maskOff != null) return _maskOff!!
        _maskOff = radixIcon(
            name = "MaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.102 1.005C14.607 1.056 15 1.482 15 2v11l-.005 .102c-.048 .47-.422 .845-.893 .893L14 14h-13L.897 13.995C.427 13.947 .053 13.573 .005 13.102L0 13v-11C0 1.482 .393 1.056 .897 1.005L1 1h13l.102 .005ZM1 13h13v-11h-13v11ZM7.5 3.875c2.002 0 3.625 1.623 3.625 3.625 0 2.002-1.623 3.625-3.625 3.625C5.498 11.125 3.875 9.502 3.875 7.5 3.875 5.498 5.498 3.875 7.5 3.875ZM7.5 4.875C6.05 4.875 4.875 6.05 4.875 7.5c0 1.45 1.175 2.625 2.625 2.625 1.45 0 2.625-1.175 2.625-2.625C10.125 6.05 8.95 4.875 7.5 4.875Z"),
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
        return _maskOff!!
    }

private var _maskOff: ImageVector? = null
