package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBin3Line: ImageVector
    get() {
        if (_deleteBin3Line != null) return _deleteBin3Line!!
        _deleteBin3Line = remixIcon(
            name = "DeleteBin3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 7v13c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-13h-2v-2h20v2h-2ZM6 7v13h12v-13h-12ZM11 9h2v2h-2v-2ZM11 12h2v2h-2v-2ZM11 15h2v2h-2v-2ZM7 2h10v2h-10v-2Z"),
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
        return _deleteBin3Line!!
    }

private var _deleteBin3Line: ImageVector? = null
