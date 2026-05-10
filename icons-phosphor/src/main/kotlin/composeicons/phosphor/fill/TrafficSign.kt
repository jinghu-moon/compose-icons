package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorFillIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.15 116.29 139.71 12.85C136.604 9.744 132.392 7.999 128 7.999c-4.392 0-8.604 1.745-11.71 4.851L12.85 116.29C9.744 119.396 7.999 123.608 7.999 128c0 4.392 1.745 8.604 4.851 11.71L116.29 243.15h0c3.106 3.106 7.318 4.851 11.71 4.851 4.392 0 8.604-1.745 11.71-4.851L243.15 139.71c3.106-3.106 4.851-7.318 4.851-11.71 0-4.392-1.745-8.604-4.851-11.71ZM173.66 125.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L148.69 128h-36.69c-8.837 0-16 7.163-16 16v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8c0-17.673 14.327-32 32-32h36.69L138.34 101.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l24 24c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
