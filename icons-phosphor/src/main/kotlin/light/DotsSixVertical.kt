package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorLightIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 102.000 60.000 C 102.000 65.523 97.523 70.000 92.000 70.000 C 86.477 70.000 82.000 65.523 82.000 60.000 C 82.000 54.477 86.477 50.000 92.000 50.000 C 97.523 50.000 102.000 54.477 102.000 60.000 ZM 164.000 70.000 C 169.523 70.000 174.000 65.523 174.000 60.000 C 174.000 54.477 169.523 50.000 164.000 50.000 C 158.477 50.000 154.000 54.477 154.000 60.000 C 154.000 65.523 158.477 70.000 164.000 70.000 ZM 92.000 118.000 C 86.477 118.000 82.000 122.477 82.000 128.000 C 82.000 133.523 86.477 138.000 92.000 138.000 C 97.523 138.000 102.000 133.523 102.000 128.000 C 102.000 122.477 97.523 118.000 92.000 118.000 ZM 164.000 118.000 C 158.477 118.000 154.000 122.477 154.000 128.000 C 154.000 133.523 158.477 138.000 164.000 138.000 C 169.523 138.000 174.000 133.523 174.000 128.000 C 174.000 122.477 169.523 118.000 164.000 118.000 ZM 92.000 186.000 C 86.477 186.000 82.000 190.477 82.000 196.000 C 82.000 201.523 86.477 206.000 92.000 206.000 C 97.523 206.000 102.000 201.523 102.000 196.000 C 102.000 190.477 97.523 186.000 92.000 186.000 ZM 164.000 186.000 C 158.477 186.000 154.000 190.477 154.000 196.000 C 154.000 201.523 158.477 206.000 164.000 206.000 C 169.523 206.000 174.000 201.523 174.000 196.000 C 174.000 190.477 169.523 186.000 164.000 186.000 Z"),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
