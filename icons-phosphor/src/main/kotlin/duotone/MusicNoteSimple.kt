package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorDuotoneIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 184.000 C 128.000 206.091 110.091 224.000 88.000 224.000 C 65.909 224.000 48.000 206.091 48.000 184.000 C 48.000 161.909 65.909 144.000 88.000 144.000 C 110.091 144.000 128.000 161.909 128.000 184.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 210.300 56.340 L 130.300 32.340 C 127.878 31.613 125.255 32.074 123.226 33.583 C 121.197 35.092 120.001 37.471 120.000 40.000 L 120.000 148.260 C 103.116 133.159 77.973 131.916 59.682 145.280 C 41.392 158.644 34.934 182.975 44.190 203.650 C 53.445 224.325 75.895 235.715 98.046 230.974 C 120.196 226.233 136.018 206.652 136.000 184.000 L 136.000 50.750 L 205.700 71.660 C 208.460 72.559 211.490 71.893 213.618 69.919 C 215.746 67.945 216.638 64.974 215.949 62.155 C 215.260 59.335 213.098 57.110 210.300 56.340 ZM 88.000 216.000 C 70.327 216.000 56.000 201.673 56.000 184.000 C 56.000 166.327 70.327 152.000 88.000 152.000 C 105.673 152.000 120.000 166.327 120.000 184.000 C 120.000 201.673 105.673 216.000 88.000 216.000 Z"),
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
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
