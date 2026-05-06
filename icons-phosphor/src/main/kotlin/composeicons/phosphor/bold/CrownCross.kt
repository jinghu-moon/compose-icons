package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorBoldIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 56c-15.4 0-29.19 4.61-40 12.5v-24.5h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-8C140 5.373 134.627 0 128 0c-6.627 0-12 5.373-12 12v8h-12C97.373 20 92 25.373 92 32c0 6.627 5.373 12 12 12h12v24.5C105.19 60.61 91.4 56 76 56 40.67 56.039 12.039 84.67 12 120c0 31.66 15.53 50.6 28.55 60.91 5.945 4.689 12.486 8.569 19.45 11.54v15.55c0 11.046 8.954 20 20 20h96c11.046 0 20-8.954 20-20v-15.55c6.964-2.971 13.505-6.851 19.45-11.54C228.47 170.6 244 151.66 244 120 243.961 84.67 215.33 56.039 180 56ZM181.09 172.36c-5.342 1.335-9.089 6.134-9.09 11.64v20h-88v-20c-.001-5.506-3.748-10.305-9.09-11.64C67.84 170.178 61.24 166.695 55.45 162.09 42.54 151.87 36 137.71 36 120 36 97.909 53.909 80 76 80c23.18 0 40 15.14 40 36v60c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-60c0-20.86 16.82-36 40-36 22.091 0 40 17.909 40 40 0 41.68-37.38 52-38.91 52.36Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
