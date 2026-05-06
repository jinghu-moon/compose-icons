package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorDuotoneIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 211.16ZM80 211.16ZM224 128C223.99 81.415 190.535 41.56 144.656 33.478 98.777 25.395 53.717 51.417 37.787 95.194 21.857 138.972 39.656 187.867 80 211.16v-35.16c0-4.418 3.582-8 8-8h8v-24c0-4.418 3.582-8 8-8h4.16l12-57.63c1.77-8.49 13.89-8.49 15.66 0l12 57.63h4.18c4.418 0 8 3.582 8 8v24h8c4.418 0 8 3.582 8 8v35.16C205.709 194.007 224.008 162.305 224 128Z"),
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
                pathData = parseSvgPathData("M201.54 54.46C160.925 13.845 95.075 13.845 54.46 54.46c-40.615 40.615-40.615 106.465 0 147.08 40.615 40.615 106.465 40.615 147.08 0 40.615-40.615 40.615-106.465 0-147.08ZM88 206.37v-30.37h80v30.37c-25.14 12.76-54.86 12.76-80 0ZM104 144h48v16h-48ZM118 128 128 80h0l10 48ZM190.22 190.23c-2 2-4.08 3.87-6.22 5.64v-19.87c0-8.837-7.163-16-16-16v-16c-.01-7.906-5.793-14.619-13.61-15.8L143.66 76.74C142.107 69.329 135.572 64.021 128 64.021c-7.572 0-14.107 5.308-15.66 12.719l-10.73 51.46C93.793 129.381 88.01 136.094 88 144v16c-8.837 0-16 7.163-16 16v19.87c-2.14-1.77-4.22-3.64-6.22-5.64C40.609 165.063 33.077 127.212 46.697 94.327 60.317 61.441 92.406 39.999 128 39.999c35.594 0 67.683 21.442 81.303 54.327 13.62 32.885 6.088 70.737-19.083 95.903Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
