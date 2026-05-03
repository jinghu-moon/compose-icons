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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.000 144.400 C 215.112 121.295 200.858 101.197 181.000 88.000 L 240.000 88.000 C 244.418 88.000 248.000 84.418 248.000 80.000 C 248.000 75.582 244.418 72.000 240.000 72.000 L 159.000 72.000 C 155.375 57.841 142.616 47.937 128.000 47.937 C 113.384 47.937 100.625 57.841 97.000 72.000 L 16.000 72.000 C 11.582 72.000 8.000 75.582 8.000 80.000 C 8.000 84.418 11.582 88.000 16.000 88.000 L 75.000 88.000 C 55.142 101.197 40.888 121.295 35.000 144.400 C 19.209 146.906 7.690 160.683 8.022 176.668 C 8.353 192.653 20.433 205.941 36.314 207.790 C 52.196 209.639 67.005 199.482 71.000 184.000 L 185.000 184.000 C 188.995 199.482 203.804 209.639 219.686 207.790 C 235.567 205.941 247.647 192.653 247.978 176.668 C 248.310 160.683 236.791 146.906 221.000 144.400 ZM 40.000 192.000 C 31.163 192.000 24.000 184.837 24.000 176.000 C 24.000 167.163 31.163 160.000 40.000 160.000 C 48.837 160.000 56.000 167.163 56.000 176.000 C 56.000 184.837 48.837 192.000 40.000 192.000 ZM 128.000 64.000 C 136.837 64.000 144.000 71.163 144.000 80.000 C 144.000 88.837 136.837 96.000 128.000 96.000 C 119.163 96.000 112.000 88.837 112.000 80.000 C 112.000 71.163 119.163 64.000 128.000 64.000 ZM 216.000 192.000 C 207.163 192.000 200.000 184.837 200.000 176.000 C 200.000 167.163 207.163 160.000 216.000 160.000 C 224.837 160.000 232.000 167.163 232.000 176.000 C 232.000 184.837 224.837 192.000 216.000 192.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
