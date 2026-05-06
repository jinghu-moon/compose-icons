package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorThinIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.55 71.3c-1.18-3.651-4.453-6.225-8.28-6.51L187.9 61.68 172.75 25.77c-1.496-3.502-4.937-5.773-8.745-5.773-3.808 0-7.249 2.271-8.745 5.773L140.1 61.68l-39.36 3.11c-3.807 .272-7.07 2.822-8.255 6.45-1.185 3.628-.056 7.612 2.855 10.08l30 25.28-9.14 37.79c-.919 3.677 .5 7.542 3.58 9.75 3.1 2.279 7.266 2.469 10.56 .48L164 134.32l33.72 20.3c3.294 1.989 7.46 1.799 10.56-.48 3.08-2.208 4.499-6.073 3.58-9.75l-9.15-37.79L232.66 81.32c2.912-2.441 4.055-6.403 2.89-10.02ZM227.5 75.21l-31.84 26.87c-1.16 .977-1.667 2.526-1.31 4l9.73 40.19c.153 .538-.062 1.113-.53 1.42-.499 .378-1.181 .406-1.71 .07L166.07 126.23c-1.27-.766-2.86-.766-4.13 0l-35.78 21.53c-.525 .337-1.205 .309-1.7-.07-.467-.308-.684-.88-.54-1.42l9.73-40.19c.357-1.474-.15-3.023-1.31-4L100.51 75.21c-.449-.339-.627-.929-.44-1.46 .172-.579 .696-.982 1.3-1l41.79-3.3c1.494-.121 2.794-1.067 3.37-2.45L162.63 28.85c.245-.539 .783-.886 1.375-.886 .592 0 1.13 .346 1.375 .886L181.48 67c.582 1.376 1.881 2.313 3.37 2.43l41.79 3.3c.601 .019 1.122 .423 1.29 1 .207 .534 .031 1.14-.43 1.48ZM85.28 120.38 26.83 178.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L79.62 114.72c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM96.09 175.91c1.558 1.561 1.558 4.089 0 5.65L42.83 234.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L90.44 175.91c1.561-1.558 4.089-1.558 5.65 0ZM169.09 174.91c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-54.28 54.28c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l54.29-54.28c.748-.757 1.767-1.184 2.831-1.188 1.064-.004 2.086 .417 2.839 1.168Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
