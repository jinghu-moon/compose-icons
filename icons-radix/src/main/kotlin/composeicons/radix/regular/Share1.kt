package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Share1: ImageVector
    get() {
        if (_share1 != null) return _share1!!
        _share1 = radixIcon(
            name = "Share1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 7.5C1 6.119 2.119 5 3.5 5c.96 0 1.792 .543 2.211 1.337L9.104 4.217C9.037 3.99 9 3.749 9 3.5 9 2.119 10.119 1 11.5 1 12.881 1 14 2.119 14 3.5c0 1.381-1.119 2.5-2.5 2.5-.809 0-1.525-.385-1.982-.98L5.984 7.229C5.994 7.318 6 7.408 6 7.5c0 .092-.006 .183-.016 .272L9.518 9.981c.457-.596 1.174-.981 1.982-.981 1.381 0 2.5 1.119 2.5 2.5C14 12.881 12.881 14 11.5 14 10.119 14 9 12.881 9 11.5c0-.249 .037-.489 .104-.716L5.711 8.664C5.292 9.458 4.46 10 3.5 10 2.119 10 1 8.881 1 7.5ZM10 3.5c0 .828 .672 1.5 1.5 1.5C12.328 5 13 4.328 13 3.5 13 2.672 12.328 2 11.5 2 10.672 2 10 2.672 10 3.5ZM2 7.5c0 .828 .672 1.5 1.5 1.5C4.328 9 5 8.328 5 7.5 5 6.672 4.328 6 3.5 6 2.672 6 2 6.672 2 7.5ZM11.5 13C12.328 13 13 12.328 13 11.5 13 10.672 12.328 10 11.5 10 10.672 10 10 10.672 10 11.5c0 .828 .672 1.5 1.5 1.5Z"),
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
        return _share1!!
    }

private var _share1: ImageVector? = null
