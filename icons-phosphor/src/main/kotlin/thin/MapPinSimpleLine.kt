package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorThinIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 212.000 L 132.000 212.000 L 132.000 131.830 C 159.857 129.681 181.037 105.902 179.961 77.983 C 178.886 50.063 155.940 27.984 128.000 27.984 C 100.060 27.984 77.114 50.063 76.039 77.983 C 74.963 105.902 96.143 129.681 124.000 131.830 L 124.000 212.000 L 40.000 212.000 C 37.791 212.000 36.000 213.791 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 C 220.000 213.791 218.209 212.000 216.000 212.000 ZM 84.000 80.000 C 84.000 55.699 103.699 36.000 128.000 36.000 C 152.301 36.000 172.000 55.699 172.000 80.000 C 172.000 104.301 152.301 124.000 128.000 124.000 C 103.711 123.972 84.028 104.289 84.000 80.000 Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
