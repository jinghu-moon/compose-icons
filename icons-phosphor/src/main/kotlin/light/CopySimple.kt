package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorLightIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 66.000 L 40.000 66.000 C 36.686 66.000 34.000 68.686 34.000 72.000 L 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 184.000 222.000 C 187.314 222.000 190.000 219.314 190.000 216.000 L 190.000 72.000 C 190.000 68.686 187.314 66.000 184.000 66.000 ZM 178.000 210.000 L 46.000 210.000 L 46.000 78.000 L 178.000 78.000 ZM 222.000 40.000 L 222.000 184.000 C 222.000 187.314 219.314 190.000 216.000 190.000 C 212.686 190.000 210.000 187.314 210.000 184.000 L 210.000 46.000 L 72.000 46.000 C 68.686 46.000 66.000 43.314 66.000 40.000 C 66.000 36.686 68.686 34.000 72.000 34.000 L 216.000 34.000 C 219.314 34.000 222.000 36.686 222.000 40.000 Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
