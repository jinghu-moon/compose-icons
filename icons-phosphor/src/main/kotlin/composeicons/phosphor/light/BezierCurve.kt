package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorLightIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.44 146.2C213.268 120.691 196.783 98.889 173.92 86h66.08c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-82.6C154.561 60.018 142.267 49.97 128 49.97 113.733 49.97 101.439 60.018 98.6 74h-82.6c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h66.08C59.217 98.889 42.732 120.691 36.56 146.2 21.274 147.96 9.797 161 9.993 176.386c.196 15.386 12.002 28.129 27.328 29.498 15.326 1.369 29.204-9.08 32.124-24.187C72.366 166.589 63.383 151.721 48.65 147.28c6.894-26.064 26.085-47.117 51.4-56.39 4.491 11.517 15.588 19.101 27.95 19.101 12.362 0 23.459-7.583 27.95-19.101 25.315 9.273 44.506 30.326 51.4 56.39-14.733 4.441-23.716 19.309-20.796 34.417 2.92 15.108 16.798 25.556 32.124 24.187 15.326-1.369 27.132-14.112 27.328-29.498 .196-15.386-11.28-28.426-26.567-30.186ZM58 176c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM128 98c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM216 194c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
