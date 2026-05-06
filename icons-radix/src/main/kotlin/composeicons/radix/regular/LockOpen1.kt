package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LockOpen1: ImageVector
    get() {
        if (_lockOpen1 != null) return _lockOpen1!!
        _lockOpen1 = radixIcon(
            name = "LockOpen1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 0c1.072 0 1.966 .338 2.589 1.002 .619 .66 .912 1.579 .912 2.634v2.364h1c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-9C2.448 14 2 13.552 2 13v-6C2 6.448 2.448 6 3 6h7v-2.364C10 2.76 9.758 2.112 9.358 1.687 8.963 1.265 8.357 1 7.499 1 6.611 1 5.997 1.269 5.604 1.715l-.076 .092C5.197 2.233 5 2.843 5 3.633h-1c0-.951 .237-1.795 .737-2.439l.121-.146C5.482 .342 6.399 0 7.499 0ZM3 13h9v-6h-9v6Z"),
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
        return _lockOpen1!!
    }

private var _lockOpen1: ImageVector? = null
