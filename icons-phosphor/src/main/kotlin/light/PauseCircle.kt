package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorLightIcon(
            name = "PauseCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 110.000 96.000 L 110.000 160.000 C 110.000 163.314 107.314 166.000 104.000 166.000 C 100.686 166.000 98.000 163.314 98.000 160.000 L 98.000 96.000 C 98.000 92.686 100.686 90.000 104.000 90.000 C 107.314 90.000 110.000 92.686 110.000 96.000 ZM 158.000 96.000 L 158.000 160.000 C 158.000 163.314 155.314 166.000 152.000 166.000 C 148.686 166.000 146.000 163.314 146.000 160.000 L 146.000 96.000 C 146.000 92.686 148.686 90.000 152.000 90.000 C 155.314 90.000 158.000 92.686 158.000 96.000 Z"),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
