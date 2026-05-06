package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorLightIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.72 67.9l-88-48.17c-4.182-2.31-9.258-2.31-13.44 0l-88 48.18C28.795 70.364 26.004 75.068 26 80.18v95.64c.004 5.112 2.795 9.816 7.28 12.27l88 48.18c4.183 2.306 9.257 2.306 13.44 0l88-48.18c4.485-2.454 7.276-7.158 7.28-12.27v-95.64c-.001-5.116-2.792-9.824-7.28-12.28ZM127 30.25c.598-.327 1.322-.327 1.92 0L212.51 76 128 122.24 43.49 76ZM39 177.57c-.624-.36-1.006-1.029-1-1.75v-89.16l84 46v90.34ZM216.92 177.57 134 223v-90.36l84-46v89.16c.014 .728-.369 1.406-1 1.77Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
