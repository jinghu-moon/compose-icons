package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorFillIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 56C88.235 56 56 88.235 56 128c0 39.764 32.235 72 72 72 39.764 0 72-32.236 72-72C199.956 88.254 167.746 56.044 128 56ZM128 160c10.083 .035 19.585-4.714 25.61-12.8 1.698-2.336 4.524-3.576 7.393-3.243 2.869 .333 5.336 2.186 6.454 4.849 1.118 2.663 .714 5.722-1.057 8.003-12.401 16.521-33.981 23.255-53.577 16.719C93.228 166.993 80.011 148.652 80.011 127.995c0-20.657 13.216-38.998 32.812-45.534 19.596-6.536 41.176 .198 53.577 16.719 1.771 2.281 2.175 5.34 1.057 8.003-1.118 2.663-3.585 4.516-6.454 4.849-2.869 .333-5.695-.906-7.393-3.243C144.579 96.758 128.385 92.642 114.704 98.901c-13.681 6.259-21.154 21.203-17.955 35.903C99.948 149.505 112.955 159.992 128 160ZM128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88Z"),
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
