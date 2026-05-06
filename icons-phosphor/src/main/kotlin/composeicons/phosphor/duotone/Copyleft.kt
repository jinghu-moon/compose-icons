package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorDuotoneIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM176 128c.004 20.663-13.215 39.009-32.816 45.545-19.601 6.536-41.186-.205-53.584-16.735-2.654-3.535-1.94-8.551 1.595-11.205 3.535-2.654 8.551-1.94 11.205 1.595 8.264 11.019 22.652 15.514 35.719 11.158C151.186 154.002 160 141.774 160 128c0-13.774-8.814-26.002-21.881-30.358-13.067-4.356-27.455 .139-35.719 11.158-2.654 3.535-7.67 4.249-11.205 1.595-3.535-2.654-4.249-7.67-1.595-11.205C101.997 82.66 123.582 75.919 143.184 82.455 162.785 88.991 176.004 107.338 176 128Z"),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
