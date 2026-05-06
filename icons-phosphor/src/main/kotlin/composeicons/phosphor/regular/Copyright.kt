package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorRegularIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM96 128c0 13.774 8.814 26.002 21.881 30.358 13.067 4.356 27.455-.139 35.719-11.158 2.654-3.535 7.67-4.249 11.205-1.595 3.535 2.654 4.249 7.67 1.595 11.205-12.399 16.523-33.98 23.26-53.577 16.725C93.225 167 80.007 148.658 80.007 128c0-20.658 13.218-39 32.815-45.535 19.597-6.535 41.178 .201 53.577 16.725 2.654 3.535 1.94 8.551-1.595 11.205-3.535 2.654-8.551 1.94-11.205-1.595C145.336 97.781 130.948 93.286 117.881 97.642 104.814 101.998 96 114.226 96 128Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
