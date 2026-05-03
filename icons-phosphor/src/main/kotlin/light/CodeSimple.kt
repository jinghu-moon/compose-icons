package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorLightIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 68.490 L 25.000 128.000 L 92.000 187.520 C 94.485 189.729 94.709 193.535 92.500 196.020 C 90.291 198.505 86.485 198.729 84.000 196.520 L 12.000 132.520 C 10.708 131.381 9.969 129.742 9.969 128.020 C 9.969 126.298 10.708 124.659 12.000 123.520 L 84.000 59.520 C 86.485 57.311 90.291 57.535 92.500 60.020 C 94.709 62.505 94.485 66.311 92.000 68.520 ZM 244.000 123.490 L 172.000 59.490 C 169.515 57.281 165.709 57.505 163.500 59.990 C 161.291 62.475 161.515 66.281 164.000 68.490 L 231.000 128.000 L 164.000 187.520 C 161.515 189.729 161.291 193.535 163.500 196.020 C 165.709 198.505 169.515 198.729 172.000 196.520 L 244.000 132.520 C 245.292 131.381 246.031 129.742 246.031 128.020 C 246.031 126.298 245.292 124.659 244.000 123.520 Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
