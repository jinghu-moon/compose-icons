package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorLightIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 70.000 92.000 C 70.000 97.523 65.523 102.000 60.000 102.000 C 54.477 102.000 50.000 97.523 50.000 92.000 C 50.000 86.477 54.477 82.000 60.000 82.000 C 65.523 82.000 70.000 86.477 70.000 92.000 ZM 128.000 82.000 C 122.477 82.000 118.000 86.477 118.000 92.000 C 118.000 97.523 122.477 102.000 128.000 102.000 C 133.523 102.000 138.000 97.523 138.000 92.000 C 138.000 86.477 133.523 82.000 128.000 82.000 ZM 196.000 102.000 C 201.523 102.000 206.000 97.523 206.000 92.000 C 206.000 86.477 201.523 82.000 196.000 82.000 C 190.477 82.000 186.000 86.477 186.000 92.000 C 186.000 97.523 190.477 102.000 196.000 102.000 ZM 60.000 154.000 C 54.477 154.000 50.000 158.477 50.000 164.000 C 50.000 169.523 54.477 174.000 60.000 174.000 C 65.523 174.000 70.000 169.523 70.000 164.000 C 70.000 158.477 65.523 154.000 60.000 154.000 ZM 128.000 154.000 C 122.477 154.000 118.000 158.477 118.000 164.000 C 118.000 169.523 122.477 174.000 128.000 174.000 C 133.523 174.000 138.000 169.523 138.000 164.000 C 138.000 158.477 133.523 154.000 128.000 154.000 ZM 196.000 154.000 C 190.477 154.000 186.000 158.477 186.000 164.000 C 186.000 169.523 190.477 174.000 196.000 174.000 C 201.523 174.000 206.000 169.523 206.000 164.000 C 206.000 158.477 201.523 154.000 196.000 154.000 Z"),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
