package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorThinIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184.46 96c14.762-7.608 22.404-24.328 18.497-40.47C199.05 39.389 184.608 28.015 168 28h-72C79.392 28.015 64.95 39.389 61.043 55.53 57.136 71.672 64.778 88.392 79.54 96c-12.259 6.317-19.832 19.082-19.5 32.869 .332 13.787 8.511 26.172 21.06 31.891-17.249 9.248-25.274 29.619-18.965 48.147 6.309 18.527 25.098 29.769 44.406 26.568C125.85 232.274 140.006 215.572 140 196v-45.41c9.194 11.454 24.426 16.174 38.486 11.926 14.06-4.248 24.13-16.612 25.444-31.241C205.244 116.646 197.538 102.685 184.46 96ZM196 64c0 15.464-12.536 28-28 28h-28v-56h28c15.464 0 28 12.536 28 28ZM140 100h5.41c-1.988 1.608-3.802 3.422-5.41 5.41ZM68 64C68 48.536 80.536 36 96 36h36v56h-36C80.536 92 68 79.464 68 64ZM132 196c0 17.673-14.327 32-32 32C82.327 228 68 213.673 68 196c0-17.673 14.327-32 32-32h32ZM132 156h-36C80.536 156 68 143.464 68 128c0-15.464 12.536-28 28-28h36ZM168 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
