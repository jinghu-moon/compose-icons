package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QwenAiFill: ImageVector
    get() {
        if (_qwenAiFill != null) return _qwenAiFill!!
        _qwenAiFill = remixIcon(
            name = "QwenAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.710 1.999 C 11.889 1.999 12.055 2.094 12.144 2.249 L 13.443 4.499 L 18.928 4.499 C 19.107 4.499 19.271 4.595 19.361 4.749 L 20.515 6.749 C 20.604 6.904 20.604 7.094 20.515 7.249 L 19.216 9.499 L 21.958 14.249 C 22.048 14.404 22.048 14.594 21.958 14.749 L 20.804 16.749 C 20.715 16.904 20.549 16.999 20.371 16.999 L 17.773 16.999 L 15.031 21.749 C 14.941 21.903 14.776 21.999 14.598 21.999 L 12.288 21.999 C 12.110 21.999 11.944 21.904 11.855 21.749 L 10.556 19.499 L 5.072 19.499 C 4.893 19.499 4.727 19.404 4.638 19.249 L 3.484 17.249 C 3.395 17.094 3.395 16.904 3.484 16.749 L 4.783 14.499 L 2.040 9.750 C 1.951 9.595 1.951 9.405 2.040 9.250 L 3.196 7.250 C 3.285 7.096 3.450 7.000 3.628 7.000 L 6.227 7.000 L 8.968 2.249 C 9.057 2.094 9.223 1.999 9.402 1.999 L 11.710 1.999 ZM 6.587 7.625 L 4.421 7.624 L 9.473 16.374 L 6.587 16.374 L 5.144 18.874 L 10.916 18.874 L 12.000 20.750 L 17.052 12.000 L 18.495 14.500 L 21.381 14.499 L 18.495 9.499 L 19.578 7.625 L 9.474 7.625 L 10.917 5.124 L 9.474 2.625 L 6.587 7.625 ZM 15.464 10.000 L 12.000 16.000 L 8.536 10.000 L 15.464 10.000 Z"),
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
        return _qwenAiFill!!
    }

private var _qwenAiFill: ImageVector? = null
