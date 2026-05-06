package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorRegularIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 76C172 51.699 152.301 32 128 32 103.699 32 84 51.699 84 76c0 24.301 19.699 44 44 44 24.289-.028 43.972-19.711 44-44ZM128 104C112.536 104 100 91.464 100 76c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM188 128c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44-.028-24.289-19.711-43.972-44-44ZM188 200c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM68 128c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C111.972 147.711 92.289 128.028 68 128ZM68 200C52.536 200 40 187.464 40 172c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
