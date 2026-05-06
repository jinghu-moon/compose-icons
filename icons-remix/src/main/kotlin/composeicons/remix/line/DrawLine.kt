package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DrawLine: ImageVector
    get() {
        if (_drawLine != null) return _drawLine!!
        _drawLine = remixIcon(
            name = "DrawLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.364 1.808c.265 0 .519 .105 .707 .293l2.828 2.828c.391 .39 .39 1.024 0 1.414l-3.672 3.672c1.055 1.373 1.849 2.752 2.283 3.991 .255 .726 .403 1.451 .377 2.122-.026 .678-.235 1.362-.756 1.883-.813 .813-1.992 .865-3.041 .649-1.085-.223-2.302-.775-3.526-1.55l1.069-1.69c1.105 .699 2.093 1.124 2.859 1.281 .801 .164 1.122-.002 1.225-.104 .068-.068 .159-.215 .172-.545 .013-.338-.063-.803-.267-1.385-.328-.935-.947-2.051-1.823-3.225l-1.972 1.972c-.188 .188-.442 .293-.707 .293h-2.828c-.552 0-1-.448-1-1v-2.828c0-.265 .105-.52 .293-.707L12.443 7.313C11.236 6.602 10.012 6.192 8.91 6.086 7.511 5.952 6.38 6.305 5.636 7.05c-.862 .862-1.204 2.252-.862 3.961 .34 1.7 1.347 3.594 2.984 5.232 1.758 1.758 3.807 2.786 5.595 3.048l-.289 1.979C10.785 20.935 8.355 19.669 6.343 17.657 4.465 15.78 3.24 13.542 2.813 11.403 2.387 9.273 2.74 7.117 4.222 5.636 5.496 4.361 7.278 3.92 9.102 4.095c1.578 .152 3.241 .766 4.795 1.766L17.657 2.101l.073-.066c.178-.146 .402-.227 .634-.227ZM12.293 10.293v1.414h1.414L19.778 5.636 18.364 4.222l-6.071 6.071Z"),
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
        return _drawLine!!
    }

private var _drawLine: ImageVector? = null
