package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorLightIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.88 30.12c-3.563-3.618-8.822-4.992-13.7-3.58h-.11L20.14 84.77c-5.581 1.616-9.583 6.512-10.058 12.302-.475 5.791 2.676 11.273 7.918 13.778l85.56 41.64L145.12 238c2.286 4.895 7.207 8.017 12.61 8 .4 0 .81 0 1.21-.05 5.806-.457 10.712-4.484 12.29-10.09L229.43 43.93v-.11c1.42-4.872 .057-10.131-3.55-13.7ZM217.88 40.52 159.73 232.43v.11c-.228 .815-.944 1.399-1.788 1.457-.844 .058-1.634-.421-1.972-1.197L115.29 149.22l49-49c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0l-49 49L23.15 100c-.759-.354-1.218-1.143-1.148-1.978 .069-.835 .651-1.538 1.458-1.762h.11L215.48 38.08c.687-.193 1.424 .007 1.92 .52 .502 .502 .7 1.233 .52 1.92Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
