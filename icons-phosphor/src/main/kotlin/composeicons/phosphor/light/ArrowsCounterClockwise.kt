package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorLightIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 102h-48c-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v33.52L64 63.52C81.48 45.956 105.22 36.053 130 35.99h.52c24.55-.074 48.142 9.521 65.67 26.71 2.239 2.337 2.221 6.028-.04 8.343-2.261 2.315-5.951 2.42-8.34 .237C155.67 39.91 104.275 40.231 72.53 72L54.48 90h33.52c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM216 154h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h33.52l-18.05 18c-15.239 15.306-35.931 23.938-57.53 24h-.46c-21.422 .052-42.003-8.333-57.29-23.34-2.389-2.183-6.079-2.078-8.34 .237-2.261 2.315-2.279 6.006-.04 8.343 17.52 17.207 41.113 26.821 65.67 26.76h.52c24.78-.063 48.52-9.966 66-27.53l18-18.05v33.58c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
