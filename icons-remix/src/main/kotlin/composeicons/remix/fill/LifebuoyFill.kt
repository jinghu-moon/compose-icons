package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LifebuoyFill: ImageVector
    get() {
        if (_lifebuoyFill != null) return _lifebuoyFill!!
        _lifebuoyFill = remixIcon(
            name = "LifebuoyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM7.197 14.682 5.022 16.855c.504 .723 1.118 1.364 1.817 1.899l.305 .223L9.318 16.803C8.511 16.351 7.829 15.702 7.338 14.92l-.141-.238ZM16.803 14.682c-.452 .807-1.101 1.489-1.883 1.98l-.238 .141 2.173 2.175c.723-.504 1.364-1.118 1.899-1.817l.223-.305L16.803 14.682ZM12 8C9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8ZM7.145 5.022C6.421 5.527 5.78 6.14 5.245 6.84l-.223 .305L7.197 9.318C7.649 8.511 8.298 7.829 9.08 7.338l.238-.141L7.145 5.022ZM16.855 5.022 14.682 7.197c.807 .452 1.489 1.101 1.98 1.883l.141 .238L18.978 7.145C18.473 6.421 17.86 5.78 17.16 5.245l-.305-.223Z"),
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
        return _lifebuoyFill!!
    }

private var _lifebuoyFill: ImageVector? = null
