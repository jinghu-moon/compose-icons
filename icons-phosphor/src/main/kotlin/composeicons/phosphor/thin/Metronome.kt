package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorThinIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182.63 113.85 211 82.69c1.486-1.657 1.347-4.204-.31-5.69-1.657-1.486-4.204-1.347-5.69 .31L179.82 105 160.52 44.32C158.92 39.355 154.296 35.992 149.08 36h-42.16c-5.227-.002-9.854 3.379-11.44 8.36l-50.9 160c-1.161 3.646-.513 7.626 1.743 10.716 2.256 3.09 5.851 4.919 9.677 4.924h144c3.828-.001 7.425-1.829 9.684-4.919 2.259-3.09 2.907-7.073 1.746-10.721ZM190.19 164h-53.19l39.37-43.31ZM103.1 46.79c.528-1.664 2.074-2.793 3.82-2.79h42.16c1.746-.003 3.292 1.126 3.82 2.79l20.71 65.09L126.23 164h-60.42ZM203.22 210.36c-.751 1.028-1.947 1.637-3.22 1.64h-144c-1.275-.001-2.473-.61-3.226-1.639-.753-1.029-.97-2.356-.584-3.571L63.27 172h129.46l11.07 34.79c.386 1.214 .171 2.54-.58 3.57Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
