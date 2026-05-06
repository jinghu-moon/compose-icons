package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorDuotoneIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 128v72c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-72Z"),
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
                pathData = parseSvgPathData("M216 72h-35.08c.39-.33 .79-.65 1.17-1 6.14-5.455 9.73-13.219 9.91-21.43 .266-8.98-3.185-17.673-9.536-24.026C176.112 19.19 167.42 15.737 158.44 16c-8.214 .177-15.983 3.768-21.44 9.91-3.735 4.329-6.772 9.214-9 14.48-2.228-5.266-5.265-10.151-9-14.48C113.543 19.768 105.774 16.177 97.56 16c-8.98-.263-17.672 3.19-24.024 9.544C67.185 31.897 63.735 40.59 64 49.57c.18 8.211 3.77 15.975 9.91 21.43 .38 .33 .78 .65 1.17 1h-35.08C31.163 72 24 79.163 24 88v32c0 8.837 7.163 16 16 16v64c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-64c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16ZM149 36.51c2.561-2.828 6.185-4.459 10-4.5h.49c4.468 .028 8.736 1.854 11.843 5.065 3.106 3.212 4.789 7.539 4.667 12.005-.041 3.815-1.672 7.439-4.5 10-9.49 8.4-25.24 11.36-35 12.4C137.7 60.89 141 45.5 149 36.51ZM84.91 36.87C88.009 33.771 92.207 32.021 96.59 32h.49c3.815 .041 7.439 1.672 10 4.5 8.39 9.48 11.35 25.2 12.39 34.92-9.72-1-25.44-4-34.92-12.39-2.828-2.561-4.459-6.185-4.5-10-.125-4.542 1.617-8.937 4.82-12.16ZM40 88h80v32h-80ZM56 136h64v64h-64ZM200 200h-64v-64h64ZM216 120h-80v-32h80v32Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
