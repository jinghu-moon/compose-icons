package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.People: ImageVector
    get() {
        if (_people != null) return _people!!
        _people = radixIcon(
            name = "People",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 8.9c1.439 0 2.68 .252 3.575 .854 .927 .625 1.425 1.588 1.425 2.846-0 .276-.224 .5-.5 .5C9.224 13.1 9 12.876 9 12.601c0-.958-.358-1.595-.983-2.017C7.359 10.141 6.35 9.9 5 9.9c-1.35 0-2.359 .241-3.017 .684C1.358 11.005 1 11.643 1 12.601c-0 .276-.224 .5-.5 .5C.224 13.1 0 12.876 0 12.601 0 11.343 .497 10.38 1.424 9.755 2.319 9.152 3.561 8.9 5 8.9ZM9.975 8.9c1.439 0 2.68 .252 3.575 .854 .927 .625 1.425 1.588 1.425 2.846-0 .276-.224 .5-.5 .5-.276-0-.5-.224-.5-.5 0-.958-.358-1.595-.983-2.017-.518-.349-1.254-.57-2.202-.649-.233-.38-.523-.727-.869-1.033 .018-0 .036-.001 .055-.001ZM5.001 1.85C6.74 1.85 8.15 3.261 8.15 5 8.15 6.739 6.74 8.149 5.001 8.149 3.261 8.149 1.851 6.74 1.851 5 1.851 3.26 3.261 1.85 5.001 1.85ZM9.976 1.85c1.739 0 3.149 1.411 3.149 3.15C13.125 6.739 11.715 8.149 9.976 8.149c-.523 0-1.016-.13-1.45-.355 .208-.262 .388-.547 .534-.852 .278 .131 .588 .207 .916 .207C11.163 7.149 12.125 6.187 12.125 5 12.125 3.813 11.163 2.85 9.976 2.85c-.328 0-.638 .075-.916 .206C8.913 2.751 8.733 2.466 8.525 2.204c.434-.226 .927-.354 1.45-.354ZM5.001 2.85C3.814 2.85 2.851 3.813 2.851 5c0 1.187 .963 2.149 2.15 2.149C6.188 7.149 7.15 6.187 7.15 5 7.15 3.813 6.188 2.85 5.001 2.85Z"),
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
        return _people!!
    }

private var _people: ImageVector? = null
