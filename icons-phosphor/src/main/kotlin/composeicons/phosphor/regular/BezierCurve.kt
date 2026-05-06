package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorRegularIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.07 144.41C215.13 121.307 200.858 101.216 181 88h59c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-81C155.375 57.841 142.616 47.937 128 47.937c-14.616 0-27.375 9.903-31 24.063h-81c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h59C55.142 101.216 40.87 121.307 34.93 144.41 19.039 146.946 7.503 160.887 7.987 176.972c.483 16.084 12.836 29.308 28.85 30.885 16.014 1.577 30.708-8.984 34.319-24.666C74.767 167.509 66.171 151.586 51.08 146 58.041 121.998 75.742 102.584 99 93.44c5.242 11.304 16.57 18.537 29.03 18.537 12.46 0 23.788-7.233 29.03-18.537 23.235 9.159 40.911 28.571 47.86 52.56-15.098 5.567-23.714 21.48-20.123 37.166 3.591 15.686 18.273 26.265 34.289 24.708 16.016-1.557 28.385-14.766 28.888-30.85 .503-16.084-11.017-30.04-26.904-32.594ZM56 176c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM128 96c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM216 192c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
