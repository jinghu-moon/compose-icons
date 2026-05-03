package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) return _folderPlus!!
        _folderPlus = phosphorLightIcon(
            name = "FolderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 74.000 L 130.490 74.000 L 102.590 46.100 C 99.968 43.469 96.404 41.993 92.690 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.620 C 26.006 208.007 31.993 213.994 39.380 214.000 L 216.890 214.000 C 224.128 213.994 229.994 208.128 230.000 200.890 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 ZM 40.000 54.000 L 92.690 54.000 C 93.220 54.002 93.727 54.214 94.100 54.590 L 113.510 74.000 L 38.000 74.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 ZM 218.000 200.890 C 218.000 201.503 217.503 202.000 216.890 202.000 L 39.380 202.000 C 38.622 201.989 38.011 201.378 38.000 200.620 L 38.000 86.000 L 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 ZM 158.000 144.000 C 158.000 147.314 155.314 150.000 152.000 150.000 L 134.000 150.000 L 134.000 168.000 C 134.000 171.314 131.314 174.000 128.000 174.000 C 124.686 174.000 122.000 171.314 122.000 168.000 L 122.000 150.000 L 104.000 150.000 C 100.686 150.000 98.000 147.314 98.000 144.000 C 98.000 140.686 100.686 138.000 104.000 138.000 L 122.000 138.000 L 122.000 120.000 C 122.000 116.686 124.686 114.000 128.000 114.000 C 131.314 114.000 134.000 116.686 134.000 120.000 L 134.000 138.000 L 152.000 138.000 C 155.314 138.000 158.000 140.686 158.000 144.000 Z"),
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
        return _folderPlus!!
    }

private var _folderPlus: ImageVector? = null
