package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Input: ImageVector
    get() {
        if (_input != null) return _input!!
        _input = radixIcon(
            name = "Input",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 1c.276 0 .5 .224 .5 .5C11 1.776 10.776 2 10.5 2c-.627 0-.957 .201-1.155 .479C9.122 2.79 9 3.288 9 4v7c0 .712 .122 1.21 .345 1.521 .198 .278 .529 .479 1.155 .479 .276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.873 0-1.543-.299-1.97-.896-.011-.016-.02-.033-.03-.049-.011 .016-.019 .033-.03 .049C8.043 13.701 7.373 14 6.5 14 6.224 14 6 13.776 6 13.5 6 13.224 6.224 13 6.5 13c.627 0 .957-.201 1.155-.479C7.878 12.21 8 11.712 8 11v-7C8 3.288 7.878 2.79 7.655 2.479 7.457 2.201 7.127 2 6.5 2 6.224 2 6 1.776 6 1.5 6 1.224 6.224 1 6.5 1c.873 0 1.543 .299 1.97 .896 .011 .015 .02 .032 .03 .048 .011-.016 .019-.033 .03-.048C8.957 1.299 9.627 1 10.5 1ZM6 5h-5v5h5v1h-5L.897 10.995C.427 10.947 .053 10.573 .005 10.102L0 10v-5C0 4.482 .393 4.056 .897 4.005L1 4h5v1ZM14.102 4.005C14.607 4.056 15 4.482 15 5v5l-.005 .102c-.048 .47-.422 .845-.893 .893L14 11h-3v-1h3v-5h-3v-1h3l.102 .005Z"),
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
        return _input!!
    }

private var _input: ImageVector? = null
