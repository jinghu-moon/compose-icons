package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorBoldIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.000 138.000 C 250.000 144.627 244.627 150.000 238.000 150.000 C 231.373 150.000 226.000 144.627 226.000 138.000 C 225.939 86.110 183.890 44.061 132.000 44.000 C 85.629 44.050 48.050 81.629 48.000 128.000 C 48.050 168.849 81.151 201.950 122.000 202.000 C 157.330 201.961 185.961 173.330 186.000 138.000 C 185.967 108.190 161.810 84.033 132.000 84.000 C 107.711 84.028 88.028 103.711 88.000 128.000 C 88.000 146.778 103.222 162.000 122.000 162.000 C 135.255 162.000 146.000 151.255 146.000 138.000 C 146.000 130.268 139.732 124.000 132.000 124.000 C 130.942 124.002 129.928 124.422 129.180 125.170 C 134.242 127.586 136.955 133.185 135.714 138.655 C 134.473 144.125 129.609 148.005 124.000 148.000 C 112.954 148.000 104.000 139.046 104.000 128.000 C 104.000 112.536 116.536 100.000 132.000 100.000 C 152.987 100.000 170.000 117.013 170.000 138.000 C 169.972 164.498 148.498 185.972 122.000 186.000 C 89.983 185.961 64.039 160.017 64.000 128.000 C 64.039 90.461 94.461 60.039 132.000 60.000 C 175.058 60.050 209.950 94.942 210.000 138.000 C 209.945 186.578 170.578 225.945 122.000 226.000 C 67.901 225.939 24.061 182.099 24.000 128.000 C 24.066 68.381 72.381 20.066 132.000 20.000 C 197.140 20.072 249.928 72.860 250.000 138.000 Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
