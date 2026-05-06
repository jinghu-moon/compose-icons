package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorDuotoneIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 128c0 30.928-25.072 56-56 56C97.072 184 72 158.928 72 128 72 97.072 97.072 72 128 72c30.928 0 56 25.072 56 56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-160v-160h160v160ZM128 64C92.654 64 64 92.654 64 128c0 35.346 28.654 64 64 64 35.346 0 64-28.654 64-64C191.961 92.67 163.33 64.039 128 64ZM128 176C101.49 176 80 154.51 80 128c0-26.51 21.49-48 48-48 26.51 0 48 21.49 48 48-.028 26.498-21.502 47.972-48 48ZM200 68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM125.66 117.66l-16 16c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l16-16c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM157.66 114.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
