package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorFillIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 56C88.235 56 56 88.235 56 128c0 39.764 32.235 72 72 72 39.764 0 72-32.236 72-72C199.956 88.254 167.746 56.044 128 56ZM128 176c-15.119 .056-29.368-7.065-38.4-19.19-2.654-3.535-1.94-8.551 1.595-11.205 3.535-2.654 8.551-1.94 11.205 1.595 8.264 11.019 22.652 15.514 35.719 11.158C151.186 154.002 160 141.774 160 128c0-13.774-8.814-26.002-21.881-30.358-13.067-4.356-27.455 .139-35.719 11.158-2.654 3.535-7.67 4.249-11.205 1.595-3.535-2.654-4.249-7.67-1.595-11.205C103.147 81.138 127.44 74.961 147.964 84.352c20.524 9.391 31.733 31.811 26.929 53.864C170.089 160.269 150.57 175.996 128 176ZM128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C232 70.562 185.438 24 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88Z"),
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
