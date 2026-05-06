package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorDuotoneIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.94 161.94c-18.745 18.744-49.135 18.744-67.88 0L128 128 158.06 94.06c18.788-18.485 48.967-18.362 67.605 .275 18.637 18.637 18.76 48.816 .275 67.605ZM30.06 94.06c-18.485 18.788-18.362 48.967 .275 67.605 18.637 18.637 48.816 18.76 67.605 .275L128 128 97.94 94.06C79.195 75.316 48.805 75.316 30.06 94.06Z"),
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
                pathData = parseSvgPathData("M248 128c.002 22.651-13.642 43.073-34.569 51.741-20.927 8.668-45.015 3.877-61.031-12.141l-.33-.35L92.12 99.55C76.451 84.064 51.21 84.163 35.663 99.771c-15.547 15.608-15.547 40.849 0 56.458 15.547 15.608 40.788 15.707 56.457 .221l8.52-9.62c2.93-3.314 7.991-3.625 11.305-.695 3.314 2.93 3.625 7.991 .695 11.305l-8.69 9.81-.33 .35c-21.87 21.868-57.326 21.867-79.195-.003C2.557 145.728 2.557 110.272 24.425 88.403 46.294 66.533 81.75 66.532 103.62 88.4l.33 .35 59.95 67.7c15.669 15.486 40.91 15.387 56.457-.221 15.547-15.608 15.547-40.849 0-56.458C204.81 84.163 179.569 84.064 163.9 99.55l-8.52 9.62c-2.93 3.314-7.991 3.625-11.305 .695-3.314-2.93-3.625-7.991-.695-11.305l8.69-9.81 .33-.35C168.416 72.382 192.504 67.59 213.431 76.259 234.358 84.927 248.002 105.349 248 128Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
