package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorBoldIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 72.28v-.28C180 60.954 171.046 52 160 52h-20v-36C140 9.373 134.627 4 128 4c-6.627 0-12 5.373-12 12v36h-20C84.954 52 76 60.954 76 72v.28C36.71 91.904 11.919 132.082 12 176c0 6.627 5.373 12 12 12h60.19c2.109 22.62 21.092 39.915 43.81 39.915 22.718 0 41.701-17.295 43.81-39.915h60.19c6.627 0 12-5.373 12-12C244.081 132.082 219.29 91.904 180 72.28ZM128 204c-9.505 .002-17.699-6.687-19.6-16h39.2c-1.901 9.313-10.095 16.002-19.6 16ZM36.78 164C41.002 131.445 62.296 103.626 92.62 91.05 97.081 89.189 99.99 84.833 100 80v-4h56v4c-.002 4.844 2.909 9.215 7.38 11.08 30.338 12.585 51.635 40.426 55.84 73Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
