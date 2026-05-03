package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = lucideOutlineIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 11.400 L 12.000 9.100"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 L 18.590 10.410"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.050 5.700 L 14.832 5.009 C 14.411 3.806 13.275 3.000 12.000 3.000 C 10.726 3.000 9.590 3.806 9.169 5.009 L 4.418 19.695 C 4.321 19.999 4.374 20.331 4.562 20.589 C 4.751 20.847 5.051 21.000 5.370 21.000 L 18.623 21.000 C 18.943 21.000 19.244 20.847 19.433 20.587 C 19.621 20.328 19.673 19.995 19.574 19.690 L 18.450 16.200"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 22.000 9.000 C 22.000 10.105 21.105 11.000 20.000 11.000 C 18.895 11.000 18.000 10.105 18.000 9.000 C 18.000 7.895 18.895 7.000 20.000 7.000 C 21.105 7.000 22.000 7.895 22.000 9.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _metronome!!
    }

private var _metronome: ImageVector? = null
