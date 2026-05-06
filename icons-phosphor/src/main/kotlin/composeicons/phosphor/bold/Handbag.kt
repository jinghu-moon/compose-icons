package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = phosphorBoldIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.86 197.65 229.61 77.65C228.39 67.567 219.826 59.987 209.67 60h-29.84C177.641 32.999 155.09 12.201 128 12.201 100.91 12.201 78.359 32.999 76.17 60h-29.84C36.174 59.987 27.61 67.567 26.39 77.65L12.14 197.65c-.673 5.688 1.125 11.391 4.938 15.665 3.813 4.274 9.275 6.708 15.002 6.685h191.84c5.727 .022 11.19-2.411 15.002-6.685 3.813-4.274 5.611-9.977 4.938-15.665ZM128 36c13.918 .001 25.722 10.225 27.71 24h-55.42C102.278 46.225 114.082 36.001 128 36ZM36.5 196 49.81 84h26.19v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h56v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h26.19l13.31 112Z"),
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
        return _handbag!!
    }

private var _handbag: ImageVector? = null
