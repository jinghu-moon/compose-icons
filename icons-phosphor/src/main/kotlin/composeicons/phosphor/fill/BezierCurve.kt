package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorFillIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221 144.4C215.112 121.295 200.858 101.197 181 88h59c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-81C155.375 57.841 142.616 47.937 128 47.937c-14.616 0-27.375 9.903-31 24.063h-81c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h59C55.142 101.197 40.888 121.295 35 144.4 19.209 146.906 7.69 160.683 8.022 176.668c.331 15.985 12.411 29.273 28.293 31.122C52.196 209.639 67.005 199.482 71 184h114c3.995 15.482 18.804 25.639 34.686 23.79 15.882-1.849 27.961-15.137 28.293-31.122C248.31 160.683 236.791 146.906 221 144.4ZM40 192c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM128 64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM216 192c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
