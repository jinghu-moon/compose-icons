package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorLightIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 136.000 L 238.000 200.000 C 238.000 207.732 231.732 214.000 224.000 214.000 L 32.000 214.000 C 24.268 214.000 18.000 207.732 18.000 200.000 L 18.000 136.000 C 18.000 128.268 24.268 122.000 32.000 122.000 L 72.000 122.000 C 75.314 122.000 78.000 124.686 78.000 128.000 C 78.000 131.314 75.314 134.000 72.000 134.000 L 32.000 134.000 C 30.895 134.000 30.000 134.895 30.000 136.000 L 30.000 200.000 C 30.000 201.105 30.895 202.000 32.000 202.000 L 224.000 202.000 C 225.105 202.000 226.000 201.105 226.000 200.000 L 226.000 136.000 C 226.000 134.895 225.105 134.000 224.000 134.000 L 184.000 134.000 C 180.686 134.000 178.000 131.314 178.000 128.000 C 178.000 124.686 180.686 122.000 184.000 122.000 L 224.000 122.000 C 231.732 122.000 238.000 128.268 238.000 136.000 ZM 123.760 132.240 C 126.103 134.580 129.897 134.580 132.240 132.240 L 180.240 84.240 C 182.443 81.876 182.378 78.192 180.093 75.907 C 177.808 73.622 174.124 73.557 171.760 75.760 L 134.000 113.510 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 113.510 L 84.240 75.760 C 81.876 73.557 78.192 73.622 75.907 75.907 C 73.622 78.192 73.557 81.876 75.760 84.240 ZM 198.000 168.000 C 198.000 162.477 193.523 158.000 188.000 158.000 C 182.477 158.000 178.000 162.477 178.000 168.000 C 178.000 173.523 182.477 178.000 188.000 178.000 C 193.523 178.000 198.000 173.523 198.000 168.000 Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
