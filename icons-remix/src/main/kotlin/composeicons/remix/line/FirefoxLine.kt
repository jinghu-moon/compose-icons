package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FirefoxLine: ImageVector
    get() {
        if (_firefoxLine != null) return _firefoxLine!!
        _firefoxLine = remixIcon(
            name = "FirefoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.478 22 2.001 17.523 2.001 12c0-1.464 .314-2.854 .879-4.106C3.347 6.955 4.114 6.02 4.731 5.7 4.078 6.983 3.758 8.241 3.69 9.083 4.145 7.583 5.006 6.326 6.211 5.439 8.277 3.92 11.059 3.852 12.167 4.82 10.111 5.526 7.871 8.367 8.364 11.695c.08 .55 .245 1.083 .489 1.582C8.469 12.266 8.435 10.844 9.055 9.919 9.747 8.889 10.733 8.671 11.261 8.783c-.208-.044-.668 .837-.736 .992-.173 .394-.259 .82-.252 1.25 .015 .898 .386 1.754 1.031 2.379 1.921 1.872 5.023 1.135 6.411-1.002 .953-1.471 1.069-3.967-.155-5.951-.305-.483-.669-.927-1.084-1.321C14.626 3.364 11.998 2.561 9.495 2.925 8.389 3.102 7.448 3.421 6.671 3.881 7.756 2.798 9.912 2 12.001 2ZM6.876 7.705C4.623 8.486 3.375 10.875 4.297 14.165c.923 3.29 3.896 5.722 7.454 5.831l.249 .004c4.252 0 7.728-3.316 7.985-7.503l.009-.212c-.13 .349-.283 .674-.463 .981l-.14 .227c-2.104 3.239-6.682 4.075-9.481 1.347-.384-.373-.707-.797-.962-1.257l-.106-.201C7.108 12.994 6.26 12.055 6.301 10.564c.027-.991 .231-1.959 .574-2.859Z"),
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
        return _firefoxLine!!
    }

private var _firefoxLine: ImageVector? = null
