package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorFillIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 132c-.001 13.918-10.225 25.722-24 27.71v40.29c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-40.29C25.209 157.575 14.701 144.201 16.128 129.325c1.426-14.876 14.284-26.01 29.211-25.295C60.267 104.744 72.002 117.056 72 132v36c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h80v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-36c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM44 88c22.737 .032 41.715 17.36 43.81 40h80.38C170.285 105.36 189.263 88.032 212 88c2.209 0 4-1.791 4-4v-12C216 49.909 198.091 32 176 32h-96C57.909 32 40 49.909 40 72v12c0 2.209 1.791 4 4 4Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
