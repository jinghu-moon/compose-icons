package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorBoldIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM178.28 60.75 60.75 178.28c-3.213-4.292-6.012-8.88-8.36-13.7L164.58 52.39c4.82 2.348 9.408 5.147 13.7 8.36ZM195.28 77.75c3.213 4.292 6.012 8.88 8.36 13.7L91.42 203.61c-4.82-2.348-9.408-5.147-13.7-8.36ZM128 44c3.467 .007 6.93 .228 10.37 .66L44.66 138.37C41.643 114.463 49.055 90.414 65.005 72.353 80.956 54.291 103.904 43.963 128 44ZM128 212c-3.467-.007-6.93-.228-10.37-.66l93.71-93.71c3.017 23.907-4.395 47.956-20.345 66.017C175.044 201.709 152.096 212.037 128 212Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
