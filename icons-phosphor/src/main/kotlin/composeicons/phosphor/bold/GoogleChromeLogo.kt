package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorBoldIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 44c25.71 .005 49.997 11.799 65.9 32h-65.9c-19.414 .018-37.206 10.839-46.15 28.07L64.18 73.47C80.108 54.77 103.436 43.997 128 44ZM156 128c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM44 128c-.006-10.658 2.031-21.219 6-31.11L83 154c.06 .11 .14 .2 .2 .3C92.523 170.201 109.567 179.979 128 180q1.19 0 2.34-.06l-17.68 30.63C72.897 203.136 44.056 168.452 44 128ZM140.05 211.12 173 154c.09-.15 .16-.3 .24-.46 9.491-16.734 8.929-37.348-1.46-53.54h35.4c8.396 23.702 5.726 49.919-7.276 71.442-13.002 21.523-34.967 36.083-59.854 39.678Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
