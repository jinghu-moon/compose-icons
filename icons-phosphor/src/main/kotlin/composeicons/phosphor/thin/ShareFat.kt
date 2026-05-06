package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorThinIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 109.17l-80-80c-1.144-1.145-2.866-1.488-4.361-.868-1.496 .62-2.47 2.08-2.469 3.698v44.09C94 78.53 27.57 129.64 20.06 195.09c-.432 3.431 1.426 6.742 4.58 8.16 1.066 .505 2.23 .768 3.41 .77 2.201-.006 4.299-.931 5.79-2.55h0C45.37 189.2 87.13 149.74 148 148.07v43.93c-.001 1.619 .973 3.079 2.469 3.698 1.496 .62 3.217 .277 4.361-.868l80-80c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM156 182.33v-38.33c0-2.209-1.791-4-4-4-27.39 0-54.08 7.17-79.34 21.3C56.125 170.573 41.071 182.269 28 196l2.92 2.74L28 196c3.36-29.21 19.55-57.48 45.6-79.57C97.53 96.11 126.83 84 152 84c2.209 0 4-1.791 4-4v-38.34L226.34 112Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
