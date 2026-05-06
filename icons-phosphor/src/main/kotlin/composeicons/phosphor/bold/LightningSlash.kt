package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorBoldIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L75.9 88.52 39.23 127.81c-2.703 2.895-3.804 6.936-2.942 10.801 .862 3.865 3.575 7.056 7.252 8.529l51.18 20.47L84.13 238.22c-.798 5.205 1.89 10.322 6.629 12.618 4.739 2.296 10.421 1.234 14.011-2.618l58.9-63.11 35.45 39c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM113.6 203.55l6.27-41.77c.825-5.504-2.243-10.853-7.41-12.92L68.74 131.37 92.09 106.37l55.38 60.92ZM111.41 68.06c-2.339-2.172-3.717-5.187-3.827-8.377-.111-3.19 1.054-6.293 3.237-8.623L151.23 7.81c3.59-3.852 9.272-4.914 14.011-2.618 4.739 2.296 7.427 7.413 6.629 12.618L161.28 88.39l51.18 20.47c3.676 1.472 6.39 4.663 7.252 8.529 .862 3.865-.239 7.907-2.942 10.801l-16.82 18c-4.523 4.846-12.119 5.108-16.965 .585-4.846-4.523-5.108-12.119-.585-16.965l4.86-5.21L143.54 107.11c-5.167-2.067-8.235-7.416-7.41-12.92l6.27-41.77-14 15c-2.165 2.343-5.174 3.728-8.362 3.848-3.188 .12-6.293-1.034-8.628-3.208Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
