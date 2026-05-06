package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorThinIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 128C203.992 103.246 191.92 80.049 171.65 65.84L165.13 29.84C164.087 24.138 159.117 19.997 153.32 20h-50.64c-5.803-.001-10.775 4.15-11.81 9.86l-6.52 36C64.072 80.062 51.996 103.263 51.996 128.02c0 24.757 12.076 47.958 32.354 62.16l6.52 36c1.052 5.694 6.02 9.825 11.81 9.82h50.64c5.803 .001 10.775-4.15 11.81-9.86l6.52-36C191.914 175.935 203.986 152.747 204 128ZM98.74 31.29c.344-1.906 2.003-3.292 3.94-3.29h50.64c1.937-.002 3.596 1.384 3.94 3.29l5.26 29c-21.662-11.093-47.338-11.093-69 0ZM157.26 224.71c-.344 1.906-2.003 3.292-3.94 3.29h-50.64c-1.937 .002-3.596-1.384-3.94-3.29l-5.26-29c21.662 11.093 47.338 11.093 69 0ZM128 196C90.445 196 60 165.555 60 128 60 90.445 90.445 60 128 60c37.555 0 68 30.445 68 68-.039 37.539-30.461 67.961-68 68ZM172 128c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-40c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v36h36c2.209 0 4 1.791 4 4Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
