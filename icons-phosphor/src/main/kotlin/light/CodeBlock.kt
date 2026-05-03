package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorLightIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 59.760 100.240 L 27.760 68.240 C 25.420 65.897 25.420 62.103 27.760 59.760 L 59.760 27.760 C 61.256 26.155 63.508 25.494 65.634 26.037 C 67.760 26.580 69.420 28.240 69.963 30.366 C 70.506 32.492 69.845 34.744 68.240 36.240 L 40.490 64.000 L 68.240 91.760 C 69.845 93.256 70.506 95.508 69.963 97.634 C 69.420 99.760 67.760 101.420 65.634 101.963 C 63.508 102.506 61.256 101.845 59.760 100.240 ZM 99.760 100.240 C 102.103 102.580 105.897 102.580 108.240 100.240 L 140.240 68.240 C 142.580 65.897 142.580 62.103 140.240 59.760 L 108.240 27.760 C 106.744 26.155 104.492 25.494 102.366 26.037 C 100.240 26.580 98.580 28.240 98.037 30.366 C 97.494 32.492 98.155 34.744 99.760 36.240 L 127.510 64.000 L 99.760 91.760 C 97.420 94.103 97.420 97.897 99.760 100.240 ZM 200.000 42.000 L 176.000 42.000 C 172.686 42.000 170.000 44.686 170.000 48.000 C 170.000 51.314 172.686 54.000 176.000 54.000 L 200.000 54.000 C 201.105 54.000 202.000 54.895 202.000 56.000 L 202.000 200.000 C 202.000 201.105 201.105 202.000 200.000 202.000 L 56.000 202.000 C 54.895 202.000 54.000 201.105 54.000 200.000 L 54.000 136.000 C 54.000 132.686 51.314 130.000 48.000 130.000 C 44.686 130.000 42.000 132.686 42.000 136.000 L 42.000 200.000 C 42.000 207.732 48.268 214.000 56.000 214.000 L 200.000 214.000 C 207.732 214.000 214.000 207.732 214.000 200.000 L 214.000 56.000 C 214.000 48.268 207.732 42.000 200.000 42.000 Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
