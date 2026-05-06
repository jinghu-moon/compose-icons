package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = phosphorFillIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.35 129.36c-.81-.47-1.7-.92-2.62-1.36 .92-.44 1.81-.89 2.62-1.36 12.478-7.094 20.198-20.331 20.23-34.685 .032-14.354-7.63-27.624-20.077-34.773-12.447-7.149-27.77-7.081-40.153 .178-.81 .47-1.65 1-2.48 1.59 .08-1 .13-2 .13-3C168 33.859 150.091 15.95 128 15.95c-22.091 0-40 17.909-40 40 0 .94 0 1.94 .13 3-.83-.57-1.67-1.12-2.48-1.59C73.267 50.101 57.944 50.033 45.497 57.182 33.051 64.331 25.389 77.601 25.42 91.955c.032 14.354 7.752 27.59 20.23 34.685 .81 .47 1.7 .92 2.62 1.36-.92 .44-1.81 .89-2.62 1.36-12.478 7.094-20.198 20.331-20.23 34.685-.032 14.354 7.63 27.624 20.077 34.773 12.447 7.149 27.77 7.081 40.153-.178 .81-.47 1.65-1 2.48-1.59-.08 1-.13 2-.13 2.95 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-.94-.05-1.94-.13-2.95 .83 .57 1.67 1.12 2.48 1.59 6.059 3.51 12.937 5.359 19.94 5.36 3.519-.005 7.022-.469 10.42-1.38 15.627-4.188 27.193-17.378 29.303-33.419 2.11-16.041-5.65-31.773-19.663-39.861ZM128 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
