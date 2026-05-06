package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorFillIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.31 124.76c-.35-.79-8.82-19.58-27.65-38.41C194.57 61.26 162.88 48 128 48 93.12 48 61.43 61.26 36.34 86.35 17.51 105.18 9 124 8.69 124.76c-.92 2.069-.92 4.431 0 6.5 .35 .79 8.82 19.57 27.65 38.4C61.43 194.74 93.12 208 128 208c34.88 0 66.57-13.26 91.66-38.34 18.83-18.83 27.3-37.61 27.65-38.4 .92-2.069 .92-4.431 0-6.5ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
