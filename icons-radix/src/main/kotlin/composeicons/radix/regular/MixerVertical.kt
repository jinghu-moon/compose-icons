package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MixerVertical: ImageVector
    get() {
        if (_mixerVertical != null) return _mixerVertical!!
        _mixerVertical = radixIcon(
            name = "MixerVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.5 1c.242 0 .444 .171 .49 .399L5 1.5v5.5c0 .017-.003 .033-.005 .049C6.139 7.279 7 8.289 7 9.5c0 1.211-.861 2.22-2.005 2.45L5 12v1.5l-.01 .101C4.944 13.829 4.742 14 4.5 14c-.242 0-.444-.171-.49-.399L4 13.5v-1.5c0-.017 .002-.033 .004-.05C2.861 11.72 2 10.711 2 9.5 2 8.289 2.861 7.279 4.004 7.049L4 7v-5.5C4 1.224 4.224 1 4.5 1ZM10.5 1c.242 0 .444 .171 .49 .399L11 1.5v1.5l-.005 .049C12.139 3.279 13 4.289 13 5.5c0 1.211-.861 2.22-2.005 2.45L11 8v5.5c0 .276-.224 .5-.5 .5-.242 0-.444-.171-.49-.399L10 13.5v-5.5c0-.017 .002-.033 .004-.05C8.861 7.72 8 6.711 8 5.5 8 4.289 8.861 3.279 10.004 3.049L10 3v-1.5C10 1.224 10.224 1 10.5 1ZM4.5 8C3.672 8 3 8.672 3 9.5 3 10.328 3.672 11 4.5 11 5.328 11 6 10.328 6 9.5 6 8.672 5.328 8 4.5 8ZM10.5 4C9.672 4 9 4.672 9 5.5 9 6.328 9.672 7 10.5 7 11.328 7 12 6.328 12 5.5 12 4.672 11.328 4 10.5 4Z"),
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
        return _mixerVertical!!
    }

private var _mixerVertical: ImageVector? = null
