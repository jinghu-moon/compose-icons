package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorRegularIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.58 128.84 160 91.06v-43.06C160 30.327 145.673 16 128 16 110.327 16 96 30.327 96 48v43.06L20.42 128.84C17.709 130.197 15.998 132.969 16 136v32c.001 2.396 1.077 4.666 2.93 6.184 1.854 1.519 4.29 2.126 6.64 1.656L96 161.76v18.93L82.34 194.34C80.84 195.842 79.998 197.878 80 200v32c-.005 2.663 1.316 5.153 3.522 6.643 2.206 1.49 5.01 1.785 7.478 .787l37-14.81 37 14.81c2.468 .998 5.271 .704 7.478-.787 2.206-1.49 3.527-3.981 3.522-6.643v-32c.002-2.122-.84-4.158-2.34-5.66L160 180.69v-18.93l70.43 14.08c2.35 .47 4.786-.137 6.64-1.656 1.854-1.518 2.929-3.788 2.93-6.184v-32c.002-3.031-1.709-5.803-4.42-7.16ZM224 158.24 153.57 144.16c-2.35-.47-4.786 .137-6.64 1.656-1.854 1.518-2.929 3.788-2.93 6.184v32c-.002 2.122 .84 4.158 2.34 5.66L160 203.31v16.87L131 208.57c-1.907-.762-4.033-.762-5.94 0L96 220.18v-16.87l13.66-13.65c1.5-1.502 2.342-3.538 2.34-5.66v-32c-.001-2.396-1.077-4.666-2.93-6.184-1.854-1.519-4.29-2.126-6.64-1.656L32 158.24v-17.3l75.58-37.78c2.711-1.357 4.422-4.129 4.42-7.16v-48c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v48c-.002 3.031 1.709 5.803 4.42 7.16L224 140.94Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
