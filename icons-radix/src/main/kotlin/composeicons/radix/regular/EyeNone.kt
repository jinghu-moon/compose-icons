package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EyeNone: ImageVector
    get() {
        if (_eyeNone != null) return _eyeNone!!
        _eyeNone = radixIcon(
            name = "EyeNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.646 1.647c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L11.638 4.068c1.338 .746 2.459 1.844 3.286 3.167 .089 .142 .1 .317 .033 .467l-.033 .062C13.344 10.293 10.692 12 7.5 12 6.362 12 5.294 11.782 4.317 11.389L2.354 13.354c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L3.361 10.931C2.024 10.184 .903 9.088 .076 7.765c-.101-.162-.101-.367 0-.529L.228 7c1.595-2.399 4.18-4 7.272-4 1.137 0 2.206 .217 3.182 .61L12.646 1.647ZM5.096 10.61c.751 .253 1.556 .39 2.404 .39 2.696 0 4.966-1.379 6.399-3.5C13.123 6.351 12.099 5.422 10.896 4.81L5.096 10.61ZM7.5 4C4.804 4 2.533 5.379 1.1 7.5c.777 1.149 1.8 2.077 3.003 2.689L9.903 4.389C9.153 4.136 8.347 4 7.5 4Z"),
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
        return _eyeNone!!
    }

private var _eyeNone: ImageVector? = null
