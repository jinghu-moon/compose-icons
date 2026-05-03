package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimplePlus: ImageVector
    get() {
        if (_folderSimplePlus != null) return _folderSimplePlus!!
        _folderSimplePlus = phosphorLightIcon(
            name = "FolderSimplePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 74.000 L 130.000 74.000 L 101.730 52.800 C 99.307 50.982 96.359 50.000 93.330 50.000 L 40.000 50.000 C 32.268 50.000 26.000 56.268 26.000 64.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.890 214.000 C 224.128 213.994 229.994 208.128 230.000 200.890 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 ZM 218.000 200.890 C 218.000 201.503 217.503 202.000 216.890 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 64.000 C 38.000 62.895 38.895 62.000 40.000 62.000 L 93.330 62.000 C 93.763 62.000 94.184 62.140 94.530 62.400 L 124.400 84.800 C 125.439 85.579 126.702 86.000 128.000 86.000 L 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 ZM 158.000 144.000 C 158.000 147.314 155.314 150.000 152.000 150.000 L 134.000 150.000 L 134.000 168.000 C 134.000 171.314 131.314 174.000 128.000 174.000 C 124.686 174.000 122.000 171.314 122.000 168.000 L 122.000 150.000 L 104.000 150.000 C 100.686 150.000 98.000 147.314 98.000 144.000 C 98.000 140.686 100.686 138.000 104.000 138.000 L 122.000 138.000 L 122.000 120.000 C 122.000 116.686 124.686 114.000 128.000 114.000 C 131.314 114.000 134.000 116.686 134.000 120.000 L 134.000 138.000 L 152.000 138.000 C 155.314 138.000 158.000 140.686 158.000 144.000 Z"),
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
        return _folderSimplePlus!!
    }

private var _folderSimplePlus: ImageVector? = null
