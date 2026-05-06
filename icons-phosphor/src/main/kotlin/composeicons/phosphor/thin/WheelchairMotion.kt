package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorThinIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 76c15.464 0 28-12.536 28-28C204 32.536 191.464 20 176 20c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM176 28c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C164.954 68 156 59.046 156 48c0-11.046 8.954-20 20-20ZM164 168c0 33.137-26.863 60-60 60C70.863 228 44 201.137 44 168c0-33.137 26.863-60 60-60 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM203.09 133.46c.76 .926 1.065 2.145 .83 3.32l-16 80c-.372 1.871-2.013 3.218-3.92 3.22-.262 .003-.524-.024-.78-.08-2.164-.432-3.569-2.535-3.14-4.7l15-75.22h-67.08c-1.43 .002-2.753-.759-3.469-1.997-.716-1.238-.717-2.764-.001-4.003L146.61 95.58C116.17 77.688 77.793 80.728 50.55 103.19c-1.709 1.408-4.237 1.164-5.645-.545C43.497 100.936 43.741 98.408 45.45 97 76.457 71.415 120.486 68.925 154.18 90.85c1.778 1.157 2.344 3.499 1.29 5.34L134.91 132h65.09c1.197 0 2.33 .536 3.09 1.46Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
