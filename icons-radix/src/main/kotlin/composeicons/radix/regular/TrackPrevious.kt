package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TrackPrevious: ImageVector
    get() {
        if (_trackPrevious != null) return _trackPrevious!!
        _trackPrevious = radixIcon(
            name = "TrackPrevious",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 2.2c-.304 0-.55 .246-.55 .55v9.5c0 .304 .246 .55 .55 .55 .304-0 .55-.246 .55-.55v-4.534c.046 .095 .12 .176 .217 .227l9 4.75c.155 .082 .341 .076 .491-.015 .15-.09 .242-.252 .242-.428v-9.5C13 2.575 12.908 2.412 12.758 2.322c-.15-.09-.336-.096-.491-.015L3.267 7.057c-.097 .051-.171 .132-.217 .227v-4.534C3.05 2.446 2.804 2.2 2.5 2.2ZM12 11.42 4.572 7.5 12 3.579v7.841Z"),
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
        return _trackPrevious!!
    }

private var _trackPrevious: ImageVector? = null
