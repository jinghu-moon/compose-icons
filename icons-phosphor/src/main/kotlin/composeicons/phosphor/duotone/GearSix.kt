package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GearSix: ImageVector
    get() {
        if (_gearSix != null) return _gearSix!!
        _gearSix = phosphorDuotoneIcon(
            name = "GearSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.1 108.76 198.25 90.62c-.64-1.16-1.31-2.29-2-3.41l-.12-36C186.064 42.715 174.485 36.198 162 32L130 49.89c-1.34 0-2.69 0-4 0L94 32C81.519 36.211 69.946 42.742 59.89 51.25l-.16 36c-.7 1.12-1.37 2.26-2 3.41L25.89 108.76c-2.51 12.697-2.51 25.763 0 38.46l31.85 18.14c.64 1.16 1.31 2.29 2 3.41l.12 36C69.927 213.273 81.51 219.798 94 224l32-17.87c1.34 0 2.69 0 4 0L162 224c12.47-4.215 24.033-10.746 34.08-19.25l.16-36c.7-1.12 1.37-2.26 2-3.41l31.84-18.1c2.519-12.702 2.526-25.775 .02-38.48ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
                pathData = parseSvgPathData("M128 80c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C175.972 101.502 154.498 80.028 128 80ZM128 160C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM237.94 107.21c-.451-2.28-1.871-4.25-3.89-5.4l-29.83-17-.12-33.62c-.007-2.343-1.042-4.566-2.83-6.08C190.449 35.957 177.988 28.943 164.55 24.44c-2.14-.724-4.487-.51-6.46 .59L128 41.85 97.88 25c-1.975-1.106-4.326-1.324-6.47-.6C77.98 28.932 65.532 35.973 54.73 45.15c-1.786 1.512-2.82 3.73-2.83 6.07l-.15 33.65-29.83 17c-2.019 1.15-3.439 3.12-3.89 5.4-2.73 13.719-2.73 27.841 0 41.56 .451 2.28 1.871 4.25 3.89 5.4l29.83 17 .12 33.63c.007 2.343 1.042 4.566 2.83 6.08 10.821 9.153 23.282 16.167 36.72 20.67 2.14 .724 4.487 .51 6.46-.59L128 214.15 158.12 231c1.192 .664 2.536 1.009 3.9 1 .874-0 1.742-.142 2.57-.42 13.427-4.53 25.873-11.564 36.68-20.73 1.786-1.512 2.82-3.73 2.83-6.07l.15-33.65 29.83-17c2.019-1.15 3.439-3.12 3.89-5.4 2.715-13.708 2.705-27.816-.03-41.52ZM222.94 142.12l-28.57 16.25c-1.252 .712-2.288 1.748-3 3-.58 1-1.19 2.06-1.81 3.06-.794 1.261-1.216 2.72-1.22 4.21l-.15 32.25c-7.679 6.031-16.235 10.853-25.37 14.3L134 199.13c-1.196-.662-2.543-1.006-3.91-1h-.19c-1.21 0-2.43 0-3.64 0-1.431-.035-2.846 .31-4.1 1L93.32 215.23C84.165 211.809 75.586 207.011 67.88 201l-.11-32.2c-.005-1.493-.428-2.955-1.22-4.22-.62-1-1.23-2-1.8-3.06-.707-1.271-1.743-2.328-3-3.06L33.15 142.17c-1.48-9.362-1.48-18.898 0-28.26L61.67 97.63c1.252-.712 2.288-1.748 3-3 .58-1 1.19-2.06 1.81-3.06 .794-1.261 1.216-2.72 1.22-4.21l.15-32.25C75.529 49.079 84.085 44.257 93.22 40.81L122 56.87c1.253 .694 2.668 1.04 4.1 1 1.21 0 2.43 0 3.64 0 1.432 .04 2.847-.306 4.1-1L162.68 40.77c9.155 3.421 17.734 8.219 25.44 14.23l.11 32.2c.005 1.493 .428 2.955 1.22 4.22 .62 1 1.23 2 1.8 3.06 .707 1.271 1.743 2.328 3 3.06l28.6 16.29c1.5 9.369 1.517 18.916 .05 28.29Z"),
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
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
