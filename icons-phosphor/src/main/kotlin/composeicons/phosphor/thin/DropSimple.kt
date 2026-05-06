package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorThinIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171 50.37C158.861 36.349 145.2 23.722 130.27 12.72c-1.376-.961-3.204-.961-4.58 0C110.774 23.724 97.127 36.351 85 50.37 58.17 81.21 44 113.58 44 144c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 113.58 197.83 81.21 171 50.37ZM128 220C86.045 219.956 52.044 185.955 52 144 52 108.1 73.15 76.2 90.9 55.77 102.073 42.968 114.501 31.32 128 21c13.5 10.333 25.929 21.994 37.1 34.81C182.85 76.2 204 108.1 204 144c-.044 41.955-34.045 75.956-76 76Z"),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
