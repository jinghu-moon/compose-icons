package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorThinIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161 110.87c-.598-.876-.824-1.955-.627-2.998 .197-1.043 .8-1.965 1.677-2.562L229.74 59c1.825-1.248 4.317-.78 5.565 1.045 1.248 1.825 .78 4.317-1.045 5.565l-67.67 46.3c-1.812 1.256-4.299 .809-5.56-1ZM235.3 196c-1.261 1.809-3.748 2.256-5.56 1L136 132.85 88.47 165.38c7.645 14.858 2.57 33.098-11.65 41.873-14.22 8.775-32.798 5.131-42.651-8.365-9.852-13.496-7.662-32.301 5.029-43.171 12.691-10.87 31.609-10.146 43.431 1.663 .45 .45 .89 .92 1.31 1.4l45-30.78-45-30.78c-.42 .48-.86 1-1.31 1.4-11.776 11.746-30.606 12.458-43.234 1.633C26.767 89.429 24.59 70.712 34.397 57.278 44.204 43.844 62.694 40.215 76.852 48.944c14.157 8.73 19.218 26.881 11.618 41.676l49.69 34h0l96.09 65.76c.894 .598 1.509 1.532 1.707 2.589 .198 1.057-.039 2.15-.657 3.031ZM77 93c1.04-1.039 1.984-2.171 2.82-3.38 0 0 0 0 0 0h0C87.099 79.059 84.788 64.641 74.572 56.885 64.357 49.129 49.848 50.776 41.631 60.624c-8.217 9.849-7.238 24.418 2.224 33.078C53.316 102.363 67.914 102.054 77 93ZM84 180c.016-4.813-1.432-9.518-4.15-13.49v-.06h0C79.007 165.215 78.053 164.061 77 163c-9.381-9.349-24.562-9.331-33.921 .039-9.359 9.37-9.359 24.551 0 33.921 9.359 9.37 24.54 9.388 33.921 .039h0c4.511-4.504 7.032-10.626 7-17Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
