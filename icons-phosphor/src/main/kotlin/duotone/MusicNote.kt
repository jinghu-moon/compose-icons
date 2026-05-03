package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorDuotoneIcon(
            name = "MusicNote",
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
                pathData = parseSvgPathData("M 210.300 56.340 L 130.300 32.340 C 127.878 31.613 125.255 32.074 123.226 33.583 C 121.197 35.092 120.001 37.471 120.000 40.000 L 120.000 148.260 C 103.116 133.159 77.973 131.916 59.682 145.280 C 41.392 158.644 34.934 182.975 44.190 203.650 C 53.445 224.325 75.895 235.715 98.046 230.974 C 120.196 226.233 136.018 206.652 136.000 184.000 L 136.000 98.750 L 205.700 119.660 C 208.122 120.387 210.745 119.926 212.774 118.417 C 214.803 116.908 215.999 114.529 216.000 112.000 L 216.000 64.000 C 215.999 60.468 213.682 57.355 210.300 56.340 ZM 88.000 216.000 C 70.327 216.000 56.000 201.673 56.000 184.000 C 56.000 166.327 70.327 152.000 88.000 152.000 C 105.673 152.000 120.000 166.327 120.000 184.000 C 120.000 201.673 105.673 216.000 88.000 216.000 ZM 200.000 101.250 L 136.000 82.050 L 136.000 50.750 L 200.000 70.000 Z"),
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
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
