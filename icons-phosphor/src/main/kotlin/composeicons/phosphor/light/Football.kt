package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorLightIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.09 54.22C224.891 41.261 214.739 31.109 201.78 28.91 169.78 23.49 109.5 21 65.25 65.25 21 109.5 23.49 169.78 28.91 201.78c2.199 12.959 12.351 23.111 25.31 25.31 11.233 1.913 22.605 2.887 34 2.91 31.69 0 71.12-7.88 102.49-39.25C235 146.5 232.51 86.22 227.09 54.22ZM167.44 37.9c10.837 .039 21.651 .985 32.33 2.83 7.937 1.345 14.155 7.563 15.5 15.5 2.385 13.599 3.257 27.419 2.6 41.21L158.56 38.14c2.89-.14 5.84-.24 8.88-.24ZM56.23 215.27C48.293 213.925 42.075 207.707 40.73 199.77 38.345 186.171 37.473 172.351 38.13 158.56l59.31 59.31c-13.791 .657-27.611-.215-41.21-2.6ZM182.23 182.27c-11.92 11.91-34.24 28.54-69.46 34L39.72 143.19c5.47-35.22 22.1-57.54 34-69.46C85.62 61.81 108 45.2 143.2 39.73l73.08 73.08c-5.47 35.19-22.1 57.54-34.01 69.46ZM164.22 91.78c2.34 2.343 2.34 6.137 0 8.48L148.48 116l7.75 7.75c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L140 124.49 124.49 140l7.75 7.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L116 148.48l-15.75 15.74c-1.496 1.605-3.748 2.266-5.874 1.723-2.126-.543-3.786-2.203-4.329-4.329-.543-2.126 .118-4.379 1.723-5.874L107.52 140l-7.75-7.75c-1.605-1.496-2.266-3.748-1.723-5.874 .543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723l7.76 7.75 15.5-15.5-7.75-7.76c-1.605-1.496-2.266-3.748-1.723-5.874 .543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723l7.75 7.75L155.74 91.79c2.34-2.342 6.135-2.347 8.48-.01Z"),
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
        return _football!!
    }

private var _football: ImageVector? = null
