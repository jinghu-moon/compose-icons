package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorLightIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.72 67.91l-88-48.18c-4.182-2.31-9.258-2.31-13.44 0l-88 48.18C28.795 70.364 26.004 75.068 26 80.18v95.64c.004 5.112 2.795 9.816 7.28 12.27l88 48.18c4.183 2.306 9.257 2.306 13.44 0l88-48.18c4.485-2.454 7.276-7.158 7.28-12.27v-95.64c-.004-5.112-2.795-9.816-7.28-12.27ZM127 30.25c.598-.327 1.322-.327 1.92 0L212.51 76 178.57 94.57 94.05 48.31ZM122 223 39 177.57c-.624-.36-1.006-1.029-1-1.75v-89.16l84 46ZM43.49 76 81.56 55.15l84.51 46.26L128 122.24ZM218 175.82c.006 .721-.376 1.39-1 1.75h0L134 223v-90.36l36-19.71v39.07c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-45.63L218 86.66Z"),
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
        return _package!!
    }

private var _package: ImageVector? = null
