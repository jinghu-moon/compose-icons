package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorBoldIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.71 117.38c-.864-3.862-3.576-7.049-7.25-8.52L161.28 88.39 171.87 17.78c.798-5.205-1.89-10.322-6.629-12.618C160.502 2.866 154.82 3.928 151.23 7.78L39.23 127.78c-2.703 2.895-3.804 6.936-2.942 10.801 .862 3.865 3.575 7.056 7.252 8.529l51.18 20.47L84.13 238.22c-.798 5.205 1.89 10.322 6.629 12.618 4.739 2.296 10.421 1.234 14.011-2.618l112-120c2.715-2.903 3.816-6.963 2.94-10.84ZM113.6 203.55l6.27-41.77c.825-5.504-2.243-10.853-7.41-12.92L68.74 131.37 142.4 52.45l-6.27 41.77c-.825 5.504 2.243 10.853 7.41 12.92l43.72 17.49Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
