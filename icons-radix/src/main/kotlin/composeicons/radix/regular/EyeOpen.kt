package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EyeOpen: ImageVector
    get() {
        if (_eyeOpen != null) return _eyeOpen!!
        _eyeOpen = radixIcon(
            name = "EyeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 3c3.192 0 5.843 1.707 7.424 4.235 .089 .142 .1 .317 .033 .467l-.033 .062C13.344 10.293 10.692 12 7.5 12 4.308 12 1.657 10.293 .076 7.765c-.101-.162-.101-.367 0-.529L.228 7C1.823 4.601 4.408 3 7.5 3ZM7.5 4C4.804 4 2.533 5.379 1.1 7.5 2.533 9.621 4.804 11 7.5 11c2.696 0 4.966-1.379 6.399-3.5C12.466 5.379 10.196 4 7.5 4ZM7.5 5.5c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2Z"),
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
        return _eyeOpen!!
    }

private var _eyeOpen: ImageVector? = null
