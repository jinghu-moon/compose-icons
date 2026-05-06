package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorDuotoneIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 208h-108c19.882 0 36-16.118 36-36v-88c-.003-17.035 9.826-32.541 25.234-39.806 15.408-7.265 33.625-4.984 46.766 5.856Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M192 208c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h4c15.464 0 28-12.536 28-28v-36h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-36C88 63.873 99.616 45.553 117.821 36.968c18.205-8.585 39.729-5.892 55.259 6.912 2.267 1.799 3.386 4.683 2.925 7.54-.461 2.857-2.429 5.243-5.147 6.239-2.718 .995-5.761 .445-7.958-1.438C152.148 47.356 137.246 45.493 124.643 51.437 112.04 57.382 103.999 70.065 104 84v36h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32v36c.009 10.223-3.557 20.128-10.08 28h90.08c4.418 0 8 3.582 8 8Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
