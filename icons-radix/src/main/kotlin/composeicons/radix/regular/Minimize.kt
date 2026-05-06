package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Minimize: ImageVector
    get() {
        if (_minimize != null) return _minimize!!
        _minimize = radixIcon(
            name = "Minimize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.5 8.05c.119 0 .233 .048 .317 .132 .084 .084 .133 .199 .133 .318v4c-0 .248-.202 .449-.45 .449-.248-0-.45-.202-.45-.45v-2.914L2.318 13.318c-.176 .176-.46 .176-.636 .001-.176-.176-.176-.461 0-.637L5.413 8.951 2.5 8.95c-.248 0-.449-.201-.449-.449 0-.249 .201-.45 .449-.45h4ZM12.682 1.682c.176-.176 .461-.176 .637 0 .175 .176 .175 .46 0 .636L9.586 6.05h2.914c.248 0 .45 .202 .45 .45-0 .248-.202 .45-.45 .45h-4L8.409 6.941C8.205 6.899 8.05 6.718 8.05 6.5v-4c0-.248 .202-.45 .45-.45 .248 0 .449 .202 .449 .45v2.914L12.682 1.682Z"),
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
        return _minimize!!
    }

private var _minimize: ImageVector? = null
