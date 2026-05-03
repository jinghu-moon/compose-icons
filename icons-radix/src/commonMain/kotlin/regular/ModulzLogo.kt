package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ModulzLogo: ImageVector
    get() {
        if (_modulzLogo != null) return _modulzLogo!!
        _modulzLogo = radixIcon(
            name = "ModulzLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.889 11.833 L 1.000 14.000 L 1.000 9.667 L 3.889 11.833 ZM 14.000 14.000 L 11.111 11.833 L 14.000 9.667 L 14.000 14.000 ZM 3.889 11.111 L 1.000 8.944 L 3.889 6.777 L 3.889 11.111 ZM 14.000 8.944 L 11.111 11.111 L 11.111 6.777 L 14.000 8.944 ZM 3.889 6.056 L 1.000 8.223 L 1.000 3.889 L 3.889 6.056 ZM 7.259 8.223 L 4.370 6.056 L 7.259 3.889 L 7.259 8.223 ZM 10.630 6.056 L 7.741 8.223 L 7.741 3.889 L 10.630 6.056 ZM 14.000 8.223 L 11.111 6.056 L 14.000 3.889 L 14.000 8.223 ZM 3.889 5.333 L 1.000 3.167 L 3.889 1.000 L 3.889 5.333 ZM 7.259 3.167 L 4.370 5.333 L 4.370 1.000 L 7.259 3.167 ZM 10.630 5.333 L 7.741 3.167 L 10.630 1.000 L 10.630 5.333 ZM 14.000 3.167 L 11.111 5.333 L 11.111 1.000 L 14.000 3.167 Z"),
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
        return _modulzLogo!!
    }

private var _modulzLogo: ImageVector? = null
